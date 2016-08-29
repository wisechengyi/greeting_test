// Copyright 2014 Pants project contributors (see CONTRIBUTORS.md).
// Licensed under the Apache License, Version 2.0 (see LICENSE).

// Test Hello World example's greet lib, which says "Hello" to things.

package org.pantsbuild.example.hello.greet;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/* Ensure our greetings are polite */
public class GreetingTest {
  public void testMentionGreetee() {
    String greetingForFoo = Greeting.greet("Foo");
    assertTrue(greetingForFoo.contains("Foo"));
  }

  public void testMentionGreeteeFromResource() throws Exception {
    String greeting = Greeting.greetFromResource("org/pantsbuild/example/hello/world.txt");
    assertTrue(greeting.contains("Resource World"));
  }

  public void testShouldSayHello() {
    String greetingForFoo = Greeting.greet("Foo");
    assertTrue(greetingForFoo.contains("Hello"));
  }
}
