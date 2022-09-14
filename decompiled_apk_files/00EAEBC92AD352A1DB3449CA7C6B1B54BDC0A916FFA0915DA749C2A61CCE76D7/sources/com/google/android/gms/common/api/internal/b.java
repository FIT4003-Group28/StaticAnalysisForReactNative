package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
/* loaded from: classes.dex */
public final class b<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6835a = false;

    /* renamed from: b  reason: collision with root package name */
    private final int f6836b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.gms.common.api.a<O> f6837c;

    /* renamed from: d  reason: collision with root package name */
    private final O f6838d;

    private b(com.google.android.gms.common.api.a<O> aVar, O o) {
        this.f6837c = aVar;
        this.f6838d = o;
        this.f6836b = com.google.android.gms.common.internal.r.a(this.f6837c, this.f6838d);
    }

    public static <O extends a.d> b<O> a(com.google.android.gms.common.api.a<O> aVar, O o) {
        return new b<>(aVar, o);
    }

    public final String a() {
        return this.f6837c.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return !this.f6835a && !bVar.f6835a && com.google.android.gms.common.internal.r.a(this.f6837c, bVar.f6837c) && com.google.android.gms.common.internal.r.a(this.f6838d, bVar.f6838d);
    }

    public final int hashCode() {
        return this.f6836b;
    }
}
