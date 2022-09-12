package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aosv  reason: default package */
/* loaded from: classes2.dex */
public final class aosv {
    public static final long a = TimeUnit.DAYS.toMillis(1);
    static final drqz b;
    static final drqz c;
    static final drqz d;
    static final dign e;
    public final z<Boolean> f;
    public final z<digr> g;
    public final v<NetworkInfo> h;
    public final anqr i;
    public final Executor j;
    public final btrm k;
    public final Activity l;
    public final cqat m;
    public final fd n;
    public final SharedPreferences o;
    public final aosu p;
    public final AtomicBoolean q;
    public final AtomicBoolean r;
    public final AtomicReference<digr> s;
    public final AtomicReference<digr> t;
    public boolean u;
    public boolean v;
    private final Executor w;
    private final anhk x;
    private final burp y;

    static {
        drpt bZ = drqz.e.bZ();
        drpx bZ2 = drqy.c.bZ();
        drqi bZ3 = drqt.c.bZ();
        drqm drqmVar = drqm.a;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drqt drqtVar = (drqt) bZ3.b;
        drqmVar.getClass();
        drqtVar.b = drqmVar;
        drqtVar.a = 3;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drqy drqyVar = (drqy) bZ2.b;
        drqt bK = bZ3.bK();
        bK.getClass();
        drqyVar.b = bK;
        drqyVar.a = 5;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drqz drqzVar = (drqz) bZ.b;
        drqy bK2 = bZ2.bK();
        bK2.getClass();
        drqzVar.b = bK2;
        drqzVar.a |= 1;
        b = bZ.bK();
        drpt bZ4 = drqz.e.bZ();
        drpx bZ5 = drqy.c.bZ();
        drqi bZ6 = drqt.c.bZ();
        drqk drqkVar = drqk.a;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drqt drqtVar2 = (drqt) bZ6.b;
        drqkVar.getClass();
        drqtVar2.b = drqkVar;
        drqtVar2.a = 2;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drqy drqyVar2 = (drqy) bZ5.b;
        drqt bK3 = bZ6.bK();
        bK3.getClass();
        drqyVar2.b = bK3;
        drqyVar2.a = 5;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drqz drqzVar2 = (drqz) bZ4.b;
        drqy bK4 = bZ5.bK();
        bK4.getClass();
        drqzVar2.b = bK4;
        drqzVar2.a |= 1;
        c = bZ4.bK();
        drpt bZ7 = drqz.e.bZ();
        drpx bZ8 = drqy.c.bZ();
        drqi bZ9 = drqt.c.bZ();
        drqq drqqVar = drqq.a;
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        drqt drqtVar3 = (drqt) bZ9.b;
        drqqVar.getClass();
        drqtVar3.b = drqqVar;
        drqtVar3.a = 1;
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        drqy drqyVar3 = (drqy) bZ8.b;
        drqt bK5 = bZ9.bK();
        bK5.getClass();
        drqyVar3.b = bK5;
        drqyVar3.a = 5;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        drqz drqzVar3 = (drqz) bZ7.b;
        drqy bK6 = bZ8.bK();
        bK6.getClass();
        drqzVar3.b = bK6;
        drqzVar3.a |= 1;
        d = bZ7.bK();
        digj bZ10 = dign.g.bZ();
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dign dignVar = (dign) bZ10.b;
        dignVar.a |= 16;
        dignVar.d = 40;
        dign dignVar2 = (dign) bZ10.b;
        dignVar2.a |= 8;
        dignVar2.c = 20;
        dign dignVar3 = (dign) bZ10.b;
        dignVar3.b = 1;
        dignVar3.a |= 4;
        e = bZ10.bK();
    }

    public aosv(anqr anqrVar, Executor executor, Executor executor2, btpc btpcVar, fd fdVar, btrm btrmVar, anhk anhkVar, burp burpVar, Activity activity, cqat cqatVar, bvju bvjuVar, aa aaVar, aa aaVar2) {
        z<Boolean> zVar = new z<>();
        this.f = zVar;
        z<digr> zVar2 = new z<>();
        this.g = zVar2;
        aosu aosuVar = new aosu(this);
        this.p = aosuVar;
        this.q = new AtomicBoolean(true);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.r = atomicBoolean;
        this.s = new AtomicReference<>(digr.d);
        this.t = new AtomicReference<>(digr.d);
        this.u = false;
        this.v = false;
        this.i = anqrVar;
        this.j = executor;
        this.w = executor2;
        this.k = btrmVar;
        this.h = btpcVar.c;
        this.x = anhkVar;
        this.y = burpVar;
        this.l = activity;
        this.m = cqatVar;
        this.n = fdVar;
        atomicBoolean.set(btpcVar.i());
        this.o = bvjuVar.a("timelineEntrypoints");
        zVar.b(fdVar, aaVar);
        zVar2.b(fdVar, aaVar2);
        dceq a2 = dcet.a();
        a2.b(anhj.class, new aosx(anhj.class, aosuVar, bvrj.UI_THREAD));
        btrmVar.g(aosuVar, a2.a());
    }

    public final void a() {
        this.g.f(null);
        aost aostVar = new aost(this);
        int e2 = bade.a.e(this.l);
        int e3 = badj.a.f().e(this.l);
        burp burpVar = this.y;
        dign dignVar = e;
        dsqp dsqpVar = (dsqp) dignVar.cu(5);
        dsqpVar.bC(dignVar);
        digj digjVar = (digj) dsqpVar;
        dnwb a2 = this.x.a();
        if (digjVar.c) {
            digjVar.bF();
            digjVar.c = false;
        }
        dign dignVar2 = (dign) digjVar.b;
        dign dignVar3 = dign.g;
        a2.getClass();
        dignVar2.e = a2;
        dignVar2.a |= 32;
        digk bZ = digl.c.bZ();
        dggh bZ2 = dggi.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dggi dggiVar = (dggi) bZ2.b;
        int i = dggiVar.a | 2;
        dggiVar.a = i;
        dggiVar.c = e3;
        dggiVar.a = i | 1;
        dggiVar.b = e2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        digl diglVar = (digl) bZ.b;
        dggi bK = bZ2.bK();
        bK.getClass();
        diglVar.b = bK;
        diglVar.a |= 1;
        if (digjVar.c) {
            digjVar.bF();
            digjVar.c = false;
        }
        dign dignVar4 = (dign) digjVar.b;
        digl bK2 = bZ.bK();
        bK2.getClass();
        dignVar4.f = bK2;
        dignVar4.a |= 64;
        burpVar.b(digjVar.bK(), aostVar, this.w);
    }
}
