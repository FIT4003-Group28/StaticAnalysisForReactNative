package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: qye  reason: default package */
/* loaded from: classes4.dex */
public final class qye extends qxb {
    public qye(Context context, Looper looper, qwu qwuVar, qub qubVar, qvh qvhVar) {
        super(context, looper, 270, qwuVar, qubVar, qvhVar);
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof qya) {
            return (qya) queryLocalInterface;
        }
        return new qya(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.qwr
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return qqq.b;
    }

    @Override // defpackage.qwr
    protected final Bundle i() {
        return new Bundle();
    }
}
