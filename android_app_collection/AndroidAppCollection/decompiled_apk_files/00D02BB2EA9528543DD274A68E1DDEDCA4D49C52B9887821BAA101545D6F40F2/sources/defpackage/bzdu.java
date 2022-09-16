package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bzdu  reason: default package */
/* loaded from: classes4.dex */
public final class bzdu extends bzek {
    private final bzgj d;
    private final bzfm e;
    private final bzej f;
    private final bzdn g;
    private final byzk h;
    private final bzfw i;
    private final bzfj j;
    private final List<ddsb> k;
    private final dgsn l;
    private final String m;
    private final btvo n;
    private int o;
    private int p;
    private double q;
    private int r;
    private int s;
    @dzsi
    private amva t;
    private float u;
    @dzsi
    private dotv v;
    private double w;
    private double x;

    public bzdu(bzfw bzfwVar, bzfm bzfmVar, bzej bzejVar, bzdn bzdnVar, byzk byzkVar, bzfj bzfjVar, cqat cqatVar, btvo btvoVar, dbsz<bzek> dbszVar, bzdg bzdgVar) {
        super(dbszVar, bzdgVar, cqatVar);
        this.d = new bzgj();
        this.k = new ArrayList();
        boolean z = true;
        dbsk.l(this.b.c() == dqvj.TRANSIT);
        dbsk.l(this.b.c != 2 ? false : z);
        this.e = bzfmVar;
        this.f = bzejVar;
        this.g = bzdnVar;
        this.h = byzkVar;
        this.o = bzdgVar.u();
        this.p = bzdgVar.w();
        this.i = bzfwVar;
        this.j = bzfjVar;
        this.l = dgsn.b(bzdgVar.d().h);
        this.m = bzdgVar.d().m;
        this.n = btvoVar;
        this.u = 0.0f;
        this.v = bzdgVar.n() ? bzdgVar.p(0) : null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final int a(amuo amuoVar) {
        int G = this.b.G(amuoVar);
        return G == 0 ? this.b.I(amuoVar) ? 0 : 1 : G;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final /* bridge */ /* synthetic */ bzdh b() {
        bzdg bzdgVar;
        float f;
        float f2;
        float f3;
        bzdg bzdgVar2 = this.b;
        String g = bzdgVar2.g();
        eaow f4 = f();
        boolean F = this.b.F();
        int i = this.o;
        amva amvaVar = this.t;
        boolean z = amvaVar == null ? false : amvaVar.b;
        int i2 = this.p;
        double d = this.q;
        float l = this.u + (l() - this.o);
        float l2 = (l() - this.o) + this.u;
        if (this.b.n()) {
            l2 -= k();
        }
        float f5 = l2;
        int w = this.b.w();
        int i3 = this.p;
        if (i3 > w) {
            i3 = w;
        }
        float f6 = w > 0 ? 1.0f - (i3 / w) : 1.0f;
        if (this.b.n()) {
            double d2 = this.x;
            bzdgVar = bzdgVar2;
            double d3 = this.w;
            double d4 = d2 - d3;
            f = f5;
            f2 = f6;
            double d5 = this.q - d3;
            if (d5 > dcyn.a && d4 > dcyn.a) {
                f3 = (float) (d5 / d4);
                return new bzcr(bzdgVar, g, f4, F, i, z, i2, d, l, f, f2, f3, k());
            }
        } else {
            bzdgVar = bzdgVar2;
            f = f5;
            f2 = f6;
        }
        f3 = 0.0f;
        return new bzcr(bzdgVar, g, f4, F, i, z, i2, d, l, f, f2, f3, k());
    }

    @Override // defpackage.bzek
    public final void c() {
        this.d.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final bzek d() {
        bzdg B = this.b.B();
        if (B.D()) {
            return this.g.a(this.a, B);
        }
        if (B.c() == dqvj.TRANSIT) {
            return this.e.a(this.a, B);
        }
        if (B.c() == dqvj.WALK) {
            return this.f.a(this.a, B);
        }
        return p("Can not handle next stage travel mode");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020f A[Catch: Exception -> 0x0255, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x0004, B:5:0x0019, B:7:0x0021, B:36:0x00b1, B:40:0x00b8, B:42:0x00c8, B:44:0x00d0, B:46:0x00d6, B:49:0x00e2, B:56:0x00f8, B:69:0x0115, B:71:0x0121, B:72:0x0126, B:74:0x0149, B:75:0x014e, B:77:0x0166, B:78:0x016b, B:79:0x0182, B:81:0x0195, B:83:0x019b, B:84:0x01a0, B:86:0x01a8, B:89:0x01b1, B:91:0x01c5, B:92:0x01c8, B:50:0x00e9, B:52:0x00ed, B:47:0x00da, B:93:0x01cb, B:95:0x01dc, B:96:0x01f9, B:98:0x01ff, B:103:0x0207, B:105:0x020f, B:107:0x0215, B:110:0x022b, B:11:0x0040, B:15:0x0051, B:18:0x005a, B:19:0x0061, B:21:0x0067, B:23:0x0078, B:28:0x0090, B:32:0x009f, B:35:0x00ab, B:113:0x0231, B:114:0x0237, B:116:0x023f, B:117:0x0244, B:119:0x024a, B:120:0x024f), top: B:126:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022b A[Catch: Exception -> 0x0255, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x0004, B:5:0x0019, B:7:0x0021, B:36:0x00b1, B:40:0x00b8, B:42:0x00c8, B:44:0x00d0, B:46:0x00d6, B:49:0x00e2, B:56:0x00f8, B:69:0x0115, B:71:0x0121, B:72:0x0126, B:74:0x0149, B:75:0x014e, B:77:0x0166, B:78:0x016b, B:79:0x0182, B:81:0x0195, B:83:0x019b, B:84:0x01a0, B:86:0x01a8, B:89:0x01b1, B:91:0x01c5, B:92:0x01c8, B:50:0x00e9, B:52:0x00ed, B:47:0x00da, B:93:0x01cb, B:95:0x01dc, B:96:0x01f9, B:98:0x01ff, B:103:0x0207, B:105:0x020f, B:107:0x0215, B:110:0x022b, B:11:0x0040, B:15:0x0051, B:18:0x005a, B:19:0x0061, B:21:0x0067, B:23:0x0078, B:28:0x0090, B:32:0x009f, B:35:0x00ab, B:113:0x0231, B:114:0x0237, B:116:0x023f, B:117:0x0244, B:119:0x024a, B:120:0x024f), top: B:126:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0230 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01dc A[Catch: Exception -> 0x0255, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x0004, B:5:0x0019, B:7:0x0021, B:36:0x00b1, B:40:0x00b8, B:42:0x00c8, B:44:0x00d0, B:46:0x00d6, B:49:0x00e2, B:56:0x00f8, B:69:0x0115, B:71:0x0121, B:72:0x0126, B:74:0x0149, B:75:0x014e, B:77:0x0166, B:78:0x016b, B:79:0x0182, B:81:0x0195, B:83:0x019b, B:84:0x01a0, B:86:0x01a8, B:89:0x01b1, B:91:0x01c5, B:92:0x01c8, B:50:0x00e9, B:52:0x00ed, B:47:0x00da, B:93:0x01cb, B:95:0x01dc, B:96:0x01f9, B:98:0x01ff, B:103:0x0207, B:105:0x020f, B:107:0x0215, B:110:0x022b, B:11:0x0040, B:15:0x0051, B:18:0x005a, B:19:0x0061, B:21:0x0067, B:23:0x0078, B:28:0x0090, B:32:0x009f, B:35:0x00ab, B:113:0x0231, B:114:0x0237, B:116:0x023f, B:117:0x0244, B:119:0x024a, B:120:0x024f), top: B:126:0x0004 }] */
    @Override // defpackage.bzek
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.cray r22) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzdu.e(cray):boolean");
    }

