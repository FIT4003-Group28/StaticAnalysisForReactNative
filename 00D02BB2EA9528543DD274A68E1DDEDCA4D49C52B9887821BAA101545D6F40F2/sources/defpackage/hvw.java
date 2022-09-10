package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: hvw  reason: default package */
/* loaded from: classes.dex */
public final class hvw extends itb implements hwd {
    private boolean A;
    private deig<akox> B;
    private TextView C;
    private boolean D;
    private final crzp<aufb> E = new hvt(this);
    private final AtomicBoolean F = new AtomicBoolean(false);
    private final crzp<Boolean> G = new hvu(this);
    private final AtomicBoolean H = new AtomicBoolean(false);
    private boolean I = true;
    public final dxio<akox> a;
    public final hvr b;
    public final hvv c;
    public crzb d;
    public crzb e;
    public crzb f;
    public crzb g;
    public crzb h;
    public crzb i;
    public dbty<Boolean> j;
    private final dzsj<Activity> k;
    private final Executor o;
    private final Executor p;
    private final anay q;
    private final btvo r;
    private final btrm s;
    private final hwq t;
    private final dxio<aufc> u;
    private final dxio<gce> v;
    private final dxio<gcg> w;
    private boolean x;
    private boolean y;
    private hvg z;

    public hvw(dzsj<Activity> dzsjVar, dxio<akox> dxioVar, hvr hvrVar, Executor executor, anay anayVar, btvo btvoVar, btrm btrmVar, hwq hwqVar, dxio<bvkx> dxioVar2, dxio<aufc> dxioVar3, dxio<gce> dxioVar4, dxio<gcg> dxioVar5, Executor executor2) {
        this.k = dzsjVar;
        this.a = dxioVar;
        this.b = hvrVar;
        this.o = executor;
        this.q = anayVar;
        this.r = btvoVar;
        this.s = btrmVar;
        this.t = hwqVar;
        this.c = new hvv(dxioVar2);
        this.u = dxioVar3;
        this.v = dxioVar4;
        this.w = dxioVar5;
        this.p = executor2;
    }

