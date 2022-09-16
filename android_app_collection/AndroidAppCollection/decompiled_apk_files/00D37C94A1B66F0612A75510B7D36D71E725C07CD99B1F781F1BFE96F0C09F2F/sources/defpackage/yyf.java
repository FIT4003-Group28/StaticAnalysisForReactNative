package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
/* compiled from: PG */
/* renamed from: yyf  reason: default package */
/* loaded from: classes4.dex */
public final class yyf extends jo {
    final /* synthetic */ AccessibilityLayerLayout b;

    public yyf(AccessibilityLayerLayout accessibilityLayerLayout) {
        this.b = accessibilityLayerLayout;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        this.b.a();
        super.d(view, mhVar);
    }

    @Override // defpackage.jo
    public final boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        boolean z = false;
        if (this.b.d(view)) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams.width == layoutParams2.width && layoutParams.height == layoutParams2.height) {
                z = true;
            }
            accessibilityEvent.setFullScreen(z);
            return super.i(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
