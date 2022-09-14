package com.facebook.react.c0;

import com.facebook.react.bridge.WritableMap;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f5425a;

    /* renamed from: b  reason: collision with root package name */
    private final WritableMap f5426b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5427c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5428d;

    /* renamed from: e  reason: collision with root package name */
    private final d f5429e;

    public a(a aVar) {
        this.f5425a = aVar.f5425a;
        this.f5426b = aVar.f5426b.copy();
        this.f5427c = aVar.f5427c;
        this.f5428d = aVar.f5428d;
        d dVar = aVar.f5429e;
        if (dVar != null) {
            dVar.copy();
        } else {
            dVar = null;
        }
        this.f5429e = dVar;
    }

    public a(String str, WritableMap writableMap, long j, boolean z) {
        this(str, writableMap, j, z, e.f5442a);
    }

    public a(String str, WritableMap writableMap, long j, boolean z, d dVar) {
        this.f5425a = str;
        this.f5426b = writableMap;
        this.f5427c = j;
        this.f5428d = z;
        this.f5429e = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WritableMap a() {
        return this.f5426b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d b() {
        return this.f5429e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f5425a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long d() {
        return this.f5427c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f5428d;
    }
}
