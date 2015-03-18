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

import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ProductJsonSerializer implements JsonSerializer<Product> {

  @Override
  public JsonElement serialize(final Product product, final Type typeOfSrc, final JsonSerializationContext context) {

    final JsonObject json = new JsonObject();
    json.addProperty("i", product.getId());
    json.addProperty("n", product.getName());
    json.addProperty("p", product.getPrice());

    final JsonArray categoriesArray = new JsonArray();
    json.add("c", categoriesArray);
    for (final Category category : product.getCategories()) {
      categoriesArray.add(context.serialize(category));
    }

    return json;
  }

}
