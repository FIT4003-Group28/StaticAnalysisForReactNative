package defpackage;

import android.view.ViewTreeObserver;
import com.facebook.litho.widget.LithoScrollView;
/* compiled from: PG */
/* renamed from: djq  reason: default package */
/* loaded from: classes3.dex */
final class djq implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ dmm a;
    final /* synthetic */ LithoScrollView b;

    public djq(LithoScrollView lithoScrollView, dmm dmmVar) {
        this.b = lithoScrollView;
        this.a = dmmVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.b.setScrollY(this.a.a);
        ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
            return true;
        }
        return true;
    }
}
