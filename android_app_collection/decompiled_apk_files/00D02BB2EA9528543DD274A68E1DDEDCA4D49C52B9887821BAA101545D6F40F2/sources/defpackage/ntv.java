package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ntv  reason: default package */
/* loaded from: classes7.dex */
public final class ntv implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ nud b;

    public ntv(nud nudVar, View view) {
        this.b = nudVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        nud nudVar = this.b;
        if (nudVar.j) {
            nudVar.j = false;
            nudVar.i();
        }
    }
}
