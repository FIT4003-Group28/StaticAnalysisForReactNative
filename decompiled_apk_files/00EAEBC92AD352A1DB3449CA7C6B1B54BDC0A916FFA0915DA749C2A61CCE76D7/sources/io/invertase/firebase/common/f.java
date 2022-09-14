package io.invertase.firebase.common;

import com.facebook.react.bridge.WritableMap;
/* loaded from: classes.dex */
public class f implements e.a.a.a.b {

    /* renamed from: a  reason: collision with root package name */
    private String f10327a;

    /* renamed from: b  reason: collision with root package name */
    private WritableMap f10328b;

    public f(String str, WritableMap writableMap) {
        this.f10327a = str;
        this.f10328b = writableMap;
    }

    public f(String str, WritableMap writableMap, String str2) {
        this.f10327a = str;
        this.f10328b = writableMap;
    }

    @Override // e.a.a.a.b
    public String a() {
        return this.f10327a;
    }

    @Override // e.a.a.a.b
    public WritableMap b() {
        return this.f10328b;
    }
}
