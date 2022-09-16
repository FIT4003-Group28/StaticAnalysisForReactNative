package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.MiniPlayerErrorOverlay;
/* compiled from: PG */
/* renamed from: kfk  reason: default package */
/* loaded from: classes3.dex */
public final class kfk implements View.OnAttachStateChangeListener {
    final /* synthetic */ MiniPlayerErrorOverlay a;

    public kfk(MiniPlayerErrorOverlay miniPlayerErrorOverlay) {
        this.a = miniPlayerErrorOverlay;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        MiniPlayerErrorOverlay miniPlayerErrorOverlay = this.a;
        if (miniPlayerErrorOverlay.a) {
            return;
        }
        miniPlayerErrorOverlay.a = true;
        miniPlayerErrorOverlay.g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        MiniPlayerErrorOverlay miniPlayerErrorOverlay = this.a;
        if (!miniPlayerErrorOverlay.a) {
            return;
        }
        miniPlayerErrorOverlay.a = false;
        miniPlayerErrorOverlay.g();
    }
}
