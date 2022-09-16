package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sy  reason: default package */
/* loaded from: classes4.dex */
public final class sy implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ta a;

    public sy(ta taVar) {
        this.a = taVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.u()) {
            ta taVar = this.a;
            if (taVar.a.o) {
                return;
            }
            View view = taVar.c;
            if (view == null || !view.isShown()) {
                this.a.k();
            } else {
                this.a.a.s();
            }
        }
    }
}
