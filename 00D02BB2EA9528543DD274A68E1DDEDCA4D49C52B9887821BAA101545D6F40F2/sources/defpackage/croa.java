package defpackage;

import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: croa  reason: default package */
/* loaded from: classes5.dex */
public final class croa implements crgy {
    public static final long a = TimeUnit.SECONDS.toMillis(30);
    private final crdz A;
    @dzsi
    crok b;
    @dzsi
    public crop c;
    @dzsi
    public crnj d;
    @dzsi
    public croh e;
    @dzsi
    public Long f;
    @dzsi
    public String h;
    public double i;
    public double j;
    public long k;
    public double l;
    public boolean m;
    @dzsi
    public GmmLocation n;
    @dzsi
    public int r;
    private final btrm s;
    private final cqat t;
    private final cjqy u;
    private final bvjj v;
    private final crow w;
    private final Set<crha> x;
    private final crox y;
    private long z;
    public Boolean g = false;
    public ArrayList<akra> o = dchl.a();
    public boolean p = false;
    public boolean q = false;

    public croa(btrm btrmVar, cqat cqatVar, crox croxVar, cjqy cjqyVar, bvjj bvjjVar, crow crowVar, Set set, crdz crdzVar) {
        this.s = btrmVar;
        this.t = cqatVar;
        this.u = cjqyVar;
        this.v = bvjjVar;
        this.y = croxVar;
        this.w = crowVar;
        this.x = set;
        this.A = crdzVar;
    }

    private final int g() {
        return ((int) (this.t.e() - this.z)) / 1000;
    }

    private final int h() {
        return deav.a(Math.max((double) dcyn.a, this.l), RoundingMode.HALF_UP);
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        this.r = 0;
        this.b = new crok();
        this.c = new crop();
        this.d = new crnj();
        this.y.p();
        this.e = new croh();
        long e = this.t.e();
        this.z = e;
        crow crowVar = this.w;
        ddnp ddnpVar = crowVar.b;
        ddnpVar.b = (MessageType) ddnpVar.b.cu(4);
        crowVar.c.clear();
        crowVar.d = e;
        this.k = this.t.e();
        this.m = this.v.m(bvjk.cb, false);
        this.q = false;
        this.i = dcyn.a;
        this.j = dcyn.a;
        this.l = dcyn.a;
        this.o = dchl.a();
        this.p = false;
        for (crha crhaVar : this.x) {
            crhaVar.a(crgzVar);
        }
        if (this.A.a()) {
            this.y.b(this.A.b());
        } else {
            this.y.b(null);
        }
        btrm btrmVar = this.s;
        dceq a2 = dcet.a();
        a2.b(aswb.class, new crob(0, aswb.class, this, bvrj.UI_THREAD));
        a2.b(crmk.class, new crob(1, crmk.class, this, bvrj.UI_THREAD));
        a2.b(crmj.class, new crob(2, crmj.class, this, bvrj.UI_THREAD));
        a2.b(crmi.class, new crob(3, crmi.class, this, bvrj.UI_THREAD));
        a2.b(crrk.class, new crob(4, crrk.class, this, bvrj.UI_THREAD));
        a2.b(crmn.class, new crob(5, crmn.class, this, bvrj.UI_THREAD));
        a2.b(crhb.class, new crob(6, crhb.class, this, bvrj.UI_THREAD));
        a2.b(AndroidLocationEvent.class, new crob(7, AndroidLocationEvent.class, this, bvrj.UI_THREAD));
        a2.b(amqo.class, new crob(8, amqo.class, this, bvrj.UI_THREAD));
        a2.b(cror.class, new crob(9, cror.class, this, bvrj.UI_THREAD));
        a2.b(croq.class, new crob(10, croq.class, this, bvrj.UI_THREAD));
        a2.b(crhm.class, new crob(11, crhm.class, this, bvrj.UI_THREAD));
        a2.b(crhp.class, new crob(12, crhp.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        this.s.a(this);
        cjqy cjqyVar = this.u;
        cjtk[] cjtkVarArr = new cjtk[1];
        ddom e = e();
        GmmLocation gmmLocation = this.n;
        cjtkVarArr[0] = new crou(e, gmmLocation != null ? gmmLocation.a() : null, this.t, this.u.G());
        cjqyVar.u(cjtkVarArr);
        for (crha crhaVar : this.x) {
            crhaVar.b(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        if (defpackage.crok.c(r0.c.get(0).c, r13.o) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.amub r11, defpackage.cray r12, @defpackage.dzsi defpackage.cray r13) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.croa.c(amub, cray, cray):void");
    }

    public final dcdc<akra> d() {
        return dcdc.r(this.o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
        if (r1 != 2) goto L196;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05b0 A[LOOP:3: B:184:0x05aa->B:186:0x05b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ddom e() {
        /*
            Method dump skipped, instructions count: 1473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.croa.e():ddom");
    }

    public final int f() {
        if (bvtb.u(deav.a(-this.j, RoundingMode.HALF_UP), false) == 1) {
            return deav.a(this.i + this.j, RoundingMode.HALF_UP);
        }
        return deav.a(this.i, RoundingMode.HALF_UP);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.f("DURATION_SECONDS", g());
        b.f("SAVED_TIME", f());
        b.f("WASTED_TIME", h());
        b.h("REACHED_DESTINATION", this.p);
        b.h("HAS_BLUETOOTH_AUDIO_CONNECTION", this.q);
        b.b("routeStats", this.b);
        b.b("stepCompletionStats", this.c);
        b.b("locationStats", this.d);
        b.b("textToSpeechStats", this.y);
        b.b("routeSnappingStats", this.e);
        return b.toString();
    }
}
