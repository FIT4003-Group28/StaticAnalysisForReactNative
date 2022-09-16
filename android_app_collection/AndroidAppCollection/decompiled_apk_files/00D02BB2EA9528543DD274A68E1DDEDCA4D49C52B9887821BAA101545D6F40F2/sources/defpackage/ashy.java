package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.lang.reflect.Proxy;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ashy  reason: default package */
/* loaded from: classes.dex */
public final class ashy implements asil {
    public final Activity a;
    public final cpb b;
    public final dxio<ache> c;
    public final dxio<btvo> d;
    @dzsi
    ViewGroup e;
    private final dxio<cjyh> f;
    private final Executor g;
    private final dxio<btxc> h;
    private final crzp<btvo> i;
    private boolean j;
    private boolean k;
    private final asht l;

    public ashy(Activity activity, dxio<ache> dxioVar, dxio<cjyh> dxioVar2, Executor executor, dxio<btvo> dxioVar3, dxio<btxc> dxioVar4) {
        cpb cpbVar = new cpb(activity);
        this.l = new asht(this);
        this.i = new ashu(this);
        dbsk.s(activity);
        this.a = activity;
        this.b = cpbVar;
        dbsk.s(dxioVar);
        this.c = dxioVar;
        this.f = dxioVar2;
        this.g = executor;
        this.d = dxioVar3;
        this.h = dxioVar4;
    }

    private final boolean o() {
        if (Build.VERSION.SDK_INT < 28 || !this.d.a().getAssistantParameters().b) {
            boolean e = this.b.e();
            this.b.f(this.l);
            return e;
        } else if (this.b.e()) {
            m();
            return false;
        } else {
            this.b.f(null);
            return false;
        }
    }

    private final void p() {
        if (!this.j || this.k) {
            return;
        }
        ashx ashxVar = new ashx(this);
        cpb cpbVar = this.b;
        String valueOf = String.valueOf(ashxVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("setScreenshotProvider: ");
        sb.append(valueOf);
        sb.toString();
        Class<?> cls = cpbVar.a;
        if (cls != null && cpbVar.b != null) {
            cpbVar.c(cpbVar.k, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cpbVar.a}, new coz(cpbVar, ashxVar)));
        }
        this.k = true;
    }

    private static boolean q(Activity activity) {
        return (activity.getWindow().getDecorView().getSystemUiVisibility() & 4096) == 4096;
    }

    @Override // defpackage.asil
    public final void a() {
        dbsk.l(this.e == null);
        boolean o = o();
        this.j = o;
        cpb cpbVar = this.b;
        ViewGroup a = cpbVar.a();
        if (o) {
            a = cpbVar.b();
        }
        dbsk.s(a);
        this.e = a;
        p();
    }

    @Override // defpackage.asil
    public final void b() {
        this.h.a().a().d(this.i, dege.a);
        cpb cpbVar = this.b;
        cpbVar.c(cpbVar.d, new Object[0]);
    }

    @Override // defpackage.asil
    public final void c() {
        cpb cpbVar = this.b;
        cpbVar.c(cpbVar.f, new Object[0]);
        n(o());
    }

    @Override // defpackage.asil
    public final void d(Configuration configuration) {
        cpb cpbVar = this.b;
        cpbVar.c(cpbVar.h, configuration);
    }

    @Override // defpackage.asil
    public final void e(boolean z) {
        cpb cpbVar = this.b;
        StringBuilder sb = new StringBuilder(27);
        sb.append("onWindowFocusChanged: ");
        sb.append(z);
        sb.toString();
        cpbVar.c(cpbVar.i, Boolean.valueOf(z));
    }

    @Override // defpackage.asil
    public final void f() {
        cpb cpbVar = this.b;
        cpbVar.c(cpbVar.g, new Object[0]);
    }

    @Override // defpackage.asil
    public final void g() {
        this.h.a().a().c(this.i);
        cpb cpbVar = this.b;
        cpbVar.c(cpbVar.e, new Object[0]);
    }

    @Override // defpackage.asil
    public final void h() {
        dbsk.s(this.e);
        this.b.f(null);
        this.e = null;
        cpb cpbVar = this.b;
        cpbVar.c(cpbVar.c, new Object[0]);
    }

    @Override // defpackage.asil
    public final ViewGroup i() {
        ViewGroup viewGroup = this.e;
        dbsk.s(viewGroup);
        return viewGroup;
    }

    @Override // defpackage.asil
    public final int j(int i) {
        return (this.j && q(this.a) && (this.a.getWindow().getDecorView().getSystemUiVisibility() & 2) == 2) ? Math.max(0, i - this.a.getResources().getDimensionPixelSize(this.a.getResources().getIdentifier("navigation_bar_height", "dimen", "android"))) : i;
    }

    @Override // defpackage.asil
    public final int k(int i) {
        return (this.j && q(this.a)) ? Math.max(i, this.a.getResources().getDimensionPixelSize(R.dimen.vanagon_status_bar_height)) : i;
    }

    public final void l() {
        this.b.f(this.l);
        n(this.b.e());
    }

    public final void m() {
        deha.q(this.f.a().d(), new ashv(this), this.g);
    }

    public final void n(boolean z) {
        if (z == this.j) {
            return;
        }
        this.j = z;
        cpb cpbVar = this.b;
        StringBuilder sb = new StringBuilder(17);
        sb.append("setEnabled: ");
        sb.append(z);
        sb.toString();
        if (!cpbVar.d() && z) {
            cpbVar.b();
        }
        if (cpbVar.d()) {
            cpbVar.c(cpbVar.j, Boolean.valueOf(z));
        }
        p();
    }
}
