package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.HashMap;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class ReadableNativeMap extends NativeMap implements an {
    @Override // com.facebook.react.bridge.an
    /* renamed from: getArray */
    public native ReadableNativeArray e(String str);

    @Override // com.facebook.react.bridge.an
    public native boolean getBoolean(String str);

    @Override // com.facebook.react.bridge.an
    public native double getDouble(String str);

    @Override // com.facebook.react.bridge.an
    public native int getInt(String str);

    @Override // com.facebook.react.bridge.an
    /* renamed from: getMap */
    public native ReadableNativeMap d(String str);

    @Override // com.facebook.react.bridge.an
    public native String getString(String str);

    @Override // com.facebook.react.bridge.an
    public native ReadableType getType(String str);

    @Override // com.facebook.react.bridge.an
    public native boolean hasKey(String str);

    @Override // com.facebook.react.bridge.an
    public native boolean isNull(String str);

    static {
        ai.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
    }

    @Override // com.facebook.react.bridge.an
    public g c(String str) {
        return i.a(this, str);
    }

    @Override // com.facebook.react.bridge.an
    public ReadableMapKeySetIterator a() {
        return new ReadableNativeMapKeySetIterator(this);
    }

    public HashMap<String, Object> b() {
        ReadableMapKeySetIterator a2 = a();
        HashMap<String, Object> hashMap = new HashMap<>();
        while (a2.hasNextKey()) {
            String nextKey = a2.nextKey();
            switch (getType(nextKey)) {
                case Null:
                    hashMap.put(nextKey, null);
                    break;
                case Boolean:
                    hashMap.put(nextKey, Boolean.valueOf(getBoolean(nextKey)));
                    break;
                case Number:
                    hashMap.put(nextKey, Double.valueOf(getDouble(nextKey)));
                    break;
                case String:
                    hashMap.put(nextKey, getString(nextKey));
                    break;
                case Map:
                    hashMap.put(nextKey, d(nextKey).b());
                    break;
                case Array:
                    hashMap.put(nextKey, e(nextKey).a());
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + nextKey + ".");
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @com.facebook.k.a.a
    /* loaded from: classes.dex */
    public static class ReadableNativeMapKeySetIterator implements ReadableMapKeySetIterator {
        @com.facebook.k.a.a
        private final HybridData mHybridData;
        @com.facebook.k.a.a
        private final ReadableNativeMap mMap;

        private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public native boolean hasNextKey();

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public native String nextKey();

        public ReadableNativeMapKeySetIterator(ReadableNativeMap readableNativeMap) {
            this.mMap = readableNativeMap;
            this.mHybridData = initHybrid(readableNativeMap);
        }
    }
}
