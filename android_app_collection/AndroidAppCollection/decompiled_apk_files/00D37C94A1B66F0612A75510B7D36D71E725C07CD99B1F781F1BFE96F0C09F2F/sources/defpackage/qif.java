package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: qif  reason: default package */
/* loaded from: classes4.dex */
public final class qif extends qxb {
    public qif(Context context, Looper looper, qwu qwuVar, qub qubVar, qvh qvhVar) {
        super(context, looper, 224, qwuVar, qubVar, qvhVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        if (queryLocalInterface instanceof qii) {
            return (qii) queryLocalInterface;
        }
        return new qih(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // defpackage.qwr, defpackage.qsn
    public final void f(String str) {
        String valueOf = String.valueOf(str);
        Log.w("GoogleAuthSvcClientImpl", valueOf.length() != 0 ? "GoogleAuthServiceClientImpl disconnected with reason: ".concat(valueOf) : new String("GoogleAuthServiceClientImpl disconnected with reason: "));
        super.f(str);
    }

    @Override // defpackage.qwr
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return new Feature[]{qhq.b, qhq.c, qhq.a};
    }
}
