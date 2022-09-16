package defpackage;

import com.google.android.apps.youtube.app.player.controls.ReportVideoController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FlagVideoEndpointOuterClass$FlagVideoEndpoint;
import j$.util.Optional;
import java.util.Map;
/* compiled from: PG */
/* renamed from: epy  reason: default package */
/* loaded from: classes3.dex */
public final class epy implements aafl {
    private final azqb a;
    private final ibm b;

    public epy(azqb azqbVar, ibm ibmVar) {
        this.a = azqbVar;
        this.b = ibmVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Optional a = this.b.a();
        if (a.isPresent()) {
            ((ibn) a.get()).q(((FlagVideoEndpointOuterClass$FlagVideoEndpoint) apzgVar.qm(FlagVideoEndpointOuterClass$FlagVideoEndpoint.flagVideoEndpoint)).b);
            return;
        }
        ReportVideoController reportVideoController = (ReportVideoController) this.a.get();
        asgn asgnVar = reportVideoController.f;
        if (asgnVar == null) {
            zep.b("Reporting options have never been set.");
            zag.q(reportVideoController.a, R.string.main_flagging_while_offline, 1);
            return;
        }
        reportVideoController.e.c();
        if (reportVideoController.b.t()) {
            reportVideoController.h(asgnVar);
        } else {
            reportVideoController.d.c(reportVideoController.a, null, new jym(reportVideoController, asgnVar));
        }
    }
}
