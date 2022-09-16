package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: rcy  reason: default package */
/* loaded from: classes4.dex */
public final class rcy {
    boolean a;
    rcz b;

    public rcy(Context context, String str) {
        rcz rczVar;
        try {
            try {
                try {
                    IBinder d = ras.e(context, ras.a, "com.google.android.gms.ads.dynamite").d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d == null) {
                        rczVar = null;
                    } else {
                        IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof rcz) {
                            rczVar = (rcz) queryLocalInterface;
                        } else {
                            rczVar = new rcz(d);
                        }
                    }
                    this.b = rczVar;
                    rad a = rac.a(context);
                    rcz rczVar2 = this.b;
                    Parcel pv = rczVar2.pv();
                    dve.i(pv, a);
                    pv.writeString(str);
                    pv.writeString(null);
                    rczVar2.px(8, pv);
                    this.a = true;
                } catch (Exception e) {
                    throw new rcp(e);
                }
            } catch (Exception e2) {
                throw new rcp(e2);
            }
        } catch (RemoteException | NullPointerException | SecurityException | rcp unused) {
        }
    }

    public final rcx a(byte[] bArr) {
        return new rcx(this, bArr);
    }
}
