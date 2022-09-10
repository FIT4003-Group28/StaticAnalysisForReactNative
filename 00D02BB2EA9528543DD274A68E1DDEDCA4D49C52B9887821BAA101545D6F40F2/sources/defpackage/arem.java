package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: arem  reason: default package */
/* loaded from: classes2.dex */
public final class arem implements jkh {
    private static final dcqe c = dcqe.c("arem");
    public akzh a;
    public jjn b;
    private final Activity d;
    private final gll e;
    private final akox f;
    private final hwe g;
    private final dxio<akzh> h;
    private final begb i;
    private final ges j;
    private final akxp k;
    private alar l;
    private boolean m;
    private jjn n = null;

    public arem(Activity activity, gll gllVar, akox akoxVar, hwe hweVar, dxio<akzh> dxioVar, bvrb bvrbVar, jkf jkfVar, fd fdVar, begb begbVar) {
        this.d = activity;
        this.e = gllVar;
        this.f = akoxVar;
        this.g = hweVar;
        this.h = dxioVar;
        this.i = begbVar;
        this.j = (ges) fdVar;
        this.b = jkfVar.l().L();
        this.k = new arel(this, akoxVar.j(), bvrbVar, jkfVar);
    }

    private final void c(jjn jjnVar) {
        if (!this.b.equals(jjnVar)) {
            this.b = jjnVar;
            this.i.b(jjnVar);
        }
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        this.m = false;
        if (!jjnVar2.equals(jjn.FULLY_EXPANDED)) {
            c(jjnVar2);
        }
        if (jjnVar2 != jjn.HIDDEN) {
            b(jjnVar2, 250, true);
        }
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
        dbsk.s(jjnVar);
        this.n = jjnVar;
        this.m = true;
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
        if (this.n == null) {
            bvoo.h("onDragStarted() should be called before onDragEnded().  MyMapsFeatureCameraController may have been created after the drag started (http://b/9432190).", new Object[0]);
        }
        this.n = null;
        this.m = false;
        c(jjnVar);
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        if (this.m || jjnVar.equals(jjn.FULLY_EXPANDED)) {
            if (!jjnVar.equals(jjn.COLLAPSED) || f == 0.0f) {
                c(jjnVar);
            } else {
                c(jjn.EXPANDED);
            }
        }
    }

    public final void b(jjn jjnVar, int i, boolean z) {
        if (!this.j.aD) {
            return;
        }
        if (this.i != null && jjnVar != jjn.FULLY_EXPANDED) {
            this.i.c();
        }
        Rect b = this.e.b();
        float f = this.h.a().p().k;
        akqq S = this.l.r.S();
        if (jjnVar == jjn.EXPANDED && z) {
            this.a = this.h.a().b();
        }
        if (jjnVar == jjn.EXPANDED) {
            akox akoxVar = this.f;
            akyc j = akyt.j(S, f, b);
            j.b = i;
            akoxVar.p(j);
        } else if (jjnVar != jjn.COLLAPSED) {
        } else {
            akzh akzhVar = this.a;
            if (akzhVar != null) {
                akox akoxVar2 = this.f;
                Rect rect = new Rect(0, 0, 0, 0);
                Rect e = this.e.e();
                alao.e(akoxVar2, akzhVar, S, rect, b, new Point(e.centerX(), e.centerY()), this.a.p().k, i, null);
                this.a = null;
                return;
            }
            akox akoxVar3 = this.f;
            akyc j2 = akyt.j(S, f, b);
            j2.b = i;
            akoxVar3.q(j2, null);
        }
    }

    public final void a(@dzsi alar alarVar) {
        if (alarVar == null) {
            if (this.f == null) {
                return;
            }
            this.k.c();
            this.l = null;
            this.f.aj().aC().o(null);
        } else if (this.f == null) {
        } else {
            this.l = alarVar;
            this.k.b();
            this.g.h();
            akty aC = this.f.aj().aC();
            aC.o(aC.s(this.d.getResources(), alarVar.c, alarVar.b, alarVar.r));
        }
    }
}
