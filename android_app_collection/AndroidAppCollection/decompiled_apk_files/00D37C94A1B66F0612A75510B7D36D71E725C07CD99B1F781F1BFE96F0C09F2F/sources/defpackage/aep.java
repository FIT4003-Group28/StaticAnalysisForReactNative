package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: aep  reason: default package */
/* loaded from: classes.dex */
public final class aep {
    public final ComponentName a;
    public final cl b;

    public aep(cl clVar, ComponentName componentName) {
        this.b = clVar;
        this.a = componentName;
    }

    public final Bundle a(String str, Bundle bundle) {
        try {
            cl clVar = this.b;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeString(str);
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            clVar.a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle2 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return bundle2;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
