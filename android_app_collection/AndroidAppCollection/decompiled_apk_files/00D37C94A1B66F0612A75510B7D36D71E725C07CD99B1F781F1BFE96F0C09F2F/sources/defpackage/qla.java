package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: qla  reason: default package */
/* loaded from: classes4.dex */
public final class qla extends dvc implements qlb {
    public qla(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // defpackage.qlb
    public final void a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        Parcel pv = pv();
        dve.g(pv, applicationMetadata);
        pv.writeString(str);
        pv.writeString(str2);
        dve.e(pv, z);
        px(4, pv);
    }

    @Override // defpackage.qlb
    public final void f(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(5, pv);
    }

    @Override // defpackage.qlb
    public final void g(ConnectionResult connectionResult) {
        Parcel pv = pv();
        dve.g(pv, connectionResult);
        px(3, pv);
    }

    @Override // defpackage.qlb
    public final void h(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(2, pv);
    }

    @Override // defpackage.qlb
    public final void i(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(7, pv);
    }

    @Override // defpackage.qlb
    public final void j(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        pv.writeInt(0);
        px(6, pv);
    }

    @Override // defpackage.qlb
    public final void k() {
        Parcel pv = pv();
        dve.g(pv, null);
        px(1, pv);
    }
}
