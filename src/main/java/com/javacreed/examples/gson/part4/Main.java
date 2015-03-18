/*
 * #%L
 * Gson Examples
 * %%
 * Copyright (C) 2012 - 2015 Java Creed
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.javacreed.examples.gson.part4;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
  public static void main(final String[] args) {

    // Configure GSON
    final GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.registerTypeAdapter(Category.class, new CategoryJsonSerializer());
    gsonBuilder.registerTypeAdapter(Product.class, new ProductJsonSerializer());
    gsonBuilder.registerTypeAdapter(ArrayList.class, new ProductsJsonSerializer());
    final Gson gson = gsonBuilder.create();

    final Product product = new Product();
    product.setId(10);
    product.setName("Tomato");
    product.addCategory(Category.FRUIT);
    product.addCategory(Category.VEGETABLES);
    product.setPrice(new BigDecimal("10.23"));

    final String json1 = gson.toJson(product);
    System.out.println(json1);

    final ArrayList<Product> products = new ArrayList<>();
    products.add(product);
    final String json2 = gson.toJson(products);
    System.out.println(json2);
  }
}
