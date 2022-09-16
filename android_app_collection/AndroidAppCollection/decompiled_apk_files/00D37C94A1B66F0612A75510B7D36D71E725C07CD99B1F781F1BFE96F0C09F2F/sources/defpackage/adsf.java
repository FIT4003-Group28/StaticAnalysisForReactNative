package defpackage;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: adsf  reason: default package */
/* loaded from: classes.dex */
final class adsf implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ akgc a;
    final /* synthetic */ adsg b;

    public adsf(adsg adsgVar, akgc akgcVar) {
        this.b = adsgVar;
        this.a = akgcVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.b.r.getGlobalVisibleRect(rect);
        this.a.g(rect);
        this.b.r.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
