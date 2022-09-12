package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: cnxe  reason: default package */
/* loaded from: classes5.dex */
public final class cnxe extends cnuw<cnwx> {
    public cnxe(Context context, Looper looper, cnum cnumVar, cnpv cnpvVar, cnsi cnsiVar) {
        super(context, looper, 270, cnumVar, cnpvVar, cnsiVar);
    }

    @Override // defpackage.cnui
    public final Feature[] Sm() {
        return cnlj.b;
    }

    @Override // defpackage.cnui
    protected final boolean Sn() {
        return true;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 203390000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof cnwx ? (cnwx) queryLocalInterface : new cnwx(iBinder);
    }

    @Override // defpackage.cnui
    protected final Bundle i() {
        return new Bundle();
    }
}
