package defpackage;

import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.gmm.replay.events.LoggedObjectDiffEvent;
import com.google.android.apps.gmm.transit.go.events.TransitGuidanceUserActionEvent;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bzfg  reason: default package */
/* loaded from: classes4.dex */
public final class bzfg implements bzem, ahvl {
    public static final bzdk a = new bzdo(false, new eapd(0), new eapd(0), 0, bzdh.a, bzdj.UNINITIALIZED, "", "", null, 0, 1, null, bzdd.a, null, false, 1, null, byys.UNKNOWN);
    public int A;
    public final ckoq B;
    private final bzge C;
    private final bzge D;
    private final btrm E;
    private final ddrz F;
    private final bzgp G;
    private final bzdz H;
    private final bzgj I;
    private final bzed J;
    private final ahjq K;
    private final bwqv L;
    private final dehq M;
    private final bzbn N;
    private final amtc O;
    private final bzat P;
    private int Q;
    private volatile boolean R;
    private final Executor S;
    private final bzbd T;
    private int U;
    final long b;
    public final bvjj c;
    public amte d;
    public final bzaf e;
    public final byzk f;
    public final Application g;
    public final btvo h;
    public final auhj i;
    public final ausy j;
    public final auhi k;
    public final ahvo l;
    public final cqat m;
    public final bnwu n;
    public bzec o;
    public volatile bzdj p;
    public volatile boolean q;
    public volatile bzdk r;
    @dzsi
    public String s;
    public int t;
    public long u;
    public boolean v;
    public boolean w;
    public boolean x;
    public byys y;
    public final vxv z;

    public bzfg(amte amteVar, ddrz ddrzVar, int i, byzk byzkVar, bzag bzagVar, bzgq bzgqVar, bzed bzedVar, Executor executor, dehq dehqVar, btrm btrmVar, ahjq ahjqVar, Application application, bwqv bwqvVar, bvjj bvjjVar, btvo btvoVar, ckoq ckoqVar, auhi auhiVar, auhj auhjVar, ausy ausyVar, bzbn bzbnVar, amtc amtcVar, bzea bzeaVar, cqat cqatVar, vxv vxvVar, ahvo ahvoVar, bzbe bzbeVar, bzat bzatVar) {
        bzgj bzgjVar = new bzgj();
        this.I = bzgjVar;
        new bnwr();
        this.n = new bnwu();
        this.p = bzdj.UNINITIALIZED;
        this.q = false;
        this.R = false;
        this.t = 0;
        this.u = Long.MIN_VALUE;
        this.w = false;
        this.y = byys.UNKNOWN;
        this.U = 1;
        this.c = bvjjVar;
        this.z = vxvVar;
        bzbe.a(this, 1);
        Application a2 = bzbeVar.a.a();
        bzbe.a(a2, 2);
        auhj a3 = bzbeVar.b.a();
        bzbe.a(a3, 3);
        auhi a4 = bzbeVar.c.a();
        bzbe.a(a4, 4);
        bzgl a5 = bzbeVar.d.a();
        bzbe.a(a5, 5);
        btvo a6 = bzbeVar.e.a();
        bzbe.a(a6, 6);
        ausy a7 = bzbeVar.f.a();
        bzbe.a(a7, 7);
        this.T = new bzbd(this, a2, a3, a4, a5, a6, a7);
        this.C = new bzge();
        bzge bzgeVar = new bzge();
        this.D = bzgeVar;
        this.F = ddrzVar;
        this.K = ahjqVar;
        this.g = application;
        this.f = byzkVar;
        this.E = btrmVar;
        this.J = bzedVar;
        this.L = bwqvVar;
        this.h = btvoVar;
        this.B = ckoqVar;
        this.M = dehqVar;
        this.P = bzatVar;
        bzgeVar.b(new bzgf(this) { // from class: bzen
            private final bzfg a;

            {
                this.a = this;
            }

            @Override // defpackage.bzgf
            public final void a() {
                this.a.m();
            }
        }, bzgjVar, null);
        t(amteVar, i, true);
        bzag.a(this, 1);
        Service service = (Service) ((dxjd) bzagVar.a).a;
        bzag.a(service, 2);
        dehq a8 = bzagVar.b.a();
        bzag.a(a8, 3);
        auhi a9 = bzagVar.c.a();
        bzag.a(a9, 4);
        byzr a10 = bzagVar.d.a();
        bzag.a(a10, 5);
        byzi a11 = bzagVar.e.a();
        bzag.a(a11, 6);
        bzag.a(bzagVar.f.a(), 7);
        bzai a12 = bzagVar.g.a();
        bzag.a(a12, 8);
        cqat a13 = bzagVar.h.a();
        bzag.a(a13, 9);
        bzag.a(bzagVar.i.a(), 10);
        this.e = new bzaf(this, service, a8, a9, a10, a11, a12, a13);
        bzgq.a(this, 1);
        Service service2 = (Service) ((dxjd) bzgqVar.a).a;
        bzgq.a(service2, 2);
        cqat a14 = bzgqVar.b.a();
        bzgq.a(a14, 3);
        bzgl a15 = bzgqVar.c.a();
        bzgq.a(a15, 4);
        dzsj<cref> dzsjVar = bzgqVar.d;
        byzi a16 = bzgqVar.e.a();
        bzgq.a(a16, 6);
        this.G = new bzgp(this, service2, a14, a15, dzsjVar, a16);
        bzea.a(this, 1);
        qdx a17 = bzeaVar.a.a();
        bzea.a(a17, 2);
        dehq a18 = bzeaVar.b.a();
        bzea.a(a18, 3);
        byzk a19 = bzeaVar.c.a();
        bzea.a(a19, 4);
        btvo a20 = bzeaVar.d.a();
        bzea.a(a20, 5);
        zar a21 = bzeaVar.e.a();
        bzea.a(a21, 6);
        zag a22 = bzeaVar.f.a();
        bzea.a(a22, 7);
        this.H = new bzdz(this, a17, a18, a19, a20, a21, a22);
        this.A = 1;
        this.p = bzdj.NOT_STARTED;
        this.k = auhiVar;
        this.i = auhjVar;
        this.j = ausyVar;
        this.N = bzbnVar;
        this.O = amtcVar;
        this.m = cqatVar;
        this.l = ahvoVar;
        this.S = executor;
        this.b = btvoVar.getTransitTrackingParameters().f;
        this.v = false;
        dbsk.s(this.o);
        this.r = new bzdo(this.q, new eapd(0L), new eapd(0L), 0, bzdh.a, this.p, v(), w(), amteVar, i, 1, null, bzdd.a, null, false, 1, this.o.c, byys.UNKNOWN);
    }

    private final void t(amte amteVar, int i, boolean z) {
        synchronized (this) {
            this.d = amteVar;
            this.Q = i;
            if (z) {
                amub k = k();
                bzed bzedVar = this.J;
                ddrz ddrzVar = this.F;
                bzge bzgeVar = this.D;
                fyo a2 = bzedVar.a.a();
                a2.a = k;
                dxjg.b(ddrzVar);
                a2.c = ddrzVar;
                dxjg.b(bzgeVar);
                a2.b = bzgeVar;
                dxjg.a(a2.a, amub.class);
                dxjg.a(a2.b, bzge.class);
                dxjg.a(a2.c, ddrz.class);
                fyq fyqVar = new fyq(a2.d, a2.a, a2.b);
                fyqVar.j();
                fyqVar.k();
                bzec i2 = fyqVar.i();
                bzfo a3 = i2.a();
                a3.h = new bzex(this);
                a3.i = new bzey(this);
                this.o = i2;
            }
        }
        e();
    }

