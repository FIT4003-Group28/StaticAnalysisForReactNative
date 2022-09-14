package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.m;
/* loaded from: classes.dex */
public class u extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<u> CREATOR = new d0();

    /* renamed from: b  reason: collision with root package name */
    private final int f7056b;

    /* renamed from: c  reason: collision with root package name */
    private IBinder f7057c;

    /* renamed from: d  reason: collision with root package name */
    private com.google.android.gms.common.b f7058d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7059e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7060f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(int i, IBinder iBinder, com.google.android.gms.common.b bVar, boolean z, boolean z2) {
        this.f7056b = i;
        this.f7057c = iBinder;
        this.f7058d = bVar;
        this.f7059e = z;
        this.f7060f = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f7058d.equals(uVar.f7058d) && q().equals(uVar.q());
    }

    public m q() {
        return m.a.a(this.f7057c);
    }

    public com.google.android.gms.common.b r() {
        return this.f7058d;
    }

    public boolean s() {
        return this.f7059e;
    }

    public boolean t() {
        return this.f7060f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f7056b);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f7057c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, (Parcelable) r(), i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, s());
        com.google.android.gms.common.internal.x.c.a(parcel, 5, t());
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
