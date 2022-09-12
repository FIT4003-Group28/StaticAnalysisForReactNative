package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: cmrs  reason: default package */
/* loaded from: classes5.dex */
final class cmrs extends cnuw<cmrz> {
    public cmrs(Context context, Looper looper, cnum cnumVar, cnpv cnpvVar, cnsi cnsiVar) {
        super(context, looper, 224, cnumVar, cnpvVar, cnsiVar);
    }

    @Override // defpackage.cnui
    public final Feature[] Sm() {
        return new Feature[]{cmqy.a, cmqy.b};
    }

    @Override // defpackage.cnui
    protected final boolean Sn() {
        return true;
    }

    @Override // defpackage.cnui
    public final boolean So() {
        return true;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // defpackage.cnui
    protected final String b() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 17895000;
    }

    @Override // defpackage.cnui
    protected final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return queryLocalInterface instanceof cmrz ? (cmrz) queryLocalInterface : new cmrz(iBinder);
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final void h(String str) {
        if (String.valueOf(str).length() == 0) {
            new String("GoogleAuthServiceClientImpl disconnected with reason: ");
        }
        super.h(str);
    }
}
