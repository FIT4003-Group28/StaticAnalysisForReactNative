package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uu  reason: default package */
/* loaded from: classes7.dex */
public final class uu implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ uz a;

    public uu(uz uzVar) {
        this.a = uzVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.a.m() || this.a.b.size() <= 0 || this.a.b.get(0).a.p) {
            return;
        }
        View view = this.a.d;
        if (view == null || !view.isShown()) {
            this.a.k();
            return;
        }
        for (uy uyVar : this.a.b) {
            uyVar.a.MY();
        }
    }
}
