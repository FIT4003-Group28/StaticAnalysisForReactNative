package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: pkl  reason: default package */
/* loaded from: classes4.dex */
public final class pkl extends phi implements pht {
    private boolean A;
    private final ene B;
    private final mwx C;
    protected final pkd[] b;
    public final pig c;
    public final pkk d;
    public final CopyOnWriteArraySet e;
    public final auy f;
    public final phh g;
    public final pkp h;
    public Object i;
    public Surface j;
    public int k;
    public aso l;
    public float m;
    public boolean n;
    public pxt o;
    public pwx p;
    public boolean q;
    public boolean r;
    public phq s;
    private final pvt t;
    private final Context u;
    private final pkj v;
    private int w;
    private int x;
    private int y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: protected */
    public pkl(pki pkiVar) {
        pkl pklVar;
        pvt pvtVar = new pvt();
        this.t = pvtVar;
        try {
            Context applicationContext = pkiVar.a.getApplicationContext();
            this.u = applicationContext;
            auy auyVar = pkiVar.g;
            this.f = auyVar;
            this.p = pkiVar.i;
            this.l = pkiVar.j;
            this.w = 1;
            this.n = false;
            pkj pkjVar = new pkj(this);
            this.v = pkjVar;
            pkk pkkVar = new pkk();
            this.d = pkkVar;
            this.e = new CopyOnWriteArraySet();
            Handler handler = new Handler(pkiVar.h);
            pkd[] ru = pkiVar.b.ru(handler, pkjVar, pkjVar, pkjVar, pkjVar);
            this.b = ru;
            this.m = 1.0f;
            int i = pxi.a;
            this.k = phk.a(applicationContext);
            Collections.emptyList();
            this.z = true;
            pvy pvyVar = new pvy();
            int[] iArr = new int[8];
            iArr[0] = 20;
            iArr[1] = 21;
            iArr[2] = 22;
            iArr[3] = 23;
            try {
                iArr[4] = 24;
                iArr[5] = 25;
                iArr[6] = 26;
                iArr[7] = 27;
                pku.f(iArr, pvyVar);
                pig pigVar = new pig(ru, pkiVar.d, pkiVar.e, pkiVar.f, auyVar, pkiVar.k, pkiVar.n, pkiVar.l, pkiVar.c, pkiVar.h, this, pku.d(pvyVar));
                pklVar = this;
                try {
                    pklVar.c = pigVar;
                    pigVar.u(pkjVar);
                    pigVar.t(pkjVar);
                    pkiVar.a.getApplicationContext();
                    new phd(handler);
                    pklVar.g = new phh(pkiVar.a, handler, pkjVar);
                    phh.d();
                    pkp pkpVar = new pkp(pkiVar.a, handler, pkjVar);
                    pklVar.h = pkpVar;
                    pkpVar.a(pxi.i(pklVar.l.c));
                    ene eneVar = new ene(pkiVar.a);
                    pklVar.B = eneVar;
                    eneVar.a = false;
                    mwx mwxVar = new mwx(pkiVar.a);
                    pklVar.C = mwxVar;
                    mwxVar.a = false;
                    pklVar.s = t(pkpVar);
                    pklVar.C(1, 10, Integer.valueOf(pklVar.k));
                    pklVar.C(2, 10, Integer.valueOf(pklVar.k));
                    pklVar.C(1, 3, pklVar.l);
                    pklVar.C(2, 4, Integer.valueOf(pklVar.w));
                    pklVar.C(2, 5, 0);
                    pklVar.C(1, 9, Boolean.valueOf(pklVar.n));
                    pklVar.C(2, 7, pkkVar);
                    pklVar.C(6, 8, pkkVar);
                    pvtVar.e();
                } catch (Throwable th) {
                    th = th;
                    pklVar.t.e();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                pklVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            pklVar = this;
        }
    }

    public static int p(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    public static phq t(pkp pkpVar) {
        return new phq(pxi.a >= 28 ? pkpVar.c.getStreamMinVolume(pkpVar.e) : 0, pkpVar.c.getStreamMaxVolume(pkpVar.e));
    }

    @Override // defpackage.pjz
    public final void A(pjt pjtVar) {
        M();
        pig pigVar = this.c;
        if (pigVar.u.l.equals(pjtVar)) {
            return;
        }
        pjs d = pigVar.u.d(pjtVar);
        pigVar.m++;
        pigVar.e.a.b(4, pjtVar).b();
        pigVar.C(d, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void B(pjx pjxVar) {
        ptx.a(pjxVar);
        this.e.remove(pjxVar);
        this.c.f.e(pjxVar);
    }

    public final void C(int i, int i2, Object obj) {
        pkd[] pkdVarArr;
        for (pkd pkdVar : this.b) {
            if (pkdVar.R() == i) {
                pkc d = this.c.d(pkdVar);
                d.f(i2);
                d.e(obj);
                d.d();
            }
        }
    }

    @Override // defpackage.pjz
    public final boolean D() {
        M();
        return this.c.D();
    }

    public final void E() {
        C(1, 2, Float.valueOf(this.m * this.g.b));
    }

    @Override // defpackage.pjz
    public final boolean F() {
        M();
        return this.c.F();
    }

    public final void G(final int i) {
        M();
        pig pigVar = this.c;
        if (pigVar.l != i) {
            pigVar.l = i;
            pigVar.e.a.c(11, i, 0).b();
            pigVar.f.c(9, new pwe() { // from class: phy
                @Override // defpackage.pwe
                public final void a(Object obj) {
                    ((pjv) obj).an();
                }
            });
            pigVar.B();
            pigVar.f.b();
        }
    }

    @Override // defpackage.pjz
    public final void H() {
        M();
    }

    @Override // defpackage.pjz
    @Deprecated
    public final void I() {
        M();
        this.g.e(D());
        this.c.J(null);
        Collections.emptyList();
    }

    public final void J(Object obj) {
        pkd[] pkdVarArr;
        ArrayList<pkc> arrayList = new ArrayList();
        boolean z = false;
        for (pkd pkdVar : this.b) {
            if (pkdVar.R() == 2) {
                pkc d = this.c.d(pkdVar);
                d.f(1);
                d.e(obj);
                d.d();
                arrayList.add(d);
            }
        }
        Object obj2 = this.i;
        if (obj2 != null && obj2 != obj) {
            try {
                for (pkc pkcVar : arrayList) {
                    pkcVar.b(2000L);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.i;
            Surface surface = this.j;
            if (obj3 == surface) {
                surface.release();
                this.j = null;
            }
        }
        this.i = obj;
        if (z) {
            this.c.J(phr.b(new pir(3), 1003));
        }
    }

    public final void K(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        pig pigVar = this.c;
        pjs pjsVar = pigVar.u;
        if (pjsVar.j == z2 && pjsVar.k == i3) {
            return;
        }
        pigVar.m++;
        pjs b = pjsVar.b(z2, i3);
        pwa pwaVar = pigVar.e.a;
        int i4 = z2 ? 1 : 0;
        int i5 = z2 ? 1 : 0;
        pwaVar.c(1, i4, i3).b();
        pigVar.C(b, 0, i2, false, false, 5, -9223372036854775807L, -1);
    }

    public final void L() {
        int m = m();
        if (m == 2 || m == 3) {
            M();
            boolean z = this.c.u.n;
            D();
            D();
        }
    }

    public final void M() {
        this.t.b();
        if (Thread.currentThread() != r().getThread()) {
            String z = pxi.z("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), r().getThread().getName());
            if (this.z) {
                throw new IllegalStateException(z);
            }
            pns.f("SimpleExoPlayer", z, this.A ? null : new IllegalStateException());
            this.A = true;
        }
    }

    @Deprecated
    public final void N() {
        this.z = false;
    }

    @Override // defpackage.pht
    public final Looper c() {
        return this.c.e.b;
    }

    @Override // defpackage.pht
    public final pkc d(pkb pkbVar) {
        M();
        return this.c.d(pkbVar);
    }

    @Override // defpackage.pht
    public final void e(boolean z) {
        M();
        this.c.e.a.c(24, z ? 1 : 0, 0).b();
    }

    @Override // defpackage.pht
    public final void f(pqb pqbVar) {
        M();
        this.c.y(Collections.singletonList(pqbVar), -1, -9223372036854775807L, true);
    }

    @Override // defpackage.pht
    public final void h(boolean z) {
        M();
        pig pigVar = this.c;
        if (pigVar.r == z) {
            return;
        }
        pigVar.r = z;
        pigVar.e.a.c(23, z ? 1 : 0, 0).b();
    }

    @Override // defpackage.pht
    public final void i(pkh pkhVar) {
        M();
        pig pigVar = this.c;
        if (pkhVar == null) {
            pkhVar = pkh.c;
        }
        if (!pigVar.q.equals(pkhVar)) {
            pigVar.q = pkhVar;
            pigVar.e.a.b(5, pkhVar).b();
        }
    }

    @Override // defpackage.pjz
    public final int j() {
        M();
        pig pigVar = this.c;
        if (pigVar.F()) {
            return pigVar.u.s.b;
        }
        return -1;
    }

    @Override // defpackage.pjz
    public final int k() {
        M();
        pig pigVar = this.c;
        if (pigVar.F()) {
            return pigVar.u.s.c;
        }
        return -1;
    }

    @Override // defpackage.pjz
    public final int l() {
        M();
        return this.c.l();
    }

    @Override // defpackage.pjz
    public final int m() {
        M();
        return this.c.m();
    }

    @Override // defpackage.pjz
    public final int n() {
        M();
        return this.c.n();
    }

    @Override // defpackage.pjz
    public final int o() {
        M();
        return this.c.l;
    }

    @Override // defpackage.pjz
    public final long q() {
        M();
        return this.c.q();
    }

    public final Looper r() {
        return this.c.j;
    }

    @Override // defpackage.pjz
    public final pkt s() {
        M();
        return this.c.s();
    }

    public final void u(pjx pjxVar) {
        ptx.a(pjxVar);
        this.e.add(pjxVar);
        ptx.a(pjxVar);
        this.c.u(pjxVar);
    }

    @Override // defpackage.pjz
    public final void v() {
        M();
        boolean D = D();
        int e = this.g.e(D);
        K(D, e, p(D, e));
        pig pigVar = this.c;
        pjs pjsVar = pigVar.u;
        if (pjsVar.d != 1) {
            return;
        }
        pjs c = pjsVar.c(null);
        pjs e2 = c.e(true != c.a.z() ? 2 : 4);
        pigVar.m++;
        pigVar.e.a.a(0).b();
        pigVar.C(e2, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // defpackage.pjz
    public final void w() {
        M();
        int i = pxi.a;
        pkp pkpVar = this.h;
        pko pkoVar = pkpVar.d;
        if (pkoVar != null) {
            try {
                pkpVar.a.unregisterReceiver(pkoVar);
            } catch (RuntimeException e) {
                pns.f("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            pkpVar.d = null;
        }
        phh phhVar = this.g;
        phhVar.a = null;
        phhVar.a();
        pig pigVar = this.c;
        String hexString = Integer.toHexString(System.identityHashCode(pigVar));
        String str = pxi.e;
        String a = piq.a();
        String.valueOf(hexString).length();
        String.valueOf(str).length();
        String.valueOf(a).length();
        if (!pigVar.e.e()) {
            pigVar.f.f(11, auq.a);
        }
        pigVar.f.d();
        ((pxe) pigVar.d).b.removeCallbacksAndMessages(null);
        auy auyVar = pigVar.i;
        if (auyVar != null) {
            ((axh) pigVar.k).h.c(auyVar);
        }
        pigVar.u = pigVar.u.e(1);
        pjs pjsVar = pigVar.u;
        pigVar.u = pjsVar.h(pjsVar.s);
        pjs pjsVar2 = pigVar.u;
        pjsVar2.o = pjsVar2.q;
        pigVar.u.p = 0L;
        final auy auyVar2 = this.f;
        auz a2 = auyVar2.a();
        auyVar2.c.put(1036, a2);
        auyVar2.H(a2, 1036, new auq(6));
        pwa pwaVar = auyVar2.f;
        ptx.b(pwaVar);
        pwaVar.e(new Runnable() { // from class: auw
            @Override // java.lang.Runnable
            public final void run() {
                auy.this.d.d();
            }
        });
        Surface surface = this.j;
        if (surface != null) {
            surface.release();
            this.j = null;
        }
        if (this.q) {
            pwx pwxVar = this.p;
            ptx.a(pwxVar);
            pwxVar.c(0);
            this.q = false;
        }
        Collections.emptyList();
        this.r = true;
    }

    @Override // defpackage.pjz
    public final void x(int i, long j) {
        M();
        auy auyVar = this.f;
        if (!auyVar.g) {
            auz a = auyVar.a();
            auyVar.g = true;
            auyVar.H(a, -1, new aut(a, 1));
        }
        this.c.x(i, j);
    }

    public final void y(int i, int i2) {
        if (i == this.x && i2 == this.y) {
            return;
        }
        this.x = i;
        this.y = i2;
        this.f.ap();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((pjx) it.next()).ap();
        }
    }

    @Override // defpackage.pjz
    public final void z(boolean z) {
        M();
        phh phhVar = this.g;
        m();
        int e = phhVar.e(z);
        K(z, e, p(z, e));
    }
}
