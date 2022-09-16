package defpackage;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: acfw  reason: default package */
/* loaded from: classes.dex */
public final class acfw implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ akgc a;
    final /* synthetic */ acgd b;

    public acfw(acgd acgdVar, akgc akgcVar) {
        this.b = acgdVar;
        this.a = akgcVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.b.n.getGlobalVisibleRect(rect);
        this.a.g(rect);
        this.b.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
