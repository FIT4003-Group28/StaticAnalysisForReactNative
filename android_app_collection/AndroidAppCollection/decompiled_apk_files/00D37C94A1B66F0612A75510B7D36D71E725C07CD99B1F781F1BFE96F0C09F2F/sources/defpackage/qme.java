package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.Map;
/* compiled from: PG */
/* renamed from: qme  reason: default package */
/* loaded from: classes4.dex */
public final class qme extends dvc implements qmf {
    public qme(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // defpackage.qmf
    public final qkz a(rad radVar, CastOptions castOptions, qmh qmhVar, Map map) {
        qkz qkyVar;
        Parcel pv = pv();
        dve.i(pv, radVar);
        dve.g(pv, castOptions);
        dve.i(pv, qmhVar);
        pv.writeMap(map);
        Parcel pw = pw(1, pv);
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qkyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            if (queryLocalInterface instanceof qkz) {
                qkyVar = (qkz) queryLocalInterface;
            } else {
                qkyVar = new qky(readStrongBinder);
            }
        }
        pw.recycle();
        return qkyVar;
    }

    @Override // defpackage.qmf
    public final qlb f(CastOptions castOptions, rad radVar, qkx qkxVar) {
        qlb qlaVar;
        Parcel pv = pv();
        dve.g(pv, castOptions);
        dve.i(pv, radVar);
        dve.i(pv, qkxVar);
        Parcel pw = pw(3, pv);
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qlaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            if (queryLocalInterface instanceof qlb) {
                qlaVar = (qlb) queryLocalInterface;
            } else {
                qlaVar = new qla(readStrongBinder);
            }
        }
        pw.recycle();
        return qlaVar;
    }

    @Override // defpackage.qmf
    public final qlf g(rad radVar, rad radVar2, rad radVar3) {
        qlf qleVar;
        Parcel pv = pv();
        dve.i(pv, radVar);
        dve.i(pv, radVar2);
        dve.i(pv, radVar3);
        Parcel pw = pw(5, pv);
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qleVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            if (queryLocalInterface instanceof qlf) {
                qleVar = (qlf) queryLocalInterface;
            } else {
                qleVar = new qle(readStrongBinder);
            }
        }
        pw.recycle();
        return qleVar;
    }

    @Override // defpackage.qmf
    public final qlh h(String str, String str2, qlm qlmVar) {
        qlh qlgVar;
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeString(str2);
        dve.i(pv, qlmVar);
        Parcel pw = pw(2, pv);
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qlgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            if (queryLocalInterface instanceof qlh) {
                qlgVar = (qlh) queryLocalInterface;
            } else {
                qlgVar = new qlg(readStrongBinder);
            }
        }
        pw.recycle();
        return qlgVar;
    }

    @Override // defpackage.qmf
    public final qom i(rad radVar, qon qonVar, int i, int i2) {
        qom qolVar;
        Parcel pv = pv();
        dve.i(pv, radVar);
        dve.i(pv, qonVar);
        pv.writeInt(i);
        pv.writeInt(i2);
        dve.e(pv, false);
        pv.writeLong(2097152L);
        pv.writeInt(5);
        pv.writeInt(333);
        pv.writeInt(10000);
        Parcel pw = pw(6, pv);
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qolVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof qom) {
                qolVar = (qom) queryLocalInterface;
            } else {
                qolVar = new qol(readStrongBinder);
            }
        }
        pw.recycle();
        return qolVar;
    }
}
