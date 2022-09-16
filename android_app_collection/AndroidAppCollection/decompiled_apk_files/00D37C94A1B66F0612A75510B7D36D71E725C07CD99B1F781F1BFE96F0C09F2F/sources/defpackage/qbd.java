package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
/* compiled from: PG */
/* renamed from: qbd  reason: default package */
/* loaded from: classes4.dex */
public final class qbd extends dvc implements qbf {
    public qbd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // defpackage.qbf
    public final void a(AdRequestParcel adRequestParcel) {
        Parcel pv = pv();
        dve.g(pv, adRequestParcel);
        px(1, pv);
    }
}
