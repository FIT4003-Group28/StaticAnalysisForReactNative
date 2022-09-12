package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axqd  reason: default package */
/* loaded from: classes3.dex */
final class axqd implements degu<djzu> {
    final /* synthetic */ axqe a;

    public axqd(axqe axqeVar) {
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
    public final /* bridge */ /* synthetic */ void b(djzu djzuVar) {
    }
}
