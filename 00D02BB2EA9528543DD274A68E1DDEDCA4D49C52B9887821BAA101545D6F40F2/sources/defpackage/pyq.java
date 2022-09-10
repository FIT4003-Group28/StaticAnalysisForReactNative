package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: pyq  reason: default package */
/* loaded from: classes7.dex */
public final class pyq {
    public final Activity a;
    public final wuw b;
    public final bvjj c;
    public final dxio<afha> d;
    public final vnk e;
    @dzsi
    public qbr f;
    private final jkf g;
    private final pyp h;
    private final btwd i;
    private final tnv j;

    public pyq(Activity activity, wuw wuwVar, bvjj bvjjVar, dxio<afha> dxioVar, btwd btwdVar, tnv tnvVar, vnk vnkVar, jkf jkfVar, pyp pypVar) {
        this.a = activity;
        this.b = wuwVar;
        this.c = bvjjVar;
        this.d = dxioVar;
        this.e = vnkVar;
        this.g = jkfVar;
        this.h = pypVar;
        this.i = btwdVar;
        this.j = tnvVar;
    }

    private final void e(int i) {
        synchronized (this.e) {
            vnu l = this.e.l();
            vwn x = l.d().x(i);
            amub w = x.w(this.a);
            if (w != null && amsr.b(w.d) == amsq.DOCKLESS_BIKESHARING && this.e.g() == dqvj.BICYCLE && w.h == dqvj.BIKESHARING) {
                x = x.z(0, 0);
            }
            this.e.m(l.j(this.a, x));
            if (this.e.l().a() == dqvj.TRANSIT) {
                this.e.U(qbs.TRANSIT_TRIP_DETAILS);
            } else {
                this.e.U(qbs.DEFAULT);
            }
        }
    }

    private final void f(int i, boolean z, @dzsi jjn jjnVar) {
        e(i);
        ((puy) this.h).bU(12, jjnVar, false, true, false);
        if (z) {
            ((puy) this.h).bR(13, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        byyo byyoVar;
        jjn jjnVar = null;
        if (this.e.l().a() == dqvj.TRANSIT) {
            pyp pypVar = this.h;
            ff J = ((fd) pypVar).J();
            if (J != null) {
                puy puyVar = (puy) pypVar;
                bzdk c = puyVar.cd.c();
                amte p = puyVar.aT.l().d().p();
                dbsk.s(p);
                if (!puy.bv(p.b(i, J), c)) {
                    puyVar.bu();
                    qbs t = puyVar.aT.t();
                    dvum dvumVar = dvum.NEVER;
                    qbs qbsVar = qbs.DEFAULT;
                    int ordinal = t.ordinal();
                    if (ordinal == 0) {
                        byyoVar = byyo.DIRECTIONS_LIST;
                    } else if (ordinal == 3) {
                        byyoVar = byyo.EXTERNAL_INVOCATION_INTENT;
                    } else {
                        byyoVar = byyo.EXPLICIT_START;
                    }
                    puyVar.cd.b(p, i, byyoVar);
                    puyVar.cf.b(true);
                    if (this.e.t() == qbs.TRANSIT_TRIP_DETAILS) {
                        jjnVar = jjn.COLLAPSED;
                    }
                    f(i, true, jjnVar);
                    return;
                }
                puyVar.cd.f(bzdd.b);
            }
            jjnVar = this.g.l().L();
            f(i, true, jjnVar);
            return;
        }
        if (this.i.T()) {
            e(i);
        } else {
            f(i, false, null);
        }
        this.h.bx(this.a, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        c(i);
        f(i, true, null);
    }

    public final void c(int i) {
        amve f = d(i).f();
        if (f != null) {
            tnv tnvVar = this.j;
            dqvj c = dqvj.c(f.b().b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            tnvVar.b(c);
        }
    }

    public final dbsg<amve> d(int i) {
        amve m;
        amsy aS = this.e.aS();
        if (aS != null && (m = aS.m(i)) != null) {
            return dbsg.i(m);
        }
        return dbpy.a;
    }
}
