package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: atzk  reason: default package */
/* loaded from: classes2.dex */
public final class atzk implements atzg {
    public static final dcdc<dmlo> a = dcdc.i(dmlo.TOP_RIGHT, dmlo.TOP_LEFT, dmlo.BOTTOM_RIGHT, dmlo.BOTTOM_LEFT);
    public final Context b;
    public final btrm c;
    public final atym d;
    @dzsi
    amrl e;
    final List<aryr> f;
    final Map<aktc, atzd> g;
    final Map<aktc, atzd> h;
    public atzi i;
    public boolean j;
    public final akoq k;
    public boolean l;
    public boolean m;
    private final bvrb n;
    private final cqat o;
    private final btvo p;
    private final asmp q;
    private final cjqq r;
    private final aufc s;
    private final crzp<aufb> t;
    private final aluu u;
    private final int v;

    public atzk(Context context, bvrb bvrbVar, btrm btrmVar, cqat cqatVar, btvo btvoVar, cjqq cjqqVar, aufc aufcVar, asmp asmpVar, int i, akoq akoqVar, aluu aluuVar) {
        atym atymVar = new atym(btrmVar, akoqVar.aC(), akoqVar.aE());
        this.t = new atzh(this);
        this.e = null;
        this.f = new ArrayList();
        this.g = new HashMap();
        this.h = new HashMap();
        this.l = false;
        this.m = false;
        this.b = context;
        this.n = bvrbVar;
        this.c = btrmVar;
        this.o = cqatVar;
        this.p = btvoVar;
        this.r = cjqqVar;
        this.s = aufcVar;
        this.q = asmpVar;
        this.d = atymVar;
        this.j = aufcVar.b();
        this.v = i;
        this.k = akoqVar;
        this.u = aluuVar;
        this.i = new atzi(context.getResources(), akoqVar.aE(), this.j);
    }

    private static boolean l(astc astcVar) {
        return (astcVar.h == null && astcVar.d == null) ? false : true;
    }

    private static boolean m(astc astcVar) {
        return astcVar.h != null && astcVar.d == null;
    }

    private final void n() {
        for (aktc aktcVar : this.g.keySet()) {
            this.k.ak().a(aktcVar);
        }
        this.h.putAll(this.g);
        this.g.clear();
    }

    private final void o() {
        this.g.putAll(this.h);
        this.h.clear();
        for (aktc aktcVar : this.g.keySet()) {
            amrg ak = this.k.ak();
            amrl amrlVar = this.e;
            dbsk.s(amrlVar);
            ak.b(aktcVar, amrlVar, amsb.NAVIGATION_SEARCH_RESULT, 0, a);
        }
    }

    private final void p(Collection<aktc> collection) {
        for (aktc aktcVar : collection) {
            this.k.ak().a(aktcVar);
            this.k.aC().e(aktcVar);
        }
        collection.clear();
    }

    @Override // defpackage.asmo
    public final void NZ(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public final void Qp() {
        k();
        this.d.c();
        this.i.a();
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void b() {
        this.s.i().d(this.t, this.n.h());
    }

    @Override // defpackage.asmo
    public final void c() {
        this.s.i().c(this.t);
    }

    @Override // defpackage.atzg
    public final void g(astc astcVar, @dzsi astc astcVar2) {
        if (astcVar2 != null && l(astcVar2) == l(astcVar) && m(astcVar) == m(astcVar2)) {
            return;
        }
        boolean l = l(astcVar);
        boolean m = m(astcVar);
        if (l && m) {
            aryr aryrVar = astcVar.h;
            dbsk.s(aryrVar);
            n();
            this.d.a(dcdc.f(aryrVar));
        } else if (l) {
            n();
            this.d.b();
        } else {
            o();
            this.d.a(this.f);
        }
    }

    @Override // defpackage.atzg
    public final void h(boolean z) {
        this.f.clear();
        k();
        this.d.b();
        if (!z) {
            this.q.q();
        }
    }

    @Override // defpackage.atzg
    public final void i(@dzsi List<ilo> list, boolean z, boolean z2, String str, int i) {
        dbsg<Integer> dbsgVar;
        String q;
        aryp arypVar;
        this.f.clear();
        k();
        this.l = z;
        this.m = z2;
        if (list == null || list.isEmpty()) {
            int i2 = true != z2 ? R.string.SEARCH_NO_RESULTS : R.string.SEARCH_OFFLINE_NO_RESULTS;
            bvrb bvrbVar = this.n;
            Context context = this.b;
            cjxu.g(bvrbVar, context, context.getResources().getString(i2, str));
            this.d.b();
            this.c.b(new brll(str, dcdc.e()));
            return;
        }
        this.c.b(new brll(str, dcdc.r(list)));
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ilo iloVar = list.get(i3);
            akra f = akra.f(iloVar.aj());
            if (f != null) {
                if (iloVar.cu()) {
                    dbsgVar = dbsg.i(Integer.valueOf(iloVar.cv()));
                } else {
                    dbsgVar = dbpy.a;
                }
                aryo k = aryr.k();
                if (iloVar.bi()) {
                    q = iloVar.bh();
                } else {
                    q = iloVar.q();
                }
                if (q.length() > 20) {
                    q = String.valueOf(q.substring(0, 17)).concat("...");
                }
                k.a = q;
                k.b = iloVar.bi() ? iloVar.bh() : iloVar.q();
                k.c = iloVar.B();
                k.e = f;
                k.f = dbsgVar;
                k.g = iloVar.ai();
                if (i3 < this.p.getEnrouteParameters().d) {
                    arypVar = aryp.BIG;
                } else {
                    arypVar = aryp.SMALL;
                }
                k.h = arypVar;
                k.i = i == 3;
                k.k = iloVar.al().b(this.o);
                k.l = iloVar.ab();
                k.m = iloVar.aa();
                k.n = iloVar.ae() ? Float.valueOf(iloVar.af()) : null;
                k.o = iloVar.as();
                k.p = iloVar.bY();
                k.b();
                k.r = iloVar.cz();
                k.s = this.u;
                k.j = z2;
                arrayList.add(f);
                this.f.add(k.a());
            }
        }
        j(this.f, z2, z, i != 3);
        this.d.a(this.f);
        this.q.p(arrayList, i == 2, i == 3, this.p.getEnrouteParameters().c, true);
        if (this.f.size() != 1 || i != 1) {
            return;
        }
        aryr aryrVar = this.f.get(0);
        if (this.v == 2) {
            this.c.b(new crhn(aryrVar));
        } else {
            this.c.b(new crhz(astj.f(aryrVar), aryrVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0199  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v80 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.util.List<defpackage.aryr> r20, boolean r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atzk.j(java.util.List, boolean, boolean, boolean):void");
    }

    public final void k() {
        p(this.h.keySet());
        p(this.g.keySet());
    }
}
