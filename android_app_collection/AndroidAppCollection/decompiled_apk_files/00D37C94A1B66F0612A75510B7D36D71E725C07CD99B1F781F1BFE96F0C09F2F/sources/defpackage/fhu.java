package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: fhu  reason: default package */
/* loaded from: classes3.dex */
public final class fhu extends cyr {
    Integer A;
    afsk B;
    avhm C;
    Integer D;
    @dfs(a = 14)
    private fht E;
    @dfs(a = 13)
    tfl a;
    @dfs(a = 13)
    snc b;
    @dfs(a = 13)
    tcu c;
    @dfs(a = 13)
    tda d;
    @dfs(a = 13)
    Executor e;
    @dfs(a = 13)
    ajmm f;
    @dfs(a = 13)
    ajmy g;
    @dfs(a = 0)
    float v;
    @dfs(a = 13)
    teb w;
    @dfs(a = 13)
    afts x;
    @dfs(a = 13)
    awob y;
    Integer z;

    public fhu() {
        super("ImageZoom");
        this.E = new fht();
    }

    @Override // defpackage.czb
    protected final int F() {
        return 30;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new fib(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dczVar.a = new AtomicReference(null);
        this.E.a = (AtomicReference) dczVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void Q(cyv cyvVar, cyz cyzVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        dcz dczVar4 = new dcz();
        awob awobVar = this.y;
        tfl tflVar = this.a;
        ajmm ajmmVar = this.f;
        awny awnyVar = awobVar.d;
        if (awnyVar == null) {
            awnyVar = awny.a;
        }
        aopc aopcVar = (aopc) avhn.a.createBuilder();
        for (int i = 0; i < awnyVar.c.size(); i++) {
            awoa awoaVar = (awoa) awnyVar.c.get(i);
            if (awoaVar.c == 1) {
                aopa createBuilder = avhm.a.createBuilder();
                String str = awoaVar.c == 1 ? (String) awoaVar.d : "";
                createBuilder.copyOnWrite();
                avhm avhmVar = (avhm) createBuilder.instance;
                str.getClass();
                avhmVar.b = 1 | avhmVar.b;
                avhmVar.c = str;
                int i2 = awoaVar.e;
                createBuilder.copyOnWrite();
                avhm avhmVar2 = (avhm) createBuilder.instance;
                avhmVar2.b |= 2;
                avhmVar2.d = i2;
                int i3 = awoaVar.f;
                createBuilder.copyOnWrite();
                avhm avhmVar3 = (avhm) createBuilder.instance;
                avhmVar3.b |= 4;
                avhmVar3.e = i3;
                aopcVar.cw(createBuilder);
            }
        }
        avhn avhnVar = (avhn) aopcVar.mo39build();
        dczVar3.a = Integer.valueOf(cyzVar.H());
        dczVar4.a = Integer.valueOf(cyzVar.C());
        if (avhnVar.c.size() > 0 && cyzVar.H() > 0 && cyzVar.C() > 0) {
            avhm w = akel.w(avhnVar, cyzVar.H(), cyzVar.C());
            dczVar.a = w;
            if (tflVar != null) {
                dczVar2.a = (afsk) ajmmVar.b().a(ajks.c(Uri.parse(w.c)));
            }
        }
        this.C = (avhm) dczVar.a;
        this.B = (afsk) dczVar2.a;
        this.D = (Integer) dczVar3.a;
        this.A = (Integer) dczVar4.a;
    }

    @Override // defpackage.czb
    public final void R(cyv cyvVar, cyz cyzVar, int i, int i2, ddj ddjVar) {
        awoa awoaVar;
        int i3;
        awny awnyVar = this.y.d;
        if (awnyVar == null) {
            awnyVar = awny.a;
        }
        float f = 1.0f;
        if (awnyVar.c.size() != 0 && (i3 = (awoaVar = (awoa) awnyVar.c.get(0)).f) != 0) {
            f = awoaVar.e / i3;
        }
        dnt.g(i, i2, f, ddjVar);
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        fib fibVar = (fib) obj;
        awob awobVar = this.y;
        ajmy ajmyVar = this.g;
        tcu tcuVar = this.c;
        tda tdaVar = this.d;
        tfl tflVar = this.a;
        afts aftsVar = this.x;
        avhm avhmVar = this.C;
        this.D.intValue();
        this.A.intValue();
        afsk afskVar = this.B;
        int intValue = this.z.intValue();
        teb tebVar = this.w;
        ajmm ajmmVar = this.f;
        snc sncVar = this.b;
        AtomicReference atomicReference = this.E.a;
        awny awnyVar = awobVar.d;
        if (awnyVar == null) {
            awnyVar = awny.a;
        }
        Context context = cyvVar.b;
        fibVar.a = intValue;
        fibVar.b = awnyVar.e;
        fibVar.i = tcuVar;
        fibVar.h = tdaVar;
        if ((awobVar.c & 2) != 0) {
            awmt awmtVar = awobVar.e;
            if (awmtVar == null) {
                awmtVar = awmt.a;
            }
            fibVar.j = awmtVar;
        }
        if ((awobVar.c & 4) != 0) {
            awmt awmtVar2 = awobVar.f;
            if (awmtVar2 == null) {
                awmtVar2 = awmt.a;
            }
            fibVar.k = awmtVar2;
        }
        fibVar.n = awobVar.h;
        int z = awwc.z(awobVar.i);
        if (z == 0) {
            z = 1;
        }
        fibVar.s = z;
        int A = awwc.A(awobVar.j);
        if (A == 0) {
            A = 1;
        }
        fibVar.t = A;
        if (avhmVar == null) {
            int C = awwc.C(awnyVar.d);
            if (C == 0) {
                C = 1;
            }
            fibVar.r = C;
            int b = tbz.b(context, awnyVar);
            if (b > 0) {
                fibVar.setImageDrawable(gw.f(context.getResources(), b, null));
                fibVar.b();
                return;
            }
            ampq b2 = tck.b(awnyVar);
            if (!b2.h()) {
                return;
            }
            fibVar.setImageDrawable(tck.a(context, (byte[]) b2.c()));
            fibVar.b();
            return;
        }
        Uri j = zgt.j(avhmVar.c);
        ajmt a = ajmu.a();
        a.d = ajnb.a();
        a.c(false);
        if (tflVar == null) {
            a.c = new fhw(awobVar, context, tcuVar, awnyVar);
            ajmyVar.i(fibVar, j, a.a());
            return;
        }
        int C2 = awwc.C(awnyVar.d);
        if (C2 == 0) {
            C2 = 1;
        }
        awny awnyVar2 = awnyVar;
        ajks ajksVar = new ajks(null, context, fibVar, tflVar, aftsVar, ajmmVar, sncVar, new fhx(fibVar, tebVar, C2), tebVar);
        atomicReference.set(ajksVar);
        if ((awobVar.c & 8) != 0) {
            awny awnyVar3 = awobVar.g;
            if (awnyVar3 == null) {
                awnyVar3 = awny.a;
            }
            int C3 = awwc.C(awnyVar3.d);
            if (C3 == 0) {
                C3 = 1;
            }
            fibVar.r = C3;
            aolu.s(awnyVar3, fibVar, context, tcuVar);
        }
        fibVar.o = aftsVar;
        fibVar.p = tflVar;
        if (afskVar != null) {
            int C4 = awwc.C(awnyVar2.d);
            if (C4 == 0) {
                C4 = 1;
            }
            fibVar.r = C4;
            ajksVar.d((Bitmap) afskVar.a);
            fibVar.b();
            return;
        }
        ajmyVar.m(j, ajksVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void V(cyv cyvVar) {
        awnx awnxVar;
        dcz dczVar = new dcz();
        awob awobVar = this.y;
        dczVar.a = 0;
        awny awnyVar = awobVar.d;
        if (awnyVar == null) {
            awnyVar = awny.a;
        }
        if (awnyVar.c.size() > 0 && ((awoa) awnyVar.c.get(0)).c == 3) {
            awoa awoaVar = (awoa) awnyVar.c.get(0);
            if (awoaVar.c == 3) {
                awnxVar = (awnx) awoaVar.d;
            } else {
                awnxVar = awnx.a;
            }
            dczVar.a = Integer.valueOf(awnxVar.d);
        }
        this.z = (Integer) dczVar.a;
        float f = this.v;
        if (f > 0.0f) {
            B(new tfp(f), cyvVar.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void W(cyv cyvVar, Object obj) {
        fib fibVar = (fib) obj;
        ajmy ajmyVar = this.g;
        tfl tflVar = this.a;
        AtomicReference atomicReference = this.E.a;
        ajmyVar.e(fibVar);
        ajks ajksVar = (ajks) atomicReference.getAndSet(null);
        if (ajksVar != null) {
            ajksVar.e();
        }
        if (tflVar != null) {
            tflVar.d();
            tflVar.a();
        }
        fibVar.setImageDrawable(null);
        fibVar.i = null;
        fibVar.j = null;
        fibVar.k = null;
        fibVar.a = 0;
        fibVar.b = false;
        fibVar.q = null;
        fibVar.o = null;
        fibVar.p = null;
        fibVar.m = false;
        fibVar.n = false;
        fibVar.s = 1;
        fibVar.t = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        ((fht) ddlVar2).a = ((fht) ddlVar).a;
    }

    @Override // defpackage.czb
    public final boolean Y() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean af() {
        return true;
    }

    @Override // defpackage.czb
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.czb
    protected final boolean ai(cyr cyrVar, cyr cyrVar2) {
        fhu fhuVar = (fhu) cyrVar2;
        dad dadVar = new dad(((fhu) cyrVar).y, fhuVar == null ? null : fhuVar.y);
        return !((awob) dadVar.a).equals(dadVar.b);
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    @Override // defpackage.czb
    public final void al() {
        fcw.e(this.g, this.C, this.D.intValue(), this.A.intValue(), this.w, this.d, this.e);
    }

    @Override // defpackage.czb
    public final void am() {
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        fhu fhuVar = (fhu) cyrVar;
        if (this.k == fhuVar.k) {
            return true;
        }
        tfl tflVar = this.a;
        if (tflVar == null ? fhuVar.a != null : !tflVar.equals(fhuVar.a)) {
            return false;
        }
        snc sncVar = this.b;
        if (sncVar == null ? fhuVar.b != null : !sncVar.equals(fhuVar.b)) {
            return false;
        }
        tcu tcuVar = this.c;
        if (tcuVar == null ? fhuVar.c != null : !tcuVar.equals(fhuVar.c)) {
            return false;
        }
        tda tdaVar = this.d;
        if (tdaVar == null ? fhuVar.d != null : !tdaVar.equals(fhuVar.d)) {
            return false;
        }
        Executor executor = this.e;
        if (executor == null ? fhuVar.e != null : !executor.equals(fhuVar.e)) {
            return false;
        }
        ajmm ajmmVar = this.f;
        if (ajmmVar == null ? fhuVar.f != null : !ajmmVar.equals(fhuVar.f)) {
            return false;
        }
        ajmy ajmyVar = this.g;
        if (ajmyVar == null ? fhuVar.g != null : !ajmyVar.equals(fhuVar.g)) {
            return false;
        }
        if (Float.compare(this.v, fhuVar.v) != 0) {
            return false;
        }
        teb tebVar = this.w;
        if (tebVar == null ? fhuVar.w != null : !tebVar.equals(fhuVar.w)) {
            return false;
        }
        afts aftsVar = this.x;
        if (aftsVar == null ? fhuVar.x != null : !aftsVar.equals(fhuVar.x)) {
            return false;
        }
        awob awobVar = this.y;
        if (awobVar == null ? fhuVar.y != null : !awobVar.equals(fhuVar.y)) {
            return false;
        }
        AtomicReference atomicReference = this.E.a;
        AtomicReference atomicReference2 = fhuVar.E.a;
        return atomicReference == null ? atomicReference2 == null : atomicReference.equals(atomicReference2);
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        fhu fhuVar = (fhu) super.j();
        fhuVar.z = null;
        fhuVar.A = null;
        fhuVar.B = null;
        fhuVar.C = null;
        fhuVar.D = null;
        fhuVar.E = new fht();
        return fhuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final void p(cyr cyrVar) {
        fhu fhuVar = (fhu) cyrVar;
        this.z = fhuVar.z;
        this.A = fhuVar.A;
        this.B = fhuVar.B;
        this.C = fhuVar.C;
        this.D = fhuVar.D;
    }
}
