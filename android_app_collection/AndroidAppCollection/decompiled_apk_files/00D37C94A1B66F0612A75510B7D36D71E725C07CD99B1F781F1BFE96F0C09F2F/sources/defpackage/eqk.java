package defpackage;

import com.google.protos.youtube.api.innertube.LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eqk  reason: default package */
/* loaded from: classes3.dex */
public final class eqk implements aafl {
    private final agvq a;
    private final azqb b;
    private final agxa c;

    public eqk(agvq agvqVar, azqb azqbVar, agxa agxaVar) {
        this.a = agvqVar;
        this.b = azqbVar;
        this.c = agxaVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.localWatchHistoryCommand)) {
            return;
        }
        LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand = (LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand) apzgVar.qm(LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.localWatchHistoryCommand);
        String d = ((agrf) this.b.get()).d();
        int u = akzj.u(localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.b);
        if (u == 0) {
            u = 1;
        }
        int i = u - 1;
        if (i != 1) {
            if (i == 2) {
                this.c.a();
            } else if (i == 3) {
                this.a.I(d, true);
            } else if (i != 4) {
            } else {
                this.a.I(d, false);
            }
        } else if (localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.c.isEmpty()) {
        } else {
            agxa agxaVar = this.c;
            String str = localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.c;
            ankt anktVar = agxaVar.h;
            if (anktVar != null && !anktVar.isCancelled() && !agxaVar.h.isDone()) {
                return;
            }
            agxaVar.h = anii.i(anko.q(anlz.q(((agrf) agxaVar.e.get()).a())), new jkq(str, 2), agxaVar.a);
            ylx.k(agxaVar.h, anjk.a, afsc.n, new agwx(agxaVar, 1));
        }
    }
}
