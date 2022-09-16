package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhlj  reason: default package */
/* loaded from: classes3.dex */
public class bhlj implements jad {
    final /* synthetic */ bhlk a;

    public bhlj(bhlk bhlkVar) {
        this.a = bhlkVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        boolean z = false;
        if (e() != null && !e().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jad
    /* renamed from: b */
    public String e() {
        ilo c = this.a.c();
        return c != null ? c.au() : "";
    }

    @Override // defpackage.jad
    public cqkl c() {
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        dpvf dpvfVar;
        ilo c = this.a.c();
        dpvg at = c != null ? c.at() : null;
        if (!bhlk.d(c)) {
            return cjtd.b;
        }
        if (at != null) {
            dpvfVar = dpvf.b(at.b);
            if (dpvfVar == null) {
                dpvfVar = dpvf.UNKNOWN_CATEGORY;
            }
        } else {
            dpvfVar = dpvf.UNKNOWN_CATEGORY;
        }
        cjta b = cjtd.b();
        b.d = dtxw.dp;
        ddes bZ = ddet.D.bZ();
        ddfc bZ2 = ddfd.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddfd ddfdVar = (ddfd) bZ2.b;
        ddfdVar.b = dpvfVar.an;
        ddfdVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddfd bK = bZ2.bK();
        bK.getClass();
        ddetVar.q = bK;
        ddetVar.a |= 32768;
        b.s(bZ.bK());
        return b.a();
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        ilo c = this.a.c();
        dpvg at = c != null ? c.at() : null;
        iqy iqyVar = new iqy();
        iqyVar.d = iqx.TRAVERSAL;
        if (at != null) {
            this.a.e.a(ckls.NEARBY_PLACES_BUTTON_CLICKED);
            brba a = this.a.d.a();
            dnqg bZ = dnqh.p.bZ();
            int i = ddda.aA.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            dnqhVar.a |= 64;
            dnqhVar.g = i;
            String b = cjqmVar.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            b.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = b;
            dnqh bK = bZ.bK();
            dnng dnngVar = c.h().X;
            if (dnngVar == null) {
                dnngVar = dnng.r;
            }
            dnnn dnnnVar = dnngVar.b;
            if (dnnnVar == null) {
                dnnnVar = dnnn.l;
            }
            dpvf b2 = dpvf.b(at.b);
            if (b2 == null) {
                b2 = dpvf.UNKNOWN_CATEGORY;
            }
            a.Q(at, bK, null, iqyVar, (b2 != dpvf.HOTELS || !aehr.c(dnnnVar)) ? null : dnnnVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.jad
    public Boolean h() {
        boolean z = false;
        if (e() != null && !e().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }
}
