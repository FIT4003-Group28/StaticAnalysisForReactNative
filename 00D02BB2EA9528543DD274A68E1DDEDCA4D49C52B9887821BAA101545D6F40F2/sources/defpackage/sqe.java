package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: sqe  reason: default package */
/* loaded from: classes7.dex */
public class sqe implements sne {
    public final dxio<qbt> a;
    public final dxio<ascb> b;
    public final Runnable c;
    private final Activity d;
    private final cqat e;
    private final String f;
    private final String g;
    private final boolean h;
    @dzsi
    private final amvh i;
    private final cjtd j;
    private final cjtd k;
    private final cjtd l;
    private final CharSequence m;
    private final CharSequence n;
    private final String o;
    private final long p;
    private final dpej q;
    private final sps r;

    public sqe(Activity activity, cqat cqatVar, dxio<qbt> dxioVar, dxio<ascb> dxioVar2, vtn vtnVar, int i, @dzsi sph sphVar, @dzsi dnui dnuiVar, sps spsVar, Runnable runnable) {
        amvh M;
        this.d = activity;
        this.e = cqatVar;
        this.a = dxioVar;
        this.b = dxioVar2;
        this.r = spsVar;
        this.c = runnable;
        if (spsVar == sps.TRIP_LOADING) {
            this.f = "";
            this.i = null;
            this.g = "";
            this.h = false;
            this.j = cjtd.b;
            this.k = cjtd.b;
            this.l = cjtd.b;
            this.m = "";
            this.n = "";
            this.o = "";
            this.p = 0L;
            this.q = dpej.DELAY_NODATA;
            return;
        }
        dbsk.s(sphVar);
        this.f = sphVar.a().a();
        String b = sphVar.b();
        cjta b2 = cjtd.b();
        b2.d = dtyb.ag;
        b2.g(b);
        b2.i(i);
        this.j = b2.a();
        cjta b3 = cjtd.b();
        b3.d = dtyb.af;
        b3.g(b);
        b3.i(i);
        this.k = b3.a();
        cjta b4 = cjtd.b();
        b4.d = dtyb.ah;
        b4.g(b);
        b4.i(i);
        this.l = b4.a();
        if (spsVar == sps.DIRECTIONS_COMPLETELY_LOADED) {
            cjta b5 = cjtd.b();
            b5.d = dtyb.ai;
            b5.g(b);
            b5.i(i);
            b5.a();
        }
        this.h = spsVar == sps.DIRECTIONS_ERROR || spsVar == sps.DIRECTIONS_LOCATION_DISABLED;
        if (dnuiVar == null) {
            M = sphVar.a().b().b();
        } else {
            dpjx dpjxVar = dnuiVar.d;
            M = amvh.M(dpjxVar == null ? dpjx.n : dpjxVar, activity);
        }
        this.i = M;
        String a = spt.a(activity, sphVar, M);
        this.g = a;
        this.m = activity.getString(R.string.ROUTE_START_NAV_CONTENT_DESCRIPTION, new Object[]{a});
        if (spsVar == sps.DIRECTIONS_COMPLETELY_LOADED) {
            dbsk.s(dnuiVar);
            int e = cqrp.d(14.0d).e(activity);
            alcb a2 = alcc.a();
            a2.a = activity;
            a2.b = vtnVar;
            a2.d = e;
            alcc a3 = a2.a();
            dnuh dnuhVar = dnuiVar.e;
            dpej b6 = dpej.b((dnuhVar == null ? dnuh.f : dnuhVar).d);
            this.q = b6 == null ? dpej.DELAY_NODATA : b6;
            dnuh dnuhVar2 = dnuiVar.e;
            dozz dozzVar = (dnuhVar2 == null ? dnuh.f : dnuhVar2).e;
            this.n = a3.b((dozzVar == null ? dozz.y : dozzVar).m);
            Object[] objArr = new Object[1];
            dnuh dnuhVar3 = dnuiVar.e;
            objArr[0] = (dnuhVar3 == null ? dnuh.f : dnuhVar3).b;
            this.o = activity.getString(R.string.VIA_ROADS, objArr);
            dnuh dnuhVar4 = dnuiVar.e;
            dgas dgasVar = (dnuhVar4 == null ? dnuh.f : dnuhVar4).c;
            this.p = (dgasVar == null ? dgas.e : dgasVar).b;
            return;
        }
        this.n = "";
        this.o = "";
        this.p = 0L;
        this.q = dpej.DELAY_NODATA;
    }

