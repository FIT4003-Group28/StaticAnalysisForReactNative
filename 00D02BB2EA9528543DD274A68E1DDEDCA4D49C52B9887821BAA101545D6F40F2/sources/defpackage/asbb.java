package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.List;
/* compiled from: PG */
/* renamed from: asbb  reason: default package */
/* loaded from: classes2.dex */
public final class asbb implements ahtg {
    public final Context a;
    public final bvrb b;
    public final arpn c;
    private final ahth d;
    private final dzsj<arpm> e;
    private final asav f;
    private boolean g = false;
    private boolean h = false;
    @dzsi
    private arpm i;

    public asbb(Application application, ahth ahthVar, bvrb bvrbVar, dzsj<arpm> dzsjVar, arpn arpnVar, asav asavVar) {
        dbsk.s(application);
        this.a = application;
        this.d = ahthVar;
        dbsk.s(bvrbVar);
        this.b = bvrbVar;
        dbsk.s(dzsjVar);
        this.e = dzsjVar;
        this.c = arpnVar;
        dbsk.s(asavVar);
        this.f = asavVar;
    }

    private final synchronized void h() {
        bvrj.UI_THREAD.c();
        dbsk.m(this.g, "we should have been started if we reach this point");
        arpm arpmVar = this.i;
        if (arpmVar != null) {
            arpmVar.d();
            this.i = null;
        }
    }

    @Override // defpackage.ahtg
    public final void a() {
        f();
    }

    @Override // defpackage.ahtg
    public final void b() {
    }

    @Override // defpackage.ahtg
    public final void c() {
        f();
    }

    @Override // defpackage.ahtg
    public final synchronized void d(GmmLocation gmmLocation) {
        if (this.i == null && !this.h) {
            arpm a = this.e.a();
            this.i = a;
            a.c(new asba(this), bvrj.BACKGROUND_THREADPOOL);
            this.i.h(vul.FREE_NAV, dqvj.DRIVE, null);
        }
    }

    public final synchronized void e() {
        bvrj.UI_THREAD.c();
        dbsk.m(!this.g, "notification cannot be shown more than once");
        this.g = true;
        this.d.a.a(this).a();
    }

    public final synchronized void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(dcdc.e());
        h();
    }

    public final synchronized void g(amtq<asau> amtqVar) {
        if (this.h) {
            return;
        }
        this.h = true;
        amtqVar.size();
        asau b = amtqVar.b();
        List list = amtqVar;
        if (b != null) {
            list = dcdc.f(b);
        }
        this.f.a(list);
        h();
    }
}
