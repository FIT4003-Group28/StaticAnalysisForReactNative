package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import c.e.a.b.c.a;
/* loaded from: classes.dex */
public final class n0 extends c.e.a.b.d.c.a implements l0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.l0
    public final c.e.a.b.c.a j() {
        Parcel a2 = a(1, f());
        c.e.a.b.c.a a3 = a.AbstractBinderC0096a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.common.internal.l0
    public final int l() {
        Parcel a2 = a(2, f());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }
}
