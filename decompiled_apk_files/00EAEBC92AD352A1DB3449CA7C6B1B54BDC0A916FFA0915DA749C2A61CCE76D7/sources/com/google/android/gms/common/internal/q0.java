package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class q0 extends c.e.a.b.d.c.a implements o0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.o0
    public final boolean a(com.google.android.gms.common.y yVar, c.e.a.b.c.a aVar) {
        Parcel f2 = f();
        c.e.a.b.d.c.c.a(f2, yVar);
        c.e.a.b.d.c.c.a(f2, aVar);
        Parcel a2 = a(5, f2);
        boolean a3 = c.e.a.b.d.c.c.a(a2);
        a2.recycle();
        return a3;
    }
}
