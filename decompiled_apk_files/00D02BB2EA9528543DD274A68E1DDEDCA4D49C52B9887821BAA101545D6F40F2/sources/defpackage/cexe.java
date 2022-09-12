package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cexe  reason: default package */
/* loaded from: classes4.dex */
public class cexe extends cevg<djbl, djce> implements cesz, cewt {
    static final cjtd a = cjtd.a(dtyd.cg);
    public final ceus<cerw> b;
    public final List<cesx> c;
    public final boolean d;
    private final cexb e;
    private final cexd h;
    private final jic i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cexe(defpackage.gga r13, defpackage.cqhn r14, defpackage.bjgj r15, defpackage.bjgl r16, defpackage.cjqq r17, defpackage.cjqy r18, defpackage.ceff r19, defpackage.cexb r20, defpackage.btvo r21, defpackage.cese r22, defpackage.cgrc r23, defpackage.dhtc r24, java.lang.String r25, @defpackage.dzsi java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cexe.<init>(gga, cqhn, bjgj, bjgl, cjqq, cjqy, ceff, cexb, btvo, cese, cgrc, dhtc, java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.cewt
    public void a(cesx cesxVar) {
        this.c.remove(cesxVar);
        cqkx.p(this);
    }

    @Override // defpackage.ceey
    public void c(btzy btzyVar) {
    }

    @Override // defpackage.cesz
    public List<cesx> d() {
        return this.c;
    }

    @Override // defpackage.cesz
    public Boolean e() {
        boolean z = false;
        if (!Ry().booleanValue() && this.c.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cesp
    public void g(cqiv cqivVar) {
        if (!this.b.e().isEmpty()) {
            cqivVar.a(new cehc(), this.b);
        }
        cqivVar.a(new cekb(), this);
    }

    @Override // defpackage.cesp
    public cjtd i() {
        return cjtd.a(dtxl.ft);
    }

    @Override // defpackage.cesz
    public cesy j() {
        if (e().booleanValue()) {
            this.h.e();
        }
        return this.h;
    }

    @Override // defpackage.cevg
    public void k(Bundle bundle) {
        this.f.j(bundle);
        this.b.i(bundle);
        djbm bZ = djce.f.bZ();
        Iterator<cesx> it = this.c.iterator();
        while (it.hasNext()) {
            djcb m = ((cexa) it.next()).m();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djce djceVar = (djce) bZ.b;
            m.getClass();
            dsrj<djcb> dsrjVar = djceVar.c;
            if (!dsrjVar.a()) {
                djceVar.c = dsqw.cl(dsrjVar);
            }
            djceVar.c.add(m);
        }
        bundle.putByteArray("profile_qa_leaf_page_card_proto_list_key", bZ.bK().bS());
    }

    @Override // defpackage.cevg
    public void l(Bundle bundle) {
        this.f.k(bundle);
        this.b.j(bundle);
        djce djceVar = (djce) bvrs.f(bundle, "profile_qa_leaf_page_card_proto_list_key", (dssr) djce.f.cu(7));
        if (djceVar != null) {
            for (djcb djcbVar : djceVar.c) {
                if (!djcbVar.equals(djcb.e)) {
                    this.c.add(this.e.a(this.i, djcbVar, this.d, this));
                }
            }
        }
    }

    @Override // defpackage.ceey
    /* renamed from: m */
    public void b(djce djceVar) {
        if ((djceVar.a & 8) != 0) {
            this.b.h(djceVar.e);
        }
        for (djcb djcbVar : djceVar.c) {
            int i = djcbVar.a;
            if (i == 2 || i == 3 || i == 5) {
                this.c.add(this.e.a(this.i, djcbVar, this.d, this));
            }
        }
        cqkx.p(this);
    }
}
