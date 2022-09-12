package defpackage;

import android.content.res.Resources;
import java.util.List;
/* compiled from: PG */
/* renamed from: bklq  reason: default package */
/* loaded from: classes3.dex */
public class bklq implements bklk, bklv {
    public final bklw a;
    private final cjqy b;
    private final bkmj c = new bkmj() { // from class: bkll
    };
    private final iaw d;
    private final hzz e;
    private final bomp f;

    public bklq(cqhn cqhnVar, cjqy cjqyVar, bklx bklxVar, bkkj bkkjVar, List<ccln> list, bwrs<ilo> bwrsVar, bknf bknfVar, boolean z) {
        bklm bklmVar = new bklm(this);
        this.e = bklmVar;
        bomp bompVar = new bomp(new bkln(this));
        this.f = bompVar;
        bhsk a = bklxVar.a.a();
        bklx.a(a, 1);
        bkml a2 = bklxVar.b.a();
        bklx.a(a2, 2);
        bklx.a(bklxVar.c.a(), 3);
        bklj a3 = bklxVar.d.a();
        bklx.a(a3, 4);
        bklx.a(bklxVar.e.a(), 5);
        bkmz a4 = bklxVar.f.a();
        bklx.a(a4, 6);
        bkns a5 = bklxVar.g.a();
        bklx.a(a5, 7);
        bknu a6 = bklxVar.h.a();
        bklx.a(a6, 8);
        Resources a7 = bklxVar.i.a();
        bklx.a(a7, 9);
        btvo a8 = bklxVar.j.a();
        bklx.a(a8, 10);
        bkoj a9 = bklxVar.k.a();
        bklx.a(a9, 11);
        bvjj a10 = bklxVar.l.a();
        bklx.a(a10, 12);
        bklx.a(bkkjVar, 13);
        bklx.a(list, 14);
        bklx.a(bwrsVar, 15);
        bklx.a(bknfVar, 16);
        bklw bklwVar = new bklw(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, bkkjVar, list, bwrsVar, bknfVar, z);
        this.a = bklwVar;
        bklwVar.b.add(new bklo());
        this.b = cjqyVar;
        iaw iawVar = new iaw(cqhnVar, cjqyVar, new bklp(this));
        this.d = iawVar;
        iawVar.NQ(bklmVar);
        cqkx.j(iawVar, bompVar);
    }

    @Override // defpackage.hzw, defpackage.absq
    public hzv a() {
        return this.d.a();
    }

    @Override // defpackage.hzw
    public Integer b() {
        throw null;
    }

    @Override // defpackage.ias, defpackage.absq
    public cqqw c() {
        return this.d.c();
    }

    @Override // defpackage.ias, defpackage.absq
    public Integer d() {
        return this.d.d();
    }

    @Override // defpackage.bklk
    public List<bkmi> e() {
        return this.a.a;
    }

    @Override // defpackage.bklk
    public List<cqkp> f() {
        return this.a.b;
    }

    @Override // defpackage.bklk
    public void g() {
        bklw bklwVar = this.a;
        bklwVar.d.e(new bklu(this));
        for (int i = 0; i < bklwVar.a.size(); i++) {
            ((bkmk) bklwVar.a.get(i)).h(i(), i);
        }
    }

    @Override // defpackage.bklk
    public void h() {
        this.f.b();
    }

    @Override // defpackage.bklv
    public bkmj i() {
        return this.c;
    }

    @Override // defpackage.bklv
    public void j() {
        bklw bklwVar = this.a;
        bklwVar.b.addAll(bklwVar.f, bklwVar.e);
        bklwVar.f += bklwVar.e.size();
        for (int i = 1; i < bklwVar.c.size(); i++) {
            List<Integer> list = bklwVar.c;
            list.set(i, Integer.valueOf(list.get(i).intValue() + bklwVar.e.size()));
        }
        bklwVar.d.d();
        cqkx.p(this);
    }

    public final void k() {
        cjqy cjqyVar = this.b;
        cjsx i = cjsy.i();
        i.b(ddda.de);
        cjqyVar.k(i.a());
    }
}
