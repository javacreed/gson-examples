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
package com.javacreed.examples.gson.part1_3;

public class Person2 {
  private String NAME;
  private String LOCATION;
  private Exam1 EXAM;

  // Getters and setters are not required for this example.
  // GSON sets the fields directly using reflection.

  @Override
  public String toString() {
    return NAME + " - " + LOCATION + " (" + EXAM + ")";
  }
}
