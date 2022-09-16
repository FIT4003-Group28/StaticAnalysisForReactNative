package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: rdm  reason: default package */
/* loaded from: classes4.dex */
public final class rdm extends qxb {
    public rdm(Context context, Looper looper, qwu qwuVar, qub qubVar, qvh qvhVar) {
        super(context, looper, 257, qwuVar, qubVar, qvhVar);
    }

    @Override // defpackage.qwr
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 17895000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gmscompliance.IGmsDeviceComplianceService");
        if (queryLocalInterface instanceof rdc) {
            return (rdc) queryLocalInterface;
        }
        return new rdc(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.gmscompliance.IGmsDeviceComplianceService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.gmscompliance.service.START";
    }

    @Override // defpackage.qwr
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return rda.b;
    }
}
