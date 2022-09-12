package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxpz  reason: default package */
/* loaded from: classes4.dex */
public class bxpz implements bxoe {
    private final dzsj<axwq> A;
    private final bzgf B;
    private final bzgj C;
    private axwt D;
    private final btpc E;
    public final gga a;
    private final bxor b;
    private final bxpd c;
    @dzsi
    private final bxeq d;
    private final bxkt e;
    private final bxko f;
    @dzsi
    private final bxnw g;
    private final bxqn h;
    private final bxpn i;
    private final dxio<bxpi> j;
    private final dxio<bxpa> k;
    private final btvo l;
    private final bxot m;
    private bxod p;
    private boolean q;
    @dzsi
    private jbi s;
    @dzsi
    private bxqm t;
    @dzsi
    private bxpm u;
    @dzsi
    private bxpj v;
    @dzsi
    private final bxqj w;
    @dzsi
    private final bxpy x;
    @dzsi
    private final bxql y;
    private final dzsj<axws> z;
    private dcdc<bxoi> n = dcdc.e();
    @dzsi
    private drgv o = null;
    private final btnc<Long, bxmh> r = new btnc<>(30);

    public bxpz(gga ggaVar, bxkt bxktVar, @dzsi bxeq bxeqVar, @dzsi bxnw bxnwVar, @dzsi bxpy bxpyVar, @dzsi bxql bxqlVar, bxko bxkoVar, btpc btpcVar, bxos bxosVar, dxio<bxpi> dxioVar, dxio<bxpa> dxioVar2, bxqn bxqnVar, bxpn bxpnVar, btvo btvoVar, cqhn cqhnVar, dzsj<axws> dzsjVar, dzsj<axwq> dzsjVar2, Executor executor, bxot bxotVar, bxqk bxqkVar) {
        bzgf bzgfVar = new bzgf(this) { // from class: bxpt
            private final bxpz a;

            {
                this.a = this;
            }

            @Override // defpackage.bzgf
            public final void a() {
                bxpz bxpzVar = this.a;
                if (bxpzVar.p()) {
                    cqkx.p(bxpzVar);
                }
            }
        };
        this.B = bzgfVar;
        bzgj bzgjVar = new bzgj();
        this.C = bzgjVar;
        this.D = axwt.a;
        this.a = ggaVar;
        this.e = bxktVar;
        this.d = bxeqVar;
        this.f = bxkoVar;
        this.g = bxnwVar;
        this.x = bxpyVar;
        this.y = bxqlVar;
        this.h = bxqnVar;
        this.p = bxod.ONLINE;
        this.i = bxpnVar;
        bxoq a = bxosVar.a.a();
        bxos.a(a, 1);
        bxpp a2 = bxosVar.b.a();
        bxos.a(a2, 2);
        this.b = new bxor(a, a2);
        this.j = dxioVar;
        this.k = dxioVar2;
        this.q = false;
        this.l = btvoVar;
        this.z = dzsjVar;
        this.A = dzsjVar2;
        this.E = btpcVar;
        this.m = bxotVar;
        bxpv bxpvVar = new bxpv(ggaVar, btpcVar, ggaVar, bxeqVar, bxkoVar);
        this.c = bxpvVar;
        if (bxpvVar != null) {
            this.w = new bxqj(bxpvVar);
            if (!bxkoVar.J()) {
                return;
            }
            bzgg.b(bzgfVar, dzsjVar.a(), bzgjVar, executor);
            p();
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    private static boolean E(bxmh bxmhVar) {
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        int a = dxbk.a(dxbpVar.g);
        return a != 0 && a == 11;
    }

    public bxof A() {
        return this.k.a();
    }

    @dzsi
    public bxoi B() {
        if (this.m.G()) {
            return this.m;
        }
        return null;
    }

    public Boolean C() {
        dcdc<bxoi> dcdcVar;
        boolean z = true;
        if (!this.f.K() || this.p == bxod.PARTIAL || this.f.d().trim().isEmpty() || ((dcdcVar = this.n) != null && !dcdcVar.isEmpty())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @dzsi
    public jbi D() {
        return this.s;
    }

    @Override // defpackage.bxoe
    public List<bxoi> a() {
        return this.n;
    }

    @Override // defpackage.bxoe
    public cqiw<bxoi> b() {
        return (cqiw) this.f.k.a();
    }

    @Override // defpackage.bxoe
    public bxnx c() {
        return this.b;
    }

    @Override // defpackage.bxoe
    public bxod d() {
        return this.p;
    }

    @Override // defpackage.bxoe
    public cqkp e() {
        return new bxpw();
    }

    @Override // defpackage.bxoe
    @dzsi
    public bxoi f() {
        return this.t;
    }

    @Override // defpackage.bxoe
    public Boolean g() {
        boolean z = false;
        if (!this.f.H()) {
            return false;
        }
        bxnz h = h();
        if (h != null && !h.a().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxoe
    @dzsi
    public bxnz h() {
        if (this.u == null && this.f.H()) {
            bxpn bxpnVar = this.i;
            akqq akqqVar = this.f.a;
            bxeq bxeqVar = this.d;
            bxpn.a(this, 1);
            cqhn a = bxpnVar.a.a();
            bxpn.a(a, 4);
            anhp a2 = bxpnVar.b.a();
            bxpn.a(a2, 5);
            fd fdVar = (fd) ((dxjd) bxpnVar.c).a;
            bxpn.a(fdVar, 6);
            this.u = new bxpm(this, akqqVar, bxeqVar, a, a2, fdVar);
        }
        return this.u;
    }

    @Override // defpackage.bxoe
    public bxny i() {
        return this.j.a();
    }

    @Override // defpackage.bxoe
    @dzsi
    public bxnw j() {
        return this.g;
    }

    @Override // defpackage.bxoe
    public Boolean k() {
        return Boolean.valueOf(f() != null);
    }

    @Override // defpackage.bxoe
    @dzsi
    public jbf l() {
        return null;
    }

    @Override // defpackage.bxoe
    public Boolean m() {
        boolean z = false;
        if (this.k.a().i().booleanValue() && this.q) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxoe
    public Boolean n() {
        bxnw bxnwVar = this.g;
        boolean z = false;
        if (bxnwVar != null && bxnwVar.G().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxoe
    @dzsi
    public bxoi o() {
        if (!C().booleanValue()) {
            return null;
        }
        return this.v;
    }

    public final boolean p() {
        axwt b = this.z.a().b();
        if (!b.equals(this.D)) {
            this.D = b;
            this.s = new iyb(this.D.a());
            return true;
        }
        return false;
    }

    @Override // defpackage.bxoe
    public bxoi q() {
        return this.c;
    }

    @Override // defpackage.bxoe
    public dksg r() {
        dksg b;
        dksh offlineMapsParameters = this.l.getOfflineMapsParameters();
        if (offlineMapsParameters == null) {
            b = null;
        } else {
            b = dksg.b(offlineMapsParameters.u);
            if (b == null) {
                b = dksg.UNKNOWN_SUGGEST_SPINNER_VARIANT;
            }
        }
        return b != null ? b : dksg.UNKNOWN_SUGGEST_SPINNER_VARIANT;
    }

    @Override // defpackage.bxoe
    public bxoc s() {
        return new bxpx(this);
    }

    @Override // defpackage.bxoe
    public Boolean t() {
        return Boolean.valueOf(this.D.b());
    }

    @Override // defpackage.bxoe
    public CharSequence u() {
        CharSequence m;
        jbi jbiVar = this.s;
        return (jbiVar == null || (m = jbiVar.m()) == null) ? "" : m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0188, code lost:
        if (defpackage.dcbg.b(r5).p(new defpackage.bxpu(r4)) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(@defpackage.dzsi java.lang.String r36, java.util.List<defpackage.bxmh> r37, @defpackage.dzsi defpackage.drgv r38, @defpackage.dzsi defpackage.bwrs<defpackage.brln> r39, defpackage.bxod r40, defpackage.ivk r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxpz.v(java.lang.String, java.util.List, drgv, bwrs, bxod, ivk, boolean):void");
    }

    public Boolean w() {
        dcdc<bxoi> dcdcVar = this.n;
        boolean z = false;
        if (dcdcVar != null && !dcdcVar.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @dzsi
    public drgv x() {
        return this.o;
    }

    @dzsi
    public bxog y() {
        return this.w;
    }

    public Boolean z() {
        return this.b.a();
    }
}
