package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: oyy  reason: default package */
/* loaded from: classes7.dex */
public class oyy implements oxr {
    public boolean a;
    private final oyc b;
    private final List<oxq> c;
    private final cjqy d;
    @dzsi
    private final cqss e;
    private boolean f;

    public oyy(Context context, cjzt cjztVar, dtlj dtljVar, dtlb dtlbVar, cjqy cjqyVar, oyc oycVar) {
        cqss cqssVar;
        this.b = oycVar;
        dccx F = dcdc.F();
        Iterator<dtku> it = dtljVar.a.iterator();
        while (true) {
            cqssVar = null;
            if (!it.hasNext()) {
                break;
            }
            dtku next = it.next();
            int i = next.a;
            if ((i & 4) != 0) {
                oyc oycVar2 = this.b;
                dtof dtofVar = next.d;
                F.g(new oyx(oycVar2.c(cjztVar, dtofVar == null ? dtof.i : dtofVar)));
            } else if ((i & 1) != 0) {
                dtkf dtkfVar = next.b;
                F.g(new oyx(new oyj(context, cjztVar, dtkfVar == null ? dtkf.n : dtkfVar, null)));
            }
        }
        this.c = F.f();
        this.d = cjqyVar;
        if ((dtlbVar.a & 4) != 0) {
            dtjf dtjfVar = dtlbVar.d;
            cqssVar = oyf.c(dtjfVar == null ? dtjf.d : dtjfVar, context.getResources());
        }
        this.e = cqssVar;
    }

    @Override // defpackage.oxe
    public cjtd a() {
        throw null;
    }

    @Override // defpackage.oxr
    public Integer b() {
        return Integer.valueOf(this.c.size());
    }

    @Override // defpackage.oxr
    public oxq c(int i) {
        return this.c.get(0);
    }

    @Override // defpackage.oxr
    public List<oxq> d() {
        return this.c;
    }

    @Override // defpackage.oxr
    @dzsi
    public cqss e() {
        return this.e;
    }

    @Override // defpackage.oxr
    public cqfc f(cqfc cqfcVar) {
        return new oyw(this, cqfcVar);
    }

    @Override // defpackage.oxr
    public void g(cjte cjteVar, cjtd cjtdVar) {
        if (!this.f) {
            this.d.m(cjteVar, cjtdVar);
            this.f = true;
        }
    }
}
