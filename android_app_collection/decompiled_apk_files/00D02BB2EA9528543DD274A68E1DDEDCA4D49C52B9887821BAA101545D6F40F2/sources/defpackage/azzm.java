package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import defpackage.azwm;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: azzm  reason: default package */
/* loaded from: classes3.dex */
public abstract class azzm<P extends azwm<P>, CP extends azwm<CP>> implements baad, azzp {
    public String b;
    public String c;
    public long d;
    public boolean e;
    public boolean g;
    @dzsi
    private bvrt<dnwl> l;
    private static final dcdn<baab, Integer> j = dcdn.m(baab.FAVORITES, Integer.valueOf((int) R.string.DEFAULT_LIST_FAVORITES), baab.WANT_TO_GO, Integer.valueOf((int) R.string.DEFAULT_LIST_WANT_TO_GO), baab.STARRED_PLACES, Integer.valueOf((int) R.string.DEFAULT_LIST_STARRED_PLACES));
    public static final dcdc<baab> a = dcdc.g(baab.FAVORITES, baab.WANT_TO_GO);
    private long k = Long.MIN_VALUE;
    public final List<baal> f = new ArrayList();
    public volatile boolean h = false;
    public volatile boolean i = false;

    public azzm(String str, String str2, @dzsi dnwl dnwlVar, boolean z, long j2) {
        this.d = Long.MIN_VALUE;
        this.b = str;
        this.c = str2;
        this.l = dnwlVar == null ? null : bvrt.b(dnwlVar);
        this.e = z;
        this.d = j2;
        this.g = true;
    }

    public static boolean aj(baal baalVar) {
        return !baalVar.s();
    }

