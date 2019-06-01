package com.iot.mvpdemo.util.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class mGson {
  private static Gson gson;
    public static Gson buildGson() {
        if (gson == null) {
            gson = new GsonBuilder()
                    .serializeNulls()
                    .registerTypeAdapter(Integer.class, new IntegerDefault0Adapter())
                    .registerTypeAdapter(int.class, new IntegerDefault0Adapter())
                    .registerTypeAdapter(Double.class, new DoubleDefault0Adapter())
                    .registerTypeAdapter(double.class, new DoubleDefault0Adapter())
                    .registerTypeAdapter(Long.class, new LongDefault0Adapter())
                    .registerTypeAdapter(long.class, new LongDefault0Adapter())
                    //.registerTypeAdapterFactory(new NullStringToEmptyAdapterFactory())
                    .create();
        }
        return gson;
    }
}

