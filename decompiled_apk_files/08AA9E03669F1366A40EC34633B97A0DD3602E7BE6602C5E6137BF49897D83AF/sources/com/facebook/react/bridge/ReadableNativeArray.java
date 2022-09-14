package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.ArrayList;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class ReadableNativeArray extends NativeArray implements am {
    @Override // com.facebook.react.bridge.am
    /* renamed from: getArray */
    public native ReadableNativeArray d(int i);

    @Override // com.facebook.react.bridge.am
    public native boolean getBoolean(int i);

    @Override // com.facebook.react.bridge.am
    public native double getDouble(int i);

    @Override // com.facebook.react.bridge.am
    public native int getInt(int i);

    @Override // com.facebook.react.bridge.am
    /* renamed from: getMap */
    public native ReadableNativeMap c(int i);

    @Override // com.facebook.react.bridge.am
    public native String getString(int i);

    @Override // com.facebook.react.bridge.am
    public native ReadableType getType(int i);

    @Override // com.facebook.react.bridge.am
    public native boolean isNull(int i);

    @Override // com.facebook.react.bridge.am
    public native int size();

    static {
        ai.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ReadableNativeArray(HybridData hybridData) {
        super(hybridData);
    }

    @Override // com.facebook.react.bridge.am
    public ArrayList<Object> a() {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            switch (getType(i)) {
                case Null:
                    arrayList.add(null);
                    break;
                case Boolean:
                    arrayList.add(Boolean.valueOf(getBoolean(i)));
                    break;
                case Number:
                    arrayList.add(Double.valueOf(getDouble(i)));
                    break;
                case String:
                    arrayList.add(getString(i));
                    break;
                case Map:
                    arrayList.add(c(i).b());
                    break;
                case Array:
                    arrayList.add(d(i).a());
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object at index: " + i + ".");
            }
        }
        return arrayList;
    }
}
