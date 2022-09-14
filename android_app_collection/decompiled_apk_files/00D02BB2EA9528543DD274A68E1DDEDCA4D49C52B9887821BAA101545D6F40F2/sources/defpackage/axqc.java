package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axqc  reason: default package */
/* loaded from: classes3.dex */
final class axqc implements degu<dhyy> {
    final /* synthetic */ axqe a;

    public axqc(axqe axqeVar) {
        this.a = axqeVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!(th instanceof axir)) {
            axqe axqeVar = this.a;
            axqeVar.o(axqeVar.a.getString(R.string.REQUEST_FAILURE_ERROR_TOAST_SHORT));
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dhyy dhyyVar) {
        dhyy dhyyVar2 = dhyyVar;
        int a = dhyx.a(dhyyVar2.c);
        if (a != 0 && a == 3) {
            axqe axqeVar = this.a;
            axqeVar.o(axqeVar.a.getString(R.string.CANNOT_FOLLOW_ERROR));
        }
        int a2 = dhyx.a(dhyyVar2.c);
        if (a2 == 0 || a2 == 1) {
            axqe axqeVar2 = this.a;
            axqeVar2.o(axqeVar2.a.getString(R.string.REQUEST_FAILURE_ERROR_TOAST_SHORT));
        }
    }
}
