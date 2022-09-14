package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c.e.a.b.d.e.p2;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class q0 extends com.google.firebase.auth.i0 {
    public static final Parcelable.Creator<q0> CREATOR = new r0();

    /* renamed from: b  reason: collision with root package name */
    private final List<com.google.firebase.auth.o0> f8385b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final t0 f8386c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8387d;

    /* renamed from: e  reason: collision with root package name */
    private final a1 f8388e;

    /* renamed from: f  reason: collision with root package name */
    private final k0 f8389f;

    public q0(List<com.google.firebase.auth.o0> list, t0 t0Var, String str, a1 a1Var, k0 k0Var) {
        for (com.google.firebase.auth.o0 o0Var : list) {
            if (o0Var instanceof com.google.firebase.auth.o0) {
                this.f8385b.add(o0Var);
            }
        }
        com.google.android.gms.common.internal.s.a(t0Var);
        this.f8386c = t0Var;
        com.google.android.gms.common.internal.s.b(str);
        this.f8387d = str;
        this.f8388e = a1Var;
        this.f8389f = k0Var;
    }

    public static q0 a(p2 p2Var, FirebaseAuth firebaseAuth, com.google.firebase.auth.z zVar) {
        List<com.google.firebase.auth.h0> q = p2Var.q();
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.auth.h0 h0Var : q) {
            if (h0Var instanceof com.google.firebase.auth.o0) {
                arrayList.add((com.google.firebase.auth.o0) h0Var);
            }
        }
        return new q0(arrayList, t0.a(p2Var.q(), p2Var.f()), firebaseAuth.h().c(), p2Var.j(), (k0) zVar);
    }

    public final com.google.firebase.auth.j0 q() {
        return this.f8386c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.b(parcel, 1, this.f8385b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, (Parcelable) q(), i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f8387d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, (Parcelable) this.f8388e, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, (Parcelable) this.f8389f, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
