package defpackage;

import android.app.Activity;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gde  reason: default package */
/* loaded from: classes3.dex */
public final class gde {
    private final gcu A;
    private final gcu B;
    private final gcu C;
    private final gcu D;
    private boolean E;
    public final Activity a;
    public final airw b;
    public final gdn c;
    public final ahiq d;
    public final xgp e;
    public final xgn h;
    public final ahin i;
    public ahia j;
    public wxp k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public gcs p;
    private final airr q;
    private final BroadcastReceiver s;
    private final gcu t;
    private final gcu u;
    private final gcu v;
    private final gcu w;
    private final gcu x;
    private final gcu y;
    private final gcu z;
    public final aypf f = new aypf();
    public final Map g = new HashMap();
    private final IntentFilter r = new IntentFilter();

    public gde(Activity activity, airr airrVar, airw airwVar, gdn gdnVar, ahiq ahiqVar, xgp xgpVar) {
        this.a = activity;
        this.q = airrVar;
        this.b = airwVar;
        this.c = gdnVar;
        this.d = ahiqVar;
        this.e = xgpVar;
        gcz gczVar = gcz.f;
        gdnVar.getClass();
        this.t = g(gczVar, new gcy(gdnVar));
        this.u = g(gcz.j, new gcx(this, 1));
        this.v = g(gcz.c, new gdb(airrVar));
        this.w = g(gcz.d, new gdb(airrVar, 2));
        this.x = g(gcz.g, new gdb(airrVar, 3));
        this.y = g(gcz.h, new gdb(airrVar, 4));
        gcz gczVar2 = gcz.a;
        gdnVar.getClass();
        this.z = g(gczVar2, new gcy(gdnVar, 1));
        this.A = g(gcz.i, new gcx(this));
        this.D = new gcu(activity, 2131232480, R.string.pip_is_not_available_for_this_video, R.string.pip_is_not_available_for_this_video, "com.google.android.libraries.youtube.player.action.controller_notification_retry", null);
        this.B = g(gcz.e, new gda(ahiqVar));
        gcz gczVar3 = gcz.b;
        ahiqVar.getClass();
        this.C = g(gczVar3, new gda(ahiqVar, 1));
        this.s = new gdc(this);
        this.h = new gdd(this);
        this.i = new ahin() { // from class: gcv
            @Override // defpackage.ahin
            public final void a(boolean z) {
                gde gdeVar = gde.this;
                if (gdeVar.l == z) {
                    return;
                }
                gdeVar.l = z;
                gcs gcsVar = gdeVar.p;
                if (gcsVar == null) {
                    return;
                }
                gcsVar.a();
            }
        };
    }

    private final RemoteAction d() {
        if (this.n) {
            return this.u.a();
        }
        RemoteAction a = this.t.a();
        boolean z = false;
        if (this.c.a && !this.m) {
            z = true;
        }
        a.setEnabled(z);
        return this.t.a();
    }

    private final RemoteAction e() {
        if (this.o) {
            ahia ahiaVar = this.j;
            if (ahiaVar != null) {
                int a = ahiaVar.a();
                if (a == 7) {
                    return this.x.a();
                }
                if (a == 8) {
                    return this.y.a();
                }
                if (this.j.f() || this.j.c()) {
                    return this.v.a();
                }
                if (this.j.e()) {
                    return this.w.a();
                }
            }
            if (this.q.T()) {
                return this.v.a();
            }
            return this.w.a();
        }
        return this.D.a();
    }

    private final RemoteAction f() {
        if (this.m) {
            this.A.a().setEnabled(elk.h(this.k));
            return this.A.a();
        }
        this.z.a().setEnabled(this.c.b);
        return this.z.a();
    }

    private final gcu g(gdf gdfVar, Runnable runnable) {
        gcu a = gdfVar.a(this.a, runnable);
        this.r.addAction(a.a);
        this.g.put(a.a, a);
        return a;
    }

    public final amuk a() {
        if (this.l) {
            return amuk.s(this.B.a(), this.C.a());
        }
        if (this.a.getResources().getConfiguration().getLayoutDirection() == 1) {
            return amuk.t(f(), e(), d());
        }
        return amuk.t(d(), e(), f());
    }

    public final void b() {
        if (this.E || !this.a.isInPictureInPictureMode()) {
            return;
        }
        this.a.registerReceiver(this.s, this.r);
        this.E = true;
    }

    public final void c() {
        if (this.E) {
            this.a.unregisterReceiver(this.s);
            this.E = false;
        }
    }
}
