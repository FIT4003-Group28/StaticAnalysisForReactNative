package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: iqo  reason: default package */
/* loaded from: classes6.dex */
public final class iqo implements jkh {
    private static final dcqe b = dcqe.c("iqo");
    public jjn a;
    private final begb c;
    private final iqs d;
    private final iql e;
    private final btrm f;
    private boolean g;
    @dzsi
    private jjn h;
    private final Set<jkh> i = new HashSet();

    public iqo(begb begbVar, iqs iqsVar, iql iqlVar, jjn jjnVar, btrm btrmVar) {
        this.c = begbVar;
        this.e = iqlVar;
        this.d = iqsVar;
        this.a = jjnVar;
        this.f = btrmVar;
    }

    private final void c(jjn jjnVar) {
        if (!this.a.equals(jjnVar)) {
            this.a = jjnVar;
            this.c.b(jjnVar);
        }
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        iqs iqsVar;
        bwrs<ilo> bwrsVar;
        ilo c;
        this.g = false;
        c(jjnVar2);
        a(jjnVar2);
        if (jjnVar2 != jjn.HIDDEN) {
            this.e.e(jjnVar2, 250);
        }
        if (jjnVar == jjn.COLLAPSED && ((jjnVar2 == jjn.EXPANDED || jjnVar2 == jjn.FULLY_EXPANDED) && (bwrsVar = (iqsVar = this.d).d) != null && (c = bwrsVar.c()) != null)) {
            ((ckcn) iqsVar.b.a(ckix.a)).a();
            iqsVar.a.a(4, bwrsVar);
            ((pfs) iqsVar.c).a(pex.CHECK, c);
        }
        for (jkh jkhVar : this.i) {
            jkhVar.L(jkjVar, jjnVar, jjnVar2, jkgVar);
        }
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
        dbsk.s(jjnVar);
        this.h = jjnVar;
        this.g = true;
        this.f.b(iqn.a);
        for (jkh jkhVar : this.i) {
            jkhVar.M(jkjVar, jjnVar);
        }
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
        jjn jjnVar2 = this.h;
        if (jjnVar2 == null) {
            bvoo.h("onDragStarted() should be called before onDragEnded().  PlaceSliderListener may have been created after the drag started (http://b/9432190).", new Object[0]);
        } else {
            this.d.d(new cjte(deaf.SWIPE), dtxy.gP, jjnVar2, jjnVar, true);
        }
        this.h = null;
        this.g = false;
        c(jjnVar);
        for (jkh jkhVar : this.i) {
            jkhVar.N(jkjVar, jjnVar);
        }
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        if (this.g) {
            if (!jjnVar.equals(jjn.COLLAPSED) || f == 0.0f) {
                c(jjnVar);
            } else {
                c(jjn.EXPANDED);
            }
        }
        for (jkh jkhVar : this.i) {
            jkhVar.P(jkjVar, jjnVar, f);
        }
    }

    public final void a(jjn jjnVar) {
        if (jjnVar == jjn.HIDDEN || jjnVar == jjn.FULLY_EXPANDED) {
            return;
        }
        this.c.c();
    }

    public final void b(jkh jkhVar) {
        this.i.add(jkhVar);
    }
}
