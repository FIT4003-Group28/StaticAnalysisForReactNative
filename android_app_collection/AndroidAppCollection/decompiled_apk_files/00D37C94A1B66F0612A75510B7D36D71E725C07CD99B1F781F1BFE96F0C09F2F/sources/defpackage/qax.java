package defpackage;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qax  reason: default package */
/* loaded from: classes4.dex */
public final class qax extends dvc implements qaz {
    public qax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // defpackage.qaz
    public final void a() {
        Parcel pv = pv();
        pv.writeInt(1);
        px(2, pv);
    }
}