    @Override // defpackage.sne
    public CharSequence b() {
        return this.n;
    }

    @Override // defpackage.sne
    public cjtd c() {
        return this.l;
    }

    @Override // defpackage.sne
    public CharSequence d() {
        return this.m;
    }

    @Override // defpackage.sne
    public Boolean e() {
        return Boolean.valueOf(this.r != sps.DIRECTIONS_LOCATION_DISABLED);
    }

    @Override // defpackage.sne
    public View.OnClickListener f() {
        return this.i == null ? sqc.a : new View.OnClickListener(this) { // from class: sqd
            private final sqe a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sqe sqeVar = this.a;
                sqeVar.c.run();
                qcw s = sqeVar.s();
                s.k(qbs.NAVIGATION);
                s.f(true);
                sqeVar.b.a().d(s.a(), asca.GO_TAB);
            }
        };
    }

    @Override // defpackage.sne
    public Boolean g() {
        return Boolean.valueOf(this.r.g);
    }

    @Override // defpackage.snf
    public CharSequence h() {
        return this.g;
    }

    public int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.snf
    public CharSequence i() {
        if (this.p == 0) {
            return "";
        }
        bvsv a = new bvsx(this.d.getResources()).a(bvtb.i(this.d, TimeUnit.MILLISECONDS.toSeconds(this.e.b()) + this.p));
        if (this.q != dpej.DELAY_NODATA) {
            a.m(vyb.Y(this.q, iva.a().booleanValue()));
        }
        return a.c();
    }

    @Override // defpackage.snf
    public cjtd j() {
        return this.j;
    }

    @Override // defpackage.snf
    public cjtd k() {
        return this.k;
    }

    @Override // defpackage.snf
    public Boolean l() {
        throw null;
    }

    @Override // defpackage.snf
    @dzsi
    public cqtd m() {
        return cqrt.f(alca.b(doza.INFORMATION));
    }

    @Override // defpackage.snf
    @dzsi
    public CharSequence n() {
        if (this.r != sps.DIRECTIONS_LOCATION_DISABLED) {
            return this.d.getText(R.string.SAVED_DATA_OFFLINE_TEXT);
        }
        return null;
    }

    @Override // defpackage.snf
    public CharSequence o() {
        return this.d.getText(R.string.SAVED_DRIVING_DATA_ERROR_TEXT);
    }

    @Override // defpackage.snf
    public View.OnClickListener p() {
        return this.i == null ? sqa.a : new View.OnClickListener(this) { // from class: sqb
            private final sqe a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sqe sqeVar = this.a;
                sqeVar.c.run();
                sqeVar.a.a().m(sqeVar.s().a());
            }
        };
    }

    @Override // defpackage.snf
    public Boolean q() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.sne
    /* renamed from: r */
    public String a() {
        return this.o;
    }

    public final qcw s() {
        qcw x = qcx.x();
        x.s(dqvj.DRIVE);
        amvh amvhVar = null;
        x.r(this.r == sps.DIRECTIONS_LOCATION_DISABLED ? null : amvh.i(this.d));
        amvh amvhVar2 = this.i;
        if (amvhVar2 != null) {
            amvhVar = amvh.M(amvhVar2.I(), this.d);
        }
        x.u(amvhVar);
        return x;
    }
}
