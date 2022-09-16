package defpackage;

import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerOverlayLayout;
/* compiled from: PG */
/* renamed from: fzh  reason: default package */
/* loaded from: classes3.dex */
public final class fzh implements zan {
    final /* synthetic */ InlinePlayerLayout a;

    public fzh(InlinePlayerLayout inlinePlayerLayout) {
        this.a = inlinePlayerLayout;
    }

    @Override // defpackage.zan
    public final void sa(zaj zajVar) {
        InlinePlayerOverlayLayout inlinePlayerOverlayLayout = this.a.e;
        if (inlinePlayerOverlayLayout != null && inlinePlayerOverlayLayout.g()) {
            inlinePlayerOverlayLayout.f();
            inlinePlayerOverlayLayout.invalidate();
        }
        if (this.a.f()) {
            this.a.e();
            this.a.invalidate();
        }
    }
}
