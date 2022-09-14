package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
/* loaded from: classes.dex */
public final class a4 extends com.google.android.gms.common.internal.c<r3> {
    public a4(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ r3 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof r3 ? (r3) queryLocalInterface : new t3(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int d() {
        return com.google.android.gms.common.i.f6959a;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String w() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String x() {
        return "com.google.android.gms.measurement.START";
    }
}
