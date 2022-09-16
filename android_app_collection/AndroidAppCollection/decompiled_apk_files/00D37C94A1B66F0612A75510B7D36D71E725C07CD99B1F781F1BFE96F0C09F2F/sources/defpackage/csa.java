package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: csa  reason: default package */
/* loaded from: classes3.dex */
public final class csa implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ csb b;

    public csa(csb csbVar, View view) {
        this.b = csbVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        cvd.j(new crz(this, this));
    }
}