    @Override // defpackage.bzek
    public final eaow f() {
        int i = this.p;
        int w = this.b.w();
        double d = this.b.y().b;
        double d2 = i;
        double d3 = w;
        Double.isNaN(d2);
        Double.isNaN(d3);
        Double.isNaN(d);
        return eaow.e((long) (d * (d2 / d3)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final void g() {
        dbsk.l(this.d.c());
        this.i.b(new bzfq(this) { // from class: bzdt
            private final bzdu a;

            {
                this.a = this;
            }

            @Override // defpackage.bzfq
            public final void a(Object obj) {
                this.a.e((cray) obj);
            }
        }, this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final boolean i() {
        return false;
    }

    @Override // defpackage.bzek
    protected final void j(int i) {
        ddsd bZ = ddsg.q.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddsg ddsgVar = (ddsg) bZ.b;
        ddsgVar.c = i - 1;
        ddsgVar.a |= 2;
        ddsg ddsgVar2 = (ddsg) bZ.b;
        ddsgVar2.b = 1;
        int i2 = 1 | ddsgVar2.a;
        ddsgVar2.a = i2;
        int i3 = this.r;
        int i4 = i2 | 128;
        ddsgVar2.a = i4;
        ddsgVar2.h = i3;
        int i5 = this.s;
        ddsgVar2.a = i4 | 256;
        ddsgVar2.i = i5;
        boolean F = this.b.F();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddsg ddsgVar3 = (ddsg) bZ.b;
        ddsgVar3.a |= 512;
        ddsgVar3.j = F;
        int w = this.b.w();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddsg ddsgVar4 = (ddsg) bZ.b;
        int i6 = ddsgVar4.a | 1024;
        ddsgVar4.a = i6;
        ddsgVar4.k = w;
        int i7 = this.p;
        int i8 = i6 | 2048;
        ddsgVar4.a = i8;
        ddsgVar4.l = i7;
        ddsgVar4.m = this.l.v;
        ddsgVar4.a = i8 | 4096;
        List<ddsb> list = this.k;
        ddsg ddsgVar5 = (ddsg) bZ.b;
        dsrj<ddsb> dsrjVar = ddsgVar5.p;
        if (!dsrjVar.a()) {
            ddsgVar5.p = dsqw.cl(dsrjVar);
        }
        dsod.bv(list, ddsgVar5.p);
        String str = this.m;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddsg ddsgVar6 = (ddsg) bZ.b;
        str.getClass();
        ddsgVar6.a |= 8192;
        ddsgVar6.n = str;
        n(bZ);
        for (doyp doypVar : this.b.t().c()) {
            if ((doypVar.a & 4096) != 0) {
                String str2 = doypVar.j;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddsg ddsgVar7 = (ddsg) bZ.b;
                str2.getClass();
                dsrj<String> dsrjVar2 = ddsgVar7.o;
                if (!dsrjVar2.a()) {
                    ddsgVar7.o = dsqw.cl(dsrjVar2);
                }
                ddsgVar7.o.add(str2);
            }
        }
        this.h.a(bZ.bK());
    }

    final int k() {
        dotv dotvVar;
        if (!this.b.n() || (dotvVar = this.v) == null) {
            return -1;
        }
        return dotvVar.c;
    }

    final int l() {
        return this.b.u();
    }
}
