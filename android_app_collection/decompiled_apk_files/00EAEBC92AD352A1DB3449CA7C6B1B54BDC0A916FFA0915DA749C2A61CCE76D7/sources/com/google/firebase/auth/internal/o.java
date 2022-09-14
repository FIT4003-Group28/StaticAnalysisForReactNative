package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class o extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<o> CREATOR = new r();

    /* renamed from: b  reason: collision with root package name */
    private final List<com.google.firebase.auth.o0> f8381b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(List<com.google.firebase.auth.o0> list) {
        this.f8381b = list == null ? c.e.a.b.d.e.w.f() : list;
    }

    public static o a(List<com.google.firebase.auth.h0> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.auth.h0 h0Var : list) {
            if (h0Var instanceof com.google.firebase.auth.o0) {
                arrayList.add((com.google.firebase.auth.o0) h0Var);
            }
        }
        return new o(arrayList);
    }

    public final List<com.google.firebase.auth.h0> f() {
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.auth.o0 o0Var : this.f8381b) {
            arrayList.add(o0Var);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.b(parcel, 1, this.f8381b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
