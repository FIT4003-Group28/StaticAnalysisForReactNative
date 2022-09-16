package com.facebook.react.bridge;

import java.util.ArrayList;
/* loaded from: classes.dex */
public interface ReadableArray {
    /* renamed from: getArray */
    ReadableArray mo208getArray(int i);

    boolean getBoolean(int i);

    double getDouble(int i);

    Dynamic getDynamic(int i);

    int getInt(int i);

    /* renamed from: getMap */
    ReadableMap mo209getMap(int i);

    String getString(int i);

    ReadableType getType(int i);

    boolean isNull(int i);

    int size();

    ArrayList<Object> toArrayList();
}
