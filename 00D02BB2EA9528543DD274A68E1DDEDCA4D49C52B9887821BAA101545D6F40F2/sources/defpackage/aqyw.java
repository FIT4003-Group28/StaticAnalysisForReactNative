package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aqyw  reason: default package */
/* loaded from: classes2.dex */
public final class aqyw extends itb implements arag {
    public final ahjq a;
    private final gga b;
    private final cqat c;
    private final bvjj d;
    private final cjxd e;
    private final cjqy f;
    private final cjqq g;
    private final btvo h;
    private final ckcw i;
    @dzsi
    private aqyr j;
    private final atbs k;

    public aqyw(gga ggaVar, cqat cqatVar, bvjj bvjjVar, ahjq ahjqVar, cjxd cjxdVar, cjqy cjqyVar, cjqq cjqqVar, btvo btvoVar, ckcw ckcwVar, atbs atbsVar) {
        this.b = ggaVar;
        this.c = cqatVar;
        this.d = bvjjVar;
        this.a = ahjqVar;
        this.e = cjxdVar;
        this.f = cjqyVar;
        this.g = cjqqVar;
        this.h = btvoVar;
        this.i = ckcwVar;
        this.k = atbsVar;
    }

    private final duwr n() {
        duwr duwrVar = this.h.getLocationParameters().b;
        return duwrVar == null ? duwr.c : duwrVar;
    }

    private final void o(boolean z, int i, boolean z2, @dzsi arae araeVar) {
        boolean k = k(i);
        aqyv aqyvVar = new aqyv(this, araeVar);
        aqyr aqyrVar = this.j;
        dbsk.s(aqyrVar);
        aqyrVar.c(z, k, z2, aqyvVar);
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        if (this.j == null) {
            if (btsj.b(this.b)) {
                this.j = new aqyj(this.b, this.f, this.g, this.i, this.k);
            } else {
                this.j = new aqyu(this.b, this.a, this.e, this.f, this.g);
            }
        }
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.j = null;
        super.Nu();
    }

    @Override // defpackage.arag
    public final boolean e() {
        return aqyu.a(this.a);
    }

    @Override // defpackage.arag
    public final void f(boolean z, @dzsi arae araeVar) {
        boolean z2 = true;
        if (!z && (!this.d.m(bvjk.fg, false) || !this.a.h().c(ahjs.DISABLED_BY_SETTING))) {
            z2 = false;
        }
        o(z2, n().b, false, araeVar);
    }

    @Override // defpackage.arag
    public final void i(@dzsi arae araeVar) {
        o(false, n().b, true, araeVar);
    }

    @Override // defpackage.arag
    public final void j(@dzsi arae araeVar) {
        int i = n().a;
        boolean z = true;
        if (k(i) && (!this.d.m(bvjk.fg, false) || !this.a.h().b())) {
            z = false;
        }
        o(z, i, false, araeVar);
    }

    final boolean k(int i) {
        return this.c.b() < this.d.w(bvjk.ff, 0L) + TimeUnit.DAYS.toMillis((long) i);
    }

    public final void l(araf arafVar) {
        this.d.Z(bvjk.ff, this.c.b());
        this.d.S(bvjk.fg, arafVar == araf.OPTIMIZED);
    }

    @Override // defpackage.arag
    public final void m(int i) {
        aqyr aqyrVar = this.j;
        if (!(aqyrVar instanceof aqyj)) {
            return;
        }
        aqyj aqyjVar = (aqyj) aqyrVar;
        bvrj.UI_THREAD.c();
        if (aqyjVar.d == null) {
            return;
        }
        if (i == -1) {
            ckcw ckcwVar = aqyjVar.a.a;
            if (ckcwVar != null) {
                ((ckco) ckcwVar.a(ckfw.a)).a(ckfv.a(1));
            }
            aqyjVar.d(aqyjVar.b, dtxs.j);
            aqyjVar.d.d.a(araf.OPTIMIZED);
        } else {
            ckcw ckcwVar2 = aqyjVar.a.a;
            if (ckcwVar2 != null) {
                ((ckco) ckcwVar2.a(ckfw.a)).a(ckfv.a(2));
            }
            aqyjVar.d(aqyjVar.c, dtxs.i);
            aqyjVar.d.d.a(araf.NOT_OPTIMIZED_OR_DISABLED);
        }
        aqyjVar.d = null;
    }
}
