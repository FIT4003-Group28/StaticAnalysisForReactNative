package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.Surface;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.car.TouchEventCompleteData;
/* compiled from: PG */
/* renamed from: cmxz  reason: default package */
/* loaded from: classes.dex */
public final class cmxz extends cla implements IInterface {
    public cmxz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarProjectionCallback");
    }

    public final void e() {
        Sk(1, a());
    }

    public final void f() {
        Sk(2, a());
    }

    public final void g() {
        Sk(3, a());
    }

    public final void h() {
        Sk(5, a());
    }

    public final void i() {
        Sk(6, a());
    }

    public final void j() {
        Sk(7, a());
    }

    public final void k(boolean z) {
        Parcel a = a();
        a.writeInt(z ? 1 : 0);
        Sk(9, a);
    }

    public final void l() {
        Sk(10, a());
    }

    public final void m(Bundle bundle) {
        Parcel a = a();
        clc.e(a, bundle);
        Sk(12, a);
    }

    public final void n() {
        Sk(15, a());
    }

    public final void o(cnfr cnfrVar, EditorInfo editorInfo) {
        Parcel a = a();
        clc.f(a, cnfrVar);
        clc.e(a, editorInfo);
        Sk(16, a);
    }

    public final void p() {
        Sk(17, a());
    }

    public final void q() {
        Sk(20, a());
    }

    public final void r(Intent intent) {
        Parcel a = a();
        clc.e(a, intent);
        Sk(21, a);
    }

    public final int s() {
        Parcel Si = Si(24, a());
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }

    public final void t() {
        Sk(27, a());
    }

    public final void u(Surface surface) {
        Parcel a = a();
        clc.e(a, surface);
        Sk(30, a);
    }

    public final void v(TouchEventCompleteData touchEventCompleteData) {
        Parcel a = a();
        clc.e(a, touchEventCompleteData);
        Sk(32, a);
    }

    public final void w(Bundle bundle) {
        Parcel a = a();
        clc.e(a, bundle);
        Sk(33, a);
    }

    public final void x() {
        Parcel a = a();
        a.writeInt(10);
        Sk(23, a);
    }
}
