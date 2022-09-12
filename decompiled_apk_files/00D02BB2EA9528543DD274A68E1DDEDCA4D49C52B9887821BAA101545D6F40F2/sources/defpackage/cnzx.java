package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: cnzx  reason: default package */
/* loaded from: classes5.dex */
public final class cnzx extends cnuw<coah> {
    public cnzx(Context context, Looper looper, cnpv cnpvVar, cnsi cnsiVar) {
        super(context, looper, 25, cnum.a(context), cnpvVar, cnsiVar);
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.droidguard.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
        return queryLocalInterface instanceof coah ? (coah) queryLocalInterface : new coah(iBinder);
    }
}
