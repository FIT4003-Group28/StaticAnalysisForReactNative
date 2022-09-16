package defpackage;

import com.google.protos.youtube.api.innertube.LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gpb  reason: default package */
/* loaded from: classes3.dex */
public final class gpb implements aafl {
    private final acrr a;

    public gpb(acrr acrrVar) {
        this.a = acrrVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        arby arbyVar;
        apzgVar.getClass();
        LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand = (LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand) apzgVar.qm(LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.logAccountLinkingEventCommand);
        if ((logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.b & 1) != 0) {
            arbyVar = logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.c;
            if (arbyVar == null) {
                arbyVar = arby.a;
            }
        } else {
            arbyVar = null;
        }
        if (arbyVar == null) {
            zep.b("Could not get event to log");
            return;
        }
        acrr acrrVar = this.a;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cz(arbyVar);
        acrrVar.c((arrh) a.mo39build());
    }
}
