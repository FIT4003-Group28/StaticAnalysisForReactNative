package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: brmd  reason: default package */
/* loaded from: classes4.dex */
public class brmd implements jkh {
    public final Set<jkh> a = new HashSet();
    private final eeu b;
    private final ff c;
    private final brmc d;
    private final jkf e;
    private final brcj f;
    @dzsi
    private final bsoi g;
    private boolean h;

    public brmd(eeu eeuVar, ff ffVar, brmc brmcVar, jkf jkfVar, brcj brcjVar, @dzsi bsoi bsoiVar, boolean z) {
        this.c = ffVar;
        this.b = eeuVar;
        this.d = brmcVar;
        this.e = jkfVar;
        this.f = brcjVar;
        this.g = bsoiVar;
        this.h = z;
    }

    private static boolean b(jjn jjnVar) {
        return jjnVar != jjn.HIDDEN;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        bsoi bsoiVar;
        if (this.c.g().J()) {
            return;
        }
        if (jjnVar2 == jjn.EXPANDED) {
            this.d.g(0, 0);
        } else if (this.b.e() && (jjnVar2 == jjn.COLLAPSED || jjnVar2 == jjn.HIDDEN)) {
            this.b.d(false);
        }
        boolean z = true;
        if (jjn.HIDDEN == jjnVar2) {
            this.f.h(false, true);
        }
        if (jjnVar2 == jjn.EXPANDED) {
            z = false;
        }
        this.h = z;
        if (b(jjnVar) != b(jjnVar2)) {
            if (b(jjnVar2) && (bsoiVar = this.g) != null) {
                if (bsoiVar.G) {
                    this.d.b();
                }
                this.g.a(false, jjnVar2);
            }
            this.f.b(jjnVar2);
            this.f.c();
        }
        brcj brcjVar = this.f;
        brcjVar.i(jjnVar, jjnVar2, jkgVar, jkjVar.j());
        brbw brbwVar = brcjVar.f;
        if (brbwVar != null && brbwVar.h() && jjn.EXPANDED == jjnVar2) {
            brbwVar.i();
        }
        for (jkh jkhVar : this.a) {
            jkhVar.L(jkjVar, jjnVar, jjnVar2, jkgVar);
        }
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
        for (jkh jkhVar : this.a) {
            jkhVar.M(jkjVar, jjnVar);
        }
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
        jkf jkfVar = this.e;
        if (!this.c.g().J() && this.h) {
            jkfVar.setExpandingStateTransition(jkc.j, btpf.d(this.c.getResources().getConfiguration()).e ? jkc.q : jkc.j, true);
        }
        for (jkh jkhVar : this.a) {
            jkhVar.N(jkjVar, jjnVar);
        }
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        float f2 = 0.0f;
        if (f >= 0.0f) {
            f2 = Math.min(1.0f, f);
        }
        for (jkh jkhVar : this.a) {
            jkhVar.P(jkjVar, jjnVar, f2);
        }
    }

    public final void a() {
        if (this.g != null) {
            brmc brmcVar = this.d;
            brmcVar.e = false;
            if (brmcVar.d != null) {
                int h = brmcVar.h();
                if (h != -1) {
                    brmcVar.a = h;
                }
                int i = brmcVar.a;
                bsoi bsoiVar = brmcVar.d;
                if (bsoiVar != null) {
                    bsoiVar.e(bsoiVar.C.b(2, i));
                }
                brmcVar.d();
            } else {
                brmcVar.f();
            }
            this.g.L();
            this.g.a(true, jjn.HIDDEN);
            this.f.c();
        }
    }
}
