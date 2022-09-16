package defpackage;

import com.google.protos.youtube.api.innertube.LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acsg  reason: default package */
/* loaded from: classes.dex */
public final class acsg implements aafl {
    private static final anay a = anay.o();
    private final acsf b;

    public acsg(acsf acsfVar) {
        this.b = acsfVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand = (LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand) apzgVar.qm(LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.logFlowLoggingEventCommand);
        int i = logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.b;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) {
            ((anav) ((anav) a.g()).i("com/google/android/libraries/youtube/logging/flow/LogFlowLoggingEventCommandResolver", "resolve", 34, "LogFlowLoggingEventCommandResolver.java")).q("Unable to log event, missing Flow Logging parameter");
            return;
        }
        int i2 = logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.c;
        int f = araa.f(logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.d);
        if (f == 0) {
            f = 1;
        }
        acsd acsdVar = new acsd(i2, f);
        if ((logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.b & 8) != 0) {
            aqyu aqyuVar = logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.f;
            if (aqyuVar == null) {
                aqyuVar = aqyu.a;
            }
            acsdVar.a = aqyuVar;
        }
        aqzj b = aqzj.b(logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.e);
        if (b == null) {
            b = aqzj.FLOW_TYPE_UNKNOWN;
        }
        aqzj aqzjVar = b;
        int i3 = logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.b;
        if ((i3 & 16) == 0) {
            this.b.b(acsdVar, aqzjVar);
            return;
        }
        String str = logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.g;
        if ((i3 & 32) == 0) {
            this.b.c(acsdVar, aqzjVar, str);
        } else {
            this.b.d(acsdVar, aqzjVar, str, logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.h);
        }
    }
}
