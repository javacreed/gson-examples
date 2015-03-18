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
package com.javacreed.examples.gson.part3;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
  public static void main(final String[] args) throws Exception {
    // Configure GSON
    final GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.registerTypeAdapter(Id.class, new IdInstanceCreator<Name>(Name.class));
    gsonBuilder.registerTypeAdapter(Name.class, new NameInstanceCreator());
    final Gson gson = gsonBuilder.create();

    // The JSON data
    try (Reader data = new InputStreamReader(Main.class.getResourceAsStream("/part3/names.json"), "UTF-8")) {

      // Parse JSON to Java
      final Name name = gson.fromJson(data, Name.class);
      System.out.println(name);
    }
  }
}
