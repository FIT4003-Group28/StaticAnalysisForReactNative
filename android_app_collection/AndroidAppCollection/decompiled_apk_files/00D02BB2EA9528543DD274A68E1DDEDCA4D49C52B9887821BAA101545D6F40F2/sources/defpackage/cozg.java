package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.signin.internal.SignInRequest;
/* compiled from: PG */
/* renamed from: cozg  reason: default package */
/* loaded from: classes5.dex */
public final class cozg extends cla implements IInterface {
    public cozg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void e(int i) {
        Parcel a = a();
        a.writeInt(i);
        Sk(7, a);
    }

    public final void f(SignInRequest signInRequest, cozf cozfVar) {
        Parcel a = a();
        clc.e(a, signInRequest);
        clc.f(a, cozfVar);
        Sk(12, a);
    }

    public final void g(cnvj cnvjVar, int i, boolean z) {
        Parcel a = a();
        clc.f(a, cnvjVar);
        a.writeInt(i);
        a.writeInt(z ? 1 : 0);
        Sk(9, a);
    }
}
