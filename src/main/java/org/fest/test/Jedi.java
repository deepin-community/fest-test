/*
 * Created on Mar 19, 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2012 the original author or authors.
 */
package org.fest.test;

/**
 * Object for test.
 * 
 * @author Nicolas François
 * @author Joel Costigliola
 */
public class Jedi extends Person {

  private String lightSaberColor;
  @SuppressWarnings("unused")
  private Object strangeNotReadablePrivateField;

  public Jedi(String name, String lightSaberColor) {
    super(name);
    this.lightSaberColor = lightSaberColor;
  }

  public String getLightSaberColor() {
    return lightSaberColor;
  }

  @Override
  public String toString() {
    return getName() + " the Jedi";
  }

}
