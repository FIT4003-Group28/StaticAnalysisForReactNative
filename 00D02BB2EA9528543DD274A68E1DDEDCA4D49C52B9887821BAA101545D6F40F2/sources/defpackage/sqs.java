package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: sqs  reason: default package */
/* loaded from: classes7.dex */
final class sqs implements degu<Void> {
    final /* synthetic */ Runnable a;
    final /* synthetic */ sqt b;

    public sqs(sqt sqtVar, Runnable runnable) {
        this.b = sqtVar;
        this.a = runnable;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.t = false;
        this.b.n(R.string.GO_TAB_PINNING_FAILURE_TEXT);
        cqkx.p(this.b);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi Void r3) {
        this.b.t = false;
        sqt sqtVar = this.b;
        if (sqtVar.e.e(sqtVar.d)) {
            sqtVar.n(R.string.GO_TAB_PINNING_SUCCESS_ACCESSIBILITY_TEXT);
        }
        this.a.run();
    }
}
