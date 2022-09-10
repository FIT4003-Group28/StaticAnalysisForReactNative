package defpackage;

import android.app.AlarmManager;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bzaf  reason: default package */
/* loaded from: classes4.dex */
public final class bzaf {
    public final bzem b;
    public final dehq c;
    public final byzi d;
    public final Service e;
    public final bzgj f = new bzgj();
    @dzsi
    public bzgb g;
    public boolean h;
    @dzsi
    public bzae i;
    private final byzr m;
    private final auhi n;
    private final bzai o;
    private final cqat p;
    @dzsi
    private byzy q;
    private byzg r;
    private boolean s;
    private static final int j = dpyv.TRANSIT_GUIDANCE.dm;
    private static final long k = TimeUnit.MINUTES.toMillis(1);
    public static final eaow a = eaow.d(30);
    private static final long l = TimeUnit.MINUTES.toMillis(5);

    public bzaf(bzem bzemVar, Service service, dehq dehqVar, auhi auhiVar, byzr byzrVar, byzi byziVar, bzai bzaiVar, cqat cqatVar) {
        this.b = bzemVar;
        this.d = byziVar;
        this.e = service;
        this.c = dehqVar;
        this.n = auhiVar;
        this.m = byzrVar;
        this.o = bzaiVar;
        this.p = cqatVar;
    }

    private static boolean e(@dzsi byzg byzgVar, @dzsi byzg byzgVar2) {
        if (byzgVar2 == byzg.RIDE) {
            return byzgVar == byzg.RIDE || byzgVar == byzg.GET_OFF;
        } else if (byzgVar != null) {
            return byzgVar.equals(byzgVar2);
        } else {
            return byzgVar2 == null;
        }
    }

    private final void f(byzy byzyVar) {
        bzel.a();
        boolean z = this.q == null || ((byzyVar.f().equals(this.r) ^ true) && byzyVar.k() && byzyVar.l());
        byzy byzyVar2 = this.q;
        boolean z2 = byzyVar2 == null || !byzyVar2.f().equals(byzyVar.f());
        bzai bzaiVar = this.o;
        boolean z3 = this.s;
        bvrj.a();
        RemoteViews b = bzaiVar.b(byzyVar, false);
        auhj auhjVar = bzaiVar.d;
        int i = bzai.b;
        ddcu ddcuVar = byzyVar.f().h;
        if (ddcuVar != null) {
            augc b2 = auhjVar.b(i, new auyt(ddcuVar));
            b2.f = byzyVar.b().toString();
            b2.g = byzyVar.c().toString();
            ddzs bZ = ddzu.g.bZ();
            int p = byzyVar.p();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddzu ddzuVar = (ddzu) bZ.b;
            ddzuVar.a |= 1;
            ddzuVar.b = p;
            int o = byzyVar.o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddzu ddzuVar2 = (ddzu) bZ.b;
            ddzuVar2.a |= 2;
            ddzuVar2.c = o;
            int i2 = byzyVar.f().i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddzu ddzuVar3 = (ddzu) bZ.b;
            int i3 = i2 - 1;
            if (i2 != 0) {
                ddzuVar3.d = i3;
                ddzuVar3.a |= 4;
                boolean l2 = byzyVar.l();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddzu ddzuVar4 = (ddzu) bZ.b;
                ddzuVar4.a |= 16;
                ddzuVar4.f = l2;
                if (byzyVar.g() != dgsn.VEHICLE_TYPE_ANY) {
                    dgsn g = byzyVar.g();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddzu ddzuVar5 = (ddzu) bZ.b;
                    ddzuVar5.e = g.v;
                    ddzuVar5.a |= 8;
                }
                ddzf bZ2 = ddzg.t.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddzg ddzgVar = (ddzg) bZ2.b;
                ddzu bK = bZ.bK();
                bK.getClass();
                ddzgVar.j = bK;
                ddzgVar.a |= 1073741824;
                b2.J = bZ2.bK();
                b2.v = 2;
                b2.w(byzyVar.e());
                b2.H(true != z ? 0 : -1);
                b2.y(1);
                b2.e();
                b2.r(!z3);
                b2.s(!z);
                b2.O = !z2;
                b2.E(byzyVar.h().a(), auhw.SERVICE);
                b2.D(akm.c(bzaiVar.c, R.color.quantum_googblue));
                b2.C = bzai.a;
                b2.k(b, bzaiVar.a(byzyVar, b, false));
                if (byzyVar.m()) {
                    RemoteViews b3 = bzaiVar.b(byzyVar, true);
                    b2.i(b3, bzaiVar.a(byzyVar, b3, true));
                }
                if (z3) {
                    Service service = bzaiVar.c;
                    b2.m(new Intent(bzce.a, Uri.EMPTY, service, service.getClass()), auhw.SERVICE);
                    b2.C(true);
                }
                augj a2 = b2.a();
                if (this.s) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        this.e.stopForeground(2);
                    } else {
                        this.e.stopForeground(false);
                    }
                    if (byzyVar.f().equals(byzg.ARRIVE) && byzyVar.l()) {
                        ((AlarmManager) this.e.getSystemService("alarm")).set(3, this.p.e() + l, bzcf.d(this.e));
                    }
                }
                auhk j2 = this.n.j(a2);
                auhh auhhVar = j2.b;
                if (auhhVar == auhh.SUPPRESSED || auhhVar == auhh.SUPPRESSED_FOR_OPTOUT) {
                    a(true);
                    Service service2 = this.e;
                    Toast.makeText(service2, service2.getResources().getText(R.string.TRANSIT_GUIDANCE_NOTIFICATION_SUPPRESSED), 1).show();
                }
                if (this.q == null) {
                    this.e.startForeground(j, j2.c);
                }
                this.q = byzyVar;
                return;
            }
            throw null;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final void a(boolean z) {
        if (this.h) {
            return;
        }
        bzel.a();
        this.h = true;
        this.f.b();
        if (z) {
            this.n.m(j);
        }
        bzgb bzgbVar = this.g;
        if (bzgbVar == null) {
            return;
        }
        bzgbVar.a(1);
    }

