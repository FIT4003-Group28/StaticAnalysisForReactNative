package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.CarUiInfo;
/* compiled from: PG */
/* renamed from: cnew  reason: default package */
/* loaded from: classes5.dex */
public final class cnew extends cla implements IInterface {
    public cnew(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplay");
    }

    public final CarUiInfo e() {
        Parcel Si = Si(3, a());
        CarUiInfo carUiInfo = (CarUiInfo) clc.d(Si, CarUiInfo.CREATOR);
        Si.recycle();
        return carUiInfo;
    }

    public final void f(cmye cmyeVar) {
        Parcel a = a();
        clc.f(a, cmyeVar);
        Sk(4, a);
    }

    public final void g(cmye cmyeVar) {
        Parcel a = a();
        clc.f(a, cmyeVar);
        Sk(5, a);
    }

    public final void h(cney cneyVar) {
        Parcel a = a();
        clc.f(a, cneyVar);
        Sk(7, a);
    }

    public final void i(cney cneyVar) {
        Parcel a = a();
        clc.f(a, cneyVar);
        Sk(8, a);
    }

    public final void j(cnfa cnfaVar) {
        Parcel a = a();
        clc.f(a, cnfaVar);
        Sk(10, a);
    }

    public final void k(cnfa cnfaVar) {
        Parcel a = a();
        clc.f(a, cnfaVar);
        Sk(11, a);
    }
}
