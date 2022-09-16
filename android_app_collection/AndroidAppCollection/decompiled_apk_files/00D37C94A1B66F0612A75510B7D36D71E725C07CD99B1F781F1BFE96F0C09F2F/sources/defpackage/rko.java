package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: rko  reason: default package */
/* loaded from: classes4.dex */
public final class rko extends qwr {
    public rko(Context context, Looper looper, qwi qwiVar, qwj qwjVar) {
        super(context, looper, 93, qwiVar, qwjVar);
    }

    @Override // defpackage.qwr, defpackage.qsn
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof rkj) {
            return (rkj) queryLocalInterface;
        }
        return new rkh(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.measurement.START";
    }
}
