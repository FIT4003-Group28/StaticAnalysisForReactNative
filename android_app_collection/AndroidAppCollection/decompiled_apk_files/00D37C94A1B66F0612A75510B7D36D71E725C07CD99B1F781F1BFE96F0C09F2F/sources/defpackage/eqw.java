package defpackage;

import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.RefreshPanelEndpointOuterClass$RefreshPanelEndpoint;
import com.google.protos.youtube.api.innertube.SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eqw  reason: default package */
/* loaded from: classes3.dex */
public final class eqw implements aafl {
    private final nmu a;
    private final /* synthetic */ int b;

    public eqw(nmu nmuVar) {
        this.a = nmuVar;
    }

    public eqw(nmu nmuVar, int i) {
        this.b = i;
        this.a = nmuVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        nml a;
        int i = this.b;
        if (i == 0) {
            String str = ((RefreshPanelEndpointOuterClass$RefreshPanelEndpoint) apzgVar.qm(RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.refreshPanelEndpoint)).b;
            if (amps.e(str)) {
                str = (String) zew.K(map, "engagement_panel_id_key", String.class);
            }
            if (amps.e(str)) {
                return;
            }
            nmc b = ((nml) this.a.b().aw()).b(str);
            if (!(b instanceof nmb)) {
                return;
            }
            ((nmb) b).B();
            return;
        }
        String str2 = null;
        if (i != 1) {
            SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand = (SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand) apzgVar.qm(SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.setEngagementPanelActivelyEngagingCommand);
            if (((setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.c == 3 ? (aqvl) setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.d : aqvl.a).b & 2) != 0) {
                str2 = (setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.c == 3 ? (aqvl) setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.d : aqvl.a).d;
            } else if (setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.c == 1) {
                str2 = (String) setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.d;
            }
            if (str2 == null || (setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.b & 4) == 0) {
                return;
            }
            nmu nmuVar = this.a;
            aqvk b2 = aqvk.b((setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.c == 3 ? (aqvl) setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.d : aqvl.a).c);
            if (b2 == null) {
                b2 = aqvk.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
            }
            nmuVar.a(b2).v(str2, setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.e);
            return;
        }
        HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) apzgVar.qm(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint);
        if (apzgVar.qn(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint)) {
            if (((hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c == 4 ? (aqvl) hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d : aqvl.a).b & 2) != 0) {
                str2 = (hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c == 4 ? (aqvl) hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d : aqvl.a).d;
            } else if (hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c == 1) {
                str2 = (String) hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d;
            }
        }
        if (amps.e(str2)) {
            str2 = (String) zew.K(map, "engagement_panel_id_key", String.class);
        }
        if (amps.e(str2)) {
            return;
        }
        if (hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.g) {
            a = (nml) this.a.b().aw();
        } else {
            nmu nmuVar2 = this.a;
            aqvk b3 = aqvk.b((hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c == 4 ? (aqvl) hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d : aqvl.a).c);
            if (b3 == null) {
                b3 = aqvk.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
            }
            a = nmuVar2.a(b3);
        }
        if (a.z(hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint)) {
            return;
        }
        str2.getClass();
        a.n(new eqa(str2));
    }
}
