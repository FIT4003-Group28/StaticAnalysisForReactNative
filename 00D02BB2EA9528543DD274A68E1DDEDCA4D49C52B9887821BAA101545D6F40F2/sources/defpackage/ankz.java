package defpackage;
/* compiled from: PG */
/* renamed from: ankz  reason: default package */
/* loaded from: classes2.dex */
public final class ankz implements anhz {
    private static final bvrj b = bvrj.BACKGROUND_THREADPOOL;
    public final btzi<duzc, duzk> a;
    private final anhk c;
    private final anjr<duzc, duzk> d;

    public ankz(anjr<duzc, duzk> anjrVar, ania aniaVar, anhk anhkVar) {
        this.d = anjrVar;
        this.c = anhkVar;
        this.a = new anky(aniaVar);
    }

    private final void c(duzc duzcVar, btzi<duzc, duzk> btziVar) {
        this.d.a(duzcVar, new ankx(this, btziVar), b);
    }

    @Override // defpackage.anhz
    public final void a(aogb aogbVar, dbsg<String> dbsgVar, btzi<duzc, duzk> btziVar) {
        dnqg bZ = dnqh.p.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 2048;
        dnqhVar.j = true;
        if (dbsgVar.a()) {
            String b2 = dbsgVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            b2.getClass();
            dnqhVar2.a |= 8;
            dnqhVar2.e = b2;
        }
        duys bZ2 = duzb.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        duzb duzbVar = (duzb) bZ2.b;
        duzbVar.a |= 1;
        duzbVar.b = true;
        duyx bZ3 = duyy.c.bZ();
        duyz bZ4 = duza.c.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        duza duzaVar = (duza) bZ4.b;
        duzaVar.b = 4;
        duzaVar.a |= 1;
        bZ3.a(bZ4);
        duyz bZ5 = duza.c.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        duza duzaVar2 = (duza) bZ5.b;
        duzaVar2.b = 2;
        duzaVar2.a |= 1;
        bZ3.a(bZ5);
        duyz bZ6 = duza.c.bZ();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        duza duzaVar3 = (duza) bZ6.b;
        duzaVar3.b = 3;
        duzaVar3.a |= 1;
        bZ3.a(bZ6);
        duyv bZ7 = duyw.c.bZ();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        duyw duywVar = (duyw) bZ7.b;
        duywVar.b = 3;
        duywVar.a |= 1;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        duyy duyyVar = (duyy) bZ3.b;
        duyw bK = bZ7.bK();
        bK.getClass();
        dsrj<duyw> dsrjVar = duyyVar.b;
        if (!dsrjVar.a()) {
            duyyVar.b = dsqw.cl(dsrjVar);
        }
        duyyVar.b.add(bK);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        duzb duzbVar2 = (duzb) bZ2.b;
        duyy bK2 = bZ3.bK();
        bK2.getClass();
        duzbVar2.c = bK2;
        duzbVar2.a |= 2;
        duyt bZ8 = duyu.c.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        duyu duyuVar = (duyu) bZ8.b;
        duyuVar.a |= 1;
        duyuVar.b = true;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        duzb duzbVar3 = (duzb) bZ2.b;
        duyu bK3 = bZ8.bK();
        bK3.getClass();
        duzbVar3.d = bK3;
        duzbVar3.a |= 4;
        duyr bZ9 = duzc.h.bZ();
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        duzc duzcVar = (duzc) bZ9.b;
        dnqh bK4 = bZ.bK();
        bK4.getClass();
        duzcVar.f = bK4;
        duzcVar.a |= 32;
        dngs h = aogbVar.h();
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        duzc duzcVar2 = (duzc) bZ9.b;
        h.getClass();
        duzcVar2.b = h;
        int i = duzcVar2.a | 1;
        duzcVar2.a = i;
        duzcVar2.a = i | 8;
        duzcVar2.d = true;
        dnwb a = this.c.a();
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        duzc duzcVar3 = (duzc) bZ9.b;
        a.getClass();
        duzcVar3.e = a;
        duzcVar3.a |= 16;
        duzb bK5 = bZ2.bK();
        bK5.getClass();
        duzcVar3.g = bK5;
        duzcVar3.a |= 64;
        c(bZ9.bK(), btziVar);
    }

    @Override // defpackage.anhz
    public final void b(aogb aogbVar, aogb aogbVar2, btzi<duzc, duzk> btziVar) {
        duyr bZ = duzc.h.bZ();
        dnwb a = this.c.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duzc duzcVar = (duzc) bZ.b;
        a.getClass();
        duzcVar.e = a;
        duzcVar.a |= 16;
        dngp bZ2 = dngq.d.bZ();
        dngs h = aogbVar.h();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dngq dngqVar = (dngq) bZ2.b;
        h.getClass();
        dngqVar.b = h;
        dngqVar.a |= 1;
        dngs h2 = aogbVar2.h();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dngq dngqVar2 = (dngq) bZ2.b;
        h2.getClass();
        dngqVar2.c = h2;
        dngqVar2.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duzc duzcVar2 = (duzc) bZ.b;
        dngq bK = bZ2.bK();
        bK.getClass();
        duzcVar2.c = bK;
        duzcVar2.a |= 2;
        c(bZ.bK(), btziVar);
    }
}
