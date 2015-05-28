/*
 * Copyright (C) 2013 The Android Open Source Project
 *
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
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String GLUCOSE_MEASUREMENT_VALUE = "00002a18-0000-1000-8000-00805f9b34fb";
    public static String GLUCOSE_FEATURE = "00002a51-0000-1000-8000-00805f9b34fb";
    public static String GLUCOSE_CONTROL_POINT = "00002a52-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String GLUCOSE_SERVICE    = "00001808-0000-1000-8000-00805f9b34fb";
    public static String BATTERY_SERVICE    = "0000180f-0000-1000-8000-00805f9b34fb";

    static {
        // Sample Services.
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Generic Access Service");
        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "Generic Attribute Service");
        attributes.put(GLUCOSE_SERVICE , "Glucose Service");
        attributes.put(BATTERY_SERVICE , "Battery Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put(GLUCOSE_MEASUREMENT_VALUE, "Glucose Measurement Value");
        attributes.put(GLUCOSE_FEATURE, "Glucose Measurement Feature");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put(GLUCOSE_CONTROL_POINT, "Glucose Control Point");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
