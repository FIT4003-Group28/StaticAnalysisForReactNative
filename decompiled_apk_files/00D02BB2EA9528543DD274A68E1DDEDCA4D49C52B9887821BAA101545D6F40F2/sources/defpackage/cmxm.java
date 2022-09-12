package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmxm  reason: default package */
/* loaded from: classes5.dex */
public final class cmxm extends cla implements cmxn {
    public cmxm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICar");
    }

    @Override // defpackage.cmxn
    public final CarInfo e() {
        Parcel Si = Si(1, a());
        CarInfo carInfo = (CarInfo) clc.d(Si, CarInfo.CREATOR);
        Si.recycle();
        return carInfo;
    }

    @Override // defpackage.cmxn
    public final CarUiInfo f() {
        Parcel Si = Si(2, a());
        CarUiInfo carUiInfo = (CarUiInfo) clc.d(Si, CarUiInfo.CREATOR);
        Si.recycle();
        return carUiInfo;
    }

    @Override // defpackage.cmxn
    public final boolean g() {
        Parcel Si = Si(3, a());
        boolean a = clc.a(Si);
        Si.recycle();
        return a;
    }

    @Override // defpackage.cmxn
    public final void h(cmxt cmxtVar) {
        Parcel a = a();
        clc.f(a, cmxtVar);
        Sk(5, a);
    }

    @Override // defpackage.cmxn
    public final void i(cmxt cmxtVar) {
        Parcel a = a();
        clc.f(a, cmxtVar);
        Sk(6, a);
    }

    @Override // defpackage.cmxn
    public final boolean j(Intent intent) {
        Parcel a = a();
        clc.e(a, intent);
        Parcel Si = Si(10, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    @Override // defpackage.cmxn
    public final void k(byte[] bArr, int i) {
        Parcel a = a();
        a.writeByteArray(bArr);
        a.writeInt(58);
        Sk(48, a);
    }

    @Override // defpackage.cmxn
    public final void l(cmye cmyeVar) {
        Parcel a = a();
        clc.f(a, cmyeVar);
        Sk(65, a);
    }

    @Override // defpackage.cmxn
    public final void m(cmye cmyeVar) {
        Parcel a = a();
        clc.f(a, cmyeVar);
        Sk(66, a);
    }

    @Override // defpackage.cmxn
    public final String n(String str, String str2) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        Parcel Si = Si(72, a);
        String readString = Si.readString();
        Si.recycle();
        return readString;
    }

    @Override // defpackage.cmxn
    public final boolean o(String str) {
        Parcel a = a();
        a.writeString(str);
        a.writeInt(0);
        Parcel Si = Si(19, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    @Override // defpackage.cmxn
    public final boolean p(String str) {
        Parcel a = a();
        a.writeString(str);
        a.writeInt(0);
        Parcel Si = Si(71, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    @Override // defpackage.cmxn
    public final int q(String str) {
        Parcel a = a();
        a.writeString(str);
        a.writeInt(0);
        Parcel Si = Si(68, a);
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }

    @Override // defpackage.cmxn
    public final List<String> r(List<String> list) {
        Parcel a = a();
        a.writeString("car_module_feature_set");
        a.writeStringList(list);
        Parcel Si = Si(55, a);
        ArrayList<String> createStringArrayList = Si.createStringArrayList();
        Si.recycle();
        return createStringArrayList;
    }

    @Override // defpackage.cmxn
    public final cmya s() {
        cmya cmyaVar;
        Parcel Si = Si(7, a());
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            cmyaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarSensor");
            if (queryLocalInterface instanceof cmya) {
                cmyaVar = (cmya) queryLocalInterface;
            } else {
                cmyaVar = new cmya(readStrongBinder);
            }
        }
        Si.recycle();
        return cmyaVar;
    }

    @Override // defpackage.cmxn
    public final cmxu t() {
        cmxu cmxuVar;
        Parcel Si = Si(17, a());
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            cmxuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarMessage");
            if (queryLocalInterface instanceof cmxu) {
                cmxuVar = (cmxu) queryLocalInterface;
            } else {
                cmxuVar = new cmxu(readStrongBinder);
            }
        }
        Si.recycle();
        return cmxuVar;
    }

    @Override // defpackage.cmxn
    public final cnfb u() {
        cnfb cnfbVar;
        Parcel Si = Si(77, a());
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            cnfbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayManager");
            if (queryLocalInterface instanceof cnfb) {
                cnfbVar = (cnfb) queryLocalInterface;
            } else {
                cnfbVar = new cnfb(readStrongBinder);
            }
        }
        Si.recycle();
        return cnfbVar;
    }
}
