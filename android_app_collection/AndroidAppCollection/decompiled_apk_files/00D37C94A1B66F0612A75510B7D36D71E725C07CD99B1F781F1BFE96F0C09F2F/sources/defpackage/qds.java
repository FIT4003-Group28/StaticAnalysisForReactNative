package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: qds  reason: default package */
/* loaded from: classes4.dex */
public final class qds {
    public final qdr a;

    public qds(qdr qdrVar) {
        rad rabVar;
        new pzj();
        this.a = qdrVar;
        Context context = null;
        try {
            Parcel pw = qdrVar.pw(9, qdrVar.pv());
            IBinder readStrongBinder = pw.readStrongBinder();
            if (readStrongBinder == null) {
                rabVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof rad) {
                    rabVar = (rad) queryLocalInterface;
                } else {
                    rabVar = new rab(readStrongBinder);
                }
            }
            pw.recycle();
            context = (Context) rac.b(rabVar);
        } catch (RemoteException | NullPointerException e) {
            qfl.c(e);
        }
        if (context != null) {
            pzs pzsVar = new pzs(context);
            try {
                qdr qdrVar2 = this.a;
                rad a = rac.a(pzsVar);
                Parcel pv = qdrVar2.pv();
                dve.i(pv, a);
                Parcel pw2 = qdrVar2.pw(10, pv);
                dve.j(pw2);
                pw2.recycle();
            } catch (RemoteException e2) {
                qfl.c(e2);
            }
        }
    }
}
