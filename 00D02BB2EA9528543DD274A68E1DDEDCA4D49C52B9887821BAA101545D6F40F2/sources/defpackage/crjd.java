package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crjd  reason: default package */
/* loaded from: classes5.dex */
public final class crjd extends crjq<crqb> {
    static final long a = TimeUnit.SECONDS.toMillis(6) - 1500;
    public static final /* synthetic */ int g = 0;
    public final crqb b;
    @dzsi
    public final crjl c;
    public final bvrb d;
    @dzsi
    public qbn e;
    public final crjc f;
    private final Application i;
    private final List<amvh> j;
    private final dqvj k;
    private final vxa l;
    private final ahjq m;
    private final dzsj<srv> n;
    private final boolean o;
    private final bvjj p;
    private final vva q;

    public crjd(Application application, btrm btrmVar, bvjj bvjjVar, crlb crlbVar, vxa vxaVar, ahjq ahjqVar, dzsj<srv> dzsjVar, bvrb bvrbVar, vva vvaVar, List<amvh> list, @dzsi crjo crjoVar, dqvj dqvjVar, @dzsi aryr aryrVar, boolean z, @dzsi crjl crjlVar) {
        super(crlbVar, btrmVar);
        this.e = null;
        this.f = new crjc(this);
        dbsk.s(list);
        if (!list.isEmpty()) {
            this.i = application;
            this.j = list;
            this.k = dqvjVar;
            this.l = vxaVar;
            this.m = ahjqVar;
            this.n = dzsjVar;
            this.d = bvrbVar;
            this.o = z;
            this.c = crjlVar;
            this.p = bvjjVar;
            this.q = vvaVar;
            crja crjaVar = new crja(this, z);
            if (crjoVar != null) {
                this.b = crqb.m(2, crqa.d(crjoVar.b(), crjoVar.a(), crjoVar.b), Long.MAX_VALUE, aryrVar, crjaVar);
                return;
            }
            dbsk.s(dqvjVar);
            this.b = new crqb(2, null, aryrVar, crjaVar, Long.MAX_VALUE, true);
            return;
        }
        throw new IllegalArgumentException("Destinations must not be empty. There must be at least one destination.");
    }

    @Override // defpackage.crjq
    protected final void a() {
        if (this.k == null) {
            f();
            return;
        }
        GmmLocation a2 = this.m.a();
        if (a2 == null) {
            f();
            return;
        }
        dwao a3 = this.q.a(this.l.c(this.k, 3, vul.FREE_NAV), this.k).a();
        vum vumVar = new vum();
        vumVar.e = crsr.a(a2);
        vumVar.f = a2.a();
        vumVar.g = bvsl.a(this.p);
        vumVar.a = a3;
        vumVar.b(amvh.h(null, a2.B()));
        for (amvh amvhVar : this.j) {
            vumVar.b(amvhVar);
        }
        if (!this.o) {
            dnqg bZ = dnqh.p.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            dnqhVar.a |= 2048;
            dnqhVar.j = true;
            vumVar.o = bZ.bK();
        }
        srv a4 = this.n.a();
        this.e = a4;
        btrm btrmVar = this.h;
        crjc crjcVar = this.f;
        dceq a5 = dcet.a();
        a5.b(srf.class, new crjf(srf.class, crjcVar));
        btrmVar.g(crjcVar, a5.a());
        a4.j(vumVar.a(), null);
    }

