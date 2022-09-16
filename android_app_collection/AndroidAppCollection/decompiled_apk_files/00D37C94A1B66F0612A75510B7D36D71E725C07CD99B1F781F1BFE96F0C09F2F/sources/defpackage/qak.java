package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qak  reason: default package */
/* loaded from: classes4.dex */
public final class qak extends qaq {
    final /* synthetic */ Context a;
    final /* synthetic */ qeo b;

    public qak(Context context, qeo qeoVar) {
        this.a = context;
        this.b = qeoVar;
    }

    @Override // defpackage.qaq
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.qaq
    public final /* bridge */ /* synthetic */ Object b() {
        qfm qfmVar;
        rad a = rac.a(this.a);
        try {
            qfn qfnVar = (qfn) qge.b(this.a, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", qaj.a);
            qeo qeoVar = this.b;
            Parcel pv = qfnVar.pv();
            dve.i(pv, a);
            dve.i(pv, qeoVar);
            pv.writeInt(213380000);
            Parcel pw = qfnVar.pw(1, pv);
            IBinder readStrongBinder = pw.readStrongBinder();
            if (readStrongBinder == null) {
                qfmVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
                if (queryLocalInterface instanceof qfm) {
                    qfmVar = (qfm) queryLocalInterface;
                } else {
                    qfmVar = new qfm(readStrongBinder);
                }
            }
            pw.recycle();
            return qfmVar;
        } catch (RemoteException | NullPointerException | qgd unused) {
            return null;
        }
    }

    @Override // defpackage.qaq
    public final /* bridge */ /* synthetic */ Object c(qbs qbsVar) {
        qfm qfmVar;
        rad a = rac.a(this.a);
        qeo qeoVar = this.b;
        Parcel pv = qbsVar.pv();
        dve.i(pv, a);
        dve.i(pv, qeoVar);
        pv.writeInt(213380000);
        Parcel pw = qbsVar.pw(15, pv);
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qfmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof qfm) {
                qfmVar = (qfm) queryLocalInterface;
            } else {
                qfmVar = new qfm(readStrongBinder);
            }
        }
        pw.recycle();
        return qfmVar;
    }
}
