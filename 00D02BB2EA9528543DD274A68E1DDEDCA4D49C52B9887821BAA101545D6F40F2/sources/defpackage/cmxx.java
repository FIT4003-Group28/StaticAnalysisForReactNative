package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
/* compiled from: PG */
/* renamed from: cmxx  reason: default package */
/* loaded from: classes.dex */
public abstract class cmxx extends clb implements cmxy {
    public cmxx() {
        super("com.google.android.gms.car.ICarProjection");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        cmxz cmxzVar;
        cmxn cmxnVar = null;
        cmxz cmxzVar2 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    cmxzVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarProjectionCallback");
                    if (queryLocalInterface instanceof cmxz) {
                        cmxzVar = (cmxz) queryLocalInterface;
                    } else {
                        cmxzVar = new cmxz(readStrongBinder);
                    }
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICar");
                    if (queryLocalInterface2 instanceof cmxn) {
                        cmxnVar = (cmxn) queryLocalInterface2;
                    } else {
                        cmxnVar = new cmxm(readStrongBinder2);
                    }
                }
                z(cmxzVar, cmxnVar);
                return true;
            case 2:
                b(parcel.readInt(), (DrawingSpec) clc.d(parcel, DrawingSpec.CREATOR), (Intent) clc.d(parcel, Intent.CREATOR), (Bundle) clc.d(parcel, Bundle.CREATOR));
                return true;
            case 3:
                c((Intent) clc.d(parcel, Intent.CREATOR));
                return true;
            case 4:
                parcel.readInt();
                w();
                return true;
            case 5:
                parcel.readInt();
                v();
                return true;
            case 6:
                parcel.readInt();
                y(parcel.readInt(), (DrawingSpec) clc.d(parcel, DrawingSpec.CREATOR), (Configuration) clc.d(parcel, Configuration.CREATOR));
                return true;
            case 7:
                d(parcel.readInt(), (MotionEvent) clc.d(parcel, MotionEvent.CREATOR));
                return true;
            case 8:
                parcel.readInt();
                u((KeyEvent) clc.d(parcel, KeyEvent.CREATOR));
                return true;
            case 9:
                parcel.readInt();
                x();
                return true;
            case 10:
                e(clc.a(parcel));
                return true;
            case 11:
                f();
                return true;
            case 12:
                g();
                return true;
            case 13:
                h();
                return true;
            case 14:
                i();
                return true;
            case 15:
                j(parcel.readInt());
                return true;
            case 16:
                k(parcel.readInt());
                return true;
            case 17:
                l((DrawingSpec) clc.d(parcel, DrawingSpec.CREATOR));
                return true;
            case 18:
                m(clc.a(parcel), clc.a(parcel));
                return true;
            case 19:
                n(parcel.readStrongBinder());
                return true;
            case 20:
                o((InputFocusChangedEvent) clc.d(parcel, InputFocusChangedEvent.CREATOR));
                return true;
            case 21:
                p((CarWindowManagerLayoutParams) clc.d(parcel, CarWindowManagerLayoutParams.CREATOR));
                return true;
            case 22:
                q((Rect) clc.d(parcel, Rect.CREATOR));
                return true;
            case 23:
                r(parcel.readInt(), (DrawingSpec) clc.d(parcel, DrawingSpec.CREATOR), (Intent) clc.d(parcel, Intent.CREATOR), (Configuration) clc.d(parcel, Configuration.CREATOR), (Bundle) clc.d(parcel, Bundle.CREATOR));
                return true;
            case 24:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.car.ICarProjectionCallback");
                    if (queryLocalInterface3 instanceof cmxz) {
                        cmxzVar2 = (cmxz) queryLocalInterface3;
                    } else {
                        cmxzVar2 = new cmxz(readStrongBinder3);
                    }
                }
                A(cmxzVar2);
                return true;
            case 25:
                s();
                return true;
            case 26:
                t(parcel.readInt(), parcel.readInt(), (DrawingSpec) clc.d(parcel, DrawingSpec.CREATOR), (Intent) clc.d(parcel, Intent.CREATOR), (Configuration) clc.d(parcel, Configuration.CREATOR), (Bundle) clc.d(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