    @dzsi
    private final baal aq(final azxb azxbVar, final boolean z) {
        return (baal) dcbg.b(this.f).o(new dbsl(z) { // from class: azzi
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                boolean z2 = this.a;
                baal baalVar = (baal) obj;
                dcdc<baab> dcdcVar = azzm.a;
                return !z2 || !baalVar.s();
            }
        }).r(new dbsl(azxbVar) { // from class: azzj
            private final azxb a;

            {
                this.a = azxbVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                azxb azxbVar2 = this.a;
                baal baalVar = (baal) obj;
                dcdc<baab> dcdcVar = azzm.a;
                baaj baajVar = baaj.PLACE;
                int ordinal = baalVar.x().ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        return azxbVar2.equals(baalVar.a());
                    }
                    if (ordinal != 2) {
                        return false;
                    }
                }
                return azxbVar2.h(baalVar.a());
            }
        }).f();
    }

    private final synchronized boolean ar(baal baalVar) {
        if (this.f.contains(baalVar) && !baalVar.s()) {
            baalVar.q();
            int o = baalVar.o();
            if (this.e) {
                for (baal baalVar2 : this.f) {
                    if (baalVar2.o() > o) {
                        baalVar2.n(baalVar2.o() - 1);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.baad
    public final String E(Context context) {
        baab o = o();
        dcdn<baab, Integer> dcdnVar = j;
        return dcdnVar.containsKey(o) ? context.getString(dcdnVar.get(o).intValue()) : this.b;
    }

    @Override // defpackage.baad
    public final void F(String str) {
        String s = dbra.b.s(dbsj.e(str));
        if (!this.b.equals(s)) {
            this.b = s;
            this.h = true;
        }
    }

    @Override // defpackage.baad
    public final String G() {
        return this.c;
    }

    @Override // defpackage.baad
    public final void H(String str) {
        String s = dbra.b.s(dbsj.e(str));
        if (!this.c.equals(s)) {
            this.c = s;
            this.h = true;
        }
    }

    @Override // defpackage.baad
    @dzsi
    public final dnwl I() {
        bvrt<dnwl> bvrtVar = this.l;
        if (bvrtVar == null) {
            return null;
        }
        return bvrtVar.e((dssr) dnwl.f.cu(7), dnwl.f);
    }

    @Override // defpackage.baad
    public final void J(@dzsi dnwl dnwlVar) {
        if (!dbsd.a(I(), dnwlVar)) {
            this.l = dnwlVar == null ? null : bvrt.b(dnwlVar);
            this.h = true;
        }
    }

    @Override // defpackage.baad
    public final void K(boolean z) {
        if (this.e != z) {
            this.e = z;
            this.h = true;
        }
    }

    @Override // defpackage.baad
    public final boolean L() {
        return !D() && !O().isEmpty();
    }

    @Override // defpackage.baad
    public final boolean M() {
        return !D() && !P().isEmpty();
    }

    @Override // defpackage.baad
    public final long Q() {
        return this.d;
    }

    @Override // defpackage.baad
    public final void R(long j2) {
        if (j2 >= 0) {
            this.d = j2;
        }
    }

    @Override // defpackage.baad
    public final long S() {
        return this.k;
    }

    @Override // defpackage.baad
    public final void T(long j2) {
        this.k = j2;
    }

    @Override // defpackage.baad
    public final void U() {
        long j2 = this.k;
        if (j2 < 0) {
            return;
        }
        this.k = j2 + 1;
    }

    @Override // defpackage.baad
    public final void V() {
        long j2 = this.k;
        if (j2 >= 0 && j2 > 0) {
            this.k = j2 - 1;
        }
    }

    @Override // defpackage.baad
    public final boolean W() {
        return this.e;
    }

    @Override // defpackage.baad
    public final boolean X() {
        return this.h;
    }

    @Override // defpackage.baad
    public final boolean Y() {
        return this.g;
    }

    @Override // defpackage.baad
    public final void Z() {
        this.g = !this.g;
    }

    @Override // defpackage.baad
    public final jic a() {
        return baam.e(o());
    }

    @Override // defpackage.baad
    public final boolean ab() {
        return this.i;
    }

    @Override // defpackage.baad
    public final boolean ac() {
        return this.i && this.h;
    }

    @Override // defpackage.baad
    public long ah() {
        throw null;
    }

    @Override // defpackage.azzp
    public final Class<baad> ak() {
        return baad.class;
    }

    public final synchronized void al(List<baal> list) {
        am();
        for (int i = 0; i < list.size(); i++) {
            baal baalVar = list.get(i);
            baalVar.r();
            if (baalVar instanceof azzn) {
                ((azzn) baalVar).c = this;
            }
        }
        this.f.addAll(list);
    }

    protected final synchronized void am() {
        this.f.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void an() {
        this.h = false;
    }

    @Override // defpackage.baad
    public final synchronized boolean b(baal baalVar) {
        baal aq = aq(baalVar.a(), false);
        if (aq != null) {
            if (!aq.s()) {
                return false;
            }
            this.f.remove(aq);
        }
        if (baalVar instanceof azzn) {
            ((azzn) baalVar).c = this;
        }
        baalVar.r();
        this.f.add(baalVar);
        if (this.e) {
            baalVar.n(i().size() - 1);
        }
        return true;
    }

    @Override // defpackage.baad
    public final void c(baal baalVar) {
        baal aq = aq(baalVar.a(), false);
        if (aq != null) {
            this.f.remove(aq);
            b(aq);
        }
    }

    @Override // defpackage.baad
    @dzsi
    public final baal d(azxb azxbVar) {
        return aq(azxbVar, true);
    }

    @Override // defpackage.baad
    public final boolean e(baal baalVar) {
        baaj baajVar = baaj.PLACE;
        int ordinal = baalVar.x().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return f(baalVar.a());
        }
        return ar(baalVar);
    }

    @Override // defpackage.baad
    public final boolean f(azxb azxbVar) {
        baal d = d(azxbVar);
        return d != null && ar(d);
    }

    @Override // defpackage.baad
    public final boolean g(baal baalVar) {
        baaj baajVar = baaj.PLACE;
        int ordinal = baalVar.x().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return h(baalVar.a());
        }
        return i().contains(baalVar);
    }

    @Override // defpackage.baad
    public final boolean h(azxb azxbVar) {
        return d(azxbVar) != null;
    }

    @Override // defpackage.baad
    public final dcdc<baal> i() {
        return dcdc.q(dcft.i(this.f, azzk.a));
    }

    @Override // defpackage.baad
    public final Set<baaj> j() {
        return dcep.L(dcft.o(i(), azzl.a));
    }

    @Override // defpackage.baad
    public final int k() {
        return i().size();
    }

    @Override // defpackage.baad
    public dpov n() {
        throw null;
    }

    @Override // defpackage.baad
    public boolean q() {
        throw null;
    }

    @Override // defpackage.baad
    public final boolean r() {
        return o() == baab.CUSTOM;
    }
}
