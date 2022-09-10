package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: mfs  reason: default package */
/* loaded from: classes7.dex */
public final class mfs implements btph {
    public static final dcqe a = dcqe.c("mfs");
    public final btrm b;
    public final bvjj c;
    public final bwjh d;
    public final dxio<bwjx> e;
    public final bxtv f;
    public boolean g;
    public boolean h;
    public final mfr i = new mfr(this);
    private final bvrb j;
    private final dxio<ahjq> k;
    private final dxio<axwq> l;
    private final dxio<akpm> m;

    public mfs(bvrb bvrbVar, btrm btrmVar, dxio<ahjq> dxioVar, dxio<axwq> dxioVar2, dxio<akpm> dxioVar3, bwjh bwjhVar, dxio<bwjx> dxioVar4, bxtv bxtvVar, bvjj bvjjVar) {
        dbsk.s(bvrbVar);
        this.j = bvrbVar;
        dbsk.s(btrmVar);
        this.b = btrmVar;
        dbsk.s(dxioVar);
        this.k = dxioVar;
        dbsk.s(dxioVar2);
        this.l = dxioVar2;
        dbsk.s(dxioVar3);
        this.m = dxioVar3;
        dbsk.s(bwjhVar);
        this.d = bwjhVar;
        dbsk.s(dxioVar4);
        this.e = dxioVar4;
        dbsk.s(bxtvVar);
        this.f = bxtvVar;
        dbsk.s(bvjjVar);
        this.c = bvjjVar;
        new nkz(mfp.a);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final void a() {
        if (this.h) {
            d(dtja.CAR_SEARCH, dtiy.GMM_PREFETCH_ON_STARTUP, null, true, btys.f);
        }
    }

    public final dcdc<azva> b() {
        dcdc<azva> n = this.l.a().n();
        dbsk.s(n);
        dccx dccxVar = new dccx();
        int size = n.size();
        for (int i = 0; i < size; i++) {
            azva azvaVar = n.get(i);
            dndr dndrVar = azvaVar.a;
            if (dndrVar == dndr.HOME || dndrVar == dndr.WORK) {
                dccxVar.g(azvaVar);
            }
        }
        return dccxVar.f();
    }

    public final void d(dtja dtjaVar, dtiy dtiyVar, @dzsi bwjw bwjwVar, boolean z, btys btysVar) {
        GmmLocation a2;
        akqs b;
        akqs akqsVar = null;
        if (dtiyVar != dtiy.GMM_PREFETCH_ON_STARTUP && this.m.a() != null && ((b = alao.b(this.m.a())) == null || akqo.e(b.j(), b.k()) <= 190000.0d)) {
            akqsVar = b;
        }
        if (akqsVar == null && (a2 = this.k.a().a()) != null) {
            akqsVar = new akqs(a2.B(), 0.04d, 0.04d);
        }
        akqs akqsVar2 = akqsVar;
        if (akqsVar2 != null || !z) {
            this.j.b(new mfq(this, dtiyVar, dtjaVar, akqsVar2, bwjwVar, btysVar), bvrj.UI_THREAD);
        }
    }
}
