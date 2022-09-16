package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.vr.vrcore.common.api.HeadTrackingState;
/* compiled from: PG */
/* renamed from: axfm  reason: default package */
/* loaded from: classes2.dex */
public final class axfm extends dvc implements axfn {
    public axfm(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.common.api.IDaydreamManager");
    }

    @Override // defpackage.axfn
    public final int a(ComponentName componentName, HeadTrackingState headTrackingState) {
        Parcel pv = pv();
        dve.g(pv, componentName);
        Parcel pw = pw(3, pv);
        int readInt = pw.readInt();
        if (pw.readInt() != 0) {
            headTrackingState.b(pw);
        }
        pw.recycle();
        return readInt;
    }

    @Override // defpackage.axfn
    public final int f(ComponentName componentName, int i, PendingIntent pendingIntent, HeadTrackingState headTrackingState) {
        Parcel pv = pv();
        dve.g(pv, componentName);
        pv.writeInt(i);
        dve.g(pv, pendingIntent);
        Parcel pw = pw(13, pv);
        int readInt = pw.readInt();
        if (pw.readInt() != 0) {
            headTrackingState.b(pw);
        }
        pw.recycle();
        return readInt;
    }

    @Override // defpackage.axfn
    public final int g(Bundle bundle, HeadTrackingState headTrackingState) {
        Parcel pv = pv();
        dve.g(pv, bundle);
        Parcel pw = pw(16, pv);
        int readInt = pw.readInt();
        if (pw.readInt() != 0) {
            headTrackingState.b(pw);
        }
        pw.recycle();
        return readInt;
    }

    @Override // defpackage.axfn
    public final void h() {
        py(14, pv());
    }

    @Override // defpackage.axfn
    public final void i(PendingIntent pendingIntent) {
        Parcel pv = pv();
        dve.g(pv, pendingIntent);
        py(5, pv);
    }

    @Override // defpackage.axfn
    public final void j() {
        py(6, pv());
    }

    @Override // defpackage.axfn
    public final boolean k(PendingIntent pendingIntent) {
        Parcel pv = pv();
        dve.g(pv, pendingIntent);
        Parcel pw = pw(10, pv);
        boolean j = dve.j(pw);
        pw.recycle();
        return j;
    }

    @Override // defpackage.axfn
    public final boolean l(Bundle bundle) {
        Parcel pv = pv();
        dve.g(pv, bundle);
        Parcel pw = pw(17, pv);
        boolean j = dve.j(pw);
        pw.recycle();
        return j;
    }

    @Override // defpackage.axfn
    public final boolean m() {
        Parcel pw = pw(8, pv());
        boolean j = dve.j(pw);
        pw.recycle();
        return j;
    }

    @Override // defpackage.axfn
    public final boolean n(axfp axfpVar) {
        Parcel pv = pv();
        dve.i(pv, axfpVar);
        Parcel pw = pw(9, pv);
        boolean j = dve.j(pw);
        pw.recycle();
        return j;
    }

    @Override // defpackage.axfn
    public final void o(PendingIntent pendingIntent, ComponentName componentName) {
        Parcel pv = pv();
        dve.g(pv, pendingIntent);
        dve.g(pv, componentName);
        Parcel pw = pw(7, pv);
        dve.j(pw);
        pw.recycle();
    }

    @Override // defpackage.axfn
    public final void p(ComponentName componentName, axfl axflVar) {
        Parcel pv = pv();
        dve.g(pv, componentName);
        dve.i(pv, axflVar);
        Parcel pw = pw(1, pv);
        dve.j(pw);
        pw.recycle();
    }

    @Override // defpackage.axfn
    public final void q(ComponentName componentName) {
        Parcel pv = pv();
        dve.g(pv, componentName);
        Parcel pw = pw(2, pv);
        dve.j(pw);
        pw.recycle();
    }
}
