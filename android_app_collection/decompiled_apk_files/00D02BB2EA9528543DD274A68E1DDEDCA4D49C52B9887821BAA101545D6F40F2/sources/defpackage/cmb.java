package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cmb  reason: default package */
/* loaded from: classes5.dex */
public final class cmb extends cla implements IInterface {
    public cmb(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IStatusBarController");
    }

    public final void e() {
        Sk(3, a());
    }

    public final void f() {
        Sk(4, a());
    }

    public final void g() {
        Sk(5, a());
    }

    public final void h() {
        Sk(6, a());
    }

    public final void i() {
        Sk(7, a());
    }

    public final void j() {
        Sk(8, a());
    }

    public final void k() {
        Sk(9, a());
    }

    public final void l() {
        Sk(10, a());
    }

    public final void m() {
        Sk(11, a());
    }

    public final void n() {
        Sk(12, a());
    }

    public final void o(int i) {
        Parcel a = a();
        a.writeInt(i);
        Sk(13, a);
    }

    public final void p(boolean z) {
        Parcel a = a();
        a.writeInt(z ? 1 : 0);
        Sk(18, a);
    }

    public final void q(boolean z, boolean z2) {
        Parcel a = a();
        a.writeInt(z ? 1 : 0);
        a.writeInt(z2 ? 1 : 0);
        Sk(19, a);
    }

    public final void r(boolean z) {
        Parcel a = a();
        a.writeInt(z ? 1 : 0);
        Sk(21, a);
    }

    public final void s() {
        Parcel a = a();
        a.writeInt(2);
        Sk(20, a);
    }
}
