package defpackage;

import android.view.View;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bxem  reason: default package */
/* loaded from: classes4.dex */
public final class bxem {
    public final btvo a;
    public final cqhn b;
    public final cjqy c;
    public final cqhu d;
    public final bxnq e;
    public final bxnt f;
    public final bxko g;
    public final bxqh h;
    private final cqat i;
    private final akpm j;
    private final bxer k;
    private final cklq l;
    @dzsi
    private final bxeq m;
    private final bxkt n;
    private final bxpr o;
    private final bxpz p;

    public bxem(btvo btvoVar, cqat cqatVar, cqhn cqhnVar, akpm akpmVar, bxer bxerVar, cjqy cjqyVar, cqhu cqhuVar, bxnq bxnqVar, bxnt bxntVar, cklq cklqVar, @dzsi bxeq bxeqVar, bxkt bxktVar, bxko bxkoVar, bxpr bxprVar, bxqh bxqhVar, bxpz bxpzVar) {
        this.a = btvoVar;
        this.i = cqatVar;
        this.b = cqhnVar;
        this.j = akpmVar;
        this.k = bxerVar;
        this.c = cjqyVar;
        this.d = cqhuVar;
        this.e = bxnqVar;
        this.f = bxntVar;
        this.l = cklqVar;
        this.m = bxeqVar;
        this.n = bxktVar;
        this.g = bxkoVar;
        this.o = bxprVar;
        this.h = bxqhVar;
        this.p = bxpzVar;
    }

    @dzsi
    public static cjql f(@dzsi View view) {
        if (view == null) {
            return null;
        }
        return cjqg.e(view);
    }

