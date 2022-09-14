package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class t0 extends com.google.firebase.auth.j0 {
    public static final Parcelable.Creator<t0> CREATOR = new s0();

    /* renamed from: b  reason: collision with root package name */
    private String f8395b;

    /* renamed from: c  reason: collision with root package name */
    private String f8396c;

    /* renamed from: d  reason: collision with root package name */
    private List<com.google.firebase.auth.o0> f8397d;

    private t0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(String str, String str2, List<com.google.firebase.auth.o0> list) {
        this.f8395b = str;
        this.f8396c = str2;
        this.f8397d = list;
    }

    public static t0 a(List<com.google.firebase.auth.h0> list, String str) {
        com.google.android.gms.common.internal.s.a(list);
        com.google.android.gms.common.internal.s.b(str);
        t0 t0Var = new t0();
        t0Var.f8397d = new ArrayList();
        for (com.google.firebase.auth.h0 h0Var : list) {
            if (h0Var instanceof com.google.firebase.auth.o0) {
                t0Var.f8397d.add((com.google.firebase.auth.o0) h0Var);
            }
        }
        t0Var.f8396c = str;
        return t0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f8395b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f8396c, false);
        com.google.android.gms.common.internal.x.c.b(parcel, 3, this.f8397d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
