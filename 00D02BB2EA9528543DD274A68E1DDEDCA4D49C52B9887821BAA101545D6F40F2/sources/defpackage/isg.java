package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: isg  reason: default package */
/* loaded from: classes.dex */
public final class isg implements ahtg {
    final /* synthetic */ ish a;

    public isg(ish ishVar) {
        this.a = ishVar;
    }

    @Override // defpackage.ahtg
    public final void a() {
        this.a.e = null;
    }

    @Override // defpackage.ahtg
    public final void b() {
    }

    @Override // defpackage.ahtg
    public final void c() {
        this.a.e = null;
    }

    @Override // defpackage.ahtg
    public final void d(GmmLocation gmmLocation) {
        ish ishVar = this.a;
        ishVar.c.a().b = gmmLocation.C();
        if (ishVar.a.a().a(ishVar.c.a())) {
            ishVar.c.a();
            ishVar.d = dqkc.PARKING_LOCATION;
        }
        this.a.e = null;
    }
}