    public final void a(bxev bxevVar) {
        Serializable serializable;
        brlu brluVar;
        String str;
        bxod bxodVar;
        bxla bxlaVar = bxla.UNKNOWN;
        int ordinal = bxevVar.a.ordinal();
        int i = 0;
        boolean z = ordinal == 1 ? !bxevVar.b.isEmpty() : ordinal == 2 || ordinal == 3 || ordinal == 4;
        if (z) {
            this.l.b();
        }
        if (this.g.b().equals(bxevVar.a)) {
            bxkx bxkxVar = bxevVar.d;
            if (bxkxVar == null || this.g.d().equals(bxevVar.b)) {
                dcdc<bxmh> r = dcdc.r(bxevVar.c);
                drgv drgvVar = bxevVar.f;
                bwrs<brln> bwrsVar = this.g.c;
                if (bwrsVar != null) {
                    try {
                        serializable = bwrs.b(bwrsVar);
                    } catch (ClassCastException unused) {
                        serializable = null;
                    }
                    brln brlnVar = (brln) serializable;
                    if (brlnVar != null && (brluVar = brlnVar.e) != null && (str = brluVar.a) != null && (!str.equals(bxevVar.b) || str.equals(brlnVar.b().c))) {
                        bwrsVar = null;
                    }
                }
                this.g.C(r);
                this.g.D(!r.isEmpty());
                String str2 = bxevVar.b;
                boolean z2 = str2 != null && str2.isEmpty();
                if (bxevVar.e) {
                    bxodVar = bxod.PARTIAL;
                } else {
                    bxodVar = bxod.OFFLINE;
                    int size = r.size();
                    while (true) {
                        if (i < size) {
                            dwjj dwjjVar = r.get(i).b;
                            if (dwjjVar == null) {
                                dwjjVar = dwjj.k;
                            }
                            dxbp dxbpVar = dwjjVar.b;
                            if (dxbpVar == null) {
                                dxbpVar = dxbp.x;
                            }
                            int a = dxbi.a(dxbpVar.f);
                            if (a == 0) {
                                a = 1;
                            }
                            i++;
                            if (a != 3) {
                                bxodVar = bxod.ONLINE;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                this.p.v(null, r, drgvVar, true == this.g.e.booleanValue() ? null : bwrsVar, bxodVar, this.h, z2);
                cqkx.p(this.o);
                if (!z) {
                    return;
                }
                this.l.c(cklt.TYPED_SUGGESTION_LIST);
                return;
            }
            String str3 = bxevVar.b;
            bxkxVar.d(bxevVar.e);
        }
    }

    public final void b(String str, int i) {
        this.g.e(str);
        this.g.e = true;
        c(str, i);
    }

    public final void c(String str, int i) {
        dhjx Z = this.j.Z();
        if (Z == null) {
            return;
        }
        bxkz d = bxkz.d(str, str.codePointCount(0, i), this.i.e());
        bxkx bxkxVar = new bxkx();
        this.n.f(bxkxVar);
        bxkxVar.a(d);
        boolean z = this.g.f && this.a.getUgcParameters().f();
        dovx l = this.g.l();
        boolean z2 = l == null;
        bxer bxerVar = this.k;
        bxla b = this.g.b();
        akqs j = this.g.j();
        boolean t = this.g.t();
        dwjm n = this.g.n();
        bxko bxkoVar = this.g;
        bxerVar.e(b, d, Z, j, l, z, t, bxkxVar, n, bxkoVar.i, bxkoVar.h && bxkoVar.b().a() == 27, z2);
        if (!dbsj.d(((bxky) d).a) || this.g.t()) {
            return;
        }
        bxla b2 = this.g.b();
        dcdc e = dcdc.e();
        dcdc.e();
        a(new bxev(b2, "", e, null, false, null));
    }

    public final void d(bxkq bxkqVar, cjqm cjqmVar) {
        dbsk.b(bxkqVar != bxkq.CLICKED_SUGGESTION, "Suggestion click should be separately handled!");
        dbsk.b(this.g.r(), "SuggestFragment state does not allow submitting of query, only clicking suggestions!");
        bxkv g = this.n.g(new bxkr(bxkqVar, this.g.d(), cjqmVar, this.g.B(), -1), this.c, this.i);
        if (this.m != null) {
            cjsb cjsbVar = new cjsb();
            cjsbVar.i(bxkqVar.f);
            deaf deafVar = bxkqVar.g;
            if (deafVar != null) {
                dnqg dnqgVar = cjsbVar.a;
                if (dnqgVar.c) {
                    dnqgVar.bF();
                    dnqgVar.c = false;
                }
                dnqh dnqhVar = (dnqh) dnqgVar.b;
                dnqh dnqhVar2 = dnqh.p;
                dnqhVar.h = deafVar.Q;
                dnqhVar.a |= 128;
            }
            cjsbVar.f(cjqmVar.a().f());
            if (g != null) {
                cjsbVar.g(g.d());
            }
            this.m.i(this.g.d(), cjsbVar.a());
        }
    }

    public final void e(ddho ddhoVar, deaa deaaVar, @dzsi View view) {
        cjql f = f(view);
        if (f == null) {
            bvoo.d(new IllegalStateException("Impression for interaction not found."));
            cjqy cjqyVar = this.c;
            cjte cjteVar = new cjte(deaf.INPUT_TEXT);
            cjta b = cjtd.b();
            b.d = ddhoVar;
            ddzy bZ = deab.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deab deabVar = (deab) bZ.b;
            deabVar.b = deaaVar.d;
            deabVar.a |= 1;
            b.a = bZ.bK();
            cjqyVar.m(cjteVar, b.a());
            return;
        }
        cjqy cjqyVar2 = this.c;
        cjte cjteVar2 = new cjte(deaf.INPUT_TEXT);
        cjta b2 = cjtd.b();
        b2.d = ddhoVar;
        ddzy bZ2 = deab.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        deab deabVar2 = (deab) bZ2.b;
        deabVar2.b = deaaVar.d;
        deabVar2.a |= 1;
        b2.a = bZ2.bK();
        cjqyVar2.n(f, cjteVar2, b2.a());
    }
}
