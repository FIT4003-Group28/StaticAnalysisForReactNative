package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cnjf  reason: default package */
/* loaded from: classes5.dex */
public final class cnjf extends cla implements IInterface {
    public cnjf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.IStartup");
    }

    public final cmxn e() {
        cmxn cmxmVar;
        Parcel Si = Si(13, a());
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            cmxmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICar");
            if (queryLocalInterface instanceof cmxn) {
                cmxmVar = (cmxn) queryLocalInterface;
            } else {
                cmxmVar = new cmxm(readStrongBinder);
            }
        }
        Si.recycle();
        return cmxmVar;
    }

    public final boolean f() {
        Parcel Si = Si(21, a());
        boolean a = clc.a(Si);
        Si.recycle();
        return a;
    }
}
