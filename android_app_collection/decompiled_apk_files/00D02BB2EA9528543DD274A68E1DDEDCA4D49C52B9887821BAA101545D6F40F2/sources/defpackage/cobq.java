package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cobq  reason: default package */
/* loaded from: classes.dex */
public final class cobq extends cla implements IInterface {
    public cobq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final coba e(coba cobaVar, String str, int i) {
        coba coayVar;
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeString(str);
        a.writeInt(i);
        Parcel Si = Si(2, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            coayVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof coba) {
                coayVar = (coba) queryLocalInterface;
            } else {
                coayVar = new coay(readStrongBinder);
            }
        }
        Si.recycle();
        return coayVar;
    }

    public final int f(coba cobaVar, String str, boolean z) {
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeString(str);
        a.writeInt(z ? 1 : 0);
        Parcel Si = Si(3, a);
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }

    public final coba g(coba cobaVar, String str, int i) {
        coba coayVar;
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeString(str);
        a.writeInt(i);
        Parcel Si = Si(4, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            coayVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof coba) {
                coayVar = (coba) queryLocalInterface;
            } else {
                coayVar = new coay(readStrongBinder);
            }
        }
        Si.recycle();
        return coayVar;
    }

    public final int h(coba cobaVar, String str, boolean z) {
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeString(str);
        a.writeInt(z ? 1 : 0);
        Parcel Si = Si(5, a);
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }

    public final int i() {
        Parcel Si = Si(6, a());
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }

    public final coba j(coba cobaVar, String str, boolean z, long j) {
        coba coayVar;
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeString(str);
        a.writeInt(z ? 1 : 0);
        a.writeLong(j);
        Parcel Si = Si(7, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            coayVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof coba) {
                coayVar = (coba) queryLocalInterface;
            } else {
                coayVar = new coay(readStrongBinder);
            }
        }
        Si.recycle();
        return coayVar;
    }

    public final coba k(coba cobaVar, String str, int i, coba cobaVar2) {
        coba coayVar;
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeString(str);
        a.writeInt(i);
        clc.f(a, cobaVar2);
        Parcel Si = Si(8, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            coayVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof coba) {
                coayVar = (coba) queryLocalInterface;
            } else {
                coayVar = new coay(readStrongBinder);
            }
        }
        Si.recycle();
        return coayVar;
    }
}
