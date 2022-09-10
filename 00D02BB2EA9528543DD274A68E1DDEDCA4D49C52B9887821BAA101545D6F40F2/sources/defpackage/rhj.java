package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: rhj  reason: default package */
/* loaded from: classes7.dex */
public final class rhj {
    public final rin a;
    public final rif b;
    public final Map<ril, rim> c;
    private final rhz d;
    private final dnls e;
    private final List<rhy> f;
    private final rhr g;

    public rhj(final rhz rhzVar, rin rinVar, rhr rhrVar, dnls dnlsVar) {
        this.a = rinVar;
        this.d = rhzVar;
        this.g = rhrVar;
        dnkt dnktVar = dnlsVar.d;
        dnktVar = dnktVar == null ? dnkt.c : dnktVar;
        if (dnktVar != null) {
            this.b = new rif(dnktVar);
            dcbg b = dcbg.b(dnlsVar.e);
            rhzVar.getClass();
            this.f = new ArrayList(b.s(new dbrn(rhzVar) { // from class: rhd
                private final rhz a;

                {
                    this.a = rhzVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return this.a.a((dnkn) obj);
                }
            }).z());
            dcbg b2 = dcbg.b(dnlsVar.f);
            rinVar.getClass();
            this.c = new LinkedHashMap(dcjz.s(((dced) b2.s(new dbrn() { // from class: rhe
                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return rin.a((dnlm) obj);
                }
            }).C(rhf.a)).b, rhg.a));
            dnln ca = dnls.g.ca(dnlsVar);
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dnls dnlsVar2 = (dnls) ca.b;
            dnlsVar2.d = null;
            dnlsVar2.a &= -5;
            dnlsVar2.e = dnls.ck();
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            ((dnls) ca.b).f = dnls.ck();
            this.e = ca.bK();
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final dnls a() {
        dnln ca = dnls.g.ca(this.e);
        rif rifVar = this.b;
        dnko ca2 = dnkt.c.ca(rifVar.a);
        if (rifVar.b.a()) {
            rie b = rifVar.b.b();
            dnkp ca3 = dnks.b.ca(b.a);
            Iterable o = dcft.o(b.b, rib.a);
            if (ca3.c) {
                ca3.bF();
                ca3.c = false;
            }
            dnks dnksVar = (dnks) ca3.b;
            dsrj<dnkr> dsrjVar = dnksVar.a;
            if (!dsrjVar.a()) {
                dnksVar.a = dsqw.cl(dsrjVar);
            }
            dsod.bv(o, dnksVar.a);
            dnks bK = ca3.bK();
            if (ca2.c) {
                ca2.bF();
                ca2.c = false;
            }
            dnkt dnktVar = (dnkt) ca2.b;
            bK.getClass();
            dnktVar.b = bK;
            dnktVar.a |= 1;
        }
        dnkt bK2 = ca2.bK();
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dnls dnlsVar = (dnls) ca.b;
        bK2.getClass();
        dnlsVar.d = bK2;
        dnlsVar.a |= 4;
        dcbg s = dcbg.b(this.f).s(rhh.a);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dnls dnlsVar2 = (dnls) ca.b;
        dnlsVar2.b();
        dsod.bv(s, dnlsVar2.e);
        dcbg s2 = dcbg.b(this.c.values()).s(rhi.a);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dnls dnlsVar3 = (dnls) ca.b;
        dnlsVar3.c();
        dsod.bv(s2, dnlsVar3.f);
        return ca.bK();
    }

    public final String b() {
        return this.e.c;
    }

    public final List<rhy> c() {
        return Collections.unmodifiableList(this.f);
    }

    public final rhy d() {
        String a = this.g.a();
        rhz rhzVar = this.d;
        dnkj bZ = dnkn.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnkn dnknVar = (dnkn) bZ.b;
        a.getClass();
        dnknVar.a |= 1;
        dnknVar.d = a;
        rhy a2 = rhzVar.a(bZ.bK());
        this.f.add(a2);
        return a2;
    }
}
