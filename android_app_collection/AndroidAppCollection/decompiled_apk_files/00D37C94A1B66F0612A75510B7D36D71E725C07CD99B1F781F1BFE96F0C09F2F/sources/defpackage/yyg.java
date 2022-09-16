package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
/* compiled from: PG */
/* renamed from: yyg  reason: default package */
/* loaded from: classes4.dex */
public final class yyg extends jo {
    final /* synthetic */ AccessibilityLayerLayout b;

    public yyg(AccessibilityLayerLayout accessibilityLayerLayout) {
        this.b = accessibilityLayerLayout;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        if (!this.b.d(view)) {
            mhVar.B(null);
            mhVar.x(false);
            mhVar.y(false);
            mhVar.E(false);
        }
    }
}
