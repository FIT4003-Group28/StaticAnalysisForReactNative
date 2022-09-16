package defpackage;

import com.google.protos.youtube.api.innertube.ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ery  reason: default package */
/* loaded from: classes3.dex */
public final class ery implements aafl {
    private final nmu a;
    private final aacz b;

    public ery(nmu nmuVar, aacz aaczVar) {
        this.a = nmuVar;
        this.b = aaczVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aqvl aqvlVar;
        ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand = (ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand) apzgVar.qm(ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.toggleEngagementPanelCommand);
        nmu nmuVar = this.a;
        if (toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.b == 2) {
            aqvlVar = (aqvl) toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.c;
        } else {
            aqvlVar = aqvl.a;
        }
        aqvk b = aqvk.b(aqvlVar.c);
        if (b == null) {
            b = aqvk.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
        }
        nml a = nmuVar.a(b);
        String f = ntr.f(toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand);
        if (amps.e(f)) {
            return;
        }
        if (!a.w(f)) {
            boolean z = false;
            if (eog.aC(this.b) && ((Boolean) zew.J(map, "triggered_on_ui_ready", false)).booleanValue()) {
                z = true;
            }
            a.f(apzgVar, null, z, true);
            return;
        }
        a.p();
    }
}
