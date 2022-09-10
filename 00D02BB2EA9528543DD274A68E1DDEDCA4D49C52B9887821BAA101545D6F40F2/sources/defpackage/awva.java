package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: awva  reason: default package */
/* loaded from: classes.dex */
public final class awva {
    public final dxio<dkux> a;
    public final ahth b;
    public final btrm c;
    @dzsi
    public ahtf d;
    @dzsi
    public GmmLocation f;
    @dzsi
    public GmmLocation g;
    @dzsi
    public dbsz<awwm> h;
    private final acys j;
    public volatile boolean e = false;
    public final awuy i = new awuy(this);

    public awva(dxio<dkux> dxioVar, ahth ahthVar, btrm btrmVar, acys acysVar) {
        this.a = dxioVar;
        this.b = ahthVar;
        this.c = btrmVar;
        this.j = acysVar;
    }

    @dzsi
    public final synchronized GmmLocation a() {
        return this.f;
    }

    public final void b() {
        if (!this.e) {
            this.e = true;
            ((acxc) this.j).k(ckfh.g);
        }
    }

    public final void c(@dzsi GmmLocation gmmLocation) {
        boolean z;
        if (gmmLocation == null) {
            return;
        }
        synchronized (this) {
            this.f = gmmLocation;
        }
        bvmn bvmnVar = bvmo.a;
        if (!this.e) {
            b();
            d(awwm.LOCATION_FIRST_AVAILABLE);
            return;
        }
        synchronized (this) {
            GmmLocation gmmLocation2 = this.g;
            z = true;
            if (gmmLocation2 != null && gmmLocation.distanceTo(gmmLocation2) <= 500.0f) {
                z = false;
            }
        }
        if (!z) {
            return;
        }
        d(awwm.LOCATION_CHANGE);
    }

    public final void d(awwm awwmVar) {
        synchronized (this) {
            this.g = this.f;
        }
        dbsz<awwm> dbszVar = this.h;
        if (dbszVar != null) {
            dbszVar.NU(awwmVar);
        }
    }
}
