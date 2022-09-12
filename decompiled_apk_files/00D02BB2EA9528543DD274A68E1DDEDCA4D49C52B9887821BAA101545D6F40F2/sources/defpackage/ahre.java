package defpackage;

import android.content.Context;
import android.view.WindowManager;
import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
import com.google.android.apps.gmm.location.events.CarHeadingEvent;
import com.google.android.gms.location.LocationServices;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahre  reason: default package */
/* loaded from: classes.dex */
public final class ahre implements ahkg {
    public final btrm a;
    public final ahkl f;
    final ahrc h;
    private ahkl l;
    private final ahkl m;
    private final ahkl n;
    private final Map<Object, ahkf> i = new HashMap();
    private final Map<ahkf, Set<Object>> j = dcjz.k(ahkf.class);
    private boolean k = false;
    public boolean b = false;
    public boolean c = false;
    public dqvj d = dqvj.WALK;
    public boolean e = false;
    final ahrb g = new ahrb(this);

    public ahre(Context context, cqat cqatVar, bvrb bvrbVar, ahjq ahjqVar, btrm btrmVar, duwy duwyVar, dehq dehqVar, Executor executor) {
        ahrl ahrlVar = new ahrl(new ahrd(ahjqVar), cqatVar, bvrbVar, duwyVar);
        if (ahrlVar.i != context) {
            ahrlVar.i = context;
            ahrlVar.j = null;
            ahrlVar.R = (WindowManager) context.getSystemService("window");
            ahrlVar.W = btsj.f(context, 15300000);
            if (ahrlVar.o()) {
                ahrlVar.V = LocationServices.getFusedLocationProviderClient(context);
            } else {
                ahrlVar.V = null;
            }
        }
        this.a = btrmVar;
        this.f = ahrlVar;
        this.m = new ahqw();
        this.n = new ahqz(btrmVar, dehqVar, executor, cqatVar);
        e();
        ahrc ahrcVar = new ahrc(this);
        this.h = ahrcVar;
        dceq a = dcet.a();
        a.b(crhp.class, new ahrf(0, crhp.class, ahrcVar));
        a.b(GmmCarProjectionStateEvent.class, new ahrf(1, GmmCarProjectionStateEvent.class, ahrcVar));
        a.b(crmj.class, new ahrf(2, crmj.class, ahrcVar));
        a.b(crhb.class, new ahrf(3, crhb.class, ahrcVar));
        a.b(CarHeadingEvent.class, new ahrf(4, CarHeadingEvent.class, ahrcVar));
        a.b(ahla.class, new ahrf(5, ahla.class, ahrcVar));
        btrmVar.g(ahrcVar, a.a());
    }

    private final Set<Object> h(ahkf ahkfVar) {
        Set<Object> set = this.j.get(ahkfVar);
        if (set == null) {
            HashSet c = dcnm.c();
            this.j.put(ahkfVar, c);
            return c;
        }
        return set;
    }

    @Override // defpackage.ahkg
    public final synchronized void a(btrr btrrVar, ahkf ahkfVar) {
        if (ahkfVar == ahkf.FAST && anac.f) {
            ahkfVar = ahkf.SLOW;
        }
        btrrVar.a(this.a);
        f(btrrVar);
        h(ahkfVar).add(btrrVar);
        this.i.put(btrrVar, ahkfVar);
        ahkf g = g();
        dbsk.s(g);
        if (!this.k) {
            this.l.b();
            this.k = true;
        }
        this.l.d(g.c);
    }

    @Override // defpackage.ahkg
    public final synchronized void b(btrr btrrVar) {
        btrrVar.b(this.a);
        if (!this.k) {
            return;
        }
        f(btrrVar);
        ahkf g = g();
        if (g == null) {
            this.l.c();
            this.k = false;
            return;
        }
        this.l.d(g.c);
    }

    @Override // defpackage.ahkg
    public final synchronized boolean c() {
        return this.l.g();
    }

    @Override // defpackage.ahkg
    public final synchronized float d() {
        return this.l.a();
    }

    final void f(Object obj) {
        ahkf remove = this.i.remove(obj);
        if (remove != null) {
            h(remove).remove(obj);
        }
    }

    @dzsi
    final ahkf g() {
        if (!h(ahkf.FAST).isEmpty()) {
            return ahkf.FAST;
        }
        if (h(ahkf.SLOW).isEmpty()) {
            return null;
        }
        return ahkf.SLOW;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.b     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L6
            goto L13
        L6:
            dqvj r0 = r3.d     // Catch: java.lang.Throwable -> L5f
            dqvj r1 = defpackage.dqvj.DRIVE     // Catch: java.lang.Throwable -> L5f
            if (r0 == r1) goto L28
            dqvj r0 = r3.d     // Catch: java.lang.Throwable -> L5f
            dqvj r1 = defpackage.dqvj.TWO_WHEELER     // Catch: java.lang.Throwable -> L5f
            if (r0 != r1) goto L13
            goto L28
        L13:
            boolean r0 = r3.c     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L18
            goto L28
        L18:
            boolean r0 = r3.e     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L22
            ahkl r0 = r3.n     // Catch: java.lang.Throwable -> L5f
            defpackage.dbsk.s(r0)     // Catch: java.lang.Throwable -> L5f
            goto L2d
        L22:
            ahkl r0 = r3.f     // Catch: java.lang.Throwable -> L5f
            defpackage.dbsk.s(r0)     // Catch: java.lang.Throwable -> L5f
            goto L2d
        L28:
            ahkl r0 = r3.m     // Catch: java.lang.Throwable -> L5f
            defpackage.dbsk.s(r0)     // Catch: java.lang.Throwable -> L5f
        L2d:
            ahkl r1 = r3.l     // Catch: java.lang.Throwable -> L5f
            if (r0 == r1) goto L5d
            if (r1 == 0) goto L41
            boolean r2 = r3.k     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L3a
            r1.c()     // Catch: java.lang.Throwable -> L5f
        L3a:
            ahkl r1 = r3.l     // Catch: java.lang.Throwable -> L5f
            ahrb r2 = r3.g     // Catch: java.lang.Throwable -> L5f
            r1.f(r2)     // Catch: java.lang.Throwable -> L5f
        L41:
            ahrb r1 = r3.g     // Catch: java.lang.Throwable -> L5f
            r0.e(r1)     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r3.k     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L59
            ahkf r1 = r3.g()     // Catch: java.lang.Throwable -> L5f
            defpackage.dbsk.s(r1)     // Catch: java.lang.Throwable -> L5f
            r0.b()     // Catch: java.lang.Throwable -> L5f
            ahkj r1 = r1.c     // Catch: java.lang.Throwable -> L5f
            r0.d(r1)     // Catch: java.lang.Throwable -> L5f
        L59:
            r3.l = r0     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r3)
            return
        L5d:
            monitor-exit(r3)
            return
        L5f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahre.e():void");
    }
}
