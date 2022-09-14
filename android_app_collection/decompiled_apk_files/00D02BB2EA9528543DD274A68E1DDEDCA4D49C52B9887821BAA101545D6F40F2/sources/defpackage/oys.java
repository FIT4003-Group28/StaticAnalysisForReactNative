package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: oys  reason: default package */
/* loaded from: classes7.dex */
public class oys implements oxo {
    private final cjzt a;
    private final dtnv b;
    private final List<bcdf> c;
    private final CharSequence d;
    @dzsi
    private final cqss e;
    @dzsi
    private final cjtd f;

    public oys(Context context, cjzt cjztVar, dtnv dtnvVar, dtlb dtlbVar, bccu bccuVar) {
        CharSequence a;
        cqss cqssVar;
        this.a = cjztVar;
        this.b = dtnvVar;
        dccx dccxVar = new dccx();
        dwgl dwglVar = dtnvVar.b;
        for (dwfl dwflVar : (dwglVar == null ? dwgl.i : dwglVar).b) {
            if (!dbsj.d(dwflVar.h)) {
                dccxVar.g(new oyr(dwflVar));
            }
        }
        cjtd cjtdVar = null;
        decs decsVar = null;
        this.c = bccu.a(dccxVar.f(), null);
        if (dtnvVar.c.isEmpty()) {
            a = "";
        } else {
            String str = dtnvVar.c.get(0);
            dtqa dtqaVar = dtlbVar.f;
            a = owy.a(str, dtqaVar == null ? dtqa.b : dtqaVar, context.getResources());
        }
        this.d = a;
        if ((dtlbVar.a & 2) != 0) {
            dtjf dtjfVar = dtlbVar.c;
            cqssVar = oyf.c(dtjfVar == null ? dtjf.d : dtjfVar, context.getResources());
        } else {
            cqssVar = null;
        }
        this.e = cqssVar;
        this.f = (dtnvVar.a & 4) != 0 ? oyf.b(this.a.b, dtnvVar.e, dtxl.b, this.a.e, (dtnvVar.a & 32) != 0 ? decs.a(dtnvVar.f) : decsVar) : cjtdVar;
    }

    @Override // defpackage.oxe
    @dzsi
    public cjtd a() {
        return this.f;
    }

    @Override // defpackage.oxo
    public List<bcdf> b() {
        return this.c;
    }

    @Override // defpackage.oxo
    public CharSequence c() {
        return this.d;
    }

    @Override // defpackage.oxo
    @dzsi
    public cqss d() {
        return this.e;
    }

    @Override // defpackage.oxo
    public Boolean e() {
        return Boolean.valueOf((this.b.a & 2) != 0);
    }

    @Override // defpackage.oxo
    public cqkl f(cjqm cjqmVar) {
        if (e().booleanValue()) {
            cjyi cjyiVar = this.a.c;
            dthb dthbVar = this.b.d;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjzt cjztVar = this.a;
            cjyiVar.j(dthbVar, nxc.a(cjztVar.a, cjztVar.b, cjqmVar));
        }
        return cqkl.a;
    }
}
