package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: cnff  reason: default package */
/* loaded from: classes5.dex */
public final class cnff extends cnuw<cmxn> {
    public cnff(Context context, Looper looper, cnum cnumVar, cnpv cnpvVar, cnsi cnsiVar) {
        super(context, looper, 13, cnumVar, cnpvVar, cnsiVar);
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.car.service.START";
    }

    @Override // defpackage.cnui
    protected final String b() {
        return "com.google.android.gms.car.ICar";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 18712000;
    }

    @Override // defpackage.cnui
    protected final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICar");
        return queryLocalInterface instanceof cmxn ? (cmxn) queryLocalInterface : new cmxm(iBinder);
    }

    @Override // defpackage.cnui
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", "car-1-0");
        return bundle;
    }
}