    private final void u() {
        this.E.b(new byze(new bzck(amuh.f(this.Q, this.d.a(this.g)))));
        bzec bzecVar = this.o;
        dbsk.l(bzecVar.h instanceof bzdr);
        bzecVar.h = bzecVar.h.d();
        bzecVar.h.g();
    }

    private final String v() {
        return amvj.j(this.o.c.j());
    }

    private final String w() {
        return amvj.j(this.o.c.k());
    }

    private final eapd x() {
        bzec bzecVar = this.o;
        bzdh b = bzecVar.b();
        bzdg b2 = b.b();
        eapd eapdVar = new eapd(bzecVar.g.b());
        if ((b instanceof bzcz) || (b instanceof bzdf)) {
            eapdVar = eapdVar.e(b.e());
            b2 = b2.B();
        }
        while (!b2.D()) {
            if (b2.c() == dqvj.TRANSIT) {
                eapd j = b2.j();
                if (j != null) {
                    if (j.w(eapdVar)) {
                        eapdVar = j;
                    }
                } else {
                    b2.J();
                }
            }
            eapdVar = eapdVar.e(b2.y());
            b2 = b2.B();
        }
        return eapdVar;
    }

    private final void y(bzdh bzdhVar, bzdd bzddVar) {
        bzel.a();
        if (this.t > 0) {
            return;
        }
        boolean z = this.q;
        eapd x = x();
        eapd x2 = x();
        int G = this.o.c.G();
        bzdj bzdjVar = this.p;
        String v = v();
        String w = w();
        amte amteVar = this.d;
        int i = this.Q;
        int i2 = this.A;
        this.r = new bzdo(z, x, x2, G, bzdhVar, bzdjVar, v, w, amteVar, i, i2, i2 != 1 ? this.s : null, bzddVar, r(), this.x, this.U, this.o.c, this.y);
        this.C.a();
    }

