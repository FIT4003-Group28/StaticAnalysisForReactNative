package defpackage;

import com.google.protos.youtube.api.innertube.DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gqc  reason: default package */
/* loaded from: classes3.dex */
public final class gqc implements aafl {
    private final aafo a;
    private final gpz b;

    public gqc(aafo aafoVar, gpz gpzVar) {
        aafoVar.getClass();
        this.a = aafoVar;
        this.b = gpzVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        apzgVar.getClass();
        if (!apzgVar.qn(DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.deleteClipEngagementPanelCommand)) {
            throw new aafy();
        }
        this.b.l();
        DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand = (DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand) apzgVar.qm(DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.deleteClipEngagementPanelCommand);
        if ((deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.b & 1) == 0) {
            return;
        }
        aafo aafoVar = this.a;
        apzg apzgVar2 = deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.c;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aafoVar.a(apzgVar2);
    }
}
