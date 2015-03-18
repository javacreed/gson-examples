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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Book {

  private final Set<Author> authors;
  private final String isbn;
  private final String title;

  public Book(final String title, final String isbn, final Author... authors) {
    this.title = title;
    this.isbn = isbn;
    this.authors = new HashSet<>(Arrays.asList(authors));
  }

  public Set<Author> getAuthors() {
    return authors;
  }

  @Override
  public String toString() {
    final StringBuilder fomrattedString = new StringBuilder();
    fomrattedString.append(title).append(" (").append(isbn).append(")");

    fomrattedString.append(" by: ");
    for (final Author author : authors) {
      fomrattedString.append(author.getName()).append(", ");
    }

    // To remove the last comma followed by a space
    return fomrattedString.substring(0, fomrattedString.length() - 2);
  }
}
