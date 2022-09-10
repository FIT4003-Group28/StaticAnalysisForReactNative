package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atbq  reason: default package */
/* loaded from: classes.dex */
public final class atbq extends gew implements atcu, atct, atcx, aueo, egq {
    public static final /* synthetic */ int bp = 0;
    static final long d = TimeUnit.SECONDS.toMillis(6);
    static final long e = TimeUnit.SECONDS.toMillis(5);
    public bvrb aA;
    public byym aB;
    public dxio<bzmm> aC;
    public efg aO;
    public asik aP;
    public cqkj aQ;
    public atmi aR;
    public dzsj<ckrp> aS;
    public atcp aT;
    public atbs aU;
    public dxio<auen> aV;
    public ckrh aW;
    public auax aX;
    public dxio<dbsg<arkd>> aY;
    public arnd aZ;
    public atae ad;
    public ckcw ae;
    public btvo af;
    public dzsj<qbt> ag;
    public btrm ah;
    public gfq ai;
    public gek aj;
    public bvjj ak;
    public dxio<acwo> al;
    public dxio<bsvm> am;
    public dxio<ahwf> an;
    public dxio<glj> ao;
    public asml ap;
    public crfm aq;
    public akox ar;
    public ascb as;
    public atbt at;
    public atop au;
    public asmi av;
    public cjxo aw;
    public atdd ax;
    public cjmt ay;
    public bwqv az;
    public dzsj<atan> ba;
    public dzsj<asla> bb;
    public atan bc;
    @dzsi
    public cqkf<atng> bd;
    @dzsi
    public cqkf<asuq> be;
    @dzsi
    public cqkf<asuq> bf;
    @dzsi
    public cqkf<atna> bg;
    @dzsi
    public cqkf<cqkp> bh;
    @dzsi
    public atls bi;
    public boolean bj;
    public boolean bk;
    @dzsi
    public dqvj bl;
    @dzsi
    private Bundle bq;
    public eeu f;
    public asac g;
    final atbo c = new atbo(this);
    private boolean br = false;
    private final aljk bs = new aljk();
    final dbty<Integer> bm = new atbi(this);
    private final gj bt = new atbj(this);
    public final atdc bn = new atbk(this);
    final BroadcastReceiver bo = new atbl(this);

    public static Bundle aJ(atls atlsVar) {
        Bundle bundle = new Bundle();
        bvrs.k(bundle, "constructionParams", atlsVar);
        return bundle;
    }

    private final boolean bA() {
        if (bo() != null) {
            amub amubVar = bo().a;
            return true;
        }
        return false;
    }

    public static boolean bp(atlq atlqVar, atlq atlqVar2) {
        return (atlqVar == null || !atlqVar.b() || atlqVar2 == null || !atlqVar2.b() || atlqVar.k == atlqVar2.k) ? false : true;
    }

    public static boolean bq(atlq atlqVar, atlq atlqVar2) {
        return (atlqVar == null || !atlqVar.b() || atlqVar2 == null || !atlqVar2.b() || atlqVar.n == atlqVar2.n) ? false : true;
    }

    public static boolean br(Context context) {
        return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
    }

    private final void bv() {
        final gga ggaVar = this.aE;
        final amte amteVar = bn().r;
        final qbt a = this.ag.a();
        final boolean z = bn().q != null;
        if (!z) {
            this.aU.h(ggaVar);
        }
        aV(new Runnable(this, ggaVar, amteVar, z, a) { // from class: atap
            private final atbq a;
            private final gga b;
            private final amte c;
            private final boolean d;
            private final qbt e;

            {
                this.a = this;
                this.b = ggaVar;
                this.c = amteVar;
                this.d = z;
                this.e = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                atbq atbqVar = this.a;
                gga ggaVar2 = this.b;
                amte amteVar2 = this.c;
                boolean z2 = this.d;
                qbt qbtVar = this.e;
                ggaVar2.w();
                boolean z3 = false;
                if (amteVar2 != null && amteVar2.h() && z2) {
                    amteVar2 = yyt.a(amteVar2);
                    z3 = true;
                }
                qcs v = qct.v(amteVar2);
                v.f();
                v.e(z3);
                qcr qcrVar = v.a;
                qcrVar.i(z3);
                v.a = qcrVar;
                qcr qcrVar2 = v.a;
                qcrVar2.c(true);
                v.a = qcrVar2;
                if (cfnr.f(atbqVar.af) || awpl.a(atbqVar.af)) {
                    crmw crmwVar = atbqVar.bn().w;
                    if (cfnr.g(atbqVar.bl) && crmwVar != null) {
                        ((qao) v.a).h = crmwVar;
                    }
                }
                qbtVar.n(v.a(qbtVar.e()));
                if (z2) {
                    atbqVar.aS(ggaVar2);
                }
            }
        });
    }

