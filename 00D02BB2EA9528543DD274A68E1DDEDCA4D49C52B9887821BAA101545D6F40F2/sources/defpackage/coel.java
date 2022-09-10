package defpackage;

import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
/* compiled from: PG */
/* renamed from: coel  reason: default package */
/* loaded from: classes5.dex */
public abstract class coel extends clb implements coem {
    public coel() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                b((GoogleHelp) clc.d(parcel, GoogleHelp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                TogglingData togglingData = (TogglingData) clc.d(parcel, TogglingData.CREATOR);
                t();
                parcel2.writeNoException();
                return true;
            case 3:
                d();
                parcel2.writeNoException();
                return true;
            case 4:
                e();
                parcel2.writeNoException();
                return true;
            case 5:
                f();
                parcel2.writeNoException();
                return true;
            case 6:
                g();
                parcel2.writeNoException();
                return true;
            case 7:
                c();
                return true;
            case 8:
                h();
                return true;
            case 9:
                parcel.readInt();
                o();
                parcel2.writeNoException();
                return true;
            case 10:
                i();
                parcel2.writeNoException();
                return true;
            case 11:
                j();
                parcel2.writeNoException();
                return true;
            case 12:
                k();
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.createByteArray();
                s();
                parcel2.writeNoException();
                return true;
            case 14:
                l();
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.createByteArray();
                p();
                parcel2.writeNoException();
                return true;
            case 16:
                m();
                parcel2.writeNoException();
                return true;
            case 17:
                InProductHelp inProductHelp = (InProductHelp) clc.d(parcel, InProductHelp.CREATOR);
                q();
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.createByteArray();
                r();
                parcel2.writeNoException();
                return true;
            case 19:
                n();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
