package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class e0 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* renamed from: b  reason: collision with root package name */
    Bundle f7007b;

    /* renamed from: c  reason: collision with root package name */
    com.google.android.gms.common.d[] f7008c;

    public e0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(Bundle bundle, com.google.android.gms.common.d[] dVarArr) {
        this.f7007b = bundle;
        this.f7008c = dVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f7007b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, (Parcelable[]) this.f7008c, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
