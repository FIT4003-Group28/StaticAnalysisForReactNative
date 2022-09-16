package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: rhh  reason: default package */
/* loaded from: classes4.dex */
public final class rhh extends dvc implements rhj {
    public rhh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.rhj
    public final void a(Bundle bundle) {
        Parcel pv = pv();
        dve.g(pv, bundle);
        px(1, pv);
    }
}
