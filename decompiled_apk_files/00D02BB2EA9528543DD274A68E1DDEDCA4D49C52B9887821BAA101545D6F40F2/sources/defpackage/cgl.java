package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgl  reason: default package */
/* loaded from: classes4.dex */
public final class cgl implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ cgm b;

    public cgl(cgm cgmVar, View view) {
        this.b = cgmVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        cjp.c(new cgk(this, this));
    }
}
