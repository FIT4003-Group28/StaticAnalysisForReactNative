package defpackage;

import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: bjea  reason: default package */
/* loaded from: classes3.dex */
public class bjea implements bjdw {
    public final Runnable a;
    public final cjtd b;
    private final List<bjdz> c = dchl.a();
    private final cjtd d;
    private final cjtd e;
    private boolean f;

    public bjea(final ilo iloVar, final List<dqcq> list, List<dqcq> list2, final gfw gfwVar) {
        this.a = new Runnable(this, gfwVar, iloVar, list) { // from class: bjdx
            private final bjea a;
            private final gfw b;
            private final ilo c;
            private final List d;

            {
                this.a = this;
                this.b = gfwVar;
                this.c = iloVar;
                this.d = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjea bjeaVar = this.a;
                gfw gfwVar2 = this.b;
                ilo iloVar2 = this.c;
                List list3 = this.d;
                cjtd bZ = iloVar2.bZ();
                List<dqcq> g = bjeaVar.g();
                bjee bjeeVar = new bjee();
                Bundle bundle = new Bundle();
                djah bZ2 = djai.g.bZ();
                bZ2.a(list3);
                bvrs.l(bundle, bZ2.bK());
                djan bZ3 = djao.i.bZ();
                bZ3.a(g);
                bvrs.l(bundle, bZ3.bK());
                bundle.putSerializable("placemarkLoggingParamsWithFprint", bZ);
                bjeeVar.B(bundle);
                gfwVar2.aZ(bjeeVar);
            }
        };
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxl.N;
        this.d = c.a();
        cjta c2 = cjtd.c(iloVar.bZ());
        c2.d = dtxl.O;
        this.e = c2.a();
        cjta c3 = cjtd.c(iloVar.bZ());
        c3.d = dtxl.Q;
        this.b = c3.a();
        h(list2);
    }

    private final void h(List<dqcq> list) {
        this.c.clear();
        for (int i = 0; i < 2 && i < list.size(); i++) {
            this.c.add(new bjdz(this, list.get(i)));
        }
        this.f = !this.c.isEmpty();
    }

    @Override // defpackage.bjdw
    public Boolean a() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.bjdw
    public cqkl b() {
        this.a.run();
        return cqkl.a;
    }

    @Override // defpackage.bjdw
    public List<? extends bjdv> c() {
        return this.c;
    }

    @Override // defpackage.bjdw
    public cjtd d() {
        return this.d;
    }

    @Override // defpackage.bjdw
    public cjtd e() {
        return this.e;
    }

    public void f(List<dqcq> list) {
        h(list);
        cqkx.p(this);
    }

    public List<dqcq> g() {
        return dchl.k(this.c, bjdy.a);
    }
}
