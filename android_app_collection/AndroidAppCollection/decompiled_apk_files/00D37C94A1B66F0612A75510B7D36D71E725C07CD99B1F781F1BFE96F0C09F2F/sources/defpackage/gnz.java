package defpackage;

import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gnz  reason: default package */
/* loaded from: classes3.dex */
public final class gnz implements aafl {
    private final oet a;

    public gnz(oet oetVar) {
        this.a = oetVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        oeu oeuVar = this.a.a;
        if (oeuVar == null) {
            return;
        }
        nml nmlVar = ((DefaultWatchPanelViewController) oeuVar).e;
        String str = (String) zew.K(map, "engagement_panel_id_key", String.class);
        if (str == null || !str.equals(nmlVar.i())) {
            nmlVar.C(apzgVar);
        } else {
            nmlVar.B(apzgVar);
        }
    }
}
