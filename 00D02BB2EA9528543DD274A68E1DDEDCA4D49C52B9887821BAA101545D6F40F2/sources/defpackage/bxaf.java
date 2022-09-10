package defpackage;

import java.util.Comparator;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxaf  reason: default package */
/* loaded from: classes4.dex */
public final class bxaf {
    public static final dwfr a;
    public static final Comparator<dhpf> h;
    public final btvo b;
    public final buti c;
    public final cqat d;
    public final Executor e;
    @dzsi
    public ilo f = null;
    @dzsi
    public dehn<bwzw> g = null;
    private final cjqy i;

    static {
        dwfp bZ = dwfr.h.bZ();
        bZ.a(drbz.DESCRIPTION);
        bZ.a(drbz.RENDER_INFO);
        bZ.a(drbz.ATTRIBUTION);
        a = bZ.bK();
        h = bwzz.a;
    }

    public bxaf(btvo btvoVar, buti butiVar, cqat cqatVar, Executor executor, cjqy cjqyVar) {
        this.b = btvoVar;
        this.c = butiVar;
        this.d = cqatVar;
        this.e = executor;
        this.i = cjqyVar;
    }

    public static dhpf b(dwfl dwflVar) {
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        diis diisVar = dizhVar.g;
        if (diisVar == null) {
            diisVar = diis.h;
        }
        dhpf dhpfVar = diisVar.f;
        return dhpfVar == null ? dhpf.i : dhpfVar;
    }

    public final void a() {
        this.g = null;
        this.f = null;
    }

    public final void c(int i, @dzsi drtc drtcVar, @dzsi dggg dgggVar) {
        ddgk bZ = ddgm.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddgm ddgmVar = (ddgm) bZ.b;
        ddgmVar.b = i - 1;
        int i2 = ddgmVar.a | 1;
        ddgmVar.a = i2;
        if (drtcVar != null) {
            ddgmVar.c = drtcVar.s;
            ddgmVar.a = i2 | 2;
        }
        cjsx i3 = cjsy.i();
        i3.b(ddda.fv);
        cjrt cjrtVar = (cjrt) i3;
        cjrtVar.c = bZ.bK();
        if (dgggVar != null) {
            ddcx bZ2 = ddcy.d.bZ();
            bxae bxaeVar = bxae.a;
            dgge b = dgge.b(dgggVar.b);
            if (b == null) {
                b = dgge.IMAGE_UNKNOWN;
            }
            dfwn NV = bxaeVar.NV(b);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddcy ddcyVar = (ddcy) bZ2.b;
            ddcyVar.b = NV.l;
            int i4 = ddcyVar.a | 1;
            ddcyVar.a = i4;
            String str = dgggVar.c;
            str.getClass();
            ddcyVar.a = i4 | 2;
            ddcyVar.c = str;
            cjrtVar.d = bZ2.bK();
        }
        this.i.k(i3.a());
    }
}
