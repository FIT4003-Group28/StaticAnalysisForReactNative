package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: apro  reason: default package */
/* loaded from: classes2.dex */
public final class apro implements aprw {
    public static final Pair<String, Long> a = Pair.create("NO_ACCOUNT", 0L);
    public static final dwuv b;
    public final bvjj c;
    public final bvab d;
    public final dehq e;
    public final ckhe f;
    public final apyv g;
    public boolean k;
    private final cqat m;
    private final akfa n;
    private final bhhf o;
    public List<akqi> h = new ArrayList();
    public Map<String, dehn<List<akqi>>> i = new HashMap();
    public Pair<String, Long> j = a;
    public Set<String> l = new HashSet();

    static {
        dwus bZ = dwuv.c.bZ();
        dwut bZ2 = dwuu.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwuu dwuuVar = (dwuu) bZ2.b;
        dwuuVar.a |= 1;
        dwuuVar.b = true;
        dwuu dwuuVar2 = (dwuu) bZ2.b;
        dwuuVar2.a |= 2;
        dwuuVar2.c = true;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwuv dwuvVar = (dwuv) bZ.b;
        dwuu bK = bZ2.bK();
        bK.getClass();
        dwuvVar.b = bK;
        dwuvVar.a |= 4;
        b = bZ.bK();
    }

    public apro(bvjj bvjjVar, bvab bvabVar, dehq dehqVar, cqat cqatVar, ckcw ckcwVar, akfa akfaVar, apyv apyvVar, bhhf bhhfVar) {
        this.c = bvjjVar;
        this.d = bvabVar;
        this.e = dehqVar;
        this.m = cqatVar;
        this.f = (ckhe) ckcwVar.a(ckgp.g);
        this.n = akfaVar;
        this.g = apyvVar;
        this.o = bhhfVar;
    }

    public static List<akqi> f(List<dpxu> list) {
        int a2;
        ArrayList arrayList = new ArrayList();
        for (dpxu dpxuVar : list) {
            int a3 = dpxq.a(dpxuVar.b);
            if (a3 != 0 && a3 == 3 && (a2 = dpxt.a(dpxuVar.c)) != 0 && a2 == 4) {
                String valueOf = String.valueOf(dpxuVar.a);
                arrayList.add(akqi.b(valueOf.length() != 0 ? "0x0:0x".concat(valueOf) : new String("0x0:0x")));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(@dzsi btlu btluVar) {
        this.c.Q(bvjk.jp, btluVar);
        this.h = new ArrayList();
        this.j = a;
        this.i = new HashMap();
    }

    public final synchronized bvac b(btlu btluVar) {
        this.d.a().e = btluVar;
        return this.d.c();
    }

    @Override // defpackage.aprw
    public final List<akqi> c() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(boolean z) {
        if (!this.k) {
            if (!z) {
                long w = this.c.w(bvjk.jw, 0L);
                if (w != 0) {
                    eapd eapdVar = new eapd(w);
                    eapd a2 = eapd.a();
                    bhhf bhhfVar = this.o;
                    if (((bhhfVar.a.getMerchantModeParameters().a & 32768) != 0 ? bhhfVar.a.getMerchantModeParameters().n : 24) > eapa.b(eapdVar, a2).p) {
                        return;
                    }
                }
            }
            this.k = true;
            deha.q(this.n.v(), new aprm(this), this.e);
        }
    }

    public final void e(String str, List<String> list, List<btlu> list2) {
        this.l.remove(str);
        if (this.l.isEmpty()) {
            this.k = false;
            this.c.ah(bvjk.js, list);
            this.c.Z(bvjk.jw, this.m.b());
            bvjj bvjjVar = this.c;
            bvjk bvjkVar = bvjk.jx;
            dcen N = dcep.N();
            for (btlu btluVar : list2) {
                if (btluVar.f == btlt.GOOGLE) {
                    String t = btluVar.t();
                    if (!dbsj.d(t)) {
                        N.b(t);
                    }
                }
            }
            bvjjVar.af(bvjkVar, N.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(btlu btluVar) {
        String str = btluVar.d;
        if (this.i.containsKey(str)) {
            this.i.get(str);
            return;
        }
        deig d = deig.d();
        this.i.put(str, d);
        this.j = Pair.create(str, Long.valueOf(this.m.b()));
        this.f.a();
        b(btluVar).b(b, new aprl(this, str, d, btluVar), this.e);
    }
}
