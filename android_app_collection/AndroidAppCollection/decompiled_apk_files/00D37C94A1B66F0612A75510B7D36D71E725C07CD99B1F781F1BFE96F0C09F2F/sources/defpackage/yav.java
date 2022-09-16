package defpackage;

import com.google.protos.youtube.api.innertube.LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yav  reason: default package */
/* loaded from: classes4.dex */
public final class yav implements aafl {
    private final acrr a;

    public yav(acrr acrrVar) {
        this.a = acrrVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand = (LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand) apzgVar.qm(LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.logYpcFlowStartCommand);
        if (!(logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b == 1 ? (aoob) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.c : aoob.b).H()) {
            acrr acrrVar = this.a;
            ybr ybrVar = new ybr();
            ybrVar.a = logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b == 1 ? (aoob) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.c : aoob.b;
            acrrVar.c(ybrVar.e());
            return;
        }
        if (!(logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b == 2 ? (aoob) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.c : aoob.b).H()) {
            acrr acrrVar2 = this.a;
            ycp ycpVar = new ycp();
            ycpVar.a = logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b == 2 ? (aoob) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.c : aoob.b;
            arrf a = arrh.a();
            awhg a2 = ycpVar.a();
            a.copyOnWrite();
            ((arrh) a.instance).el(a2);
            acrrVar2.c((arrh) a.mo39build());
            return;
        }
        if (!(logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b == 3 ? (aoob) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.c : aoob.b).H()) {
            acrr acrrVar3 = this.a;
            ydb ydbVar = new ydb();
            ydbVar.a = logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b == 3 ? (aoob) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.c : aoob.b;
            arrf a3 = arrh.a();
            awhk a4 = ydbVar.a();
            a3.copyOnWrite();
            ((arrh) a3.instance).ev(a4);
            acrrVar3.c((arrh) a3.mo39build());
            return;
        }
        if (!(logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b == 4 ? (aoob) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.c : aoob.b).H()) {
            acrr acrrVar4 = this.a;
            ydf ydfVar = new ydf();
            ydfVar.a = logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b == 4 ? (aoob) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.c : aoob.b;
            arrf a5 = arrh.a();
            awhn a6 = ydfVar.a();
            a5.copyOnWrite();
            ((arrh) a5.instance).eA(a6);
            acrrVar4.c((arrh) a5.mo39build());
            return;
        }
        if ((logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b == 5 ? (aoob) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.c : aoob.b).H()) {
            if ((logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b == 6 ? (aoob) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.c : aoob.b).H()) {
                return;
            }
            acrr acrrVar5 = this.a;
            yde ydeVar = new yde();
            ydeVar.a = logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b == 6 ? (aoob) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.c : aoob.b;
            ydeVar.b = 2;
            acrrVar5.c(ydeVar.a());
            return;
        }
        acrr acrrVar6 = this.a;
        yct yctVar = new yct();
        yctVar.a = logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b == 5 ? (aoob) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.c : aoob.b;
        arrf a7 = arrh.a();
        aopa createBuilder = awhh.a.createBuilder();
        aoob aoobVar = yctVar.a;
        if (aoobVar != null) {
            createBuilder.copyOnWrite();
            awhh awhhVar = (awhh) createBuilder.instance;
            awhhVar.b = 1 | awhhVar.b;
            awhhVar.c = aoobVar;
        }
        a7.copyOnWrite();
        ((arrh) a7.instance).en((awhh) createBuilder.mo39build());
        acrrVar6.c((arrh) a7.mo39build());
    }
}
