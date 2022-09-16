package defpackage;

import android.app.Application;
import android.location.Location;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bnwd  reason: default package */
/* loaded from: classes.dex */
public final class bnwd implements bnwn {
    private final bvrb a;
    private final Application b;
    private final btrm c;
    private final cqat d;
    @dzsi
    private bnvz e;
    @dzsi
    private bnwl f;
    @dzsi
    private bnwl g;
    @dzsi
    private Location h;

    public bnwd(Application application, btrm btrmVar, cqat cqatVar, bvrb bvrbVar) {
        this.b = application;
        this.c = btrmVar;
        this.d = cqatVar;
        this.a = bvrbVar;
    }

    final synchronized void a(@dzsi bnwl bnwlVar) {
        bnwl bnwlVar2 = this.f;
        if (bnwlVar2 != null) {
            bnwlVar2.c();
        }
        if (bnwlVar != null) {
            if (this.f == null) {
                this.c.h();
            }
            this.f = bnwlVar;
            bnwlVar.a(this);
            bnwlVar.getClass();
        }
    }

    public final synchronized void b(String str) {
        if (this.e == null) {
            this.e = new bnvz(bnvz.a);
        }
        bvrb bvrbVar = this.a;
        a(bnwc.a(bvrbVar, new bnwb(this.b, str, this.c, bvrbVar, this.e)));
    }

    @Override // defpackage.bnwn
    public final synchronized void c(String str) {
        b(str);
        d();
    }

    public final synchronized void d() {
        bnwl bnwlVar = this.f;
        if (bnwlVar != null) {
            bnwlVar.b();
        }
    }

    @Override // defpackage.bnwn
    public final synchronized void e() {
        if (this.g != null) {
            dbsk.s(this.h);
            this.g = bnwc.a(this.a, new bnwj(this.c, this.d, this.h));
        }
        a(this.g);
        d();
    }

    @Override // defpackage.bnwn
    public final void f(amub amubVar, float f, double d) {
        a(bnwc.a(this.a, new bnwm(this.c, this.d, amubVar, f, d)));
        d();
    }

    @Override // defpackage.bnwn
    public final void g(@dzsi akqq akqqVar) {
        bnwl bnwlVar = this.f;
        boolean z = false;
        if (bnwlVar != null && bnwlVar != this.g) {
            z = true;
        }
        if (akqqVar != null) {
            Location location = new Location("gps");
            location.setLatitude(akqqVar.a);
            location.setLongitude(akqqVar.b);
            location.setAccuracy(9.99f);
            location.setElapsedRealtimeNanos(TimeUnit.MILLISECONDS.toNanos(this.d.e()));
            this.h = location;
            this.g = bnwc.a(this.a, new bnwj(this.c, this.d, location));
        } else {
            this.h = null;
            this.g = null;
        }
        if (!z) {
            a(this.g);
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h(bnwl bnwlVar) {
        if (bnwlVar == this.f) {
            this.f = null;
            this.c.f();
            bnwlVar.getClass();
        }
    }
}