    private final synchronized void t() {
        this.d.a();
        if (this.B.isDone() || this.a.a().B) {
            return;
        }
        if (this.I) {
            new Throwable();
        }
        if (this.F.compareAndSet(false, true)) {
            this.u.a().i().d(this.E, this.p);
        }
        if (this.w.a().a() && this.H.compareAndSet(false, true)) {
            this.v.a().g().d(this.G, this.p);
        }
        this.a.a().aj().au(this.c);
        this.a.a().af();
        dbsk.l(!this.y);
        if (this.x) {
            this.a.a().d();
            hvg hvgVar = new hvg(this.a.a(), this.r.getVectorMapsParameters(), this.s);
            this.z = hvgVar;
            hvgVar.a();
            this.y = true;
        }
        dbsk.l(!this.A);
        if (x()) {
            this.A = true;
        }
        if (this.C != null) {
            this.a.a().aj().N(this.C);
            this.C = null;
        }
        this.a.a().V(this.D);
        this.B.j(this.a.a());
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        this.t.a();
        this.a.a().o = f();
        this.B = deig.d();
        amyn.b = this.d;
        amyn.c = this.e;
        amyn.d = this.f;
        amyn.e = this.g;
        amyn.f = this.h;
        amyn.g = this.i;
        this.o.execute(new Runnable(this) { // from class: hvs
            private final hvw a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                hvw hvwVar = this.a;
                akoq aj = hvwVar.a.a().aj();
                aj.au(hvwVar.c);
                if (hvwVar.j.a().booleanValue()) {
                    aj.aF().i(hvk.a);
                    aj.aF().f(new hvk());
                    aj.aF().g(hvwVar.b);
                }
            }
        });
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.x = true;
        dbsk.l(!this.y);
        if (this.B.isDone()) {
            this.a.a().d();
            if (this.z == null) {
                this.z = new hvg(this.a.a(), this.r.getVectorMapsParameters(), this.s);
            }
            this.z.a();
            this.y = true;
        }
        this.q.a();
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.a.a().aj().au(null);
        if (this.F.get()) {
            this.u.a().i().c(this.E);
        }
        if (this.H.get()) {
            this.v.a().g().c(this.G);
        }
        this.a.a().b();
        this.t.b();
        super.Nu();
    }

    @Override // defpackage.itb
    public final void PX() {
        super.PX();
        dbsk.l(!this.A);
        if (this.B.isDone()) {
            this.A = true;
        }
    }

    @Override // defpackage.itb
    public final void PY() {
        dbsk.l(this.A == this.B.isDone());
        if (this.A) {
            this.A = false;
        }
        super.PY();
    }

    @Override // defpackage.itb
    public final void Po() {
        this.q.b();
        dbsk.l(this.y == this.B.isDone());
        if (this.y) {
            hvg hvgVar = this.z;
            hvgVar.b.a(hvgVar.d);
            this.a.a().e();
            this.y = false;
        }
        this.x = false;
        super.Po();
    }

    @Override // defpackage.hwd
    @Deprecated
    public final akox e() {
        return this.a.a();
    }

    final Point f() {
        Point point = new Point();
        ((Activity) ((dxjd) this.k).a).getWindowManager().getDefaultDisplay().getSize(point);
        if (btpf.a((Context) ((dxjd) this.k).a)) {
            Resources resources = ((Activity) ((dxjd) this.k).a).getResources();
            point.y = (point.y - resources.getDimensionPixelSize(R.dimen.sheetheader_height)) - resources.getDimensionPixelSize(R.dimen.omnibox_height);
        }
        return point;
    }

    @Override // defpackage.hwd
    public final boolean i() {
        View k = k();
        if (k == null || k.getVisibility() != 0 || k.getWidth() == 0 || k.getHeight() == 0) {
            return false;
        }
        View decorView = ((Activity) ((dxjd) this.k).a).getWindow().getDecorView();
        for (ViewParent parent = k().getParent(); parent != null; parent = parent.getParent()) {
            if (parent == decorView) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hwd
    public final void j() {
        t();
    }

    @Override // defpackage.hwd
    public final View k() {
        return this.a.a().af();
    }

    @Override // defpackage.hwd
    public final boolean l() {
        return w();
    }

    @Override // defpackage.hwd
    public final void m(TextView textView) {
        if (this.a.a() == null) {
            dbsk.m(false, "not in a unit or feature test");
        } else if (!this.B.isDone()) {
            this.C = textView;
        } else {
            this.a.a().aj().N(textView);
            this.C = null;
        }
    }

    @Override // defpackage.hwd
    public final dehn<akox> n() {
        return this.B;
    }

    @Override // defpackage.hwd
    public final void o(boolean z) {
        this.D = z;
        deig<akox> deigVar = this.B;
        if (deigVar == null || !deigVar.isDone()) {
            return;
        }
        this.a.a().V(z);
    }

    @Override // defpackage.hwd
    public final void p(boolean z) {
        hvg hvgVar = this.z;
        if (hvgVar == null) {
            return;
        }
        hvgVar.c = z;
        hvgVar.b();
    }

    @Override // defpackage.hwd
    public final void q(boolean z) {
        this.d.a();
        akox a = this.a.a();
        a.B = z;
        a.aj().Z(z);
        StringBuilder sb = new StringBuilder(38);
        sb.append("MapContainer.setBlockMapStart to ");
        sb.append(z);
        sb.toString();
        bvmn bvmnVar = bvmo.a;
    }

    @Override // defpackage.hwd
    public final void r() {
        this.a.a().m(f());
    }

    @Override // defpackage.hwd
    public final void s() {
        this.I = false;
    }
}