    private final void bw() {
        this.aU.h(J());
        this.au.d();
        aV(new Runnable(this) { // from class: atas
            private final atbq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gfq.m(this.a);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0276 A[Catch: all -> 0x02ca, TryCatch #0 {, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x000d, B:9:0x0014, B:16:0x003f, B:17:0x0043, B:18:0x0046, B:20:0x0074, B:22:0x0078, B:24:0x0096, B:27:0x00a5, B:29:0x00a9, B:30:0x00bb, B:31:0x00d8, B:33:0x0104, B:35:0x0109, B:37:0x0113, B:111:0x02bb, B:38:0x0124, B:40:0x0131, B:41:0x013b, B:34:0x0107, B:42:0x0140, B:44:0x0144, B:45:0x014a, B:47:0x014e, B:48:0x0154, B:50:0x0164, B:52:0x016c, B:70:0x01bb, B:72:0x01eb, B:74:0x01f1, B:76:0x0200, B:81:0x020a, B:83:0x0220, B:85:0x0228, B:86:0x022f, B:88:0x0239, B:90:0x023e, B:94:0x024e, B:96:0x0257, B:98:0x025b, B:100:0x0276, B:101:0x027a, B:103:0x02a0, B:104:0x02a2, B:106:0x02ab, B:108:0x02b3, B:110:0x02b8, B:109:0x02b6, B:89:0x023c, B:54:0x0174, B:56:0x0184, B:58:0x018c, B:59:0x018e, B:60:0x0194, B:62:0x019a, B:69:0x01ad, B:12:0x0033), top: B:117:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a0 A[Catch: all -> 0x02ca, TryCatch #0 {, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x000d, B:9:0x0014, B:16:0x003f, B:17:0x0043, B:18:0x0046, B:20:0x0074, B:22:0x0078, B:24:0x0096, B:27:0x00a5, B:29:0x00a9, B:30:0x00bb, B:31:0x00d8, B:33:0x0104, B:35:0x0109, B:37:0x0113, B:111:0x02bb, B:38:0x0124, B:40:0x0131, B:41:0x013b, B:34:0x0107, B:42:0x0140, B:44:0x0144, B:45:0x014a, B:47:0x014e, B:48:0x0154, B:50:0x0164, B:52:0x016c, B:70:0x01bb, B:72:0x01eb, B:74:0x01f1, B:76:0x0200, B:81:0x020a, B:83:0x0220, B:85:0x0228, B:86:0x022f, B:88:0x0239, B:90:0x023e, B:94:0x024e, B:96:0x0257, B:98:0x025b, B:100:0x0276, B:101:0x027a, B:103:0x02a0, B:104:0x02a2, B:106:0x02ab, B:108:0x02b3, B:110:0x02b8, B:109:0x02b6, B:89:0x023c, B:54:0x0174, B:56:0x0184, B:58:0x018c, B:59:0x018e, B:60:0x0194, B:62:0x019a, B:69:0x01ad, B:12:0x0033), top: B:117:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ab A[Catch: all -> 0x02ca, TryCatch #0 {, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x000d, B:9:0x0014, B:16:0x003f, B:17:0x0043, B:18:0x0046, B:20:0x0074, B:22:0x0078, B:24:0x0096, B:27:0x00a5, B:29:0x00a9, B:30:0x00bb, B:31:0x00d8, B:33:0x0104, B:35:0x0109, B:37:0x0113, B:111:0x02bb, B:38:0x0124, B:40:0x0131, B:41:0x013b, B:34:0x0107, B:42:0x0140, B:44:0x0144, B:45:0x014a, B:47:0x014e, B:48:0x0154, B:50:0x0164, B:52:0x016c, B:70:0x01bb, B:72:0x01eb, B:74:0x01f1, B:76:0x0200, B:81:0x020a, B:83:0x0220, B:85:0x0228, B:86:0x022f, B:88:0x0239, B:90:0x023e, B:94:0x024e, B:96:0x0257, B:98:0x025b, B:100:0x0276, B:101:0x027a, B:103:0x02a0, B:104:0x02a2, B:106:0x02ab, B:108:0x02b3, B:110:0x02b8, B:109:0x02b6, B:89:0x023c, B:54:0x0174, B:56:0x0184, B:58:0x018c, B:59:0x018e, B:60:0x0194, B:62:0x019a, B:69:0x01ad, B:12:0x0033), top: B:117:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0239 A[Catch: all -> 0x02ca, TryCatch #0 {, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x000d, B:9:0x0014, B:16:0x003f, B:17:0x0043, B:18:0x0046, B:20:0x0074, B:22:0x0078, B:24:0x0096, B:27:0x00a5, B:29:0x00a9, B:30:0x00bb, B:31:0x00d8, B:33:0x0104, B:35:0x0109, B:37:0x0113, B:111:0x02bb, B:38:0x0124, B:40:0x0131, B:41:0x013b, B:34:0x0107, B:42:0x0140, B:44:0x0144, B:45:0x014a, B:47:0x014e, B:48:0x0154, B:50:0x0164, B:52:0x016c, B:70:0x01bb, B:72:0x01eb, B:74:0x01f1, B:76:0x0200, B:81:0x020a, B:83:0x0220, B:85:0x0228, B:86:0x022f, B:88:0x0239, B:90:0x023e, B:94:0x024e, B:96:0x0257, B:98:0x025b, B:100:0x0276, B:101:0x027a, B:103:0x02a0, B:104:0x02a2, B:106:0x02ab, B:108:0x02b3, B:110:0x02b8, B:109:0x02b6, B:89:0x023c, B:54:0x0174, B:56:0x0184, B:58:0x018c, B:59:0x018e, B:60:0x0194, B:62:0x019a, B:69:0x01ad, B:12:0x0033), top: B:117:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023c A[Catch: all -> 0x02ca, TryCatch #0 {, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x000d, B:9:0x0014, B:16:0x003f, B:17:0x0043, B:18:0x0046, B:20:0x0074, B:22:0x0078, B:24:0x0096, B:27:0x00a5, B:29:0x00a9, B:30:0x00bb, B:31:0x00d8, B:33:0x0104, B:35:0x0109, B:37:0x0113, B:111:0x02bb, B:38:0x0124, B:40:0x0131, B:41:0x013b, B:34:0x0107, B:42:0x0140, B:44:0x0144, B:45:0x014a, B:47:0x014e, B:48:0x0154, B:50:0x0164, B:52:0x016c, B:70:0x01bb, B:72:0x01eb, B:74:0x01f1, B:76:0x0200, B:81:0x020a, B:83:0x0220, B:85:0x0228, B:86:0x022f, B:88:0x0239, B:90:0x023e, B:94:0x024e, B:96:0x0257, B:98:0x025b, B:100:0x0276, B:101:0x027a, B:103:0x02a0, B:104:0x02a2, B:106:0x02ab, B:108:0x02b3, B:110:0x02b8, B:109:0x02b6, B:89:0x023c, B:54:0x0174, B:56:0x0184, B:58:0x018c, B:59:0x018e, B:60:0x0194, B:62:0x019a, B:69:0x01ad, B:12:0x0033), top: B:117:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0257 A[Catch: all -> 0x02ca, TryCatch #0 {, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x000d, B:9:0x0014, B:16:0x003f, B:17:0x0043, B:18:0x0046, B:20:0x0074, B:22:0x0078, B:24:0x0096, B:27:0x00a5, B:29:0x00a9, B:30:0x00bb, B:31:0x00d8, B:33:0x0104, B:35:0x0109, B:37:0x0113, B:111:0x02bb, B:38:0x0124, B:40:0x0131, B:41:0x013b, B:34:0x0107, B:42:0x0140, B:44:0x0144, B:45:0x014a, B:47:0x014e, B:48:0x0154, B:50:0x0164, B:52:0x016c, B:70:0x01bb, B:72:0x01eb, B:74:0x01f1, B:76:0x0200, B:81:0x020a, B:83:0x0220, B:85:0x0228, B:86:0x022f, B:88:0x0239, B:90:0x023e, B:94:0x024e, B:96:0x0257, B:98:0x025b, B:100:0x0276, B:101:0x027a, B:103:0x02a0, B:104:0x02a2, B:106:0x02ab, B:108:0x02b3, B:110:0x02b8, B:109:0x02b6, B:89:0x023c, B:54:0x0174, B:56:0x0184, B:58:0x018c, B:59:0x018e, B:60:0x0194, B:62:0x019a, B:69:0x01ad, B:12:0x0033), top: B:117:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bx(boolean r13) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atbq.bx(boolean):void");
    }

    private final boolean by() {
        return this.af.getDirectionsExperimentsParameters().l;
    }

    private final boolean bz() {
        return H() != null && btpf.c(H()).f && !this.aU.j && !this.aU.i();
    }

    @Override // defpackage.asmn
    public final void Qa() {
        if (this.aD) {
            this.aS.a().d();
            if (this.bi.e) {
                this.ah.b(new crie());
            } else {
                this.aq.d(true);
            }
        }
    }

    @Override // defpackage.asmn
    public final void Qb(aste asteVar) {
        cray bo = bo();
        int q = asteVar.q();
        int i = 1;
        if (bo == null || !vxx.d(bo.a.h, this.af)) {
            i = 6;
        } else if (dbsd.a(asteVar, bn().e)) {
            this.ax.o(true);
            i = 2;
        } else {
            this.ax.h(asteVar);
        }
        if (q == 2) {
            this.aW.x(i);
        } else if (q != 3) {
        } else {
            this.aW.y(i);
        }
    }

    @Override // defpackage.asmn
    public final void Qc() {
        this.ax.j();
    }

    @Override // defpackage.atcu
    public final void Qk() {
        aV(new Runnable(this) { // from class: atau
            private final atbq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.aT.c();
            }
        });
    }

    @Override // defpackage.atcu
    public final void Ql() {
        if (!this.aD) {
            return;
        }
        if (!this.ax.t().c.a.c()) {
            this.ax.x();
            this.ax.v();
        }
        atcp atcpVar = this.aT;
        atcpVar.k.c(atcpVar.e);
        this.aj.c = jjn.FULLY_EXPANDED;
        bx(false);
    }

    @Override // defpackage.gew
    protected final void Qm() {
        if (this.aU.a()) {
            this.bb.a().n();
        }
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        this.ap.Qs(eguVar);
        if (((crgt) this.aq).b == arym.GUIDED_NAV) {
            this.bb.a().n();
        }
        this.as.e();
        atls atlsVar = this.bi;
        if (atlsVar.i) {
            dsqp dsqpVar = (dsqp) atlsVar.cu(5);
            dsqpVar.bC(atlsVar);
            atlr atlrVar = (atlr) dsqpVar;
            if (atlrVar.c) {
                atlrVar.bF();
                atlrVar.c = false;
            }
            atls atlsVar2 = (atls) atlrVar.b;
            atlsVar2.a |= 128;
            atlsVar2.i = false;
            this.bi = atlrVar.bK();
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
        if (r0.j == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aR() {
        /*
            r11 = this;
            atlq r0 = r11.bn()
            ilo r0 = r0.q
            atlq r1 = r11.bn()
            amte r1 = r1.r
            atlq r2 = r11.bn()
            crmw r2 = r2.w
            if (r2 == 0) goto L19
            ddom r2 = r2.g()
            goto L1a
        L19:
            r2 = 0
        L1a:
            atlq r3 = r11.bn()
            crmw r3 = r3.w
            asik r4 = r11.aP
            asio r4 = (defpackage.asio) r4
            boolean r4 = r4.b
            if (r4 == 0) goto L2b
            r11.bw()
        L2b:
            r4 = 1
            r5 = 0
            if (r0 == 0) goto La9
            dqvj r6 = r11.bl
            dqvj r7 = defpackage.dqvj.DRIVE
            if (r6 == r7) goto L41
            dqvj r6 = r11.bl
            dqvj r7 = defpackage.dqvj.TAXICAB
            if (r6 == r7) goto L41
            dqvj r6 = r11.bl
            dqvj r7 = defpackage.dqvj.TWO_WHEELER
            if (r6 != r7) goto L8e
        L41:
            if (r1 == 0) goto L8e
            if (r2 == 0) goto L8e
            if (r3 == 0) goto L8e
            gga r6 = r11.aE
            atls r7 = r11.bi
            boolean r7 = r7.h
            java.lang.Long r8 = r3.c()
            java.lang.Boolean r9 = r3.d()
            java.lang.String r3 = r3.e()
            ascu r10 = new ascu
            r10.<init>()
            r10.e = r2
            r10.f = r1
            boolean r2 = r1.h()
            if (r2 == 0) goto L75
            amte r1 = defpackage.yyt.a(r1)
            r10.g = r1
            amte r1 = r10.g
            if (r1 == 0) goto L73
            r5 = 1
        L73:
            r10.d = r5
        L75:
            bwrs r0 = defpackage.bwrs.a(r0)
            r10.ad = r0
            r10.ae = r4
            r10.ah = r7
            r10.aj = r8
            r10.ak = r9
            r10.al = r3
            ataq r0 = new ataq
            r0.<init>(r11, r6, r10)
            r11.aV(r0)
            goto Lc5
        L8e:
            if (r1 == 0) goto L9a
            boolean r0 = r1.h()
            if (r0 == 0) goto L9a
            r11.bv()
            goto Lc4
        L9a:
            atlq r0 = r11.bn()
            ilo r0 = r0.q
            atbh r1 = new atbh
            r1.<init>(r11, r0)
            r11.aV(r1)
            goto Lc4
        La9:
            if (r1 == 0) goto Lb1
            boolean r0 = r1.h()
            if (r0 != 0) goto Lbd
        Lb1:
            if (r1 == 0) goto Lc1
            atls r0 = r11.bi
            boolean r1 = r0.h
            if (r1 != 0) goto Lc1
            boolean r0 = r0.j
            if (r0 != 0) goto Lc1
        Lbd:
            r11.bv()
            goto Lc4
        Lc1:
            r11.bw()
        Lc4:
            r4 = 0
        Lc5:
            asac r0 = r11.g
            boolean r0 = r0.a
            if (r0 == 0) goto Ld8
            crfm r0 = r11.aq
            crgt r0 = (defpackage.crgt) r0
            arym r0 = r0.b
            if (r0 == 0) goto Ld8
            if (r4 != 0) goto Ld8
            r11.Qa()
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atbq.aR():void");
    }

    public final void aS(final gga ggaVar) {
        if (!bn().k) {
            return;
        }
        this.aA.b(new Runnable(ggaVar) { // from class: atar
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gga ggaVar2 = this.a;
                if (ggaVar2.aZ) {
                    ggaVar2.D(new asdf());
                }
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.atcx
    public final void aT() {
        bx(true);
    }

    public final boolean aU() {
        return this.aR.n().h().booleanValue() || this.aR.n().i().booleanValue();
    }

    final void aV(final Runnable runnable) {
        this.aA.b(new Runnable(this, runnable) { // from class: atay
            private final atbq a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                atbq atbqVar = this.a;
                Runnable runnable2 = this.b;
                gn gnVar = atbqVar.A;
                if (gnVar == null || gnVar.J()) {
                    return;
                }
                runnable2.run();
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.atct
    public final gek aX() {
        return this.aj;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void aj(Bundle bundle) {
        ckcv e2 = this.ae.e();
        try {
            super.aj(bundle);
            if (this.bc == null) {
                this.bc = this.ba.a();
                this.ax.H(bundle);
                if (this.af.getNavigationParameters().T()) {
                    this.aR.as(new Runnable(this) { // from class: ataz
                        private final atbq a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            atbq atbqVar = this.a;
                            atls atlsVar = atbqVar.bi;
                            dbsk.s(atlsVar);
                            if (!atlsVar.g) {
                                atbqVar.bd.e(atbqVar.aR.ap());
                                atbqVar.aT.a();
                            }
                        }
                    });
                    this.aR.as(new Runnable(this) { // from class: atba
                        private final atbq a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            atbq atbqVar = this.a;
                            atls atlsVar = atbqVar.bi;
                            dbsk.s(atlsVar);
                            if (!atlsVar.g) {
                                atbqVar.aT.b();
                            }
                        }
                    });
                    this.aR.as(new Runnable(this) { // from class: atbb
                        private final atbq a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            atbq atbqVar = this.a;
                            atls atlsVar = atbqVar.bi;
                            dbsk.s(atlsVar);
                            if (!atlsVar.g) {
                                atbqVar.be.e(atbqVar.aR.n());
                            }
                        }
                    });
                    this.aR.as(new Runnable(this) { // from class: atbc
                        private final atbq a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            atbq atbqVar = this.a;
                            atls atlsVar = atbqVar.bi;
                            dbsk.s(atlsVar);
                            if (!atlsVar.g) {
                                atbqVar.bf.e(atbqVar.aR.n());
                            }
                        }
                    });
                    this.aR.as(new Runnable(this) { // from class: atbd
                        private final atbq a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cqkf<atna> cqkfVar;
                            atbq atbqVar = this.a;
                            atls atlsVar = atbqVar.bi;
                            dbsk.s(atlsVar);
                            if (atlsVar.g || (cqkfVar = atbqVar.bg) == null) {
                                return;
                            }
                            cqkfVar.e(atbqVar.aR);
                        }
                    });
                    this.aR.as(new Runnable(this) { // from class: atbe
                        private final atbq a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cqkf<cqkp> cqkfVar;
                            atbq atbqVar = this.a;
                            atls atlsVar = atbqVar.bi;
                            dbsk.s(atlsVar);
                            if (atlsVar.g || (cqkfVar = atbqVar.bh) == null) {
                                return;
                            }
                            cqkfVar.e(atbqVar.aR);
                        }
                    });
                    this.aR.as(new Runnable(this) { // from class: atbf
                        private final atbq a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            atbq atbqVar = this.a;
                            boolean aU = atbqVar.aU();
                            if (atbqVar.bj != aU) {
                                atbqVar.aT();
                                atbqVar.bj = aU;
                            }
                        }
                    });
                } else {
                    this.aR.as(new Runnable(this) { // from class: atao
                        private final atbq a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            atbq atbqVar = this.a;
                            atls atlsVar = atbqVar.bi;
                            dbsk.s(atlsVar);
                            if (!atlsVar.g) {
                                atbqVar.bd.e(atbqVar.aR.ap());
                                cqkf<atna> cqkfVar = atbqVar.bg;
                                if (cqkfVar != null) {
                                    cqkfVar.e(atbqVar.aR);
                                }
                                cqkf<cqkp> cqkfVar2 = atbqVar.bh;
                                if (cqkfVar2 != null) {
                                    cqkfVar2.e(atbqVar.aR);
                                }
                                atbqVar.be.e(atbqVar.aR.n());
                                atbqVar.bf.e(atbqVar.aR.n());
                                atbqVar.aT.a();
                                atbqVar.aT.b();
                            }
                            boolean aU = atbqVar.aU();
                            if (atbqVar.bj != aU) {
                                atbqVar.aT();
                                atbqVar.bj = aU;
                            }
                        }
                    });
                }
                this.bc.NZ(bundle);
            }
            this.bq = null;
        } finally {
            e2.a((ckcr) this.ae.a(ckhi.ba));
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        bt();
        super.ak();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        bu();
        super.al();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        this.aw.b();
        atcp atcpVar = this.aT;
        if (atcpVar != null) {
            ExpandingScrollView a = atcpVar.k.a();
            atcpVar.d.a.e(null);
            atcpVar.e.d();
            atcpVar.f.d();
            atcpVar.g.d();
            atcpVar.c.a().removeOnLayoutChangeListener(atcpVar.l);
            atcpVar.c.a.e(null);
            a.G(atcpVar.m);
        }
        cqkf<atng> cqkfVar = this.bd;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<atna> cqkfVar2 = this.bg;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        cqkf<cqkp> cqkfVar3 = this.bh;
        if (cqkfVar3 != null) {
            cqkfVar3.e(null);
        }
        cqkf<asuq> cqkfVar4 = this.be;
        if (cqkfVar4 != null) {
            cqkfVar4.e(null);
        }
        cqkf<asuq> cqkfVar5 = this.bf;
        if (cqkfVar5 != null) {
            cqkfVar5.e(null);
        }
        atan atanVar = this.bc;
        if (atanVar != null) {
            atanVar.Qp();
        }
        J().g().m(this.bt);
        this.av.d();
        this.ah.a(this.c);
    }

    @Override // defpackage.atcu
    public final void b() {
        aV(new Runnable(this) { // from class: atav
            private final atbq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.am.a().k();
            }
        });
    }

    @Override // defpackage.aueo
    @dzsi
    public final Uri bI() {
        bvrj.UI_THREAD.c();
        cray bo = bo();
        if (!this.aD || bo == null) {
            return null;
        }
        amub amubVar = bo.a;
        return afhd.d(amubVar.h, amubVar.j(), amubVar.af(), afhv.NAVIGATION, null, null, null, false);
    }

    @Override // defpackage.ges
    public final achc bk() {
        return achc.DIRECTION_PAGE;
    }

    public final atlq bn() {
        return this.ax.t();
    }

    @dzsi
    public final cray bo() {
        crqf crqfVar;
        atlq t = this.ax.t();
        if (t == null || (crqfVar = t.m) == null) {
            return null;
        }
        return crqfVar.g();
    }

    public final boolean bs() {
        return H() != null && btpf.c(H()).f && by() && !this.aU.j && !this.aU.i();
    }

    public final void bt() {
        this.aU.l = true;
        if (bA()) {
            this.aZ.c(5, bo().a.h);
        }
    }

    public final void bu() {
        this.aU.l = false;
        if (bA()) {
            this.aZ.c(4, bo().a.h);
        }
    }

    @Override // defpackage.atcu
    public final void c() {
        if (this.aD) {
            aT();
        }
    }

    @Override // defpackage.atcu
    public final void d() {
        final cray bo = bo();
        if (bo == null) {
            return;
        }
        aV(new Runnable(this, bo, this) { // from class: ataw
            private final atbq a;
            private final cray b;
            private final fd c;

            {
                this.a = this;
                this.b = bo;
                this.c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                atbq atbqVar = this.a;
                cray crayVar = this.b;
                fd fdVar = this.c;
                gga ggaVar = atbqVar.aE;
                amvh l = crayVar.a.l();
                atbv atbvVar = new atbv();
                Bundle bundle = new Bundle();
                bundle.putSerializable("nextDestination", l);
                atbvVar.B(bundle);
                atbvVar.F(fdVar, 0);
                gei.a(ggaVar, atbvVar);
                ggaVar.g().aq();
            }
        });
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (!this.ao.a().h() && !this.aS.a().d() && !this.au.c()) {
            if (bn().e != null) {
                this.ax.j();
                return true;
            } else if (bn().c.a != asld.FOLLOWING) {
                this.ax.E();
                return true;
            } else {
                ff J = J();
                if (((asio) this.aP).b) {
                    asmh.a(new Runnable(this) { // from class: atbg
                        private final atbq a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.Qa();
                        }
                    }).aJ(J);
                    return true;
                }
                Qa();
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.atcu
    public final void f() {
        if (!this.aD) {
            return;
        }
        atcp atcpVar = this.aT;
        atcpVar.k.c(atcpVar.f);
        this.aj.c = jjn.FULLY_EXPANDED;
        bx(false);
    }

    @Override // defpackage.atcu
    public final void g(boolean z) {
        btrm btrmVar = this.ah;
        auax auaxVar = this.aX;
        boolean z2 = auaxVar.A == 3;
        int i = auaxVar.l;
        btrmVar.b(new crin(dbpy.a, z, new aryv(i == -1 ? dbpy.a : dbsg.i(Integer.valueOf(i)), auaxVar.j, z2)));
    }

    @Override // defpackage.atcu
    public final void h() {
        if (this.aB.c().h() == bzdj.STARTED) {
            this.aB.e();
            this.an.a().K(ahvk.TRANSIT_NAVIGATION);
            return;
        }
        cray bo = bo();
        if (bo == null) {
            return;
        }
        if (this.af.getLocationSharingParameters().y) {
            this.an.a().D();
            this.ah.b(new aswd());
            return;
        }
        this.an.a().C(bo, ahvk.STANDARD_NAVIGATION);
    }

    @Override // defpackage.atcu
    public final void i() {
        this.ah.b(new crhv());
    }

    @Override // defpackage.atcu
    public final void j() {
        bw();
    }

    @Override // defpackage.atcu
    public final void k() {
        ((efh) this.f).e = false;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        ckcv e2 = this.ae.e();
        try {
            super.l(bundle);
            Bundle bundle2 = bundle != null ? bundle : this.o;
            if (bundle2 != null) {
                this.bi = (atls) bvrs.g(bundle2, "constructionParams", (dssr) atls.k.cu(7), atls.k);
            } else {
                this.bi = atls.k;
            }
            if (anac.d) {
                this.aw.a(13);
            }
            this.an.a().E();
            this.bq = bundle;
            asml asmlVar = this.ap;
            asmlVar.a = null;
            asmlVar.b = false;
            asmi asmiVar = this.av;
            arym arymVar = arym.FREE_NAV;
            asmiVar.e();
            this.be = this.aQ.e(new aspn());
            this.bf = this.aQ.e(new asrt());
            this.bd = this.aQ.e(new atib());
            btrm btrmVar = this.ah;
            atbo atboVar = this.c;
            dceq a = dcet.a();
            a.b(alhb.class, new atbr(alhb.class, atboVar, bvrj.UI_THREAD));
            a.b(crmk.class, new atbr(crmk.class, atboVar));
            btrmVar.g(atboVar, a.a());
            this.bs.l = false;
            J().g().l(this.bt);
        } finally {
            e2.a((ckcr) this.ae.a(ckhi.aZ));
        }
    }

    @Override // defpackage.asmn
    public final void m() {
        aV(new Runnable(this) { // from class: atax
            private final atbq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                atbq atbqVar = this.a;
                cray bo = atbqVar.bo();
                if (bo == null) {
                    return;
                }
                amub amubVar = bo.a;
                if (amubVar.ai() < 10) {
                    gga ggaVar = atbqVar.aE;
                    Resources Rn = atbqVar.Rn();
                    bwqv bwqvVar = atbqVar.az;
                    dqvj dqvjVar = amubVar.h;
                    dtjq bZ = dtjt.e.bZ();
                    dtju bZ2 = dtjv.d.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dtjv dtjvVar = (dtjv) bZ2.b;
                    dtjvVar.b = dqvjVar.k;
                    dtjvVar.a |= 1;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dtjt dtjtVar = (dtjt) bZ.b;
                    dtjv bK = bZ2.bK();
                    bK.getClass();
                    dtjtVar.b = bK;
                    dtjtVar.a |= 1;
                    bxko bxkoVar = new bxko();
                    bxkoVar.c(bxla.SEARCH);
                    bxkoVar.g(Rn.getString(R.string.MENU_SEARCH_ENROUTE));
                    bxkoVar.e("");
                    bxkoVar.z(301989891);
                    bxkoVar.q(false);
                    bxkoVar.F(true);
                    bxkoVar.w(1);
                    bwnj bwnjVar = new bwnj();
                    bwnjVar.p(bwnl.a);
                    bwnjVar.c(dtja.DIRECTIONS_DRIVING);
                    bwnjVar.E(bZ.bK());
                    bwnjVar.e(false);
                    bwnjVar.g(false);
                    bwnjVar.M(true);
                    bwnjVar.aa();
                    bwnjVar.G(false);
                    atyo atyoVar = new atyo();
                    atyoVar.aU(bwqvVar, bxkoVar, bwnjVar, null);
                    ggaVar.D(atyoVar);
                    return;
                }
                gga ggaVar2 = atbqVar.aE;
                amvh l = amubVar.l();
                ff J = atbqVar.J();
                atyt atytVar = new atyt();
                Bundle bundle = new Bundle();
                bundle.putString("nextDestinationText", l.p());
                bundle.putString("nextDestinationSpokenText", J.getString(R.string.MENU_REMOVE_NEXT_STOP_ACTION, new Object[]{l.s(J.getResources())}));
                atytVar.B(bundle);
                ggaVar2.D(atytVar);
            }
        });
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.bc.Qo(configuration);
        this.au.e();
        aT();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxw.aR;
    }

    @Override // defpackage.asmn
    public final void q() {
        aR();
    }

    @Override // defpackage.asmn
    public final void r() {
        this.au.b();
        if (this.aD) {
            bx(false);
        }
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void s() {
        bvmn bvmnVar = bvmo.a;
        ckcv e2 = this.ae.e();
        try {
            super.s();
            this.bc.b();
            this.aV.a().e(this);
            this.ao.a().e(this.aR.y());
            if (this.aY.a().a() && this.bi.g) {
                this.aY.a().b().b();
            }
            J().registerReceiver(this.bo, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
            this.ax.K(br(J()));
            this.al.a().f();
        } finally {
            e2.a((ckcr) this.ae.a(ckhi.bb));
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        Bundle bundle2 = this.bq;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
            this.bq = null;
        } else {
            atan atanVar = this.bc;
            if (atanVar != null) {
                atanVar.Qr(bundle);
            }
        }
        atls atlsVar = this.bi;
        if (atlsVar != null) {
            bvrs.k(bundle, "constructionParams", atlsVar);
        }
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void u() {
        this.bc.c();
        this.aV.a().f(this);
        this.ao.a().j(this.aR.y());
        J().unregisterReceiver(this.bo);
        if (bn() != null && this.br) {
            this.br = false;
            this.ar.G(true);
        }
        atls atlsVar = this.bi;
        dsqp dsqpVar = (dsqp) atlsVar.cu(5);
        dsqpVar.bC(atlsVar);
        atlr atlrVar = (atlr) dsqpVar;
        if (atlrVar.c) {
            atlrVar.bF();
            atlrVar.c = false;
        }
        atls atlsVar2 = (atls) atlrVar.b;
        atls atlsVar3 = atls.k;
        atlsVar2.a &= -33;
        atlsVar2.g = false;
        this.bi = atlrVar.bK();
        super.u();
    }

    @Override // defpackage.asmm
    public final void v(Runnable runnable) {
        if (!this.aD) {
            return;
        }
        this.ap.c(runnable);
    }

    @Override // defpackage.asmm
    public final /* bridge */ /* synthetic */ asmp w() {
        return this.ax;
    }

    @Override // defpackage.asmn
    public final void y() {
    }
}
