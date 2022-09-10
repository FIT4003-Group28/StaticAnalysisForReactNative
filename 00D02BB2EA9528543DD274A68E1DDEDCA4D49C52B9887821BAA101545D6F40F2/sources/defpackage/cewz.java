package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cewz  reason: default package */
/* loaded from: classes4.dex */
public class cewz implements jax {
    final /* synthetic */ cexa a;
    @dzsi
    private final jht b;
    private final dvyw c;

    @Override // defpackage.jax
    public CharSequence b() {
        return this.c.i.isEmpty() ? this.a.b.getString(R.string.PLACE_QA_INACTIVE_PLACE_TITLE) : this.c.i;
    }

    @Override // defpackage.jax
    public CharSequence c() {
        return null;
    }

    @Override // defpackage.jax
    public cqss d() {
        return irg.H();
    }

    @Override // defpackage.jax
    public cqtv e() {
        return jaw.a();
    }

    @Override // defpackage.jax
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jax
    @dzsi
    public CharSequence g() {
        return this.c.p.isEmpty() ? this.a.b.getString(R.string.PLACE_QA_INACTIVE_PLACE_SUBTITLE) : this.c.p;
    }

    @Override // defpackage.jax
    @dzsi
    public jht h() {
        return this.b;
    }

    @Override // defpackage.jax
    public Boolean j() {
        return Boolean.TRUE;
    }

    @Override // defpackage.jax
    @dzsi
    public jic k() {
        dwfl dwflVar = this.c.G;
        if (dwflVar == null) {
            dwflVar = dwfl.w;
        }
        return owy.g(dwflVar, cexa.a);
    }

