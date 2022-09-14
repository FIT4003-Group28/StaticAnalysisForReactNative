package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axqh  reason: default package */
/* loaded from: classes3.dex */
final class axqh implements degu<djoq> {
    final /* synthetic */ axqj a;

    public axqh(axqj axqjVar) {
        this.a = axqjVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!(th instanceof axir)) {
            axqj axqjVar = this.a;
            axqjVar.m(axqjVar.a.a().getString(R.string.REQUEST_FAILURE_ERROR_TOAST_SHORT));
        }
        this.a.h = false;
        cqkx.p(this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(djoq djoqVar) {
        this.a.h = false;
        cqkx.p(this.a.b);
    }
}
