package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cj  reason: default package */
/* loaded from: classes2.dex */
public final class cj extends Binder implements ck {
    public final /* synthetic */ aen a;
    private Handler b;

    public cj() {
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public cj(aen aenVar) {
        this.a = aenVar;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        switch (i) {
            case 2:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                this.b.post(new aeo(this, 1));
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                    Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                this.b.post(new aeo(this));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                if (parcel.readInt() != 0) {
                    Bundle bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                this.b.post(new aeo(this, 2));
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                    Bundle bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                this.b.post(new aeo(this, 3));
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    Uri uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    Bundle bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                this.b.post(new bhj(1));
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                    Bundle bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
