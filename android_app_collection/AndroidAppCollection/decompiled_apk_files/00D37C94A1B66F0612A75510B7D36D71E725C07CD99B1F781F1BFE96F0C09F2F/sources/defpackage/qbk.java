package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
/* compiled from: PG */
/* renamed from: qbk  reason: default package */
/* loaded from: classes4.dex */
public final class qbk extends dvc implements qbm {
    public qbk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // defpackage.qbm
    public final AdSizeParcel a() {
        Parcel pw = pw(12, pv());
        AdSizeParcel adSizeParcel = (AdSizeParcel) dve.a(pw, AdSizeParcel.CREATOR);
        pw.recycle();
        return adSizeParcel;
    }

    @Override // defpackage.qbm
    public final qcg f() {
        qcg qceVar;
        Parcel pw = pw(26, pv());
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qceVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof qcg) {
                qceVar = (qcg) queryLocalInterface;
            } else {
                qceVar = new qce(readStrongBinder);
            }
        }
        pw.recycle();
        return qceVar;
    }

    @Override // defpackage.qbm
    public final rad g() {
        rad rabVar;
        Parcel pw = pw(1, pv());
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
        return rabVar;
    }

    @Override // defpackage.qbm
    public final void h() {
        px(2, pv());
    }

    @Override // defpackage.qbm
    public final void i(AdRequestParcel adRequestParcel, qbc qbcVar) {
        Parcel pv = pv();
        dve.g(pv, adRequestParcel);
        dve.i(pv, qbcVar);
        px(43, pv);
    }

    @Override // defpackage.qbm
    public final void j() {
        px(5, pv());
    }

    @Override // defpackage.qbm
    public final void k() {
        px(6, pv());
    }

    @Override // defpackage.qbm
    public final void l(qaw qawVar) {
        Parcel pv = pv();
        dve.i(pv, qawVar);
        px(20, pv);
    }

    @Override // defpackage.qbm
    public final void m(qaz qazVar) {
        Parcel pv = pv();
        dve.i(pv, qazVar);
        px(7, pv);
    }

    @Override // defpackage.qbm
    public final void n(AdSizeParcel adSizeParcel) {
        Parcel pv = pv();
        dve.g(pv, adSizeParcel);
        px(13, pv);
    }

    @Override // defpackage.qbm
    public final void o(qbr qbrVar) {
        Parcel pv = pv();
        dve.i(pv, qbrVar);
        px(8, pv);
    }

    @Override // defpackage.qbm
    public final void p(qbw qbwVar) {
        Parcel pv = pv();
        dve.i(pv, qbwVar);
        px(45, pv);
    }

    @Override // defpackage.qbm
    public final void q(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(34, pv);
    }

    @Override // defpackage.qbm
    public final void r(qcc qccVar) {
        Parcel pv = pv();
        dve.i(pv, qccVar);
        px(42, pv);
    }

    @Override // defpackage.qbm
    public final void s(rad radVar) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        px(44, pv);
    }

    @Override // defpackage.qbm
    public final boolean t(AdRequestParcel adRequestParcel) {
        Parcel pv = pv();
        dve.g(pv, adRequestParcel);
        Parcel pw = pw(4, pv);
        boolean j = dve.j(pw);
        pw.recycle();
        return j;
    }

    @Override // defpackage.qbm
    public final void u() {
        Parcel pv = pv();
        dve.e(pv, false);
        px(22, pv);
    }
}
