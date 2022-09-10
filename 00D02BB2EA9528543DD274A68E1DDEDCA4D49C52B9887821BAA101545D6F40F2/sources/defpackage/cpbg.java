package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: cpbg  reason: default package */
/* loaded from: classes5.dex */
public final class cpbg extends cnuw<cpbb> {
    public cpbg(Context context, Looper looper, cnpv cnpvVar, cnsi cnsiVar, cnum cnumVar) {
        super(context, looper, 79, cnumVar, cnpvVar, cnsiVar);
    }

    @Override // defpackage.cnui
    public final Feature[] Sm() {
        return cozr.u;
    }

    @Override // defpackage.cnui
    public final boolean So() {
        return true;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.tapandpay.service.BIND";
    }

    @Override // defpackage.cnui
    protected final String b() {
        return "com.google.android.gms.tapandpay.internal.ITapAndPayService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 12800000;
    }

    @Override // defpackage.cnui
    protected final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayService");
        return queryLocalInterface instanceof cpbb ? (cpbb) queryLocalInterface : new cpbb(iBinder);
    }

    @Override // defpackage.cnui
    protected final Bundle i() {
        return new Bundle();
    }
}
