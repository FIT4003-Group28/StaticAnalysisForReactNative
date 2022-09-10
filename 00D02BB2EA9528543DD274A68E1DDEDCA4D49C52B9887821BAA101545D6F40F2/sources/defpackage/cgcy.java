package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cgcy  reason: default package */
/* loaded from: classes4.dex */
public final class cgcy {
    public final Activity a;
    public final akoq b;
    public final cjqq c;
    public final cgcw d;
    @dzsi
    public aktc e;
    private final cgcx f = new cgcx(new amsa(), new amrz(), new amrm());

    public cgcy(Activity activity, akoq akoqVar, cjqq cjqqVar) {
        this.a = activity;
        this.b = akoqVar;
        this.c = cjqqVar;
        this.d = new cgcw(activity.getResources(), akoqVar.aE());
    }

    public final void a() {
        synchronized (this) {
            aktc aktcVar = this.e;
            if (aktcVar != null) {
                this.b.ak().a(aktcVar);
                this.b.aC().e(aktcVar);
                this.e = null;
            }
        }
    }

    public final void b() {
        synchronized (this) {
            aktc aktcVar = this.e;
            if (aktcVar != null) {
                this.b.ak().b(aktcVar, this.f, amsb.PLACEMARK, 0, cgcw.a);
            }
        }
    }
}
