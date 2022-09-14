package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.List;
/* compiled from: JavaOnlyArray.java */
/* loaded from: classes.dex */
public class s implements am, aq {

    /* renamed from: a  reason: collision with root package name */
    private final List f3286a;

    public static s a(List list) {
        return new s(list);
    }

    private s(List list) {
        this.f3286a = new ArrayList(list);
    }

    public s() {
        this.f3286a = new ArrayList();
    }

    @Override // com.facebook.react.bridge.am
    public int size() {
        return this.f3286a.size();
    }

    @Override // com.facebook.react.bridge.am
    public boolean isNull(int i) {
        return this.f3286a.get(i) == null;
    }

    @Override // com.facebook.react.bridge.am
    public double getDouble(int i) {
        return ((Double) this.f3286a.get(i)).doubleValue();
    }

    @Override // com.facebook.react.bridge.am
    public int getInt(int i) {
        return ((Integer) this.f3286a.get(i)).intValue();
    }

    @Override // com.facebook.react.bridge.am
    public String getString(int i) {
        return (String) this.f3286a.get(i);
    }

    @Override // com.facebook.react.bridge.am
    /* renamed from: a */
    public s d(int i) {
        return (s) this.f3286a.get(i);
    }

    @Override // com.facebook.react.bridge.am
    public boolean getBoolean(int i) {
        return ((Boolean) this.f3286a.get(i)).booleanValue();
    }

    @Override // com.facebook.react.bridge.am
    /* renamed from: b */
    public t c(int i) {
        return (t) this.f3286a.get(i);
    }

    @Override // com.facebook.react.bridge.am
    public ReadableType getType(int i) {
        Object obj = this.f3286a.get(i);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof am) {
            return ReadableType.Array;
        }
        if (!(obj instanceof an)) {
            return null;
        }
        return ReadableType.Map;
    }

    @Override // com.facebook.react.bridge.aq
    public void pushBoolean(boolean z) {
        this.f3286a.add(Boolean.valueOf(z));
    }

    @Override // com.facebook.react.bridge.aq
    public void pushDouble(double d2) {
        this.f3286a.add(Double.valueOf(d2));
    }

    @Override // com.facebook.react.bridge.aq
    public void pushInt(int i) {
        this.f3286a.add(Integer.valueOf(i));
    }

    @Override // com.facebook.react.bridge.aq
    public void pushString(String str) {
        this.f3286a.add(str);
    }

    @Override // com.facebook.react.bridge.aq
    public void a(aq aqVar) {
        this.f3286a.add(aqVar);
    }

    @Override // com.facebook.react.bridge.aq
    public void a(ar arVar) {
        this.f3286a.add(arVar);
    }

    @Override // com.facebook.react.bridge.aq
    public void pushNull() {
        this.f3286a.add(null);
    }

    @Override // com.facebook.react.bridge.am
    public ArrayList<Object> a() {
        return new ArrayList<>(this.f3286a);
    }

    public String toString() {
        return this.f3286a.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f3286a == null ? sVar.f3286a == null : this.f3286a.equals(sVar.f3286a);
    }

    public int hashCode() {
        if (this.f3286a != null) {
            return this.f3286a.hashCode();
        }
        return 0;
    }
}
