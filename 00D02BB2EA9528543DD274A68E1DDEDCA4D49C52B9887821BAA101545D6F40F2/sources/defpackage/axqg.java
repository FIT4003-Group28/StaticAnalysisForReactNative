package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axqg  reason: default package */
/* loaded from: classes3.dex */
final class axqg implements degu<dhkx> {
    final /* synthetic */ axqj a;

    public axqg(axqj axqjVar) {
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
    public final /* bridge */ /* synthetic */ void b(dhkx dhkxVar) {
        int a = dhkw.a(dhkxVar.b);
        if (a == 0 || a != 2) {
            axqj axqjVar = this.a;
            axqjVar.m(axqjVar.a.a().getString(R.string.REQUEST_FAILURE_ERROR_TOAST_SHORT));
        }
        this.a.h = false;
        cqkx.p(this.a.b);
    }
}
