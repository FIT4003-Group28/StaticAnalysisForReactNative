package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.a;
/* loaded from: classes.dex */
public final class i2 extends d implements a.d.c {

    /* renamed from: c  reason: collision with root package name */
    private final String f8474c;

    private i2(String str) {
        com.google.android.gms.common.internal.s.a(str, (Object) "A valid API key must be provided");
        this.f8474c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ i2(String str, j2 j2Var) {
        this(str);
    }

    @Override // com.google.firebase.auth.v0.a.d
    public final /* synthetic */ d c() {
        return (i2) clone();
    }

    @Override // com.google.firebase.auth.v0.a.d
    public final /* synthetic */ Object clone() {
        return new l2(this.f8474c).a();
    }

    public final String d() {
        return this.f8474c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i2) {
            return com.google.android.gms.common.internal.r.a(this.f8474c, ((i2) obj).f8474c);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.a(this.f8474c);
    }
}
