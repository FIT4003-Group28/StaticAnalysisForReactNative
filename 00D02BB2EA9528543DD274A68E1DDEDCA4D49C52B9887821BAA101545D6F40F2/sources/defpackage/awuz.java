package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: awuz  reason: default package */
/* loaded from: classes.dex */
final class awuz implements ahtg {
    final /* synthetic */ awva a;

    public awuz(awva awvaVar) {
        this.a = awvaVar;
    }

    private final void e(awwm awwmVar) {
        bvmn bvmnVar = bvmo.a;
        this.a.b();
        this.a.d(awwmVar);
    }

    @Override // defpackage.ahtg
    public final void a() {
        e(awwm.LOCATION_FIX_FAILED);
    }

    @Override // defpackage.ahtg
    public final void b() {
    }

    @Override // defpackage.ahtg
    public final void c() {
        e(awwm.LOCATION_FIX_TIMEOUT);
    }

    @Override // defpackage.ahtg
    public final void d(GmmLocation gmmLocation) {
        this.a.c(gmmLocation);
    }
}
