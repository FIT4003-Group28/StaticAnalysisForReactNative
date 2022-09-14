package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: bgeu  reason: default package */
/* loaded from: classes3.dex */
final class bgeu implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ bgev a;

    public bgeu(bgev bgevVar) {
        this.a = bgevVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        bgpt bgptVar = this.a.e;
        if (bgptVar != null) {
            bgptVar.l();
        }
    }
}
