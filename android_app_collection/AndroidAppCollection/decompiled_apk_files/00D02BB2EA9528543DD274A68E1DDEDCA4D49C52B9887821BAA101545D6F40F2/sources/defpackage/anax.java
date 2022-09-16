package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anax  reason: default package */
/* loaded from: classes.dex */
public final class anax implements anat {
    private final cjqy a;
    private final cjqq b;
    private final cqat c;
    private final Executor d;
    private final dbty<Boolean> e;
    private final Set<akua> f = dcnm.g();
    private final Set<akue> g = dcnm.g();
    private dbty<alim> h;
    private anaw i;
    private volatile int j;

    public anax(cjqy cjqyVar, cjqq cjqqVar, cqat cqatVar, Executor executor, dbty<Boolean> dbtyVar) {
        dbsk.s(cjqyVar);
        this.a = cjqyVar;
        dbsk.s(cjqqVar);
        this.b = cjqqVar;
        this.c = cqatVar;
        this.d = executor;
        this.e = dbtyVar;
    }

    private final anaw i(final anbg anbgVar) {
        anao anaoVar = new anao(anbgVar.a(), this.a.u(anbgVar).get(0).a);
        this.i = anaoVar;
        for (final akue akueVar : this.g) {
            this.d.execute(new Runnable(akueVar, anbgVar) { // from class: anav
                private final akue a;
                private final anbg b;

                {
                    this.a = akueVar;
                    this.b = anbgVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g(this.b);
                }
            });
        }
        return anaoVar;
    }

    private static cjql j(int i, String str, ddho ddhoVar) {
        return new cjql(cjqi.a, cjsh.d(dbsg.i(cjrc.a(str).b()), dbsg.i(cjsg.b(i)), dbsg.i(Integer.valueOf(ddhoVar.b()))));
    }

    @Override // defpackage.anat
    public final void a(alim alimVar) {
        if (this.e.a().booleanValue()) {
            i(new anbg(this.c, alimVar));
            return;
        }
        dnqg bZ = dnqh.p.bZ();
        ddxw bZ2 = ddxx.j.bZ();
        int i = ((ddda) alimVar.a).b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddxx ddxxVar = (ddxx) bZ2.b;
        ddxxVar.a |= 8;
        ddxxVar.d = i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        ddxx bK = bZ2.bK();
        bK.getClass();
        dnqhVar.f = bK;
        dnqhVar.a |= 16;
        dnqh bK2 = bZ.bK();
        cjqy cjqyVar = this.a;
        dhjx dhjxVar = alimVar.b;
        dplc bZ3 = dpld.d.bZ();
        dplf dplfVar = alimVar.c;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dpld dpldVar = (dpld) bZ3.b;
        dpldVar.b = dplfVar.g;
        int i2 = dpldVar.a | 1;
        dpldVar.a = i2;
        dntk dntkVar = alimVar.d;
        dntkVar.getClass();
        dpldVar.c = dntkVar;
        dpldVar.a = i2 | 8;
        cjqyVar.q(dhjxVar, bZ3.bK(), alimVar.f, alimVar.e, bK2, alimVar.h);
    }

    @Override // defpackage.akub
    public final void b(akuc akucVar) {
        this.j = ((amjh) akucVar).a;
    }

    @Override // defpackage.anat
    public final void c(alhf alhfVar) {
        alhe alheVar = alhfVar.a;
        cjte cjteVar = new cjte(alheVar.a, alheVar.b);
        cjta b = cjtd.b();
        String str = alhfVar.b;
        b.b = null;
        String str2 = alhfVar.c;
        b.g(null);
        b.d = alhfVar.d;
        this.a.n(cjql.a, cjteVar, b.a());
    }

    @Override // defpackage.anat
    public final void e(alhd alhdVar) {
        if (this.e.a().booleanValue()) {
            return;
        }
        for (alhc alhcVar : alhdVar.a) {
            this.b.g().d(alhcVar.a);
        }
    }

    @Override // defpackage.anat
    public final void f(dbty<alim> dbtyVar) {
        this.h = dbtyVar;
    }

    @Override // defpackage.anat
    public final void g(akue akueVar) {
        this.g.add(akueVar);
    }

    @Override // defpackage.anat
    public final void h(akue akueVar) {
        this.g.remove(akueVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117 A[LOOP:0: B:45:0x0111->B:47:0x0117, LOOP_END] */
    @Override // defpackage.anat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cjqm d(defpackage.dmpn r11, @defpackage.dzsi defpackage.amkh r12, defpackage.aktn r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anax.d(dmpn, amkh, aktn, boolean):cjqm");
    }
}
