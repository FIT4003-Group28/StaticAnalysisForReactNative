package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;
/* compiled from: PG */
/* renamed from: cnfq  reason: default package */
/* loaded from: classes5.dex */
public abstract class cnfq extends clb implements cnfr {
    public cnfq() {
        super("com.google.android.gms.car.input.IProxyInputConnection");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        cnfp cnfpVar;
        switch (i) {
            case 1:
                CharSequence b = b(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                clc.c(parcel2, b);
                return true;
            case 2:
                CharSequence c = c(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                clc.c(parcel2, c);
                return true;
            case 3:
                CharSequence d = d(parcel.readInt());
                parcel2.writeNoException();
                clc.c(parcel2, d);
                return true;
            case 4:
                int e = e(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(e);
                return true;
            case 5:
                boolean f = f(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(f ? 1 : 0);
                return true;
            case 6:
                boolean g = g(clc.b(parcel), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(g ? 1 : 0);
                return true;
            case 7:
                boolean h = h(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(h ? 1 : 0);
                return true;
            case 8:
                boolean i2 = i();
                parcel2.writeNoException();
                parcel2.writeInt(i2 ? 1 : 0);
                return true;
            case 9:
                boolean j = j(clc.b(parcel), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(j ? 1 : 0);
                return true;
            case 10:
                boolean k = k(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(k ? 1 : 0);
                return true;
            case 11:
                boolean l = l(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(l ? 1 : 0);
                return true;
            case 12:
                boolean m = m(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(m ? 1 : 0);
                return true;
            case 13:
                boolean n = n();
                parcel2.writeNoException();
                parcel2.writeInt(n ? 1 : 0);
                return true;
            case 14:
                boolean o = o();
                parcel2.writeNoException();
                parcel2.writeInt(o ? 1 : 0);
                return true;
            case 15:
                boolean p = p((KeyEvent) clc.d(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(p ? 1 : 0);
                return true;
            case 16:
                boolean q = q(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(q ? 1 : 0);
                return true;
            case 17:
                boolean r = r(clc.a(parcel));
                parcel2.writeNoException();
                parcel2.writeInt(r ? 1 : 0);
                return true;
            case 18:
                boolean s = s(parcel.readString(), (Bundle) clc.d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(s ? 1 : 0);
                return true;
            case 19:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    cnfpVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.input.ICarEditableListener");
                    if (queryLocalInterface instanceof cnfp) {
                        cnfpVar = (cnfp) queryLocalInterface;
                    } else {
                        cnfpVar = new cnfp(readStrongBinder);
                    }
                }
                u(cnfpVar);
                parcel2.writeNoException();
                return true;
            case 20:
                clc.a(parcel);
                t();
                return true;
            default:
                return false;
        }
    }
}
