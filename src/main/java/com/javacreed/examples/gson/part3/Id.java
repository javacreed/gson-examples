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

public class Id<T> {

  public static <N> Id<N> createEmptyInstance(final Class<N> type) {
    return new Id<N>(type, 0);
  }

  public transient final Class<T> type;
  public final int id;

  public Id(final Class<T> type, final int id) {
    this.type = type;
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public Class<T> getType() {
    return type;
  }

  @Override
  public String toString() {
    return String.format("%d (of type %s)", id, type == null ? "unknown" : type.getSimpleName());
  }

}
