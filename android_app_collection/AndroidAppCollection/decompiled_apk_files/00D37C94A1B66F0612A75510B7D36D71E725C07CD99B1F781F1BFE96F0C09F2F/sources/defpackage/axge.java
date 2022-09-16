package defpackage;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: axge  reason: default package */
/* loaded from: classes2.dex */
public final class axge extends dvc implements axgg {
    public axge(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IGvrUiLayout");
    }

    @Override // defpackage.axgg
    public final axgj getRootView() {
        throw null;
    }

    @Override // defpackage.axgg
    public final boolean isEnabled() {
        throw null;
    }

    @Override // defpackage.axgg
    public final void setCloseButtonListener(axgj axgjVar) {
        Parcel pv = pv();
        dve.i(pv, axgjVar);
        px(5, pv);
    }

    @Override // defpackage.axgg
    public final void setEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.axgg
    public final void setSettingsButtonEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.axgg
    public final void setSettingsButtonListener(axgj axgjVar) {
        throw null;
    }

    @Override // defpackage.axgg
    public final void setTransitionViewEnabled(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(6, pv);
    }

    @Override // defpackage.axgg
    public final void setTransitionViewListener(axgj axgjVar) {
        throw null;
    }

    @Override // defpackage.axgg
    public final void setViewerName(String str) {
        Parcel pv = pv();
        pv.writeString(str);
        px(10, pv);
    }
}
