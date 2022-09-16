package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
/* compiled from: PG */
/* renamed from: cvfj  reason: default package */
/* loaded from: classes5.dex */
public final class cvfj extends ViewOutlineProvider {
    final /* synthetic */ int a;
    final /* synthetic */ OverlayView b;

    public cvfj(OverlayView overlayView, int i) {
        this.b = overlayView;
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + this.a, this.b.e);
    }
}