    @Override // defpackage.crjq
    protected final /* bridge */ /* synthetic */ crqb b() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        if (r7 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(defpackage.qbm r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r7 == 0) goto Ld
            crqb r0 = r5.b     // Catch: java.lang.Throwable -> Lae
            int r0 = r0.g     // Catch: java.lang.Throwable -> Lae
            r1 = 1
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            monitor-exit(r5)
            return
        Ld:
            amte r6 = r6.n()     // Catch: java.lang.Throwable -> Lae
            defpackage.dbsk.s(r6)     // Catch: java.lang.Throwable -> Lae
            amsy r0 = r6.a     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r0.D()     // Catch: java.lang.Throwable -> Lae
            r1 = 0
            if (r0 == 0) goto L24
            amsy r0 = r6.a     // Catch: java.lang.Throwable -> Lae
            dpfh r0 = r0.E()     // Catch: java.lang.Throwable -> Lae
            goto L25
        L24:
            r0 = r1
        L25:
            android.app.Application r2 = r5.i     // Catch: java.lang.Throwable -> Lae
            r3 = 0
            amuh r6 = defpackage.amuh.g(r6, r2, r3)     // Catch: java.lang.Throwable -> Lae
            if (r6 == 0) goto L86
            boolean r2 = r6.n()     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto L86
            boolean r2 = r6.j()     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto L3b
            goto L86
        L3b:
            amub r1 = r6.k()     // Catch: java.lang.Throwable -> Lae
            crax r2 = new crax     // Catch: java.lang.Throwable -> Lae
            r2.<init>()     // Catch: java.lang.Throwable -> Lae
            r2.a = r1     // Catch: java.lang.Throwable -> Lae
            int r4 = r1.D     // Catch: java.lang.Throwable -> Lae
            r2.h = r4     // Catch: java.lang.Throwable -> Lae
            amsx r4 = r1.B     // Catch: java.lang.Throwable -> Lae
            r2.i = r4     // Catch: java.lang.Throwable -> Lae
            amuo[] r4 = r1.k     // Catch: java.lang.Throwable -> Lae
            int r4 = r4.length     // Catch: java.lang.Throwable -> Lae
            if (r4 <= 0) goto L59
            amuo r1 = r1.o(r3)     // Catch: java.lang.Throwable -> Lae
            r2.b = r1     // Catch: java.lang.Throwable -> Lae
        L59:
            cray r1 = r2.a()     // Catch: java.lang.Throwable -> Lae
            java.util.List<amvh> r2 = r5.j     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Lae
            amvh r2 = (defpackage.amvh) r2     // Catch: java.lang.Throwable -> Lae
            akqi r3 = r2.d     // Catch: java.lang.Throwable -> Lae
            if (r3 == 0) goto L71
            akqi r4 = defpackage.akqi.a     // Catch: java.lang.Throwable -> Lae
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> Lae
            if (r3 == 0) goto L7d
        L71:
            boolean r3 = r2.l()     // Catch: java.lang.Throwable -> Lae
            if (r3 == 0) goto L7d
            amub r2 = r1.a     // Catch: java.lang.Throwable -> Lae
            amvh r2 = r2.l()     // Catch: java.lang.Throwable -> Lae
        L7d:
            crqg r3 = new crqg     // Catch: java.lang.Throwable -> Lae
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> Lae
            crqa r1 = defpackage.crqa.d(r3, r6, r0)     // Catch: java.lang.Throwable -> Lae
        L86:
            if (r1 != 0) goto L91
            if (r7 != 0) goto L8f
            r5.f()     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r5)
            return
        L8f:
            monitor-exit(r5)
            return
        L91:
            crqb r6 = r5.b     // Catch: java.lang.Throwable -> Lae
            r6.a = r1     // Catch: java.lang.Throwable -> Lae
            r6.c = r7     // Catch: java.lang.Throwable -> Lae
            r5.e()     // Catch: java.lang.Throwable -> Lae
            if (r7 == 0) goto Lac
            bvrb r6 = r5.d     // Catch: java.lang.Throwable -> Lae
            criz r7 = new criz     // Catch: java.lang.Throwable -> Lae
            r7.<init>(r5)     // Catch: java.lang.Throwable -> Lae
            bvrj r0 = defpackage.bvrj.BACKGROUND_THREADPOOL     // Catch: java.lang.Throwable -> Lae
            long r1 = defpackage.crjd.a     // Catch: java.lang.Throwable -> Lae
            r6.a(r7, r0, r1)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r5)
            return
        Lac:
            monitor-exit(r5)
            return
        Lae:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crjd.d(qbm, boolean):void");
    }
}
