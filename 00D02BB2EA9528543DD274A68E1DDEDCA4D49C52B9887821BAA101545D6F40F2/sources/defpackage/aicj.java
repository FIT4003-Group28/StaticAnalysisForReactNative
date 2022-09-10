package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aicj  reason: default package */
/* loaded from: classes2.dex */
final class aicj extends aica implements bzgf {
    private final Context b;
    private final cqat c;
    private final ahjq d;
    private final byyp e;
    private final Executor f;
    private final btvo g;
    private final bvjj h;
    private final bzgj i;
    @dzsi
    private bzdk j;
    private Long k;

    static {
        TimeUnit.SECONDS.toMillis(20L);
    }

    public aicj(Context context, cqat cqatVar, ahjq ahjqVar, aiby aibyVar, byyp byypVar, Executor executor, btvo btvoVar, bvjj bvjjVar) {
        super(cqatVar, aibyVar);
        this.i = new bzgj();
        this.k = 0L;
        this.b = context;
        this.c = cqatVar;
        this.d = ahjqVar;
        this.e = byypVar;
        this.f = executor;
        this.g = btvoVar;
        this.h = bvjjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean l(defpackage.bzdk r5) {
        /*
            r4 = this;
            boolean r5 = n(r5)
            r0 = 1
            if (r5 == 0) goto L35
            com.google.android.apps.gmm.map.model.location.GmmLocation r5 = r4.f()
            monitor-enter(r4)
            bvjj r1 = r4.h     // Catch: java.lang.Throwable -> L32
            bvjk r2 = defpackage.bvjk.dn     // Catch: java.lang.Throwable -> L32
            r3 = 0
            boolean r1 = r1.m(r2, r3)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L19
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            goto L31
        L19:
            bzdk r1 = r4.j     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L2c
            boolean r1 = r1.p()     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            boolean r5 = b(r5)     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L2a
            goto L2c
        L2a:
            r5 = 0
            goto L2d
        L2c:
            r5 = 1
        L2d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L31
            goto L35
        L31:
            return r3
        L32:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            throw r5
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aicj.l(bzdk):boolean");
    }

    private final long m(bzdk bzdkVar) {
        long longValue;
        synchronized (this) {
            if (bzdkVar.g() instanceof bzcz) {
                this.k = Long.valueOf((long) ((bzcz) bzdkVar.g()).i());
            } else if (bzdkVar.g() instanceof bzdf) {
                this.k = Long.valueOf((long) ((bzdf) bzdkVar.g()).g());
            }
            longValue = this.k.longValue();
        }
        return longValue;
    }

    private static boolean n(bzdk bzdkVar) {
        return (bzdkVar.g() instanceof bzcz) || (bzdkVar.g() instanceof bzdf);
    }

    @Override // defpackage.bzgf
    public final synchronized void a() {
        bzdk c = this.e.c();
        if (c.o().e == bzdc.ARRIVED) {
            this.j = null;
            k(true);
        } else if (c.h() == bzdj.STOPPED) {
            this.j = null;
            k(false);
        } else {
            this.j = c;
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aica
    public final synchronized void d() {
        this.e.d(this, this.i, this.f);
        this.j = this.e.c();
        j();
    }

    @Override // defpackage.aica
    protected final synchronized void e() {
        this.i.b();
    }

    @Override // defpackage.aica
    @dzsi
    public final GmmLocation f() {
        return this.d.a();
    }

    @Override // defpackage.aica
    protected final dkod g() {
        dkod dkodVar = this.g.getLocationSharingParameters().E;
        return dkodVar == null ? dkod.c : dkodVar;
    }

    @Override // defpackage.aica
    @dzsi
    protected final doek h() {
        bzdk bzdkVar;
        doej bZ = doek.f.bZ();
        synchronized (this) {
            bzdkVar = this.j;
        }
        if (bzdkVar != null && bzdkVar.h() == bzdj.STARTED) {
            amub l = bzdkVar.l(this.b);
            dqvj c = bzdkVar.g().b().c();
            Integer num = null;
            if (c == dqvj.TRANSIT) {
                if (!n(bzdkVar)) {
                    if (bzdkVar.g() instanceof bzdl) {
                        c = dqvj.WALK;
                    }
                } else if ((bzdkVar.g().b().d().a & 128) != 0) {
                    num = Integer.valueOf(bzdkVar.g().b().d().h);
                }
            }
            dqvj dqvjVar = c;
            if (l != null) {
                l(bzdkVar);
                m(bzdkVar);
                boolean l2 = l(bzdkVar);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                doek doekVar = (doek) bZ.b;
                doekVar.a |= 4;
                doekVar.d = l2;
                doqt f = aibf.f(l, dqvjVar, num, Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(bzdkVar.d().a - this.c.b())), m(bzdkVar), !bzdkVar.p(), dpej.DELAY_NODATA);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                doek doekVar2 = (doek) bZ.b;
                f.getClass();
                doekVar2.c = f;
                doekVar2.a |= 2;
            }
        }
        return bZ.bK();
    }

    public final synchronized String toString() {
        dbsb b;
        b = dbsc.b(this);
        b.b("lastKnownTripState", this.j);
        b.b("derived: journeyInternal", h());
        b.b("derived: journey", i());
        b.b("derived: location", f());
        return b.toString();
    }
}
