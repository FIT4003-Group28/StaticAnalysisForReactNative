package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: brmn  reason: default package */
/* loaded from: classes4.dex */
final class brmn {
    public final brat a;
    public final dxio<akox> b;
    private final aluu e;
    private final akty f;
    private final akvz g;
    private final Context h;
    private final cqat i;
    private final btvo j;
    private final bsqi l;
    private final List<aktd> k = new ArrayList();
    public final List<brod> c = new ArrayList();
    public dkee d = dkee.UNKNOWN_VIEW_TYPE;

    public brmn(aluu aluuVar, akty aktyVar, akvz akvzVar, Context context, cqat cqatVar, btvo btvoVar, brat bratVar, dxio<akox> dxioVar, bsqi bsqiVar) {
        this.e = aluuVar;
        this.f = aktyVar;
        this.g = akvzVar;
        this.h = context;
        this.i = cqatVar;
        this.j = btvoVar;
        this.a = bratVar;
        this.b = dxioVar;
        this.l = bsqiVar;
    }

    static String e(brod brodVar) {
        return brodVar.c().b;
    }

    private final boolean g() {
        return dcft.m(this.c, brmm.a).a();
    }

    private static String h(brod brodVar) {
        dvxh dvxhVar = brodVar.a.h().z;
        if (dvxhVar == null) {
            dvxhVar = dvxh.B;
        }
        dvyy dvyyVar = dvxhVar.e;
        if (dvyyVar == null) {
            dvyyVar = dvyy.e;
        }
        return (dvyyVar.a & 1) != 0 ? Float.toString(dvyyVar.b) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v59 */
    public final void a(List<brod> list) {
        int a;
        akuh a2;
        dmpe dmpeVar;
        akuh a3;
        Iterator<brod> it;
        akuh a4;
        this.c.clear();
        this.c.addAll(list);
        int i = 2;
        ?? r5 = 1;
        boolean z = false;
        if (b()) {
            d();
            List<brod> list2 = this.c;
            ArrayList<dmpn> arrayList = new ArrayList();
            Iterator<brod> it2 = list2.iterator();
            while (it2.hasNext()) {
                brod next = it2.next();
                akqq aj = next.a.aj();
                if (aj != null) {
                    int i2 = next.a.G;
                    if (next.f()) {
                        a2 = this.g.a(dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_LABEL_LAYOUT);
                    } else {
                        a2 = this.g.a(dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_LABEL_LAYOUT);
                    }
                    dmpk g = a2.g();
                    if (!this.j.getCategoricalSearchParameters().e() || this.c.size() <= r5 || i2 <= 0 || next.f()) {
                        akvz akvzVar = this.g;
                        aluu aluuVar = this.e;
                        dpxe dpxeVar = next.c().e;
                        if (dpxeVar == null) {
                            dpxeVar = dpxe.g;
                        }
                        akuh a5 = akvzVar.a(aluuVar.a(dpxeVar, next.f()));
                        dmpe dmpeVar2 = (dmpe) dmph.f.bZ();
                        dmpeVar2.b(a5.e());
                        dmpeVar = dmpeVar2;
                    } else {
                        if (i2 <= 99) {
                            a4 = this.g.a(dmqc.LEGEND_STYLE_ORDERED_SEARCH_RESULT);
                        } else {
                            a4 = this.g.a(dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_GENERIC);
                        }
                        dmpc e = a4.e();
                        if (i2 <= 99) {
                            String valueOf = String.valueOf(i2);
                            if (e.c) {
                                e.bF();
                                e.c = z;
                            }
                            dmpd dmpdVar = (dmpd) e.b;
                            dmpd dmpdVar2 = dmpd.h;
                            valueOf.getClass();
                            dmpdVar.a |= r5;
                            dmpdVar.b = valueOf;
                        }
                        dmpeVar = (dmpe) dmph.f.bZ();
                        dmpeVar.b(e);
                    }
                    if (g.c) {
                        g.bF();
                        g.c = z;
                    }
                    dmpn dmpnVar = (dmpn) g.b;
                    dmph dmphVar = (dmph) dmpeVar.bK();
                    dmpn dmpnVar2 = dmpn.r;
                    dmphVar.getClass();
                    dmpnVar.b = dmphVar;
                    int i3 = dmpnVar.a;
                    int i4 = r5 == true ? 1 : 0;
                    char c = r5 == true ? 1 : 0;
                    char c2 = r5 == true ? 1 : 0;
                    char c3 = r5 == true ? 1 : 0;
                    dmpnVar.a = i3 | i4;
                    String e2 = e(next);
                    if (next.f()) {
                        a3 = this.g.a(dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_TITLE_TEXT);
                    } else {
                        a3 = this.g.a(dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_TITLE_TEXT);
                    }
                    dmpe a6 = akxg.a(dfyn.a(e2, 20, i, 20), a3);
                    String str = "";
                    if (next.b(this.d) && this.d.equals(dkee.DINING) && !h(next).isEmpty()) {
                        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
                        if (dmpcVar.c) {
                            dmpcVar.bF();
                            dmpcVar.c = z;
                        }
                        dmpd dmpdVar3 = (dmpd) dmpcVar.b;
                        dmpdVar3.a |= 16;
                        dmpdVar3.f = r5;
                        a6.c((dmpd) dmpcVar.bK());
                        dmpc e3 = f(next).e();
                        String h = h(next);
                        if (e3.c) {
                            e3.bF();
                            e3.c = z;
                        }
                        dmpd dmpdVar4 = (dmpd) e3.b;
                        h.getClass();
                        dmpdVar4.a |= r5;
                        dmpdVar4.b = h;
                        a6.b(e3);
                        a6.b(this.g.a(dmqc.LEGEND_STYLE_SEARCH_RESULT_SUBTITLE_STAR_RATING_ICON).e());
                        dmpc e4 = f(next).e();
                        dvxh dvxhVar = next.a.h().z;
                        if (dvxhVar == null) {
                            dvxhVar = dvxh.B;
                        }
                        dvyy dvyyVar = dvxhVar.e;
                        if (dvyyVar == null) {
                            dvyyVar = dvyy.e;
                        }
                        String str2 = dvyyVar.d == 0 ? str : "(" + dvyyVar.d + ")";
                        if (e4.c) {
                            e4.bF();
                            e4.c = z;
                        }
                        dmpd dmpdVar5 = (dmpd) e4.b;
                        str2.getClass();
                        dmpdVar5.a |= r5;
                        dmpdVar5.b = str2;
                        a6.b(e4);
                    }
                    String str3 = next.c().c;
                    if (next.b(this.d)) {
                        Context context = this.h;
                        cqat cqatVar = this.i;
                        dkee dkeeVar = this.d;
                        dkee dkeeVar2 = dkee.UNKNOWN_VIEW_TYPE;
                        int ordinal = dkeeVar.ordinal();
                        if (ordinal != r5) {
                            if (ordinal == i) {
                                dvxh dvxhVar2 = next.a.h().z;
                                if (dvxhVar2 == null) {
                                    dvxhVar2 = dvxh.B;
                                }
                                dvyy dvyyVar2 = dvxhVar2.e;
                                if (dvyyVar2 == null) {
                                    dvyyVar2 = dvyy.e;
                                }
                                String str4 = dvyyVar2.c;
                                StringBuilder sb = new StringBuilder();
                                if (!str4.isEmpty()) {
                                    if (sb.length() != 0) {
                                        sb.append(" · ");
                                    }
                                    sb.append(str4);
                                }
                                if (next.a.al().l(cqatVar)) {
                                    CharSequence a7 = brod.h(context, cqatVar).a(next.a.al());
                                    if (!a7.toString().isEmpty()) {
                                        if (sb.length() != 0) {
                                            sb.append(" · ");
                                        }
                                        sb.append(a7);
                                    }
                                }
                                str = sb.toString();
                            } else if (ordinal == 3) {
                                dvxh dvxhVar3 = next.a.h().z;
                                if (dvxhVar3 == null) {
                                    dvxhVar3 = dvxh.B;
                                }
                                dvyy dvyyVar3 = dvxhVar3.e;
                                if (dvyyVar3 == null) {
                                    dvyyVar3 = dvyy.e;
                                }
                                String str5 = dvyyVar3.c;
                                StringBuilder sb2 = new StringBuilder();
                                if (!str5.isEmpty()) {
                                    if (sb2.length() != 0) {
                                        sb2.append(" · ");
                                    }
                                    sb2.append(str5);
                                }
                                CharSequence a8 = brod.h(context, cqatVar).a(next.a.al());
                                if (!a8.toString().isEmpty()) {
                                    if (sb2.length() != 0) {
                                        sb2.append(" · ");
                                    }
                                    sb2.append(a8);
                                }
                                str = sb2.toString();
                            } else if (ordinal == 4) {
                                str = new StringBuilder(brod.h(context, cqatVar).a(next.a.al())).toString();
                            } else if (ordinal == 5) {
                                if (next.a.h().B.size() > 0) {
                                    str = next.a.h().B.get(0).c;
                                }
                                StringBuilder sb3 = new StringBuilder();
                                if (!str.isEmpty()) {
                                    if (sb3.length() != 0) {
                                        sb3.append(" · ");
                                    }
                                    sb3.append(str);
                                }
                                if (next.a.al().l(cqatVar)) {
                                    CharSequence a9 = brod.h(context, cqatVar).a(next.a.al());
                                    if (!a9.toString().isEmpty()) {
                                        if (sb3.length() != 0) {
                                            sb3.append(" · ");
                                        }
                                        sb3.append(a9);
                                    }
                                }
                                str = sb3.toString();
                            }
                            it = it2;
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            Resources resources = context.getResources();
                            String ab = next.a.ab();
                            if (dbsj.d(ab)) {
                                it = it2;
                            } else {
                                bvsx bvsxVar = new bvsx(resources);
                                bvsu c4 = bvsxVar.c(R.string.SEARCH_LIST_GAS_PRICE_LABELED);
                                it = it2;
                                bvsv a10 = bvsxVar.a(ab);
                                a10.i();
                                c4.a(a10, bvsxVar.c(R.string.PLACE_GAS_PRICE_REGULAR), str);
                                str = c4.c().toString().trim();
                            }
                            if (!dbsj.d(str)) {
                                sb4.append(str);
                            }
                            CharSequence a11 = brod.h(context, cqatVar).a(next.a.al());
                            if (!a11.toString().isEmpty()) {
                                if (sb4.length() != 0) {
                                    sb4.append(" · ");
                                }
                                sb4.append(a11);
                            }
                            str = sb4.toString();
                        }
                    } else {
                        it = it2;
                        str = str3;
                    }
                    if (!str.isEmpty()) {
                        dmpc dmpcVar2 = (dmpc) dmpd.h.bZ();
                        if (dmpcVar2.c) {
                            dmpcVar2.bF();
                            dmpcVar2.c = false;
                        }
                        dmpd dmpdVar6 = (dmpd) dmpcVar2.b;
                        dmpdVar6.a |= 16;
                        dmpdVar6.f = true;
                        a6.c((dmpd) dmpcVar2.bK());
                        akxg.b(dfyn.a(str, 20, 2, 20), f(next), a6);
                    }
                    if (a6.c) {
                        a6.bF();
                        a6.c = false;
                    }
                    dmph dmphVar2 = (dmph) a6.b;
                    dmphVar2.e = 2;
                    dmphVar2.a |= 4;
                    if (g.c) {
                        g.bF();
                        g.c = false;
                    }
                    dmpn dmpnVar3 = (dmpn) g.b;
                    dmph dmphVar3 = (dmph) a6.bK();
                    dmphVar3.getClass();
                    dmpnVar3.c = dmphVar3;
                    dmpnVar3.a |= 2;
                    dmlp bZ = dmlq.e.bZ();
                    dmls a12 = akxh.a(akra.f(aj));
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dmlq dmlqVar = (dmlq) bZ.b;
                    a12.getClass();
                    dmlqVar.b = a12;
                    dmlqVar.a |= 1;
                    if (g.c) {
                        g.bF();
                        g.c = false;
                    }
                    dmpn dmpnVar4 = (dmpn) g.b;
                    dmlq bK = bZ.bK();
                    bK.getClass();
                    dmpnVar4.d = bK;
                    dmpnVar4.a |= 4;
                    if (g.c) {
                        g.bF();
                        g.c = false;
                    }
                    dmpn dmpnVar5 = (dmpn) g.b;
                    dmpnVar5.a |= 32;
                    dmpnVar5.g = 17;
                    dsqv<dmpn, dmol> dsqvVar = dmnl.L;
                    String e5 = e(next);
                    akqi d = next.d();
                    dmoi bZ2 = dmol.n.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dmol dmolVar = (dmol) bZ2.b;
                    e5.getClass();
                    int i5 = dmolVar.a | 128;
                    dmolVar.a = i5;
                    dmolVar.i = e5;
                    long j = d.b;
                    int i6 = i5 | 8;
                    dmolVar.a = i6;
                    dmolVar.e = j;
                    long j2 = d.c;
                    int i7 = i6 | 16;
                    dmolVar.a = i7;
                    dmolVar.f = j2;
                    dmolVar.a = i7 | 512;
                    dmolVar.j = true;
                    g.k(dsqvVar, bZ2.bK());
                    g.k(dmnl.G, anbd.b(next.a, ((dtxi) dtyi.cs).a, false));
                    dsqv<dmpn, dnbc> dsqvVar2 = dmnl.F;
                    dnbb bZ3 = dnbc.c.bZ();
                    dnox bZ4 = dnpo.t.bZ();
                    bZ4.b(dnow.PRIMARY_RESULT);
                    dnpo bK2 = bZ4.bK();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dnbc dnbcVar = (dnbc) bZ3.b;
                    bK2.getClass();
                    dnbcVar.b = bK2;
                    dnbcVar.a |= 1;
                    g.k(dsqvVar2, bZ3.bK());
                    dsqv<dmpn, dmng> dsqvVar3 = dmnl.J;
                    dmnf bZ5 = dmng.e.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dmng dmngVar = (dmng) bZ5.b;
                    dmngVar.a |= 2;
                    dmngVar.c = true;
                    dgrn n = aj.n();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dmng dmngVar2 = (dmng) bZ5.b;
                    n.getClass();
                    dmngVar2.d = n;
                    dmngVar2.a |= 4;
                    g.k(dsqvVar3, bZ5.bK());
                    dnbv e6 = next.e();
                    if (e6 != null) {
                        g.k(dmnl.y, e6);
                    }
                    if (next.a.k) {
                        dsqv<dmpn, akus> dsqvVar4 = akvj.a;
                        akuq bZ6 = akus.o.bZ();
                        if (bZ6.c) {
                            bZ6.bF();
                            bZ6.c = false;
                        }
                        akus akusVar = (akus) bZ6.b;
                        akusVar.b = 1;
                        akusVar.c = true;
                        g.k(dsqvVar4, bZ6.bK());
                    }
                    akxf.O(g);
                    arrayList.add((dmpn) g.bK());
                    it2 = it;
                    i = 2;
                    r5 = 1;
                    z = false;
                }
            }
            for (dmpn dmpnVar6 : arrayList) {
                aktd b = this.f.b(dmpnVar6, dmti.WORLD_ENCODING_LAT_LNG_E7);
                b.Pu();
                this.f.f(b);
                this.k.add(b);
            }
        }
        if (!c() || this.a.d() == 2) {
            return;
        }
        bsqi bsqiVar = this.l;
        dkee dkeeVar3 = this.d;
        List<brod> list3 = this.c;
        dkks exploreMapParametersWithoutLogging = bsqiVar.b.getExploreMapParametersWithoutLogging();
        dnbw bZ7 = dncj.p.bZ();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dncj dncjVar = (dncj) bZ7.b;
        dncjVar.i = 1;
        dncjVar.a |= 128;
        if ((exploreMapParametersWithoutLogging.a & 33554432) != 0 && (a = dfpw.a(exploreMapParametersWithoutLogging.C)) != 0) {
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dncj dncjVar2 = (dncj) bZ7.b;
            dncjVar2.n = a - 1;
            dncjVar2.a |= 4096;
        }
        dncj bK3 = bZ7.bK();
        if (bsqiVar.c.d() == 3) {
            dsqp dsqpVar = (dsqp) bK3.cu(5);
            dsqpVar.bC(bK3);
            dnbw dnbwVar = (dnbw) dsqpVar;
            if (dnbwVar.c) {
                dnbwVar.bF();
                dnbwVar.c = false;
            }
            dncj.b((dncj) dnbwVar.b);
            bK3 = dnbwVar.bK();
        }
        dfpn bZ8 = dfpo.h.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dfpo dfpoVar = (dfpo) bZ8.b;
        bK3.getClass();
        dfpoVar.f = bK3;
        dfpoVar.a |= 16;
        dfpy b2 = bsqi.a.a(dkeeVar3);
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dfpo dfpoVar2 = (dfpo) bZ8.b;
        dfpoVar2.e = b2.n;
        dfpoVar2.a |= 8;
        for (brod brodVar : list3) {
            dfpl bZ9 = dfpm.f.bZ();
            if (!brodVar.g().isEmpty()) {
                String g2 = brodVar.g();
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dfpm dfpmVar = (dfpm) bZ9.b;
                g2.getClass();
                dfpmVar.a |= 2;
                dfpmVar.c = g2;
            } else if (akqi.d(brodVar.d())) {
                dgrh h2 = brodVar.d().h();
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dfpm dfpmVar2 = (dfpm) bZ9.b;
                h2.getClass();
                dfpmVar2.b = h2;
                dfpmVar2.a |= 1;
            }
            dnbv e7 = brodVar.e();
            if (e7 != null) {
                dndg bZ10 = dndh.d.bZ();
                dndc dndcVar = e7.b;
                if (dndcVar == null) {
                    dndcVar = dndc.f;
                }
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                dndh dndhVar = (dndh) bZ10.b;
                dndcVar.getClass();
                dndhVar.b = dndcVar;
                dndhVar.a |= 1;
                boolean f = brodVar.f();
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                dndh dndhVar2 = (dndh) bZ10.b;
                dndhVar2.a |= 16;
                dndhVar2.c = f;
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dfpm dfpmVar3 = (dfpm) bZ9.b;
                dndh bK4 = bZ10.bK();
                bK4.getClass();
                dfpmVar3.d = bK4;
                dfpmVar3.a |= 8;
            }
            cjtd bY = brodVar.a.bY();
            String str6 = bY != null ? bY.d : null;
            if (str6 != null) {
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dfpm dfpmVar4 = (dfpm) bZ9.b;
                str6.getClass();
                dfpmVar4.a |= 16;
                dfpmVar4.e = str6;
            }
            dfpm bK5 = bZ9.bK();
            if (bK5.c.isEmpty() && (bK5.a & 1) == 0) {
            }
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dfpo dfpoVar3 = (dfpo) bZ8.b;
            bK5.getClass();
            dfpoVar3.b();
            dfpoVar3.g.add(bK5);
        }
        dfpo bK6 = bZ8.bK();
        akrw h3 = akrw.h(bK6);
        alyk q = alyl.q();
        ((alvg) q).a = bK6;
        this.b.a().O("search-results-injection-layer", this.b.a().N(this.h.getResources(), h3, q.b()));
    }

    public final boolean b() {
        return this.a.d() != 4 || !g();
    }

    public final boolean c() {
        return (this.a.d() == 4 || this.a.d() == 3) && g();
    }

    public final void d() {
        for (aktd aktdVar : this.k) {
            this.f.g(aktdVar);
            this.f.e(aktdVar);
        }
        this.k.clear();
    }

    final akuh f(brod brodVar) {
        if (brodVar.f()) {
            return this.g.a(dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_SUBTITLE_TEXT);
        }
        return this.g.a(dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_SUBTITLE_TEXT);
    }
}
