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
import java.util.Collection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ProductsJsonSerializer implements JsonSerializer<Collection<Product>> {

  @Override
  public JsonElement serialize(final Collection<Product> products, final Type typeOfSrc,
      final JsonSerializationContext context) {

    final JsonObject json = new JsonObject();
    json.addProperty("size", products.size());

    final JsonArray jsonArray = new JsonArray();
    json.add("collection", jsonArray);
    for (final Product product : products) {
      final JsonElement element = context.serialize(product);
      jsonArray.add(element);
    }

    return json;
  }

}
