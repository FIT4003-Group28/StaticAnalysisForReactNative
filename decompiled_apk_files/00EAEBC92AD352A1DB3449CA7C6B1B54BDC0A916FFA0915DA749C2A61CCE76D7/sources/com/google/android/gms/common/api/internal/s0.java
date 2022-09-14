package com.google.android.gms.common.api.internal;

import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private final a.e.a<b<?>, com.google.android.gms.common.b> f6917a;

    /* renamed from: b  reason: collision with root package name */
    private final a.e.a<b<?>, String> f6918b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.a.b.g.i<Map<b<?>, String>> f6919c;

    /* renamed from: d  reason: collision with root package name */
    private int f6920d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6921e;

    public final Set<b<?>> a() {
        return this.f6917a.keySet();
    }

    public final void a(b<?> bVar, com.google.android.gms.common.b bVar2, String str) {
        this.f6917a.put(bVar, bVar2);
        this.f6918b.put(bVar, str);
        this.f6920d--;
        if (!bVar2.u()) {
            this.f6921e = true;
        }
        if (this.f6920d == 0) {
            if (!this.f6921e) {
                this.f6919c.a((c.e.a.b.g.i<Map<b<?>, String>>) this.f6918b);
                return;
            }
            this.f6919c.a(new com.google.android.gms.common.api.c(this.f6917a));
        }
    }
}
