package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.setupcompat.internal.TemplateLayout;
/* compiled from: PG */
/* renamed from: alwa  reason: default package */
/* loaded from: classes.dex */
public final class alwa implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ TemplateLayout a;

    public alwa(TemplateLayout templateLayout) {
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
