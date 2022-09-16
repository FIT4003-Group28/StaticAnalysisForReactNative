package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeyc  reason: default package */
/* loaded from: classes.dex */
public final class aeyc extends ppl implements Handler.Callback, aeys {
    public aetv d;
    public aeya e;
    public aeya g;
    public final boolean h;
    private int l;
    private final Handler m;
    private pqb n;
    private Handler o;
    private final afjz r;
    private final List i = new ArrayList();
    private final IdentityHashMap j = new IdentityHashMap(2);
    private final AtomicInteger k = new AtomicInteger();
    private final Callable p = new aexx(this, 1);
    private final Callable q = new aexx(this);
    public final HashSet f = new HashSet();

    public aeyc(pqb pqbVar, aetv aetvVar, Handler handler, afjz afjzVar) {
        this.d = aetv.c;
        this.e = new aeya(pqbVar);
        this.d = aetvVar;
        this.m = handler;
        this.r = afjzVar;
        this.h = afjzVar.u();
    }

    private final void E() {
        int i = this.k.get();
        int i2 = this.l;
        if (i > i2) {
            return;
        }
        rF(new aexz(this.e, this.g, this.k, i2));
    }

    @Override // defpackage.aeys
    public final long A(long j) {
        pqb pqbVar = this.e.a;
        if (pqbVar instanceof aeys) {
            return ((aeys) pqbVar).A(j);
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void B() {
        if (this.n != null) {
            this.i.add(this.p);
            this.n = null;
            this.k.incrementAndGet();
            Handler handler = this.o;
            if (handler != null) {
                handler.obtainMessage(1).sendToTarget();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void C() {
        if (this.n != null) {
            this.i.add(this.q);
            this.n = null;
            this.k.incrementAndGet();
            Handler handler = this.o;
            if (handler != null) {
                handler.obtainMessage(1).sendToTarget();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void D(pqb pqbVar, long j, long j2) {
        if (this.n != pqbVar) {
            this.i.add(new aeyb(this, pqbVar, j, j2, this.r));
            this.n = pqbVar;
            this.k.incrementAndGet();
            Handler handler = this.o;
            if (handler != null) {
                handler.obtainMessage(1).sendToTarget();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r6) {
        /*
            r5 = this;
            int r0 = r6.what
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L62
            monitor-enter(r5)
            java.util.List r6 = r5.i     // Catch: java.lang.Throwable -> L5f
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L11
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
            return r2
        L11:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5f
            java.util.List r0 = r5.i     // Catch: java.lang.Throwable -> L5f
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            java.util.List r0 = r5.i     // Catch: java.lang.Throwable -> L5f
            r0.clear()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L42
            r0 = 0
        L23:
            boolean r3 = r6.hasNext()     // Catch: java.lang.Exception -> L40
            if (r3 == 0) goto L59
            java.lang.Object r3 = r6.next()     // Catch: java.lang.Exception -> L40
            java.util.concurrent.Callable r3 = (java.util.concurrent.Callable) r3     // Catch: java.lang.Exception -> L40
            int r4 = r5.l     // Catch: java.lang.Exception -> L40
            int r4 = r4 + r2
            r5.l = r4     // Catch: java.lang.Exception -> L40
            java.lang.Object r3 = r3.call()     // Catch: java.lang.Exception -> L40
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Exception -> L40
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Exception -> L40
            r0 = r0 | r3
            goto L23
        L40:
            r6 = move-exception
            goto L44
        L42:
            r6 = move-exception
            r0 = 0
        L44:
            afki r3 = defpackage.afki.MLPLAYER
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r6
            java.lang.String r1 = "Exception in MedialibMediaSource: %s"
            defpackage.afkj.e(r3, r1, r4)
            android.os.Handler r1 = r5.m
            aexw r3 = new aexw
            r3.<init>()
            r1.post(r3)
        L59:
            if (r0 == 0) goto L5e
            r5.E()
        L5e:
            return r2
        L5f:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
            throw r6
        L62:
            afki r0 = defpackage.afki.MLPLAYER
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r6 = r6.what
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r1] = r6
            java.lang.String r6 = "Unrecognized MedialibMediaSource message: %s"
            defpackage.afkj.e(r0, r6, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyc.handleMessage(android.os.Message):boolean");
    }

    @Override // defpackage.pqb
    public final pjc r() {
        return this.e.a.r();
    }

    @Override // defpackage.ppl, defpackage.ppa
    public final synchronized void rA() {
        super.rA();
        this.f.clear();
        this.o = null;
    }

    @Override // defpackage.ppl, defpackage.ppa
    public final synchronized void rz(atk atkVar) {
        super.rz(atkVar);
        this.o = new Handler(this);
        aeya aeyaVar = this.e;
        x(aeyaVar, aeyaVar.a);
        if (this.r.u()) {
            this.f.add(this.e);
        }
        this.o.obtainMessage(1).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ppl
    public final /* bridge */ /* synthetic */ void t(Object obj, pqb pqbVar, pkt pktVar) {
        aeya aeyaVar = (aeya) obj;
        if (aeyaVar.e == pktVar) {
            return;
        }
        aeyaVar.e = pktVar;
        E();
    }

    @Override // defpackage.pqb
    public final void u(ppy ppyVar) {
        aeya aeyaVar = (aeya) this.j.remove(ppyVar);
        afms.a(aeyaVar);
        afms.a(aeyaVar.c);
        aeyaVar.a.u(aeyaVar.c.a);
        aeyaVar.c = null;
        if (aeyaVar.d) {
            y(aeyaVar);
            this.f.remove(aeyaVar);
        }
    }

    @Override // defpackage.pqb
    public final ppy v(ppz ppzVar, axf axfVar, long j) {
        afms.d(ppzVar.a instanceof aeya);
        aeya aeyaVar = (aeya) ppzVar.a;
        afms.d(aeyaVar.c == null);
        pkt pktVar = aeyaVar.e;
        afms.a(pktVar);
        ppe ppeVar = new ppe(aeyaVar.a.v(ppzVar.b(pktVar.j(0)), axfVar, j), false, 0L, aeyaVar.a());
        this.j.put(ppeVar, aeyaVar);
        aeyaVar.c = ppeVar;
        return ppeVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ppl
    public final /* bridge */ /* synthetic */ int w(Object obj, int i) {
        return ((aeya) obj) == this.e ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ppl
    public final /* bridge */ /* synthetic */ ppz z(Object obj, ppz ppzVar) {
        return ppzVar.b((aeya) obj);
    }
}
