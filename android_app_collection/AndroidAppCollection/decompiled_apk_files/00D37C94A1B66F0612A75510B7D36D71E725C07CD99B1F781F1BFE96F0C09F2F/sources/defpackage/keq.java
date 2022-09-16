package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
/* compiled from: PG */
/* renamed from: keq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class keq implements ayqb {
    public final /* synthetic */ InteractiveInlineMutedControlsOverlay a;
    private final /* synthetic */ int b;

    public /* synthetic */ keq(InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay, int i) {
        this.b = i;
        this.a = interactiveInlineMutedControlsOverlay;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        Drawable drawable;
        int i = this.b;
        if (i == 0) {
            this.a.p = ((ahhj) obj).d();
        } else if (i == 1) {
            InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay = this.a;
            TouchImageView touchImageView = interactiveInlineMutedControlsOverlay.y;
            if (((ahhf) obj).a()) {
                drawable = interactiveInlineMutedControlsOverlay.d.getResources().getDrawable(2131233488);
            } else {
                drawable = interactiveInlineMutedControlsOverlay.d.getResources().getDrawable(2131233490);
            }
            touchImageView.setImageDrawable(drawable);
        } else {
            this.a.q = ((Boolean) obj).booleanValue();
        }
    }
}
