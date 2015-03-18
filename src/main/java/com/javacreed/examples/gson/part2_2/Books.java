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
package com.javacreed.examples.gson.part2_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Books {

  private final Map<String, Author> authors = new HashMap<>();
  private final Set<Book> books = new HashSet<>();

  public void addAuthor(final Author author) {
    authors.put(author.getName(), author);
  }

  public void addBook(final Book book) {
    books.add(book);
  }

  public Author getAuthorWithName(final String name) {
    return authors.get(name);
  }

  @Override
  public String toString() {
    final StringBuilder formattedString = new StringBuilder();
    for (final Author author : authors.values()) {
      formattedString.append(author).append("\n");
      for (final Book book : author.getBooks()) {
        formattedString.append("  ").append(book).append("\n");
      }
      formattedString.append("\n");
    }

    return formattedString.toString();
  }
}
