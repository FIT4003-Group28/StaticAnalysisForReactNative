package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: afpq  reason: default package */
/* loaded from: classes.dex */
final class afpq implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ afps a;

    public afpq(afps afpsVar) {
        this.a = afpsVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        afps afpsVar = this.a;
        if (afpsVar.d.t == 4) {
            afpsVar.e();
        }
    }
}
