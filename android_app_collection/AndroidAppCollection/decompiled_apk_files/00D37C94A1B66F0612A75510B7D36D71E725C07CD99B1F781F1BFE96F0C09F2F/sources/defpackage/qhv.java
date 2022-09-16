package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qhv  reason: default package */
/* loaded from: classes4.dex */
public final class qhv implements qhy {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    public qhv(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.qhy
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        ose oseVar;
        if (iBinder == null) {
            oseVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof ose) {
                oseVar = (ose) queryLocalInterface;
            } else {
                oseVar = new ose(iBinder);
            }
        }
        String str = this.a;
        Bundle bundle = this.b;
        Parcel pv = oseVar.pv();
        pv.writeString(str);
        dve.g(pv, bundle);
        Parcel pw = oseVar.pw(2, pv);
        Bundle bundle2 = (Bundle) dve.a(pw, Bundle.CREATOR);
        pw.recycle();
        qhz.j(bundle2);
        String string = bundle2.getString("Error");
        if (bundle2.getBoolean("booleanResult")) {
            return null;
        }
        throw new qhr(string);
    }
}
