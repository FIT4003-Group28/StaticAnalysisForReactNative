package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.gmm.base.mod.components.tabs.GmmTabLayout;
/* compiled from: PG */
/* renamed from: hzt  reason: default package */
/* loaded from: classes6.dex */
final class hzt implements ViewTreeObserver.OnPreDrawListener {
    private final dagg a;
    private final int b;

    public hzt(dagg daggVar, int i) {
        this.a = daggVar;
        this.b = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        dagb j = this.a.j(this.b);
        if (j == null) {
            return true;
        }
        hzs hzsVar = new hzs();
        this.a.setAccessibilityDelegate(hzsVar);
        View view = j.e;
        if (view != null) {
            view.setAccessibilityDelegate(hzsVar);
        }
        dagg daggVar = this.a;
        if (daggVar instanceof GmmTabLayout) {
            ((GmmTabLayout) daggVar).d(j);
        } else {
            daggVar.p(j, true);
        }
        this.a.setAccessibilityDelegate(null);
        if (view != null) {
            view.setAccessibilityDelegate(null);
        }
        return true;
    }
}
