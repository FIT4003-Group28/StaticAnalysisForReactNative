package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.setupcompat.internal.TemplateLayout;
/* compiled from: PG */
/* renamed from: daom  reason: default package */
/* loaded from: classes5.dex */
public final class daom implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ TemplateLayout a;

    public daom(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this.a.b);
        TemplateLayout templateLayout = this.a;
        templateLayout.setXFraction(templateLayout.a);
        return true;
    }
}
