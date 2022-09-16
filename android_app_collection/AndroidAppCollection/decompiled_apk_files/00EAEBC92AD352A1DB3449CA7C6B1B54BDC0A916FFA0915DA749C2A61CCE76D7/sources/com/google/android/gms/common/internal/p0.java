package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class p0 extends c.e.a.b.d.c.b implements o0 {
    public static o0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof o0 ? (o0) queryLocalInterface : new q0(iBinder);
    }
}
