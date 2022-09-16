package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cobr  reason: default package */
/* loaded from: classes.dex */
public final class cobr extends cla implements IInterface {
    public cobr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final coba e(coba cobaVar, String str, int i, coba cobaVar2) {
        coba coayVar;
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeString(str);
        a.writeInt(i);
        clc.f(a, cobaVar2);
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

    public final coba f(coba cobaVar, String str, int i, coba cobaVar2) {
        coba coayVar;
        Parcel a = a();
        clc.f(a, cobaVar);
        a.writeString(str);
        a.writeInt(i);
        clc.f(a, cobaVar2);
        Parcel Si = Si(3, a);
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
