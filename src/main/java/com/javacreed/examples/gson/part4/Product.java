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
import java.util.HashSet;
import java.util.Set;

public class Product {

  private int id;
  private String name;
  private BigDecimal price;
  private Set<Category> categories;

  public void addCategory(final Category category) {
    if (categories == null) {
      categories = new HashSet<>();
    }

    categories.add(category);
  }

  public Set<Category> getCategories() {
    return categories;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setCategories(final Set<Category> categories) {
    this.categories = categories;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public void setPrice(final BigDecimal price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format("%s at %.2f", name, price);
  }

}
