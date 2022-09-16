package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
/* compiled from: PG */
/* renamed from: qag  reason: default package */
/* loaded from: classes4.dex */
public final class qag extends raf {
    private qfv a;

    public qag() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final qbm a(Context context, AdSizeParcel adSizeParcel, String str, qeo qeoVar, int i) {
        qbm qbkVar;
        qbm qbkVar2;
        qdb.b(context);
        if (((Boolean) qdb.A.e()).booleanValue()) {
            try {
                IBinder a = ((qbn) qge.b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", qaj.b)).a(rac.a(context), adSizeParcel, str, qeoVar, i);
                if (a == null) {
                    return null;
                }
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof qbm) {
                    qbkVar = (qbm) queryLocalInterface;
                } else {
                    qbkVar = new qbk(a);
                }
                return qbkVar;
            } catch (RemoteException | NullPointerException | qgd e) {
                qfv a2 = qft.a(context);
                this.a = a2;
                a2.b(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                qfl.h("#007 Could not call remote method.", e);
                return null;
            }
        }
        try {
            IBinder a3 = ((qbn) d(context)).a(rac.a(context), adSizeParcel, str, qeoVar, i);
            if (a3 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = a3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface2 instanceof qbm) {
                qbkVar2 = (qbm) queryLocalInterface2;
            } else {
                qbkVar2 = new qbk(a3);
            }
            return qbkVar2;
        } catch (RemoteException | rae unused) {
            return null;
        }
    }

    @Override // defpackage.raf
    protected final /* bridge */ /* synthetic */ Object c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof qbn) {
            return (qbn) queryLocalInterface;
        }
        return new qbn(iBinder);
    }
}
