package defpackage;

import com.google.protos.youtube.api.innertube.AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aavv  reason: default package */
/* loaded from: classes.dex */
public final class aavv implements aafl {
    private final Executor a;
    private final aavx b;

    public aavv(Executor executor, aavx aavxVar) {
        this.a = executor;
        this.b = aavxVar;
    }

    public static /* synthetic */ void b(Throwable th) {
        zep.d("aavv", th);
        afus.c(2, 5, "Error acknowledging channel TOU strike", th);
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.acknowledgeChannelTouStrikeCommand)) {
            throw new aafy("Could not find AcknowledgeChannelTouStrikeCommand");
        }
        aavx aavxVar = this.b;
        aavw aavwVar = new aavw(aavxVar.e, aavxVar.a.c());
        aput aputVar = ((AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand) apzgVar.qm(AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.acknowledgeChannelTouStrikeCommand)).b;
        if (aputVar == null) {
            aputVar = aput.a;
        }
        aputVar.getClass();
        aavwVar.a = aputVar;
        aavwVar.k(apzgVar.c.I());
        aavx aavxVar2 = this.b;
        ylx.j(aavxVar2.b.b(aavwVar, this.a), anjk.a, ngc.q);
    }
}
