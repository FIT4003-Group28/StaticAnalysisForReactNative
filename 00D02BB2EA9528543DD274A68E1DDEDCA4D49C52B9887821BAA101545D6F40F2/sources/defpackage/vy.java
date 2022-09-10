package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vy  reason: default package */
/* loaded from: classes7.dex */
public final class vy implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ wa a;

    public vy(wa waVar) {
        this.a = waVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.m()) {
            wa waVar = this.a;
            if (waVar.a.p) {
                return;
            }
            View view = waVar.c;
            if (view == null || !view.isShown()) {
                this.a.k();
            } else {
                this.a.a.MY();
            }
        }
    }
}
