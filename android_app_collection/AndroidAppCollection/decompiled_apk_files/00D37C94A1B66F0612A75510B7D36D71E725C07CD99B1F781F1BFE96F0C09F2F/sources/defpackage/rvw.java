package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: rvw  reason: default package */
/* loaded from: classes4.dex */
public final class rvw extends qxb {
    private final AtomicReference a;

    public rvw(Context context, Looper looper, qwu qwuVar, qsv qsvVar, qsw qswVar) {
        super(context, looper, 41, qwuVar, qsvVar, qswVar);
        this.a = new AtomicReference();
    }

    @Override // defpackage.qwr
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 12600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        if (queryLocalInterface instanceof rvt) {
            return (rvt) queryLocalInterface;
        }
        return new rvt(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return rvm.c;
    }

    @Override // defpackage.qwr, defpackage.qsn
    public final void l() {
        try {
            rvs rvsVar = (rvs) this.a.getAndSet(null);
            if (rvsVar != null) {
                rvv rvvVar = new rvv();
                rvt rvtVar = (rvt) D();
                Parcel pv = rvtVar.pv();
                dve.i(pv, rvsVar);
                dve.i(pv, rvvVar);
                rvtVar.px(5, pv);
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.l();
    }
}
