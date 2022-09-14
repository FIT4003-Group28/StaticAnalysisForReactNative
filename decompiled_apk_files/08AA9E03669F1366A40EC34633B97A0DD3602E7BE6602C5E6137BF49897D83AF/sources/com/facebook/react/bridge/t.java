package com.facebook.react.bridge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: JavaOnlyMap.java */
/* loaded from: classes.dex */
public class t implements an, ar {

    /* renamed from: a  reason: collision with root package name */
    private final Map f3287a;

    public static t a(Object... objArr) {
        return new t(objArr);
    }

    private t(Object... objArr) {
        if (objArr.length % 2 != 0) {
            throw new IllegalArgumentException("You must provide the same number of keys and values");
        }
        this.f3287a = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            this.f3287a.put(objArr[i], objArr[i + 1]);
        }
    }

    public t() {
        this.f3287a = new HashMap();
    }

    @Override // com.facebook.react.bridge.an
    public boolean hasKey(String str) {
        return this.f3287a.containsKey(str);
    }

    @Override // com.facebook.react.bridge.an
    public boolean isNull(String str) {
        return this.f3287a.get(str) == null;
    }

    @Override // com.facebook.react.bridge.an
    public boolean getBoolean(String str) {
        return ((Boolean) this.f3287a.get(str)).booleanValue();
    }

    @Override // com.facebook.react.bridge.an
    public double getDouble(String str) {
        return ((Double) this.f3287a.get(str)).doubleValue();
    }

    @Override // com.facebook.react.bridge.an
    public int getInt(String str) {
        return ((Integer) this.f3287a.get(str)).intValue();
    }

    @Override // com.facebook.react.bridge.an
    public String getString(String str) {
        return (String) this.f3287a.get(str);
    }

    @Override // com.facebook.react.bridge.an
    /* renamed from: a */
    public t d(String str) {
        return (t) this.f3287a.get(str);
    }

    @Override // com.facebook.react.bridge.an
    /* renamed from: b */
    public s e(String str) {
        return (s) this.f3287a.get(str);
    }

    @Override // com.facebook.react.bridge.an
    public g c(String str) {
        return i.a(this, str);
    }

    @Override // com.facebook.react.bridge.an
    public ReadableType getType(String str) {
        Object obj = this.f3287a.get(str);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof an) {
            return ReadableType.Map;
        }
        if (obj instanceof am) {
            return ReadableType.Array;
        }
        if (obj instanceof g) {
            return ((g) obj).d();
        }
        throw new IllegalArgumentException("Invalid value " + obj.toString() + " for key " + str + "contained in JavaOnlyMap");
    }

    @Override // com.facebook.react.bridge.an
    public ReadableMapKeySetIterator a() {
        return new ReadableMapKeySetIterator() { // from class: com.facebook.react.bridge.t.1

            /* renamed from: a  reason: collision with root package name */
            Iterator<String> f3288a;

            {
                this.f3288a = t.this.f3287a.keySet().iterator();
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public boolean hasNextKey() {
                return this.f3288a.hasNext();
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public String nextKey() {
                return this.f3288a.next();
            }
        };
    }

    @Override // com.facebook.react.bridge.ar
    public void putBoolean(String str, boolean z) {
        this.f3287a.put(str, Boolean.valueOf(z));
    }

    @Override // com.facebook.react.bridge.ar
    public void putDouble(String str, double d2) {
        this.f3287a.put(str, Double.valueOf(d2));
    }

    @Override // com.facebook.react.bridge.ar
    public void putInt(String str, int i) {
        this.f3287a.put(str, Integer.valueOf(i));
    }

    @Override // com.facebook.react.bridge.ar
    public void putString(String str, String str2) {
        this.f3287a.put(str, str2);
    }

    @Override // com.facebook.react.bridge.ar
    public void putNull(String str) {
        this.f3287a.put(str, null);
    }

    @Override // com.facebook.react.bridge.ar
    public void a(String str, ar arVar) {
        this.f3287a.put(str, arVar);
    }

    @Override // com.facebook.react.bridge.ar
    public void a(String str, aq aqVar) {
        this.f3287a.put(str, aqVar);
    }

    public String toString() {
        return this.f3287a.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f3287a == null ? tVar.f3287a == null : this.f3287a.equals(tVar.f3287a);
    }

    public int hashCode() {
        if (this.f3287a != null) {
            return this.f3287a.hashCode();
        }
        return 0;
    }
}
