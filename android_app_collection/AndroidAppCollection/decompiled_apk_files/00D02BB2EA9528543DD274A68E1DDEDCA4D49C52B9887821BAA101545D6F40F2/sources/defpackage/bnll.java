package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bnll  reason: default package */
/* loaded from: classes3.dex */
public final class bnll implements bnlh, akzx {
    public long a;
    public final cqat b;
    public final dxio<akpm> c;
    public boolean d = false;
    public final cua e;
    public float f;
    public final bnly g;
    public final bnlm h;
    private final dxio<akzh> i;
    private final bnlq j;
    private final dujz k;
    private final Executor l;

    public bnll(dxio dxioVar, dxio dxioVar2, bnlq bnlqVar, bnlm bnlmVar, cua cuaVar, dujz dujzVar, Executor executor, cqat cqatVar, bnly bnlyVar) {
        int i = ctz.a;
        this.f = -1.0f;
        this.i = dxioVar2;
        this.j = bnlqVar;
        this.c = dxioVar;
        this.h = bnlmVar;
        this.k = dujzVar;
        this.e = cuaVar;
        this.a = Long.MIN_VALUE;
        this.l = executor;
        this.b = cqatVar;
        this.g = bnlyVar;
    }

    private final boolean j() {
        return TimeUnit.MILLISECONDS.toSeconds(this.b.e() - this.a) > ((long) this.h.b());
    }

    @Override // defpackage.bnlh
    public final synchronized void a(float f) {
        if (!g()) {
            return;
        }
        if (!d(f)) {
            return;
        }
        c(f);
    }

    @Override // defpackage.bnlh
    public final synchronized void b(bnlj bnljVar) {
        djiq djiqVar = bnljVar.a;
        if (djiqVar != null) {
            cvj c = ctz.c(djiqVar, 1, this.k.h, false, dtyi.cp, dtyi.cq);
            this.e.a(c);
            if (!bnljVar.a.b.isEmpty() && !c.h) {
                this.g.h(true);
                return;
            }
            this.g.h(false);
        }
    }

    public final void c(float f) {
        this.e.b();
        if (g() && !this.j.a) {
            this.a = this.b.e();
            this.d = true;
            this.f = f;
            bnlq bnlqVar = this.j;
            dhjx Z = this.c.a().Z();
            if (!bnlqVar.d.a()) {
                return;
            }
            bnlqVar.a = true;
            djin bZ = djio.e.bZ();
            dnqg bZ2 = dnqh.p.bZ();
            dnmu dnmuVar = dnmu.PROPERTY_GMM;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ2.b;
            dnqhVar.l = dnmuVar.ap;
            dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            int i = ddda.az.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ2.b;
            dnqhVar2.a |= 64;
            dnqhVar2.g = i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djio djioVar = (djio) bZ.b;
            dnqh bK = bZ2.bK();
            bK.getClass();
            djioVar.b = bK;
            djioVar.a = 1 | djioVar.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djio djioVar2 = (djio) bZ.b;
            Z.getClass();
            djioVar2.c = Z;
            int i2 = djioVar2.a | 2;
            djioVar2.a = i2;
            djioVar2.a = i2 | 16;
            djioVar2.d = false;
            bnlqVar.c.a(bZ.bK(), bnlqVar.b, bvrj.UI_THREAD);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(float f) {
        if (f < i()) {
            return false;
        }
        if (!this.d || this.f < i()) {
            return true;
        }
        return this.h.b.getPromotedPlacesParameters().f && j() && !f().c(true).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        if (h() < i()) {
            return false;
        }
        if (!this.d) {
            return this.h.b.getPromotedPlacesParameters().e;
        }
        djim djimVar = this.h.a;
        return djimVar != null && djimVar.k && j() && !f().c(true).booleanValue();
    }

    final dbsg<Boolean> f() {
        akqs a = alao.a(this.c.a());
        if (a == null) {
            return dbpy.a;
        }
        akrp g = akrp.g(akra.f(a.j()), akra.f(a.k()));
        akrp akrpVar = ((cui) this.e).j;
        boolean z = false;
        if (akrpVar == null) {
            return dbsg.i(false);
        }
        if (akrpVar.k(g) || akrpVar.l(g)) {
            z = true;
        }
        return dbsg.i(Boolean.valueOf(z));
    }

    public final boolean g() {
        return this.h.a();
    }

    public final float h() {
        return this.i.a().p().k;
    }

    public final float i() {
        bnlm bnlmVar = this.h;
        djim djimVar = bnlmVar.a;
        return (djimVar == null || (djimVar.a & 1) == 0) ? bnlmVar.b.getPromotedPlacesParameters().b : djimVar.b;
    }

    @Override // defpackage.akzx
    public final void l(akzs akzsVar) {
        djim djimVar;
        if (!g() || (djimVar = this.h.a) == null || !djimVar.B || akzsVar.a) {
            return;
        }
        this.l.execute(new Runnable(this) { // from class: bnlk
            private final bnll a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bnll bnllVar = this.a;
                float h = bnllVar.h();
                if (bnllVar.d(h) || bnllVar.e()) {
                    bnllVar.c(h);
                }
            }
        });
    }
}