    @Override // defpackage.bzem
    public final void a(final bzdd bzddVar) {
        dbsk.s(bzddVar);
        this.S.execute(new Runnable(this) { // from class: bzfe
            private final bzfg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bzfg bzfgVar = this.a;
                bzfgVar.l.b(bzfgVar);
            }
        });
        p(new Runnable(this, bzddVar) { // from class: bzeo
            private final bzfg a;
            private final bzdd b;

            {
                this.a = this;
                this.b = bzddVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.o(this.b);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x03c1 A[Catch: IndexOutOfBoundsException -> 0x0683, TryCatch #0 {IndexOutOfBoundsException -> 0x0683, blocks: (B:175:0x0554, B:176:0x0572, B:178:0x0578, B:180:0x0582, B:185:0x058b, B:187:0x05ac, B:188:0x05b2, B:193:0x05ec, B:195:0x05fe, B:196:0x0604, B:198:0x062b, B:199:0x0631, B:189:0x05ca, B:191:0x05d7, B:192:0x05dd, B:47:0x011e, B:49:0x0136, B:50:0x013c, B:52:0x014e, B:53:0x0154, B:55:0x0165, B:58:0x018d, B:62:0x019c, B:63:0x01b2, B:65:0x01f0, B:67:0x0203, B:68:0x0218, B:70:0x022c, B:72:0x0232, B:73:0x0238, B:75:0x0246, B:77:0x024e, B:79:0x0266, B:80:0x026c, B:83:0x027a, B:85:0x0298, B:86:0x029a, B:88:0x029e, B:89:0x02a0, B:91:0x02a6, B:92:0x02a8, B:94:0x02c1, B:96:0x02c9, B:97:0x02cb, B:99:0x02e1, B:100:0x02e7, B:102:0x0304, B:103:0x0306, B:105:0x031e, B:106:0x0324, B:109:0x0346, B:111:0x034e, B:113:0x0370, B:114:0x0386, B:116:0x038a, B:117:0x0390, B:118:0x03a2, B:119:0x03af, B:121:0x03c1, B:122:0x03c7, B:124:0x03e0, B:125:0x03e2, B:127:0x03f6, B:128:0x03f8, B:130:0x0408, B:131:0x040a, B:133:0x0410, B:135:0x0414, B:136:0x0416, B:138:0x041a, B:139:0x041c, B:141:0x0420, B:142:0x0426, B:144:0x0439, B:145:0x043b, B:147:0x043f, B:148:0x0445, B:150:0x0458, B:151:0x045e, B:153:0x0477, B:154:0x047d, B:174:0x053f, B:155:0x0494, B:157:0x04a6, B:158:0x04a8, B:160:0x04b8, B:161:0x04ba, B:163:0x04ca, B:164:0x04d0, B:166:0x04e6, B:167:0x04ec, B:169:0x0505, B:170:0x050b, B:172:0x0524, B:173:0x052a), top: B:212:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e0 A[Catch: IndexOutOfBoundsException -> 0x0683, TryCatch #0 {IndexOutOfBoundsException -> 0x0683, blocks: (B:175:0x0554, B:176:0x0572, B:178:0x0578, B:180:0x0582, B:185:0x058b, B:187:0x05ac, B:188:0x05b2, B:193:0x05ec, B:195:0x05fe, B:196:0x0604, B:198:0x062b, B:199:0x0631, B:189:0x05ca, B:191:0x05d7, B:192:0x05dd, B:47:0x011e, B:49:0x0136, B:50:0x013c, B:52:0x014e, B:53:0x0154, B:55:0x0165, B:58:0x018d, B:62:0x019c, B:63:0x01b2, B:65:0x01f0, B:67:0x0203, B:68:0x0218, B:70:0x022c, B:72:0x0232, B:73:0x0238, B:75:0x0246, B:77:0x024e, B:79:0x0266, B:80:0x026c, B:83:0x027a, B:85:0x0298, B:86:0x029a, B:88:0x029e, B:89:0x02a0, B:91:0x02a6, B:92:0x02a8, B:94:0x02c1, B:96:0x02c9, B:97:0x02cb, B:99:0x02e1, B:100:0x02e7, B:102:0x0304, B:103:0x0306, B:105:0x031e, B:106:0x0324, B:109:0x0346, B:111:0x034e, B:113:0x0370, B:114:0x0386, B:116:0x038a, B:117:0x0390, B:118:0x03a2, B:119:0x03af, B:121:0x03c1, B:122:0x03c7, B:124:0x03e0, B:125:0x03e2, B:127:0x03f6, B:128:0x03f8, B:130:0x0408, B:131:0x040a, B:133:0x0410, B:135:0x0414, B:136:0x0416, B:138:0x041a, B:139:0x041c, B:141:0x0420, B:142:0x0426, B:144:0x0439, B:145:0x043b, B:147:0x043f, B:148:0x0445, B:150:0x0458, B:151:0x045e, B:153:0x0477, B:154:0x047d, B:174:0x053f, B:155:0x0494, B:157:0x04a6, B:158:0x04a8, B:160:0x04b8, B:161:0x04ba, B:163:0x04ca, B:164:0x04d0, B:166:0x04e6, B:167:0x04ec, B:169:0x0505, B:170:0x050b, B:172:0x0524, B:173:0x052a), top: B:212:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f6 A[Catch: IndexOutOfBoundsException -> 0x0683, TryCatch #0 {IndexOutOfBoundsException -> 0x0683, blocks: (B:175:0x0554, B:176:0x0572, B:178:0x0578, B:180:0x0582, B:185:0x058b, B:187:0x05ac, B:188:0x05b2, B:193:0x05ec, B:195:0x05fe, B:196:0x0604, B:198:0x062b, B:199:0x0631, B:189:0x05ca, B:191:0x05d7, B:192:0x05dd, B:47:0x011e, B:49:0x0136, B:50:0x013c, B:52:0x014e, B:53:0x0154, B:55:0x0165, B:58:0x018d, B:62:0x019c, B:63:0x01b2, B:65:0x01f0, B:67:0x0203, B:68:0x0218, B:70:0x022c, B:72:0x0232, B:73:0x0238, B:75:0x0246, B:77:0x024e, B:79:0x0266, B:80:0x026c, B:83:0x027a, B:85:0x0298, B:86:0x029a, B:88:0x029e, B:89:0x02a0, B:91:0x02a6, B:92:0x02a8, B:94:0x02c1, B:96:0x02c9, B:97:0x02cb, B:99:0x02e1, B:100:0x02e7, B:102:0x0304, B:103:0x0306, B:105:0x031e, B:106:0x0324, B:109:0x0346, B:111:0x034e, B:113:0x0370, B:114:0x0386, B:116:0x038a, B:117:0x0390, B:118:0x03a2, B:119:0x03af, B:121:0x03c1, B:122:0x03c7, B:124:0x03e0, B:125:0x03e2, B:127:0x03f6, B:128:0x03f8, B:130:0x0408, B:131:0x040a, B:133:0x0410, B:135:0x0414, B:136:0x0416, B:138:0x041a, B:139:0x041c, B:141:0x0420, B:142:0x0426, B:144:0x0439, B:145:0x043b, B:147:0x043f, B:148:0x0445, B:150:0x0458, B:151:0x045e, B:153:0x0477, B:154:0x047d, B:174:0x053f, B:155:0x0494, B:157:0x04a6, B:158:0x04a8, B:160:0x04b8, B:161:0x04ba, B:163:0x04ca, B:164:0x04d0, B:166:0x04e6, B:167:0x04ec, B:169:0x0505, B:170:0x050b, B:172:0x0524, B:173:0x052a), top: B:212:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0408 A[Catch: IndexOutOfBoundsException -> 0x0683, TryCatch #0 {IndexOutOfBoundsException -> 0x0683, blocks: (B:175:0x0554, B:176:0x0572, B:178:0x0578, B:180:0x0582, B:185:0x058b, B:187:0x05ac, B:188:0x05b2, B:193:0x05ec, B:195:0x05fe, B:196:0x0604, B:198:0x062b, B:199:0x0631, B:189:0x05ca, B:191:0x05d7, B:192:0x05dd, B:47:0x011e, B:49:0x0136, B:50:0x013c, B:52:0x014e, B:53:0x0154, B:55:0x0165, B:58:0x018d, B:62:0x019c, B:63:0x01b2, B:65:0x01f0, B:67:0x0203, B:68:0x0218, B:70:0x022c, B:72:0x0232, B:73:0x0238, B:75:0x0246, B:77:0x024e, B:79:0x0266, B:80:0x026c, B:83:0x027a, B:85:0x0298, B:86:0x029a, B:88:0x029e, B:89:0x02a0, B:91:0x02a6, B:92:0x02a8, B:94:0x02c1, B:96:0x02c9, B:97:0x02cb, B:99:0x02e1, B:100:0x02e7, B:102:0x0304, B:103:0x0306, B:105:0x031e, B:106:0x0324, B:109:0x0346, B:111:0x034e, B:113:0x0370, B:114:0x0386, B:116:0x038a, B:117:0x0390, B:118:0x03a2, B:119:0x03af, B:121:0x03c1, B:122:0x03c7, B:124:0x03e0, B:125:0x03e2, B:127:0x03f6, B:128:0x03f8, B:130:0x0408, B:131:0x040a, B:133:0x0410, B:135:0x0414, B:136:0x0416, B:138:0x041a, B:139:0x041c, B:141:0x0420, B:142:0x0426, B:144:0x0439, B:145:0x043b, B:147:0x043f, B:148:0x0445, B:150:0x0458, B:151:0x045e, B:153:0x0477, B:154:0x047d, B:174:0x053f, B:155:0x0494, B:157:0x04a6, B:158:0x04a8, B:160:0x04b8, B:161:0x04ba, B:163:0x04ca, B:164:0x04d0, B:166:0x04e6, B:167:0x04ec, B:169:0x0505, B:170:0x050b, B:172:0x0524, B:173:0x052a), top: B:212:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0410 A[Catch: IndexOutOfBoundsException -> 0x0683, TryCatch #0 {IndexOutOfBoundsException -> 0x0683, blocks: (B:175:0x0554, B:176:0x0572, B:178:0x0578, B:180:0x0582, B:185:0x058b, B:187:0x05ac, B:188:0x05b2, B:193:0x05ec, B:195:0x05fe, B:196:0x0604, B:198:0x062b, B:199:0x0631, B:189:0x05ca, B:191:0x05d7, B:192:0x05dd, B:47:0x011e, B:49:0x0136, B:50:0x013c, B:52:0x014e, B:53:0x0154, B:55:0x0165, B:58:0x018d, B:62:0x019c, B:63:0x01b2, B:65:0x01f0, B:67:0x0203, B:68:0x0218, B:70:0x022c, B:72:0x0232, B:73:0x0238, B:75:0x0246, B:77:0x024e, B:79:0x0266, B:80:0x026c, B:83:0x027a, B:85:0x0298, B:86:0x029a, B:88:0x029e, B:89:0x02a0, B:91:0x02a6, B:92:0x02a8, B:94:0x02c1, B:96:0x02c9, B:97:0x02cb, B:99:0x02e1, B:100:0x02e7, B:102:0x0304, B:103:0x0306, B:105:0x031e, B:106:0x0324, B:109:0x0346, B:111:0x034e, B:113:0x0370, B:114:0x0386, B:116:0x038a, B:117:0x0390, B:118:0x03a2, B:119:0x03af, B:121:0x03c1, B:122:0x03c7, B:124:0x03e0, B:125:0x03e2, B:127:0x03f6, B:128:0x03f8, B:130:0x0408, B:131:0x040a, B:133:0x0410, B:135:0x0414, B:136:0x0416, B:138:0x041a, B:139:0x041c, B:141:0x0420, B:142:0x0426, B:144:0x0439, B:145:0x043b, B:147:0x043f, B:148:0x0445, B:150:0x0458, B:151:0x045e, B:153:0x0477, B:154:0x047d, B:174:0x053f, B:155:0x0494, B:157:0x04a6, B:158:0x04a8, B:160:0x04b8, B:161:0x04ba, B:163:0x04ca, B:164:0x04d0, B:166:0x04e6, B:167:0x04ec, B:169:0x0505, B:170:0x050b, B:172:0x0524, B:173:0x052a), top: B:212:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0494 A[Catch: IndexOutOfBoundsException -> 0x0683, TryCatch #0 {IndexOutOfBoundsException -> 0x0683, blocks: (B:175:0x0554, B:176:0x0572, B:178:0x0578, B:180:0x0582, B:185:0x058b, B:187:0x05ac, B:188:0x05b2, B:193:0x05ec, B:195:0x05fe, B:196:0x0604, B:198:0x062b, B:199:0x0631, B:189:0x05ca, B:191:0x05d7, B:192:0x05dd, B:47:0x011e, B:49:0x0136, B:50:0x013c, B:52:0x014e, B:53:0x0154, B:55:0x0165, B:58:0x018d, B:62:0x019c, B:63:0x01b2, B:65:0x01f0, B:67:0x0203, B:68:0x0218, B:70:0x022c, B:72:0x0232, B:73:0x0238, B:75:0x0246, B:77:0x024e, B:79:0x0266, B:80:0x026c, B:83:0x027a, B:85:0x0298, B:86:0x029a, B:88:0x029e, B:89:0x02a0, B:91:0x02a6, B:92:0x02a8, B:94:0x02c1, B:96:0x02c9, B:97:0x02cb, B:99:0x02e1, B:100:0x02e7, B:102:0x0304, B:103:0x0306, B:105:0x031e, B:106:0x0324, B:109:0x0346, B:111:0x034e, B:113:0x0370, B:114:0x0386, B:116:0x038a, B:117:0x0390, B:118:0x03a2, B:119:0x03af, B:121:0x03c1, B:122:0x03c7, B:124:0x03e0, B:125:0x03e2, B:127:0x03f6, B:128:0x03f8, B:130:0x0408, B:131:0x040a, B:133:0x0410, B:135:0x0414, B:136:0x0416, B:138:0x041a, B:139:0x041c, B:141:0x0420, B:142:0x0426, B:144:0x0439, B:145:0x043b, B:147:0x043f, B:148:0x0445, B:150:0x0458, B:151:0x045e, B:153:0x0477, B:154:0x047d, B:174:0x053f, B:155:0x0494, B:157:0x04a6, B:158:0x04a8, B:160:0x04b8, B:161:0x04ba, B:163:0x04ca, B:164:0x04d0, B:166:0x04e6, B:167:0x04ec, B:169:0x0505, B:170:0x050b, B:172:0x0524, B:173:0x052a), top: B:212:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136 A[Catch: IndexOutOfBoundsException -> 0x0683, TryCatch #0 {IndexOutOfBoundsException -> 0x0683, blocks: (B:175:0x0554, B:176:0x0572, B:178:0x0578, B:180:0x0582, B:185:0x058b, B:187:0x05ac, B:188:0x05b2, B:193:0x05ec, B:195:0x05fe, B:196:0x0604, B:198:0x062b, B:199:0x0631, B:189:0x05ca, B:191:0x05d7, B:192:0x05dd, B:47:0x011e, B:49:0x0136, B:50:0x013c, B:52:0x014e, B:53:0x0154, B:55:0x0165, B:58:0x018d, B:62:0x019c, B:63:0x01b2, B:65:0x01f0, B:67:0x0203, B:68:0x0218, B:70:0x022c, B:72:0x0232, B:73:0x0238, B:75:0x0246, B:77:0x024e, B:79:0x0266, B:80:0x026c, B:83:0x027a, B:85:0x0298, B:86:0x029a, B:88:0x029e, B:89:0x02a0, B:91:0x02a6, B:92:0x02a8, B:94:0x02c1, B:96:0x02c9, B:97:0x02cb, B:99:0x02e1, B:100:0x02e7, B:102:0x0304, B:103:0x0306, B:105:0x031e, B:106:0x0324, B:109:0x0346, B:111:0x034e, B:113:0x0370, B:114:0x0386, B:116:0x038a, B:117:0x0390, B:118:0x03a2, B:119:0x03af, B:121:0x03c1, B:122:0x03c7, B:124:0x03e0, B:125:0x03e2, B:127:0x03f6, B:128:0x03f8, B:130:0x0408, B:131:0x040a, B:133:0x0410, B:135:0x0414, B:136:0x0416, B:138:0x041a, B:139:0x041c, B:141:0x0420, B:142:0x0426, B:144:0x0439, B:145:0x043b, B:147:0x043f, B:148:0x0445, B:150:0x0458, B:151:0x045e, B:153:0x0477, B:154:0x047d, B:174:0x053f, B:155:0x0494, B:157:0x04a6, B:158:0x04a8, B:160:0x04b8, B:161:0x04ba, B:163:0x04ca, B:164:0x04d0, B:166:0x04e6, B:167:0x04ec, B:169:0x0505, B:170:0x050b, B:172:0x0524, B:173:0x052a), top: B:212:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014e A[Catch: IndexOutOfBoundsException -> 0x0683, TryCatch #0 {IndexOutOfBoundsException -> 0x0683, blocks: (B:175:0x0554, B:176:0x0572, B:178:0x0578, B:180:0x0582, B:185:0x058b, B:187:0x05ac, B:188:0x05b2, B:193:0x05ec, B:195:0x05fe, B:196:0x0604, B:198:0x062b, B:199:0x0631, B:189:0x05ca, B:191:0x05d7, B:192:0x05dd, B:47:0x011e, B:49:0x0136, B:50:0x013c, B:52:0x014e, B:53:0x0154, B:55:0x0165, B:58:0x018d, B:62:0x019c, B:63:0x01b2, B:65:0x01f0, B:67:0x0203, B:68:0x0218, B:70:0x022c, B:72:0x0232, B:73:0x0238, B:75:0x0246, B:77:0x024e, B:79:0x0266, B:80:0x026c, B:83:0x027a, B:85:0x0298, B:86:0x029a, B:88:0x029e, B:89:0x02a0, B:91:0x02a6, B:92:0x02a8, B:94:0x02c1, B:96:0x02c9, B:97:0x02cb, B:99:0x02e1, B:100:0x02e7, B:102:0x0304, B:103:0x0306, B:105:0x031e, B:106:0x0324, B:109:0x0346, B:111:0x034e, B:113:0x0370, B:114:0x0386, B:116:0x038a, B:117:0x0390, B:118:0x03a2, B:119:0x03af, B:121:0x03c1, B:122:0x03c7, B:124:0x03e0, B:125:0x03e2, B:127:0x03f6, B:128:0x03f8, B:130:0x0408, B:131:0x040a, B:133:0x0410, B:135:0x0414, B:136:0x0416, B:138:0x041a, B:139:0x041c, B:141:0x0420, B:142:0x0426, B:144:0x0439, B:145:0x043b, B:147:0x043f, B:148:0x0445, B:150:0x0458, B:151:0x045e, B:153:0x0477, B:154:0x047d, B:174:0x053f, B:155:0x0494, B:157:0x04a6, B:158:0x04a8, B:160:0x04b8, B:161:0x04ba, B:163:0x04ca, B:164:0x04d0, B:166:0x04e6, B:167:0x04ec, B:169:0x0505, B:170:0x050b, B:172:0x0524, B:173:0x052a), top: B:212:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165 A[Catch: IndexOutOfBoundsException -> 0x0683, TryCatch #0 {IndexOutOfBoundsException -> 0x0683, blocks: (B:175:0x0554, B:176:0x0572, B:178:0x0578, B:180:0x0582, B:185:0x058b, B:187:0x05ac, B:188:0x05b2, B:193:0x05ec, B:195:0x05fe, B:196:0x0604, B:198:0x062b, B:199:0x0631, B:189:0x05ca, B:191:0x05d7, B:192:0x05dd, B:47:0x011e, B:49:0x0136, B:50:0x013c, B:52:0x014e, B:53:0x0154, B:55:0x0165, B:58:0x018d, B:62:0x019c, B:63:0x01b2, B:65:0x01f0, B:67:0x0203, B:68:0x0218, B:70:0x022c, B:72:0x0232, B:73:0x0238, B:75:0x0246, B:77:0x024e, B:79:0x0266, B:80:0x026c, B:83:0x027a, B:85:0x0298, B:86:0x029a, B:88:0x029e, B:89:0x02a0, B:91:0x02a6, B:92:0x02a8, B:94:0x02c1, B:96:0x02c9, B:97:0x02cb, B:99:0x02e1, B:100:0x02e7, B:102:0x0304, B:103:0x0306, B:105:0x031e, B:106:0x0324, B:109:0x0346, B:111:0x034e, B:113:0x0370, B:114:0x0386, B:116:0x038a, B:117:0x0390, B:118:0x03a2, B:119:0x03af, B:121:0x03c1, B:122:0x03c7, B:124:0x03e0, B:125:0x03e2, B:127:0x03f6, B:128:0x03f8, B:130:0x0408, B:131:0x040a, B:133:0x0410, B:135:0x0414, B:136:0x0416, B:138:0x041a, B:139:0x041c, B:141:0x0420, B:142:0x0426, B:144:0x0439, B:145:0x043b, B:147:0x043f, B:148:0x0445, B:150:0x0458, B:151:0x045e, B:153:0x0477, B:154:0x047d, B:174:0x053f, B:155:0x0494, B:157:0x04a6, B:158:0x04a8, B:160:0x04b8, B:161:0x04ba, B:163:0x04ca, B:164:0x04d0, B:166:0x04e6, B:167:0x04ec, B:169:0x0505, B:170:0x050b, B:172:0x0524, B:173:0x052a), top: B:212:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0203 A[Catch: IndexOutOfBoundsException -> 0x0683, LOOP:2: B:66:0x0201->B:67:0x0203, LOOP_END, TryCatch #0 {IndexOutOfBoundsException -> 0x0683, blocks: (B:175:0x0554, B:176:0x0572, B:178:0x0578, B:180:0x0582, B:185:0x058b, B:187:0x05ac, B:188:0x05b2, B:193:0x05ec, B:195:0x05fe, B:196:0x0604, B:198:0x062b, B:199:0x0631, B:189:0x05ca, B:191:0x05d7, B:192:0x05dd, B:47:0x011e, B:49:0x0136, B:50:0x013c, B:52:0x014e, B:53:0x0154, B:55:0x0165, B:58:0x018d, B:62:0x019c, B:63:0x01b2, B:65:0x01f0, B:67:0x0203, B:68:0x0218, B:70:0x022c, B:72:0x0232, B:73:0x0238, B:75:0x0246, B:77:0x024e, B:79:0x0266, B:80:0x026c, B:83:0x027a, B:85:0x0298, B:86:0x029a, B:88:0x029e, B:89:0x02a0, B:91:0x02a6, B:92:0x02a8, B:94:0x02c1, B:96:0x02c9, B:97:0x02cb, B:99:0x02e1, B:100:0x02e7, B:102:0x0304, B:103:0x0306, B:105:0x031e, B:106:0x0324, B:109:0x0346, B:111:0x034e, B:113:0x0370, B:114:0x0386, B:116:0x038a, B:117:0x0390, B:118:0x03a2, B:119:0x03af, B:121:0x03c1, B:122:0x03c7, B:124:0x03e0, B:125:0x03e2, B:127:0x03f6, B:128:0x03f8, B:130:0x0408, B:131:0x040a, B:133:0x0410, B:135:0x0414, B:136:0x0416, B:138:0x041a, B:139:0x041c, B:141:0x0420, B:142:0x0426, B:144:0x0439, B:145:0x043b, B:147:0x043f, B:148:0x0445, B:150:0x0458, B:151:0x045e, B:153:0x0477, B:154:0x047d, B:174:0x053f, B:155:0x0494, B:157:0x04a6, B:158:0x04a8, B:160:0x04b8, B:161:0x04ba, B:163:0x04ca, B:164:0x04d0, B:166:0x04e6, B:167:0x04ec, B:169:0x0505, B:170:0x050b, B:172:0x0524, B:173:0x052a), top: B:212:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022c A[Catch: IndexOutOfBoundsException -> 0x0683, TryCatch #0 {IndexOutOfBoundsException -> 0x0683, blocks: (B:175:0x0554, B:176:0x0572, B:178:0x0578, B:180:0x0582, B:185:0x058b, B:187:0x05ac, B:188:0x05b2, B:193:0x05ec, B:195:0x05fe, B:196:0x0604, B:198:0x062b, B:199:0x0631, B:189:0x05ca, B:191:0x05d7, B:192:0x05dd, B:47:0x011e, B:49:0x0136, B:50:0x013c, B:52:0x014e, B:53:0x0154, B:55:0x0165, B:58:0x018d, B:62:0x019c, B:63:0x01b2, B:65:0x01f0, B:67:0x0203, B:68:0x0218, B:70:0x022c, B:72:0x0232, B:73:0x0238, B:75:0x0246, B:77:0x024e, B:79:0x0266, B:80:0x026c, B:83:0x027a, B:85:0x0298, B:86:0x029a, B:88:0x029e, B:89:0x02a0, B:91:0x02a6, B:92:0x02a8, B:94:0x02c1, B:96:0x02c9, B:97:0x02cb, B:99:0x02e1, B:100:0x02e7, B:102:0x0304, B:103:0x0306, B:105:0x031e, B:106:0x0324, B:109:0x0346, B:111:0x034e, B:113:0x0370, B:114:0x0386, B:116:0x038a, B:117:0x0390, B:118:0x03a2, B:119:0x03af, B:121:0x03c1, B:122:0x03c7, B:124:0x03e0, B:125:0x03e2, B:127:0x03f6, B:128:0x03f8, B:130:0x0408, B:131:0x040a, B:133:0x0410, B:135:0x0414, B:136:0x0416, B:138:0x041a, B:139:0x041c, B:141:0x0420, B:142:0x0426, B:144:0x0439, B:145:0x043b, B:147:0x043f, B:148:0x0445, B:150:0x0458, B:151:0x045e, B:153:0x0477, B:154:0x047d, B:174:0x053f, B:155:0x0494, B:157:0x04a6, B:158:0x04a8, B:160:0x04b8, B:161:0x04ba, B:163:0x04ca, B:164:0x04d0, B:166:0x04e6, B:167:0x04ec, B:169:0x0505, B:170:0x050b, B:172:0x0524, B:173:0x052a), top: B:212:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024e A[Catch: IndexOutOfBoundsException -> 0x0683, TryCatch #0 {IndexOutOfBoundsException -> 0x0683, blocks: (B:175:0x0554, B:176:0x0572, B:178:0x0578, B:180:0x0582, B:185:0x058b, B:187:0x05ac, B:188:0x05b2, B:193:0x05ec, B:195:0x05fe, B:196:0x0604, B:198:0x062b, B:199:0x0631, B:189:0x05ca, B:191:0x05d7, B:192:0x05dd, B:47:0x011e, B:49:0x0136, B:50:0x013c, B:52:0x014e, B:53:0x0154, B:55:0x0165, B:58:0x018d, B:62:0x019c, B:63:0x01b2, B:65:0x01f0, B:67:0x0203, B:68:0x0218, B:70:0x022c, B:72:0x0232, B:73:0x0238, B:75:0x0246, B:77:0x024e, B:79:0x0266, B:80:0x026c, B:83:0x027a, B:85:0x0298, B:86:0x029a, B:88:0x029e, B:89:0x02a0, B:91:0x02a6, B:92:0x02a8, B:94:0x02c1, B:96:0x02c9, B:97:0x02cb, B:99:0x02e1, B:100:0x02e7, B:102:0x0304, B:103:0x0306, B:105:0x031e, B:106:0x0324, B:109:0x0346, B:111:0x034e, B:113:0x0370, B:114:0x0386, B:116:0x038a, B:117:0x0390, B:118:0x03a2, B:119:0x03af, B:121:0x03c1, B:122:0x03c7, B:124:0x03e0, B:125:0x03e2, B:127:0x03f6, B:128:0x03f8, B:130:0x0408, B:131:0x040a, B:133:0x0410, B:135:0x0414, B:136:0x0416, B:138:0x041a, B:139:0x041c, B:141:0x0420, B:142:0x0426, B:144:0x0439, B:145:0x043b, B:147:0x043f, B:148:0x0445, B:150:0x0458, B:151:0x045e, B:153:0x0477, B:154:0x047d, B:174:0x053f, B:155:0x0494, B:157:0x04a6, B:158:0x04a8, B:160:0x04b8, B:161:0x04ba, B:163:0x04ca, B:164:0x04d0, B:166:0x04e6, B:167:0x04ec, B:169:0x0505, B:170:0x050b, B:172:0x0524, B:173:0x052a), top: B:212:0x011e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.amte r31, int r32) {
        /*
            Method dump skipped, instructions count: 1680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzfg.b(amte, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        GmmLocation a2;
        if (this.p == bzdj.STARTED) {
            if (!this.o.b().o() && this.h.getTransitTrackingParameters().d && (a2 = this.K.a()) != null) {
                this.o.a().a(a2, false);
            }
            bvqd.a(this.M.d(new Runnable(this) { // from class: bzew
                private final bzfg a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            }, this.b, TimeUnit.SECONDS), this.M);
        }
    }

    @Override // defpackage.bzgh
    public final void d(bzgf bzgfVar, bzgj bzgjVar, @dzsi Executor executor) {
        this.C.b(bzgfVar, bzgjVar, executor);
    }

    public final void e() {
        dbsk.s(this.d);
        bzeg a2 = bzeg.a(this.d, this.Q, this.F);
        if (a2 != null) {
            this.L.o(bwrj.TRANSIT_TRIP_PARAMS, a2);
            return;
        }
        dqvj c = this.d.c(this.Q);
        if (c == null) {
            return;
        }
        c.name();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(amte amteVar) {
        this.t++;
        try {
            if (!this.p.e) {
                return;
            }
            t(amteVar, this.Q, false);
            this.o.f.a(k());
            this.t--;
            bzdh b = this.o.b();
            y(b, b.a());
        } finally {
            this.t--;
        }
    }

    @Override // defpackage.ahvl
    public final void g() {
        this.U = 3;
        p(new Runnable(this) { // from class: bzes
            private final bzfg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.q();
            }
        });
    }

    @Override // defpackage.ahvl
    public final void h() {
        this.U = 4;
        p(new Runnable(this) { // from class: bzet
            private final bzfg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.q();
            }
        });
    }

    @Override // defpackage.ahvl
    public final void i() {
        this.U = 2;
        p(new Runnable(this) { // from class: bzeu
            private final bzfg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.q();
            }
        });
    }

    public final void j() {
        bzel.a();
        boolean z = true;
        this.t++;
        this.u = Long.MIN_VALUE;
        this.w = false;
        try {
            this.p = bzdj.STARTED;
            int i = 3;
            if (!this.R) {
                btrm btrmVar = this.E;
                dceq a2 = dcet.a();
                a2.b(crhr.class, new bzfi(0, crhr.class, this, bvrj.NAVIGATION_INTERNAL));
                a2.b(crhs.class, new bzfi(1, crhs.class, this, bvrj.NAVIGATION_INTERNAL));
                a2.b(ahju.class, new bzfi(2, ahju.class, this, bvrj.NAVIGATION_INTERNAL));
                a2.b(LoggedObjectDiffEvent.class, new bzfi(3, LoggedObjectDiffEvent.class, this, bvrj.NAVIGATION_INTERNAL));
                btrmVar.g(this, a2.a());
                this.R = true;
            }
            amub k = k();
            byzk byzkVar = this.f;
            ddrz ddrzVar = this.F;
            dbsk.m(byzkVar.p == null, "Cannot start new trip before ending current one");
            byzkVar.s = k;
            byzkVar.p = ddsh.w.bZ();
            ddrx ddrxVar = byzkVar.p;
            if (ddrxVar.c) {
                ddrxVar.bF();
                ddrxVar.c = false;
            }
            ddsh ddshVar = (ddsh) ddrxVar.b;
            ddshVar.d = ddrzVar.g;
            ddshVar.a |= 4;
            ddrx ddrxVar2 = byzkVar.p;
            int z2 = k.z();
            if (ddrxVar2.c) {
                ddrxVar2.bF();
                ddrxVar2.c = false;
            }
            ddsh ddshVar2 = (ddsh) ddrxVar2.b;
            ddshVar2.a |= 1;
            ddshVar2.b = z2;
            ddrx ddrxVar3 = byzkVar.p;
            int i2 = k.D;
            if (ddrxVar3.c) {
                ddrxVar3.bF();
                ddrxVar3.c = false;
            }
            ddsh ddshVar3 = (ddsh) ddrxVar3.b;
            ddshVar3.a |= 16;
            ddshVar3.f = i2;
            ddrx ddrxVar4 = byzkVar.p;
            int i3 = k.c;
            if (ddrxVar4.c) {
                ddrxVar4.bF();
                ddrxVar4.c = false;
            }
            ddsh ddshVar4 = (ddsh) ddrxVar4.b;
            ddshVar4.a |= ImageMetadata.SHADING_MODE;
            ddshVar4.t = i3;
            if (byzkVar.f.a() != null) {
                byzkVar.d.g();
                byzkVar.d.e(dukj.TRANSIT_TRIP_TRACKING_STARTED, byzkVar.f.a().h().d());
            }
            byzkVar.g = byzkVar.a.e();
            byzkVar.h = dcyn.a;
            byzkVar.i = 0;
            byzkVar.j = 0;
            byzkVar.k = 0;
            byzkVar.l = 0;
            byzkVar.m = 0;
            byzkVar.n = 0;
            byzkVar.o = null;
            byzkVar.r = null;
            byzkVar.q = new byzj();
            btrm btrmVar2 = byzkVar.b;
            dceq a3 = dcet.a();
            a3.b(amqo.class, new byzl(0, amqo.class, byzkVar, bvrj.NAVIGATION_INTERNAL));
            a3.b(crhm.class, new byzl(1, crhm.class, byzkVar, bvrj.NAVIGATION_INTERNAL));
            btrmVar2.g(byzkVar, a3.a());
            crnz crnzVar = byzkVar.e;
            if (crnzVar != null) {
                bvrj.NAVIGATION_INTERNAL.c();
                crnzVar.l(dqvj.TRANSIT, arym.GUIDED_NAV, "", null);
            }
            new TransitGuidanceUserActionEvent(byzf.START, this.Q);
            u();
            this.A = 1;
            this.t--;
            bzdh b = this.o.b();
            bzdd bzddVar = bzdd.a;
            if (b != null) {
                bzddVar = b.a();
            }
            y(b, bzddVar);
            this.N.b.m(bzbn.a);
            final bzaf bzafVar = this.e;
            dbsk.l(!bzafVar.h);
            bzel.a();
            bzafVar.b.d(new bzgf(bzafVar) { // from class: bzaa
                private final bzaf a;

                {
                    this.a = bzafVar;
                }

                @Override // defpackage.bzgf
                public final void a() {
                    this.a.d();
                }
            }, bzafVar.f, null);
            bzafVar.c();
            if (bzafVar.g == null) {
                Context applicationContext = bzafVar.e.getApplicationContext();
                bzab bzabVar = new bzab(bzafVar);
                bzgc.a(applicationContext, 1);
                bzgc.a(bzabVar, 2);
                bzafVar.g = new bzgb(applicationContext, bzabVar);
            }
            bzgb bzgbVar = bzafVar.g;
            if (true != bzgbVar.a.isInteractive()) {
                i = 2;
            }
            bzgbVar.a(i);
            final bzgp bzgpVar = this.G;
            if (bzgpVar.d != null) {
                bzgpVar.f.d(new bzgf(bzgpVar) { // from class: bzgo
                    private final bzgp a;

                    {
                        this.a = bzgpVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:109:0x030c  */
                    @Override // defpackage.bzgf
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a() {
                        /*
                            Method dump skipped, instructions count: 825
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzgo.a():void");
                    }
                }, bzgpVar.g, null);
            }
            final bzbd bzbdVar = this.T;
            bzgl bzglVar = bzbdVar.f;
            if (bzglVar.c.a() && (bzglVar.a.getTransitTrackingParameters().x || bzglVar.b.m(bvjk.f0do, false))) {
                bzbdVar.b.d(new bzgf(bzbdVar) { // from class: bzbc
                    private final bzbd a;

                    {
                        this.a = bzbdVar;
                    }

                    @Override // defpackage.bzgf
                    public final void a() {
                        bzbd bzbdVar2 = this.a;
                        bzdh g = ((bzfg) bzbdVar2.b).r.g();
                        int i4 = dpyv.TRANSIT_GUIDANCE_QUESTIONS.dm;
                        if (!(g instanceof bzcz)) {
                            if (!bzbdVar2.i) {
                                return;
                            }
                            bzbdVar2.e.m(i4);
                            bzbdVar2.i = false;
                        } else if (bzbdVar2.i) {
                        } else {
                            bzbdVar2.i = true;
                            aujb e = bzbdVar2.h.e(i4);
                            if (e == null) {
                                return;
                            }
                            augc b2 = bzbdVar2.d.b(i4, e);
                            b2.w(bzal.m(g.b()));
                            b2.f = bzbi.a(bzbdVar2.c.getResources(), g.b());
                            b2.v = bzbdVar2.g.getTransitTrackingParameters().z;
                            String r = g.b().r();
                            if (r == null) {
                                return;
                            }
                            b2.g = bzbdVar2.c.getResources().getString(R.string.TRANSIT_GUIDANCE_QUESTIONS_CROWDEDNESS_NOTIFICATION_CONTENT, r);
                            Application application = bzbdVar2.c;
                            Intent intent = new Intent();
                            String packageName = application.getPackageName();
                            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 33);
                            sb.append(packageName);
                            sb.append(".");
                            sb.append("TransitGuidanceQuestionsActivity");
                            intent.setComponent(new ComponentName(application, sb.toString()));
                            b2.E(intent, auhw.ACTIVITY);
                            b2.C(true);
                            bzbdVar2.e.j(b2.a()).b.equals(auhh.SHOWN);
                        }
                    }
                }, bzbdVar.a, null);
            }
            bzat bzatVar = this.P;
            bzatVar.e = k();
            bzatVar.d = bzatVar.a.e();
            btrm btrmVar3 = bzatVar.b;
            dceq a4 = dcet.a();
            a4.b(crhm.class, new bzau(crhm.class, bzatVar));
            btrmVar3.g(bzatVar, a4.a());
            if (this.h.getTransitTrackingParameters().l) {
                bzdz bzdzVar = this.H;
                bzel.a();
                if (bzdzVar.b.p != bzdj.STARTED) {
                    z = false;
                }
                dbsk.m(z, "TripTracker must be started to receive realtime updates");
                bzdy bzdyVar = bzdzVar.d;
                bzdyVar.b = false;
                bzdyVar.c = false;
                bzdzVar.b();
            } else {
                bvqd.a(this.M.d(new Runnable(this) { // from class: bzfb
                    private final bzfg a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c();
                    }
                }, this.b, TimeUnit.SECONDS), this.M);
            }
            this.x = this.c.m(bvjk.dk, false);
        } catch (Throwable th) {
            this.t--;
            throw th;
        }
    }

    public final amub k() {
        amub b = this.d.b(this.Q, this.g);
        dbsk.s(b);
        return b;
    }

    public final void l() {
        this.S.execute(new Runnable(this) { // from class: bzfd
            private final bzfg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bzfg bzfgVar = this.a;
                bzfgVar.l.a(bzfgVar);
            }
        });
    }

    public final void m() {
        bzel.a();
        bzdh b = this.o.b();
        b.getClass();
        b.e();
        if (this.p == bzdj.STOPPED) {
            dbsk.l(b.p());
            return;
        }
        this.t++;
        bzdd bzddVar = bzdd.a;
        try {
            if (this.o.c()) {
                a(bzddVar);
                b = this.o.b();
                bzddVar = b.a();
            }
            this.t--;
            y(b, bzddVar);
        } catch (Throwable th) {
            this.t--;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bzdh n() {
        return this.o.b();
    }

    public final void o(bzdd bzddVar) {
        bzel.a();
        if (this.p == bzdj.STARTED) {
            this.t++;
            try {
                if (this.p == bzdj.STARTED) {
                    this.p = bzdj.STOPPED;
                    if (this.R) {
                        this.E.a(this);
                        this.R = false;
                    }
                    if (!this.o.c()) {
                        bzec bzecVar = this.o;
                        bzecVar.e.a().e();
                        bzdc bzdcVar = bzdc.NOT_STOPPED;
                        int ordinal = bzddVar.e.ordinal();
                        if (ordinal == 3) {
                            bzecVar.h.r(new bzee(bzecVar.a), 5);
                        } else if (ordinal == 5) {
                            bzecVar.h.r(new bzdq(bzecVar.a, bzddVar.g), 6);
                        } else {
                            bzecVar.h.r(new bzee(bzecVar.a), 8);
                        }
                        this.I.b();
                    }
                    this.E.b(new byze(null));
                    if (bzddVar.f) {
                        new TransitGuidanceUserActionEvent(byzf.STOP, 0);
                    }
                    if (this.w) {
                        this.f.b(r());
                    }
                    byzk byzkVar = this.f;
                    byzkVar.b.a(byzkVar);
                    byzkVar.s = null;
                    if (byzkVar.f.a() != null) {
                        byzkVar.d.e(dukj.TRANSIT_TRIP_TRACKING_ENDED, byzkVar.f.a().h().d());
                        byzkVar.d.h();
                    }
                    dbsk.s(byzkVar.p);
                    ddrx ddrxVar = byzkVar.p;
                    int e = ((int) (byzkVar.a.e() - byzkVar.g)) / 1000;
                    if (ddrxVar.c) {
                        ddrxVar.bF();
                        ddrxVar.c = false;
                    }
                    ddsh ddshVar = (ddsh) ddrxVar.b;
                    ddsh ddshVar2 = ddsh.w;
                    ddshVar.a |= 2;
                    ddshVar.c = e;
                    ddrx ddrxVar2 = byzkVar.p;
                    int i = (int) byzkVar.h;
                    if (ddrxVar2.c) {
                        ddrxVar2.bF();
                        ddrxVar2.c = false;
                    }
                    ddsh ddshVar3 = (ddsh) ddrxVar2.b;
                    ddshVar3.a |= 32;
                    ddshVar3.g = i;
                    ddrx ddrxVar3 = byzkVar.p;
                    int i2 = byzkVar.i;
                    if (ddrxVar3.c) {
                        ddrxVar3.bF();
                        ddrxVar3.c = false;
                    }
                    ddsh ddshVar4 = (ddsh) ddrxVar3.b;
                    ddshVar4.a |= 8192;
                    ddshVar4.m = i2;
                    ddrx ddrxVar4 = byzkVar.p;
                    int i3 = byzkVar.j;
                    if (ddrxVar4.c) {
                        ddrxVar4.bF();
                        ddrxVar4.c = false;
                    }
                    ddsh ddshVar5 = (ddsh) ddrxVar4.b;
                    ddshVar5.a |= 16384;
                    ddshVar5.n = i3;
                    ddrx ddrxVar5 = byzkVar.p;
                    int i4 = byzkVar.k;
                    if (ddrxVar5.c) {
                        ddrxVar5.bF();
                        ddrxVar5.c = false;
                    }
                    ddsh ddshVar6 = (ddsh) ddrxVar5.b;
                    ddshVar6.a |= 32768;
                    ddshVar6.o = i4;
                    ddrx ddrxVar6 = byzkVar.p;
                    int i5 = byzkVar.l;
                    if (ddrxVar6.c) {
                        ddrxVar6.bF();
                        ddrxVar6.c = false;
                    }
                    ddsh ddshVar7 = (ddsh) ddrxVar6.b;
                    ddshVar7.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                    ddshVar7.p = i5;
                    ddrx ddrxVar7 = byzkVar.p;
                    int i6 = byzkVar.m;
                    if (ddrxVar7.c) {
                        ddrxVar7.bF();
                        ddrxVar7.c = false;
                    }
                    ddsh ddshVar8 = (ddsh) ddrxVar7.b;
                    ddshVar8.a |= 131072;
                    ddshVar8.q = i6;
                    ddrx ddrxVar8 = byzkVar.p;
                    int i7 = byzkVar.n;
                    if (ddrxVar8.c) {
                        ddrxVar8.bF();
                        ddrxVar8.c = false;
                    }
                    ddsh ddshVar9 = (ddsh) ddrxVar8.b;
                    ddshVar9.a |= 262144;
                    ddshVar9.r = i7;
                    cjsw cjswVar = byzkVar.r;
                    if (cjswVar != null) {
                        ddrx ddrxVar9 = byzkVar.p;
                        ddmg b = cjswVar.b();
                        if (ddrxVar9.c) {
                            ddrxVar9.bF();
                            ddrxVar9.c = false;
                        }
                        ddsh ddshVar10 = (ddsh) ddrxVar9.b;
                        b.getClass();
                        ddshVar10.s = b;
                        ddshVar10.a |= ImageMetadata.LENS_APERTURE;
                    }
                    byzj byzjVar = byzkVar.q;
                    if (byzjVar != null) {
                        ddrx ddrxVar10 = byzkVar.p;
                        ddmg b2 = byzjVar.a.b();
                        if (ddrxVar10.c) {
                            ddrxVar10.bF();
                            ddrxVar10.c = false;
                        }
                        ddsh ddshVar11 = (ddsh) ddrxVar10.b;
                        b2.getClass();
                        ddshVar11.i = b2;
                        int i8 = ddshVar11.a | 64;
                        ddshVar11.a = i8;
                        int i9 = byzjVar.b;
                        int i10 = i8 | 128;
                        ddshVar11.a = i10;
                        ddshVar11.j = i9;
                        int i11 = byzjVar.d;
                        int i12 = i10 | 1024;
                        ddshVar11.a = i12;
                        ddshVar11.l = i11;
                        int i13 = byzjVar.c;
                        ddshVar11.a = i12 | 512;
                        ddshVar11.k = i13;
                        byzkVar.q = null;
                    }
                    if (byzkVar.u > 0) {
                        byzkVar.c();
                        dbsk.s(byzkVar.p);
                        ddrx ddrxVar11 = byzkVar.p;
                        int i14 = byzkVar.u;
                        if (ddrxVar11.c) {
                            ddrxVar11.bF();
                            ddrxVar11.c = false;
                        }
                        ddsh ddshVar12 = (ddsh) ddrxVar11.b;
                        ddshVar12.a |= 2097152;
                        ddshVar12.u = i14;
                        ddrx ddrxVar12 = byzkVar.p;
                        int i15 = byzkVar.v;
                        if (ddrxVar12.c) {
                            ddrxVar12.bF();
                            ddrxVar12.c = false;
                        }
                        ddsh ddshVar13 = (ddsh) ddrxVar12.b;
                        ddshVar13.a |= 4194304;
                        ddshVar13.v = i15;
                    }
                    byzkVar.c.u(new byzm(byzkVar.p.bK(), byzkVar.a, byzkVar.c.G()));
                    byzkVar.p = null;
                    crnz crnzVar = byzkVar.e;
                    if (crnzVar != null) {
                        crnzVar.b(true);
                    }
                    if (this.A == 2) {
                        dbsk.s(((bzdo) this.r).g);
                        Toast.makeText(this.g, "Failed to write track", 0).show();
                        this.s = null;
                        this.A = 3;
                    }
                    bzat bzatVar = this.P;
                    bzatVar.b.a(bzatVar);
                    amub amubVar = bzatVar.e;
                    if (amubVar != null && bzatVar.f != 0 && amubVar.ai() != 0) {
                        long b3 = bzatVar.a.b();
                        long e2 = bzatVar.a.e() - bzatVar.d;
                        crsq crsqVar = bzatVar.c;
                        disc a2 = crsq.a(bzatVar.f, bzatVar.e, b3, e2);
                        dsqp dsqpVar = (dsqp) a2.cu(5);
                        dsqpVar.bC(a2);
                        dirt dirtVar = (dirt) dsqpVar;
                        amub amubVar2 = bzatVar.e;
                        amve amveVar = amubVar2.d;
                        amvh k = amubVar2.k();
                        diru bZ = dirv.e.bZ();
                        if (k.m()) {
                            String o = k.d.o();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dirv dirvVar = (dirv) bZ.b;
                            o.getClass();
                            dirvVar.a |= 1;
                            dirvVar.b = o;
                        }
                        if (k.n()) {
                            dpum h = k.e.h();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dirv dirvVar2 = (dirv) bZ.b;
                            h.getClass();
                            dirvVar2.d = h;
                            dirvVar2.a |= 4;
                        }
                        if (k.l()) {
                            String str = k.c;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dirv dirvVar3 = (dirv) bZ.b;
                            str.getClass();
                            dirvVar3.a = 2 | dirvVar3.a;
                            dirvVar3.c = str;
                        }
                        disa bZ2 = disb.c.bZ();
                        dpie dpieVar = amveVar.a;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        disb disbVar = (disb) bZ2.b;
                        dpieVar.getClass();
                        disbVar.b = dpieVar;
                        disbVar.a = 1 | disbVar.a;
                        if (dirtVar.c) {
                            dirtVar.bF();
                            dirtVar.c = false;
                        }
                        disc discVar = (disc) dirtVar.b;
                        disb bK = bZ2.bK();
                        disc discVar2 = disc.j;
                        bK.getClass();
                        discVar.i = bK;
                        discVar.a |= 512;
                        dirv bK2 = bZ.bK();
                        if (dirtVar.c) {
                            dirtVar.bF();
                            dirtVar.c = false;
                        }
                        disc discVar3 = (disc) dirtVar.b;
                        bK2.getClass();
                        discVar3.e = bK2;
                        discVar3.a |= 8;
                        bzatVar.c.b(dirtVar.bK());
                        bzatVar.e = null;
                    }
                }
                this.t--;
                y(this.o.b(), bzddVar);
                if (this.A == 3) {
                    this.N.a(this.r);
                }
                this.e.a(bzddVar.f);
                if (!this.h.getTransitTrackingParameters().l) {
                    return;
                }
                bzdz bzdzVar = this.H;
                bzel.a();
                bzdzVar.a.c();
            } catch (Throwable th) {
                this.t--;
                throw th;
            }
        }
    }

    public final void p(final Runnable runnable) {
        if (this.p == bzdj.STOPPED) {
            return;
        }
        this.M.execute(new Runnable(this, runnable) { // from class: bzep
            private final bzfg a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bzfg bzfgVar = this.a;
                try {
                    this.b.run();
                } catch (Throwable th) {
                    bzfgVar.o(bzdd.a(th));
                    throw th;
                }
            }
        });
    }

    public final void q() {
        bzdh b = this.o.b();
        y(b, b.a());
    }

    @dzsi
    public final eaow r() {
        if (this.u != Long.MIN_VALUE) {
            return eaow.e(this.m.b() - this.u);
        }
        return null;
    }

    public final void s() {
        bzel.a();
        if (this.p == bzdj.STARTED && this.u != Long.MIN_VALUE) {
            q();
            bvqd.a(this.M.d(new Runnable(this) { // from class: bzev
                private final bzfg a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.s();
                }
            }, 1L, TimeUnit.MINUTES), this.M);
        }
    }
}
