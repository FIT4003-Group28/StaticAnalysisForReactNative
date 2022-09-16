package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.vr.vrcore.logging.api.VREventParcelable;
/* compiled from: PG */
/* renamed from: axgn  reason: default package */
/* loaded from: classes2.dex */
public final class axgn extends dvc implements axgo {
    public axgn(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
    }

    @Override // defpackage.axgo
    public final void a(VREventParcelable vREventParcelable) {
        Parcel pv = pv();
        dve.g(pv, vREventParcelable);
        py(2, pv);
    }
}
