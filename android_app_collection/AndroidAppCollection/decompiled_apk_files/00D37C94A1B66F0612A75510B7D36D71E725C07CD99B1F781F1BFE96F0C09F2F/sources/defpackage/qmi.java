package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qmi  reason: default package */
/* loaded from: classes4.dex */
public final class qmi extends dvc implements qmj {
    public qmi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    @Override // defpackage.qmj
    public final void a(String str, Bundle bundle) {
        Parcel pv = pv();
        pv.writeString(str);
        dve.g(pv, bundle);
        px(1, pv);
    }

    @Override // defpackage.qmj
    public final void f(String str, Bundle bundle) {
        Parcel pv = pv();
        pv.writeString(str);
        dve.g(pv, bundle);
        px(2, pv);
    }

    @Override // defpackage.qmj
    public final void g(String str, Bundle bundle) {
        Parcel pv = pv();
        pv.writeString(str);
        dve.g(pv, bundle);
        px(3, pv);
    }

    @Override // defpackage.qmj
    public final void h(String str, Bundle bundle) {
        Parcel pv = pv();
        pv.writeString(str);
        dve.g(pv, bundle);
        px(4, pv);
    }

    @Override // defpackage.qmj
    public final void i(String str, Bundle bundle, int i) {
        Parcel pv = pv();
        pv.writeString(str);
        dve.g(pv, bundle);
        pv.writeInt(i);
        px(6, pv);
    }
}
