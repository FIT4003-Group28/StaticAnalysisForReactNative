package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: oyu  reason: default package */
/* loaded from: classes7.dex */
public class oyu implements oxp {
    private final dcdc<jba> a;
    @dzsi
    private final cqss b;

    public oyu(Context context, cjzt cjztVar, dtlj dtljVar, dtlb dtlbVar, oyc oycVar) {
        dccx F = dcdc.F();
        cqss cqssVar = null;
        jba jbaVar = null;
        for (dtku dtkuVar : dtljVar.a) {
            if ((dtkuVar.a & 4) != 0) {
                dtof dtofVar = dtkuVar.d;
                jba c = oycVar.c(cjztVar, dtofVar == null ? dtof.i : dtofVar);
                jbaVar = jbaVar == null ? c : jbaVar;
                if (c.c().booleanValue()) {
                    F.g(c);
                }
            }
        }
        dcdc<jba> f = F.f();
        if (f.isEmpty()) {
            if (jbaVar == null) {
                f = dcdc.e();
            } else {
                f = dcdc.f(jbaVar);
            }
        }
        this.a = f;
        if ((dtlbVar.a & 4) != 0) {
            dtjf dtjfVar = dtlbVar.d;
            cqssVar = oyf.c(dtjfVar == null ? dtjf.d : dtjfVar, context.getResources());
        }
        this.b = cqssVar;
    }

    @Override // defpackage.oxe
    @dzsi
    public cjtd a() {
        throw null;
    }

    @Override // defpackage.oxp
    public List<jba> b() {
        return this.a;
    }

    @Override // defpackage.oxp
    @dzsi
    public cqss c() {
        return this.b;
    }
}
