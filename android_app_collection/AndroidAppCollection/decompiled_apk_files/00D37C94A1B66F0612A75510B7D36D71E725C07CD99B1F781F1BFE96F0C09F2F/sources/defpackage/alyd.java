package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: alyd  reason: default package */
/* loaded from: classes.dex */
public abstract class alyd extends dvd implements alye {
    public alyd() {
        super("com.google.android.youtube.player.internal.IEmbedFragment");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        alyi alyiVar = null;
        alyb alybVar = null;
        alyb alybVar2 = null;
        switch (i) {
            case 1:
                alyy b = b();
                parcel2.writeNoException();
                dve.i(parcel2, b);
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                h();
                parcel2.writeNoException();
                return true;
            case 4:
                w(parcel.readString(), dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                u(parcel.readString(), dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 6:
                y(parcel.createStringArrayList(), dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 7:
                B();
                parcel2.writeNoException();
                return true;
            case 8:
                t(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle a = a();
                parcel2.writeNoException();
                dve.h(parcel2, a);
                return true;
            case 10:
                i((Bundle) dve.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 11:
                o();
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
                    if (queryLocalInterface instanceof alyi) {
                        alyiVar = (alyi) queryLocalInterface;
                    } else {
                        alyiVar = new alyg(readStrongBinder);
                    }
                }
                s(alyiVar);
                parcel2.writeNoException();
                return true;
            case 13:
                parcel2.writeNoException();
                return true;
            case 14:
                x(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                c();
                parcel2.writeNoException();
                return true;
            case 16:
                d();
                parcel2.writeNoException();
                return true;
            case 17:
                k();
                parcel2.writeNoException();
                return true;
            case 18:
                j();
                parcel2.writeNoException();
                return true;
            case 19:
                v(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 20:
                p(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                q(dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 22:
                r(dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.youtube.player.internal.IAsyncResultCallback");
                    if (queryLocalInterface2 instanceof alyb) {
                        alybVar2 = (alyb) queryLocalInterface2;
                    } else {
                        alybVar2 = new alyb(readStrongBinder2);
                    }
                }
                C(alybVar2);
                parcel2.writeNoException();
                return true;
            case 24:
                String readString = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.youtube.player.internal.IAsyncResultCallback");
                    if (queryLocalInterface3 instanceof alyb) {
                        alybVar = (alyb) queryLocalInterface3;
                    } else {
                        alybVar = new alyb(readStrongBinder3);
                    }
                }
                D(readString, alybVar);
                parcel2.writeNoException();
                return true;
            case 25:
                z(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                A();
                parcel2.writeNoException();
                return true;
            case 27:
                n(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 28:
                m(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 29:
                e(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 30:
                l(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 31:
                f(parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            case 32:
                g(parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
