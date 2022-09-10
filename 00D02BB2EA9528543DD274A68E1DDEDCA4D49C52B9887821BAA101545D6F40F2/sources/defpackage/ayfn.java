package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.maps.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayfn  reason: default package */
/* loaded from: classes3.dex */
public final class ayfn extends cqqw implements ghu, egq {
    public final jkf a;
    public List<ghs<?>> b = new ArrayList();
    public int c = 0;
    @dzsi
    public ghw d;
    @dzsi
    public aymt e;
    private final ghl f;
    private final ghx g;
    private final Activity h;
    private boolean i;
    @dzsi
    private jjn j;

    public ayfn(jkf jkfVar, ghl ghlVar, ghx ghxVar, Activity activity) {
        this.a = jkfVar;
        this.f = ghlVar;
        this.g = ghxVar;
        this.h = activity;
    }

    @dzsi
    public static ilo g(cqkp cqkpVar) {
        if (cqkpVar instanceof aymp) {
            return ((aymp) cqkpVar).u();
        }
        return null;
    }

    public static final boolean h(@dzsi jjn jjnVar) {
        return jjnVar == jjn.HIDDEN;
    }

    @dzsi
    private final ExtendedFloatingActionButton i() {
        return (ExtendedFloatingActionButton) cqkx.e(this.h.findViewById(R.id.footer_container), aygu.a, ExtendedFloatingActionButton.class);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [cqkp] */
    private final void j(int i) {
        ilo g;
        if (i < 0 || i >= this.b.size() || (g = g(this.b.get(i).a().b())) == null) {
            return;
        }
        this.f.e(g);
        this.f.c(g);
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 0) {
            if (this.i) {
                brla.b(i(), this.h);
            } else {
                brla.a(i(), this.h);
            }
        }
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        if (this.d == null || eguVar.j != jjn.HIDDEN) {
            return;
        }
        ghw ghwVar = this.d;
        dbsk.s(ghwVar);
        c(ghwVar, this.c, 0, null);
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.i = i2 > 0;
    }

    @Override // defpackage.ghu
    public final void c(ghw ghwVar, int i, int i2, @dzsi cjqm cjqmVar) {
        ghwVar.n(i, true);
        j(i);
        this.c = i;
        aymt aymtVar = this.e;
        if (aymtVar != null && !aymtVar.c().booleanValue() && i >= this.b.size() - 3) {
            this.e.k();
        }
        if (i2 == 1) {
            brla.b(i(), this.h);
        }
        cqkx.p(ghwVar);
    }

    public final void d(aymt aymtVar) {
        this.e = aymtVar;
        ghw f = f();
        List<ghs<?>> a = f.a();
        this.b = a;
        a.clear();
        Iterator<aymp> it = aymtVar.b().iterator();
        while (true) {
            cjtd cjtdVar = null;
            if (!it.hasNext()) {
                break;
            }
            aymp next = it.next();
            ilo u = next.u();
            List<ghs<?>> list = this.b;
            cqix fT = cqgr.fT(new ayma(), next);
            String string = this.h.getString(R.string.ACCESSIBILITY_TRAVERSAL_CARD, new Object[]{aymtVar.a()});
            ayfm c = ayfm.c(true, u == null ? null : u.ai());
            if (u != null) {
                cjta c2 = cjtd.c(u.ca());
                c2.d = dtxy.ez;
                cjtdVar = c2.a();
            }
            list.add(new ghs<>(fT, string, false, c, cjtdVar, null));
        }
        if (aymtVar.c().booleanValue()) {
            this.b.add(new ghs<>(cqgr.fT(new ayin(), aymtVar), "", true, ayfm.c(false, null), null, null));
        }
        j(f.c().intValue());
        cqkx.p(f);
    }

    public final void e() {
        jkc jkcVar;
        jjn jjnVar = this.j;
        if (jjnVar == null) {
            jjnVar = jjn.EXPANDED;
        }
        jjn L = this.a.l().L();
        this.j = L;
        if (L != jjn.HIDDEN) {
            jjnVar = jjn.HIDDEN;
        } else if (this.j == jjn.HIDDEN && jjnVar == jjn.HIDDEN) {
            jjnVar = jjn.FULLY_EXPANDED;
        }
        jkf jkfVar = this.a;
        if (h(jjnVar)) {
            jkcVar = jkc.d;
        } else {
            jkcVar = jkc.m;
        }
        jkfVar.setExpandingStateTransition(jkcVar, h(jjnVar) ? jkc.d : jkc.m, true);
        this.a.B(jjnVar);
        brla.a(i(), this.h);
    }

    public final ghw f() {
        if (this.d == null) {
            ghw a = this.g.a(this, false);
            this.d = a;
            a.s(230, 155);
        }
        ghw ghwVar = this.d;
        dbsk.s(ghwVar);
        return ghwVar;
    }
}