    public final boolean b(byzh byzhVar) {
        if (this.h) {
            return false;
        }
        byzy b = this.m.b(((bzfg) this.b).r, byzhVar.b, byzhVar.a);
        if (byzhVar.a.b.i != ((bzfg) this.b).r.g().b().b.i || !e(this.r, byzhVar.b)) {
            f(b);
            return true;
        }
        this.i = null;
        d();
        return false;
    }

    public final void c() {
        bzel.a();
        bzae bzaeVar = this.i;
        if (bzaeVar == null) {
            d();
        } else {
            b(bzaeVar.b);
        }
        if (!this.h) {
            bvqd.a(this.c.d(new Runnable(this) { // from class: bzad
                private final bzaf a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            }, k, TimeUnit.MILLISECONDS), this.c);
        }
    }

    public final void d() {
        bzgb bzgbVar;
        bzae bzaeVar;
        if (this.h) {
            return;
        }
        bzdk bzdkVar = ((bzfg) this.b).r;
        bzdh g = bzdkVar.g();
        byzg a2 = this.d.a(bzdkVar);
        boolean z = true;
        if (bzdkVar.h() == bzdj.STARTED && !g.p()) {
            z = false;
        }
        this.s = z;
        if (a2 == null) {
            return;
        }
        byzy a3 = this.m.a(bzdkVar, a2);
        byzy byzyVar = this.q;
        if (byzyVar == null || (!byzyVar.equals(a3) && (((bzgbVar = this.g) != null && bzgbVar.c != 3) || (bzaeVar = this.i) == null || ((e(a3.f(), byzyVar.f()) && ((bzfg) this.b).r.g().b().b.i == bzaeVar.b.a.b.i) || (bzaeVar.a.e(a).K() && this.r != a3.f()))))) {
            f(a3);
            this.i = null;
        }
        this.r = a3.f();
    }
}
