package defpackage;

import com.google.protos.youtube.api.innertube.RunAttestationCommandOuterClass$RunAttestationCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aabu  reason: default package */
/* loaded from: classes.dex */
public final class aabu implements aafl {
    private final aabt a;

    public aabu(aabt aabtVar) {
        this.a = aabtVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(RunAttestationCommandOuterClass$RunAttestationCommand.runAttestationCommand)) {
            return;
        }
        aabt aabtVar = this.a;
        RunAttestationCommandOuterClass$RunAttestationCommand runAttestationCommandOuterClass$RunAttestationCommand = (RunAttestationCommandOuterClass$RunAttestationCommand) apzgVar.qm(RunAttestationCommandOuterClass$RunAttestationCommand.runAttestationCommand);
        afvm c = aabtVar.b.c();
        aasv a = aabtVar.d.a(c, aabtVar.c.f(), c.g());
        int t = akpq.t(runAttestationCommandOuterClass$RunAttestationCommand.c);
        if (t == 0) {
            t = 1;
        }
        a.b = t;
        a.a.addAll(runAttestationCommandOuterClass$RunAttestationCommand.b);
        ylx.k(aabtVar.d.b(a, aabtVar.a), anjk.a, new aabr(aabtVar, 1), new aabs(aabtVar, 1));
    }
}
