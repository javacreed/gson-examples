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

import java.math.BigDecimal;

public class Item {

  private final Id<Item> id;
  private final String name;
  private final BigDecimal price;

  public Item(final Id<Item> id, final String name, final BigDecimal price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public Id<Item> getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return String.format("[%s] %s %.2f", id, name, price);
  }

}
