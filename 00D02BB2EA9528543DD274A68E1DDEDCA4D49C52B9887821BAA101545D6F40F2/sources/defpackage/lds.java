package defpackage;
/* compiled from: PG */
/* renamed from: lds  reason: default package */
/* loaded from: classes7.dex */
final class lds implements lkn {
    final /* synthetic */ ldz a;

    public lds(ldz ldzVar) {
        this.a = ldzVar;
    }

    private final void d() {
        dbsk.s(this.a.l);
        ldz ldzVar = this.a;
        lkr lkrVar = ldzVar.l;
        dbsk.s(lkrVar);
        int i = lkrVar.z;
        ckco ckcoVar = (ckco) ldzVar.e.a(ckee.au);
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        ckcoVar.a(i2);
        dbsk.s(this.a.l);
        this.a.f.a().a();
        ldz ldzVar2 = this.a;
        dcba<ldu> dcbaVar = ldzVar2.n;
        ldzVar2.h.b();
        dcbaVar.add(new ldu());
        ldz ldzVar3 = this.a;
        ldzVar3.l = null;
        ldzVar3.g.n();
    }

    @Override // defpackage.lkn
    public final void a() {
        bvrj.UI_THREAD.c();
        d();
    }

    @Override // defpackage.lkn
    public final void b(dcdc<ldm> dcdcVar, amte amteVar) {
        bvrj.UI_THREAD.c();
        this.a.b.a();
        d();
        lzf lzfVar = this.a.j;
        dbsk.s(lzfVar);
        Boolean l = lzfVar.k().l();
        if (l == null || !l.booleanValue()) {
            les lesVar = this.a.k;
            lesVar.w(lesVar.h.g(dcdcVar, amteVar, false));
        }
        this.a.b.b();
    }

    @Override // defpackage.lkn
    public final void c(crmw crmwVar, ldm ldmVar, @dzsi amte amteVar, ksr ksrVar) {
        lds ldsVar = this;
        bvrj.UI_THREAD.c();
        ldsVar.a.b.a();
        d();
        les lesVar = ldsVar.a.k;
        if (!lesVar.o.o() && !lesVar.q.a()) {
            ler lerVar = lesVar.i;
            crzm<Boolean> h = lesVar.s.h();
            amub b = amteVar != null ? amteVar.b(amteVar.i, ((jus) lerVar).b.v.d) : null;
            jus jusVar = (jus) lerVar;
            jvh jvhVar = jusVar.b;
            kag kagVar = jvhVar.ak;
            ncm a = jvhVar.M.a();
            jvh jvhVar2 = jusVar.b;
            cqkj cqkjVar = jvhVar2.v;
            dowa dowaVar = b != null ? b.I : null;
            not notVar = jvhVar2.V;
            jur jurVar = jusVar.a;
            nop nopVar = jurVar.a;
            noo nooVar = jvhVar2.y;
            kxu kxuVar = jvhVar2.C;
            hwe hweVar = jvhVar2.B;
            asmp asmpVar = jurVar.b;
            afwo afwoVar = jvhVar2.z;
            kaj kajVar = jvhVar2.aY;
            kag.a(crmwVar, 1);
            kag.a(ldmVar, 2);
            kag.a(a, 3);
            kag.a(cqkjVar, 4);
            bvsl a2 = kagVar.a.a();
            kag.a(a2, 5);
            kag.a(notVar, 7);
            kag.a(nopVar, 8);
            kag.a(nooVar, 9);
            kag.a(jurVar, 10);
            cjqy a3 = kagVar.b.a();
            kag.a(a3, 12);
            cjqq a4 = kagVar.c.a();
            kag.a(a4, 13);
            kag.a(kxuVar, 14);
            kag.a(hweVar, 15);
            kag.a(asmpVar, 16);
            btrm a5 = kagVar.d.a();
            kag.a(a5, 17);
            kag.a(afwoVar, 18);
            bvrb a6 = kagVar.e.a();
            kag.a(a6, 19);
            dehq a7 = kagVar.f.a();
            kag.a(a7, 20);
            akfa a8 = kagVar.g.a();
            kag.a(a8, 21);
            kag.a(h, 22);
            kag.a(kajVar, 23);
            kcl a9 = kagVar.h.a();
            kag.a(a9, 24);
            lesVar.w(new kaf(crmwVar, ldmVar, a, cqkjVar, a2, dowaVar, notVar, nopVar, nooVar, jurVar, ksrVar, a3, a4, kxuVar, hweVar, asmpVar, a5, afwoVar, a6, a7, a8, h, kajVar, a9));
            ldsVar = this;
        } else {
            lesVar.x();
        }
        ldsVar.a.b.b();
    }
}
