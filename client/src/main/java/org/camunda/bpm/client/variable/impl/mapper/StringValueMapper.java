/*
 * Copyright © 2018 camunda services GmbH and various authors (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.client.variable.impl.mapper;

import org.camunda.bpm.client.variable.impl.TypedValueField;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.impl.value.UntypedValueImpl;
import org.camunda.bpm.engine.variable.type.ValueType;
import org.camunda.bpm.engine.variable.value.StringValue;

public class StringValueMapper extends PrimitiveValueMapper<StringValue> {

  public StringValueMapper() {
    super(ValueType.STRING);
  }

  public StringValue convertToTypedValue(UntypedValueImpl untypedValue) {
    return Variables.stringValue((String) untypedValue.getValue());
  }

  public StringValue readValue(TypedValueField typedValueField) {
    return Variables.stringValue((String) typedValueField.getValue());
  }

  public void writeValue(StringValue stringValue, TypedValueField typedValueField) {
    typedValueField.setValue(stringValue.getValue());
  }

}
