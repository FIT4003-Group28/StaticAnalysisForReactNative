package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: pzm  reason: default package */
/* loaded from: classes4.dex */
public final class pzm extends raf {
    private static final pzm a = new pzm();

    private pzm() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    public static pzp a(Context context, Executor executor, dnl dnlVar) {
        pzp pzpVar = null;
        if (dnlVar.g && f(context)) {
            pzpVar = a.e(dnlVar.e, context, dnlVar.f);
        }
        return pzpVar == null ? new pzo(context, executor, dnlVar) : pzpVar;
    }

    @Deprecated
    public static pzp b(String str, Context context, boolean z, boolean z2) {
        pzp pzpVar = null;
        if (z2 && f(context)) {
            pzpVar = a.e(str, context, z);
        }
        return pzpVar == null ? new pzo(str, context, z) : pzpVar;
    }

    private final pzp e(String str, Context context, boolean z) {
        IBinder readStrongBinder;
        pzp pznVar;
        rad a2 = rac.a(context);
        try {
            pzq pzqVar = (pzq) d(context);
            if (!z) {
                Parcel pv = pzqVar.pv();
                pv.writeString(str);
                dve.i(pv, a2);
                Parcel pw = pzqVar.pw(2, pv);
                readStrongBinder = pw.readStrongBinder();
                pw.recycle();
            } else {
                Parcel pv2 = pzqVar.pv();
                pv2.writeString(str);
                dve.i(pv2, a2);
                Parcel pw2 = pzqVar.pw(1, pv2);
                readStrongBinder = pw2.readStrongBinder();
                pw2.recycle();
            }
            if (readStrongBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            if (queryLocalInterface instanceof pzp) {
                pznVar = (pzp) queryLocalInterface;
            } else {
                pznVar = new pzn(readStrongBinder);
            }
            return pznVar;
        } catch (RemoteException | LinkageError | rae unused) {
            return null;
        }
    }

    private static boolean f(Context context) {
        return qrr.d.h(context, 12800000) == 0;
    }

    @Override // defpackage.raf
    protected final /* bridge */ /* synthetic */ Object c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        if (queryLocalInterface instanceof pzq) {
            return (pzq) queryLocalInterface;
        }
        return new pzq(iBinder);
    }
}
