package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bbpw  reason: default package */
/* loaded from: classes3.dex */
final class bbpw extends bbqp {
    private final bbtj b;

    public bbpw(bbtj bbtjVar, bbvh bbvhVar, dbsg<String> dbsgVar, dbsg<Integer> dbsgVar2, boolean z) {
        super(bbvhVar, dbsgVar, bbtjVar.c(), bbtjVar.a().getAuthority(), dbsgVar2, z);
        this.b = bbtjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbqp
    public final void a(cruz cruzVar, bbqa bbqaVar) {
        String str = cruzVar.b;
        cruf b = cruf.b(cruzVar.c);
        if (b == null) {
            b = cruf.PRECHECK_STATUS_UNKNOWN;
        }
        bbqaVar.f.f(bbqaVar.a(bbti.VIDEO.equals(this.b.b()) ? ddcu.Ka : ddcu.JZ, str, b, !dbsj.d(this.a), dbsg.i(this.b.d())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbqp
    public final void b(cruz cruzVar, bbqe bbqeVar, bbqd bbqdVar) {
        cruf crufVar = cruf.PRECHECK_STATUS_UNKNOWN;
        cruf b = cruf.b(cruzVar.c);
        if (b == null) {
            b = cruf.PRECHECK_STATUS_UNKNOWN;
        }
        if (b.ordinal() != 1) {
            cruf b2 = cruf.b(cruzVar.c);
            if (b2 == null) {
                b2 = cruf.PRECHECK_STATUS_UNKNOWN;
            }
            b2.name();
            bbqdVar.a(b2);
            return;
        }
        bbqeVar.a(cruzVar.b);
    }

    @Override // defpackage.bbqp
    protected final void c(crtl crtlVar, bbvh bbvhVar) {
        for (dwye dwyeVar : this.b.m()) {
            String valueOf = String.valueOf(dwyeVar.name().toLowerCase(Locale.ENGLISH));
            crtlVar.a(valueOf.length() != 0 ? "gmm_modification:".concat(valueOf) : new String("gmm_modification:"));
        }
        if (!this.b.e().isEmpty()) {
            crtlVar.a(this.b.e());
        }
        if (!this.b.g().isEmpty()) {
            String valueOf2 = String.valueOf(this.b.g());
            crtlVar.a(valueOf2.length() != 0 ? "proposal_id:".concat(valueOf2) : new String("proposal_id:"));
        }
        dddn d = this.b.d();
        if (d != dddn.UNKNOWN) {
            String valueOf3 = String.valueOf(d.name());
            crtlVar.a(valueOf3.length() != 0 ? "agmm_source:".concat(valueOf3) : new String("agmm_source:"));
        } else {
            this.b.a();
        }
        String uri = this.b.a().toString();
        if (crtlVar.c) {
            crtlVar.bF();
            crtlVar.c = false;
        }
        crts crtsVar = (crts) crtlVar.b;
        crts crtsVar2 = crts.r;
        uri.getClass();
        crtsVar.a |= 1;
        crtsVar.b = uri;
        bbtm q = this.b.q();
        bbpt bZ = bbpu.h.bZ();
        String n = bbvhVar.a().n();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bbpu bbpuVar = (bbpu) bZ.b;
        n.getClass();
        bbpuVar.a |= 32;
        bbpuVar.g = n;
        Long b = q.b();
        if (b != null) {
            long longValue = b.longValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bbpu bbpuVar2 = (bbpu) bZ.b;
            bbpuVar2.a |= 1;
            bbpuVar2.b = longValue;
        }
        if (q.g().a()) {
            int intValue = q.g().b().intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bbpu bbpuVar3 = (bbpu) bZ.b;
            bbpuVar3.a |= 2;
            bbpuVar3.c = intValue;
        }
        if (q.h().a()) {
            int intValue2 = q.h().b().intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bbpu bbpuVar4 = (bbpu) bZ.b;
            bbpuVar4.a |= 4;
            bbpuVar4.d = intValue2;
        }
        if (q.i().a()) {
            int intValue3 = q.i().b().intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bbpu bbpuVar5 = (bbpu) bZ.b;
            bbpuVar5.a |= 8;
            bbpuVar5.e = intValue3;
        }
        if (q.j().a()) {
            long longValue2 = q.j().b().longValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bbpu bbpuVar6 = (bbpu) bZ.b;
            bbpuVar6.a |= 16;
            bbpuVar6.f = longValue2;
        }
        dspd bR = bZ.bK().bR();
        if (crtlVar.c) {
            crtlVar.bF();
            crtlVar.c = false;
        }
        crts crtsVar3 = (crts) crtlVar.b;
        bR.getClass();
        crtsVar3.a |= 1024;
        crtsVar3.o = bR;
        dspd k = q.k();
        if (k != null) {
            crtj bZ2 = crtk.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            crtk crtkVar = (crtk) bZ2.b;
            k.getClass();
            crtkVar.a |= 1;
            crtkVar.b = k;
            if (crtlVar.c) {
                crtlVar.bF();
                crtlVar.c = false;
            }
            crts crtsVar4 = (crts) crtlVar.b;
            crtk bK = bZ2.bK();
            bK.getClass();
            crtsVar4.c();
            crtsVar4.l.add(bK);
        }
    }
}
