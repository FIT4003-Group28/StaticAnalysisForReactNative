package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
/* compiled from: PG */
/* renamed from: qer  reason: default package */
/* loaded from: classes4.dex */
public final class qer extends dvc implements qet {
    public qer(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // defpackage.qet
    public final void a() {
        px(1, pv());
    }

    @Override // defpackage.qet
    public final void f() {
        px(2, pv());
    }

    @Override // defpackage.qet
    public final void g(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(3, pv);
    }

    @Override // defpackage.qet
    public final void h(AdErrorParcel adErrorParcel) {
        Parcel pv = pv();
        dve.g(pv, adErrorParcel);
        px(23, pv);
    }

    @Override // defpackage.qet
    public final void i() {
        px(8, pv());
    }

    @Override // defpackage.qet
    public final void j() {
        px(6, pv());
    }

    @Override // defpackage.qet
    public final void k() {
        px(5, pv());
    }

    @Override // defpackage.qet
    public final void l(String str, String str2) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeString(str2);
        px(9, pv);
    }

    @Override // defpackage.qet
    public final void m(qdr qdrVar, String str) {
        Parcel pv = pv();
        dve.i(pv, qdrVar);
        pv.writeString(str);
        px(10, pv);
    }
}
