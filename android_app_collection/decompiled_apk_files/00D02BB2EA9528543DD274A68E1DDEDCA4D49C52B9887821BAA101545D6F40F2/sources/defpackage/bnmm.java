package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bnmm  reason: default package */
/* loaded from: classes3.dex */
public final class bnmm extends itb implements bnmo {
    public final gga c;
    public final cqkj d;
    public final cjqy e;
    public final cjqq f;
    public final btvo g;
    public final cqat h;
    public final efa i;
    public final btpc j;
    public final bvrb k;
    public final cztz o;
    public final dxio<afha> p;
    public boolean q;
    private final btrm v;
    private final bvju w;
    public final Set<Integer> a = new HashSet();
    public final dcha<Integer, dvev> b = dbyv.N();
    @dzsi
    public bnoe r = null;
    @dzsi
    public dvew s = null;
    @dzsi
    public SharedPreferences t = null;
    public final cjqv u = new bnmj(this);

    public bnmm(gga ggaVar, cqkj cqkjVar, btrm btrmVar, cjqy cjqyVar, cjqq cjqqVar, btvo btvoVar, bvrb bvrbVar, cqat cqatVar, efa efaVar, btpc btpcVar, cztz cztzVar, dxio dxioVar, bvju bvjuVar) {
        this.c = ggaVar;
        this.d = cqkjVar;
        this.v = btrmVar;
        this.e = cjqyVar;
        this.f = cjqqVar;
        this.g = btvoVar;
        this.k = bvrbVar;
        this.h = cqatVar;
        this.i = efaVar;
        this.j = btpcVar;
        this.o = cztzVar;
        this.p = dxioVar;
        this.w = bvjuVar;
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        this.s = this.g.getNudgebarParameters();
        btrm btrmVar = this.v;
        dceq a = dcet.a();
        a.b(btvr.class, new bnmn(btvr.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        this.t = this.w.a("gmmActivityPreference");
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        e();
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.v.a(this);
        this.a.clear();
        this.b.p();
        super.Nu();
    }

    @Override // defpackage.itb
    public final void Po() {
        this.e.A(this.u);
        super.Po();
    }

    public final void e() {
        dvew dvewVar = this.s;
        if (dvewVar == null || dvewVar.a.size() <= 0) {
            this.e.A(this.u);
            this.b.p();
            return;
        }
        this.b.p();
        if (this.s != null) {
            for (int i = 0; i < this.s.a.size(); i++) {
                dvev dvevVar = this.s.a.get(i);
                for (int i2 = 0; i2 < dvevVar.p.size(); i2++) {
                    this.b.n(Integer.valueOf(dvevVar.p.f(i2)), dvevVar);
                }
            }
        }
        this.e.z(this.u);
        this.q = false;
    }
}
