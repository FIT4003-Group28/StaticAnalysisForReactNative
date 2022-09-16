package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: axgb  reason: default package */
/* loaded from: classes2.dex */
public final class axgb extends dvc implements axgd {
    public axgb(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IGvrLayout");
    }

    @Override // defpackage.axgd
    public final boolean enableAsyncReprojection(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        Parcel pw = pw(9, pv);
        boolean j = dve.j(pw);
        pw.recycle();
        return j;
    }

    @Override // defpackage.axgd
    public final boolean enableCardboardTriggerEmulation(axgj axgjVar) {
        throw null;
    }

    @Override // defpackage.axgd
    public final long getNativeGvrContext() {
        Parcel pw = pw(2, pv());
        long readLong = pw.readLong();
        pw.recycle();
        return readLong;
    }

    @Override // defpackage.axgd
    public final axgj getRootView() {
        axgj axghVar;
        Parcel pw = pw(3, pv());
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            axghVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
            if (queryLocalInterface instanceof axgj) {
                axghVar = (axgj) queryLocalInterface;
            } else {
                axghVar = new axgh(readStrongBinder);
            }
        }
        pw.recycle();
        return axghVar;
    }

    @Override // defpackage.axgd
    public final axgg getUiLayout() {
        Parcel pw = pw(4, pv());
        axgg asInterface = axgf.asInterface(pw.readStrongBinder());
        pw.recycle();
        return asInterface;
    }

    @Override // defpackage.axgd
    public final void onBackPressed() {
        throw null;
    }

    @Override // defpackage.axgd
    public final void onPause() {
        px(5, pv());
    }

    @Override // defpackage.axgd
    public final void onResume() {
        px(6, pv());
    }

    @Override // defpackage.axgd
    public final boolean setOnDonNotNeededListener(axgj axgjVar) {
        throw null;
    }

    @Override // defpackage.axgd
    public final void setPresentationView(axgj axgjVar) {
        Parcel pv = pv();
        dve.i(pv, axgjVar);
        px(8, pv);
    }

    @Override // defpackage.axgd
    public final void setReentryIntent(axgj axgjVar) {
        throw null;
    }

    @Override // defpackage.axgd
    public final void setStereoModeEnabled(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(11, pv);
    }

    @Override // defpackage.axgd
    public final void shutdown() {
        px(7, pv());
    }
}
