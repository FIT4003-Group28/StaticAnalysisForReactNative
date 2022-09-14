package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.auth.a1;
import java.util.List;
/* loaded from: classes.dex */
public final class e0 implements com.google.firebase.auth.i {
    public static final Parcelable.Creator<e0> CREATOR = new h0();

    /* renamed from: b  reason: collision with root package name */
    private k0 f8345b;

    /* renamed from: c  reason: collision with root package name */
    private c0 f8346c;

    /* renamed from: d  reason: collision with root package name */
    private a1 f8347d;

    public e0(k0 k0Var) {
        com.google.android.gms.common.internal.s.a(k0Var);
        this.f8345b = k0Var;
        List<g0> B = this.f8345b.B();
        this.f8346c = null;
        for (int i = 0; i < B.size(); i++) {
            if (!TextUtils.isEmpty(B.get(i).f())) {
                this.f8346c = new c0(B.get(i).a(), B.get(i).f(), k0Var.C());
            }
        }
        if (this.f8346c == null) {
            this.f8346c = new c0(k0Var.C());
        }
        this.f8347d = k0Var.D();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(k0 k0Var, c0 c0Var, a1 a1Var) {
        this.f8345b = k0Var;
        this.f8346c = c0Var;
        this.f8347d = a1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.i
    public final com.google.firebase.auth.g e() {
        return this.f8346c;
    }

    @Override // com.google.firebase.auth.i
    public final com.google.firebase.auth.z getUser() {
        return this.f8345b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, (Parcelable) getUser(), i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, (Parcelable) e(), i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, (Parcelable) this.f8347d, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