    @Override // defpackage.jax
    public Boolean l() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jax
    public cqkl m(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.jax
    public Boolean n() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jax
    public cqkl o(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.jax
    public Boolean p() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jax
    public cqkl q(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.jax
    public cjtd r() {
        return null;
    }

    @Override // defpackage.jax
    public cjtd s() {
        return null;
    }

    @Override // defpackage.jax
    public jic t() {
        throw null;
    }

    @Override // defpackage.jax
    public cqss u() {
        throw null;
    }

    @Override // defpackage.jax
    public jic v() {
        return null;
    }

    @Override // defpackage.jax
    public String w() {
        return null;
    }

    @Override // defpackage.jax
    @dzsi
    public CharSequence i() {
        djby djbyVar;
        djbv djbvVar;
        djca djcaVar;
        if (this.b == null) {
            return "";
        }
        int a = djbw.a(this.a.f.a);
        int i = a - 1;
        if (a == 0) {
            throw null;
        }
        if (i == 0) {
            cexa cexaVar = this.a;
            gga ggaVar = cexaVar.b;
            Object[] objArr = new Object[1];
            djcb djcbVar = cexaVar.f;
            if (djcbVar.a == 2) {
                djbyVar = (djby) djcbVar.b;
            } else {
                djbyVar = djby.c;
            }
            djbr djbrVar = djbyVar.a;
            if (djbrVar == null) {
                djbrVar = djbr.d;
            }
            objArr[0] = djbrVar.a;
            return ggaVar.getString(R.string.PLACE_QA_ACCESSIBILITY_YOUR_QUESTION_OVERFLOW_MENU_DESCRIPTION, objArr);
        } else if (i == 1) {
            cexa cexaVar2 = this.a;
            gga ggaVar2 = cexaVar2.b;
            Object[] objArr2 = new Object[1];
            djcb djcbVar2 = cexaVar2.f;
            if (djcbVar2.a == 3) {
                djbvVar = (djbv) djcbVar2.b;
            } else {
                djbvVar = djbv.c;
            }
            djbo djboVar = djbvVar.a;
            if (djboVar == null) {
                djboVar = djbo.c;
            }
            objArr2[0] = djboVar.b;
            return ggaVar2.getString(R.string.PLACE_QA_ACCESSIBILITY_YOUR_ANSWER_OVERFLOW_MENU_DESCRIPTION, objArr2);
        } else if (i != 2) {
            return "";
        } else {
            gga ggaVar3 = this.a.b;
            int i2 = bdys.PLACE_QA_ACCESSIBILITY_YOUR_REPLY_OVERFLOW_MENU_DESCRIPTION;
            Object[] objArr3 = new Object[1];
            djcb djcbVar3 = this.a.f;
            if (djcbVar3.a == 5) {
                djcaVar = (djca) djcbVar3.b;
            } else {
                djcaVar = djca.d;
            }
            djbt djbtVar = djcaVar.a;
            if (djbtVar == null) {
                djbtVar = djbt.c;
            }
            objArr3[0] = djbtVar.a;
            return ggaVar3.getString(i2, objArr3);
        }
    }

    public cewz(cexa cexaVar, final bvfk bvfkVar, final bvff bvffVar, final bvfn bvfnVar, final Executor executor, dvyw dvywVar, boolean z) {
        int i;
        cjtd cjtdVar;
        final Runnable runnable;
        this.a = cexaVar;
        this.c = dvywVar;
        if (!z) {
            this.b = null;
            return;
        }
        int a = djbw.a(cexaVar.f.a);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        }
        if (i2 == 0) {
            Runnable runnable2 = new Runnable(this, bvfkVar, executor) { // from class: cewu
                private final cewz a;
                private final bvfk b;
                private final Executor c;

                {
                    this.a = this;
                    this.b = bvfkVar;
                    this.c = executor;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    djby djbyVar;
                    cewz cewzVar = this.a;
                    bvfk bvfkVar2 = this.b;
                    Executor executor2 = this.c;
                    djap bZ = djar.l.bZ();
                    dnwb a2 = cewzVar.a.d.a();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    djar djarVar = (djar) bZ.b;
                    a2.getClass();
                    djarVar.j = a2;
                    djarVar.a |= 128;
                    djar djarVar2 = (djar) bZ.b;
                    djarVar2.b = 3;
                    djarVar2.a |= 1;
                    djcb djcbVar = cewzVar.a.f;
                    if (djcbVar.a == 2) {
                        djbyVar = (djby) djcbVar.b;
                    } else {
                        djbyVar = djby.c;
                    }
                    djbr djbrVar = djbyVar.a;
                    if (djbrVar == null) {
                        djbrVar = djbr.d;
                    }
                    String str = djbrVar.b;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    djar djarVar3 = (djar) bZ.b;
                    str.getClass();
                    djarVar3.a |= 2;
                    djarVar3.c = str;
                    bvfkVar2.b(bZ.bK(), cewzVar.a.j, executor2);
                }
            };
            cjtd a2 = cjtd.a(dtyd.ce);
            i = R.string.PLACE_QA_DELETE_QUESTION;
            cjtdVar = a2;
            runnable = runnable2;
        } else if (i2 == 1) {
            runnable = new Runnable(this, bvffVar, executor) { // from class: cewv
                private final cewz a;
                private final bvff b;
                private final Executor c;

                {
                    this.a = this;
                    this.b = bvffVar;
                    this.c = executor;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    djbv djbvVar;
                    cewz cewzVar = this.a;
                    bvff bvffVar2 = this.b;
                    Executor executor2 = this.c;
                    dizy bZ = djaa.l.bZ();
                    dnwb a3 = cewzVar.a.d.a();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    djaa djaaVar = (djaa) bZ.b;
                    a3.getClass();
                    djaaVar.i = a3;
                    djaaVar.a |= 128;
                    djaa djaaVar2 = (djaa) bZ.b;
                    djaaVar2.b = 2;
                    djaaVar2.a |= 1;
                    djcb djcbVar = cewzVar.a.f;
                    if (djcbVar.a == 3) {
                        djbvVar = (djbv) djcbVar.b;
                    } else {
                        djbvVar = djbv.c;
                    }
                    djbr djbrVar = djbvVar.b;
                    if (djbrVar == null) {
                        djbrVar = djbr.d;
                    }
                    String str = djbrVar.b;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    djaa djaaVar3 = (djaa) bZ.b;
                    str.getClass();
                    djaaVar3.a = 2 | djaaVar3.a;
                    djaaVar3.c = str;
                    bvffVar2.b(bZ.bK(), cewzVar.a.i, executor2);
                }
            };
            cjtdVar = cjtd.a(dtyd.cd);
            i = R.string.PLACE_QA_DELETE_ANSWER;
        } else if (i2 == 2) {
            runnable = new Runnable(this, bvfnVar, executor) { // from class: ceww
                private final cewz a;
                private final bvfn b;
                private final Executor c;

                {
                    this.a = this;
                    this.b = bvfnVar;
                    this.c = executor;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    djca djcaVar;
                    cewz cewzVar = this.a;
                    bvfn bvfnVar2 = this.b;
                    Executor executor2 = this.c;
                    dkex bZ = dkez.f.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dkez dkezVar = (dkez) bZ.b;
                    dkezVar.d = 3;
                    dkezVar.a |= 1;
                    djcb djcbVar = cewzVar.a.f;
                    if (djcbVar.a == 5) {
                        djcaVar = (djca) djcbVar.b;
                    } else {
                        djcaVar = djca.d;
                    }
                    djbt djbtVar = djcaVar.a;
                    if (djbtVar == null) {
                        djbtVar = djbt.c;
                    }
                    String str = djbtVar.b;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dkez dkezVar2 = (dkez) bZ.b;
                    str.getClass();
                    dkezVar2.b = 3;
                    dkezVar2.c = str;
                    dnqh dnqhVar = dnqh.p;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dkez dkezVar3 = (dkez) bZ.b;
                    dnqhVar.getClass();
                    dkezVar3.e = dnqhVar;
                    dkezVar3.a |= 256;
                    bvfnVar2.b(bZ.bK(), cewzVar.a.k, executor2);
                }
            };
            i = bdys.PLACE_QA_DELETE_REPLY;
            cjtdVar = cjtd.a(dtyd.cf);
        } else {
            runnable = cewx.a;
            cjtdVar = cjtd.b;
            i = 0;
        }
        if (i == 0) {
            this.b = null;
            return;
        }
        jhu h = jhv.h();
        jhm jhmVar = new jhm();
        jhmVar.a = cexaVar.b.getString(i);
        jhmVar.d(new View.OnClickListener(runnable) { // from class: cewy
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.run();
            }
        });
        jhmVar.f = cjtdVar;
        h.d(jhmVar.c());
        this.b = h.b();
    }
}
