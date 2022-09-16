package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: qao  reason: default package */
/* loaded from: classes4.dex */
public final class qao extends qaq {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ qeo c;
    final /* synthetic */ qap d;

    public qao(qap qapVar, Context context, String str, qeo qeoVar) {
        this.d = qapVar;
        this.a = context;
        this.b = str;
        this.c = qeoVar;
    }

    @Override // defpackage.qaq
    protected final /* bridge */ /* synthetic */ Object a() {
        qap.a(this.a, "native_ad");
        return new qbh();
    }

    @Override // defpackage.qaq
    public final /* bridge */ /* synthetic */ Object b() {
        Object qbgVar;
        qdb.b(this.a);
        if (((Boolean) qdb.A.e()).booleanValue()) {
            try {
                IBinder a = ((qbj) qge.b(this.a, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", qaj.c)).a(rac.a(this.a), this.b, this.c);
                if (a == null) {
                    return null;
                }
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (queryLocalInterface instanceof qbi) {
                    qbgVar = (qbi) queryLocalInterface;
                } else {
                    qbgVar = new qbg(a);
                }
            } catch (RemoteException | NullPointerException | qgd e) {
                this.d.c = qft.a(this.a);
                this.d.c.b(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        } else {
            qaf qafVar = this.d.b;
            Context context = this.a;
            String str = this.b;
            qeo qeoVar = this.c;
            try {
                IBinder a2 = ((qbj) qafVar.d(context)).a(rac.a(context), str, qeoVar);
                if (a2 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = a2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (queryLocalInterface2 instanceof qbi) {
                    qbgVar = (qbi) queryLocalInterface2;
                } else {
                    qbgVar = new qbg(a2);
                }
            } catch (RemoteException | rae e2) {
                qfl.f("Could not create remote builder for AdLoader.", e2);
                return null;
            }
        }
        return qbgVar;
    }

    @Override // defpackage.qaq
    public final /* bridge */ /* synthetic */ Object c(qbs qbsVar) {
        qbi qbgVar;
        rad a = rac.a(this.a);
        String str = this.b;
        qeo qeoVar = this.c;
        Parcel pv = qbsVar.pv();
        dve.i(pv, a);
        pv.writeString(str);
        dve.i(pv, qeoVar);
        pv.writeInt(213380000);
        Parcel pw = qbsVar.pw(3, pv);
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qbgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof qbi) {
                qbgVar = (qbi) queryLocalInterface;
            } else {
                qbgVar = new qbg(readStrongBinder);
            }
        }
        pw.recycle();
        return qbgVar;
    }
}
