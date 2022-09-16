package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.PipPaidProductBadgeOverlay;
/* compiled from: PG */
/* renamed from: kft  reason: default package */
/* loaded from: classes3.dex */
public final class kft implements View.OnAttachStateChangeListener {
    final /* synthetic */ PipPaidProductBadgeOverlay a;

    public kft(PipPaidProductBadgeOverlay pipPaidProductBadgeOverlay) {
        this.a = pipPaidProductBadgeOverlay;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        PipPaidProductBadgeOverlay pipPaidProductBadgeOverlay = this.a;
        if (pipPaidProductBadgeOverlay.a) {
            return;
        }
        pipPaidProductBadgeOverlay.a = true;
        pipPaidProductBadgeOverlay.j();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        PipPaidProductBadgeOverlay pipPaidProductBadgeOverlay = this.a;
        if (!pipPaidProductBadgeOverlay.a) {
            return;
        }
        pipPaidProductBadgeOverlay.a = false;
        pipPaidProductBadgeOverlay.j();
    }
}
