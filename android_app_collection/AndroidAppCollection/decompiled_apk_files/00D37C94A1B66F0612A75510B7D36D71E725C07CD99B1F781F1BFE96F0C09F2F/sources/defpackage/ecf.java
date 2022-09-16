package defpackage;

import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
/* compiled from: PG */
/* renamed from: ecf  reason: default package */
/* loaded from: classes3.dex */
public final class ecf {
    private final oet a;

    public ecf(oet oetVar) {
        this.a = oetVar;
    }

    public final nml a() {
        oeu oeuVar = this.a.a;
        if (oeuVar != null) {
            return ((DefaultWatchPanelViewController) oeuVar).e;
        }
        throw new wlb("Unable to acquire engagementPanelController");
    }
}
