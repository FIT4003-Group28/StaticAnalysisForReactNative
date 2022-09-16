package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abvq  reason: default package */
/* loaded from: classes2.dex */
public class abvq implements abql {
    public final abfk a;
    private final akpm b;
    private final dqfo c;
    private final gga d;
    private final efg e;
    private final cjtd f;
    private final jic g;
    private final cklq h;
    private final abse i;
    @dzsi
    private final acwt j;
    @dzsi
    private final View.OnAttachStateChangeListener k;

    public abvq(akpm akpmVar, aeau aeauVar, abfl abflVar, gga ggaVar, efg efgVar, cklq cklqVar, dqfo dqfoVar, ddho ddhoVar, @dzsi dxio<aeaa> dxioVar, @dzsi acwt acwtVar, abse abseVar) {
        cqfk cqfkVar;
        this.j = acwtVar;
        this.f = isw.a(dqfoVar, ddhoVar);
        this.b = akpmVar;
        this.c = dqfoVar;
        abfk a = abflVar.a(dqfoVar, dxioVar, abseVar);
        this.a = a;
        this.d = ggaVar;
        this.e = efgVar;
        this.h = cklqVar;
        this.i = abseVar;
        this.g = new jic(dqfoVar.f, ckqc.FULLY_QUALIFIED, 0);
        if (dxioVar != null) {
            aeaa a2 = dxioVar.a();
            Executor a3 = aeauVar.a.a();
            aeau.a(a3, 1);
            Executor a4 = aeauVar.b.a();
            aeau.a(a4, 2);
            Activity activity = (Activity) ((dxjd) aeauVar.c).a;
            aeau.a(activity, 3);
            aeau.a(a, 4);
            aeau.a(a2, 5);
            cqfkVar = new aeat(a3, a4, activity, a, a2).l;
        } else {
            cqfkVar = null;
        }
        this.k = cqfkVar;
    }

    @Override // defpackage.abiu
    public String d() {
        return this.c.e;
    }

    @Override // defpackage.abiu
    public cqkl h(final cjqm cjqmVar) {
        dhjx dhjxVar;
        this.h.a(ckls.SHORTCUT_CLICKED);
        acwt acwtVar = this.j;
        if (acwtVar != null) {
            acwtVar.a();
        }
        abse abseVar = this.i;
        if ((abseVar.a & 2) != 0) {
            dhjxVar = abseVar.c;
            if (dhjxVar == null) {
                dhjxVar = dhjx.f;
            }
        } else {
            dhjxVar = null;
        }
        abfe.a(dhjxVar, this.b, this.d, this.e, new Runnable(this, cjqmVar) { // from class: abvp
            private final abvq a;
            private final cjqm b;

            {
                this.a = this;
                this.b = cjqmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                abvq abvqVar = this.a;
                abvqVar.a.a(this.b);
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.abiu
    public cjtd i() {
        return this.f;
    }

    @Override // defpackage.abql
    @dzsi
    public View.OnAttachStateChangeListener j() {
        return this.k;
    }

    @Override // defpackage.abql
    public cqtd k() {
        dqfn b = dqfn.b(this.c.h);
        if (b == null) {
            b = dqfn.UNKNOWN;
        }
        if (isw.b.containsKey(b)) {
            return iup.e(isw.b.get(b).intValue());
        }
        dcdn<dqfn, Integer> dcdnVar = isw.a;
        dqfn b2 = dqfn.b(this.c.h);
        if (b2 == null) {
            b2 = dqfn.UNKNOWN;
        }
        return cqrt.f(dcdnVar.getOrDefault(b2, 2131232414).intValue());
    }

    @Override // defpackage.abiu
    public jic l() {
        return this.g;
    }
}
