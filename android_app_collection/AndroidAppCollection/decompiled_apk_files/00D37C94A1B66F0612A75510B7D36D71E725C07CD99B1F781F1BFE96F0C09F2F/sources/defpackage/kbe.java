package defpackage;

import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.apps.youtube.app.player.overlay.ControlsOverlayAlwaysShownController;
/* compiled from: PG */
/* renamed from: kbe  reason: default package */
/* loaded from: classes3.dex */
public final class kbe {
    public final /* synthetic */ ControlsOverlayAlwaysShownController a;

    public kbe(ControlsOverlayAlwaysShownController controlsOverlayAlwaysShownController) {
        this.a = controlsOverlayAlwaysShownController;
    }

    public final void a(adlt adltVar) {
        if (b(adltVar)) {
            ControlsOverlayAlwaysShownController controlsOverlayAlwaysShownController = this.a;
            controlsOverlayAlwaysShownController.b = false;
            controlsOverlayAlwaysShownController.g();
        }
    }

    public final boolean b(adlt adltVar) {
        return (adltVar instanceof iwc) && ((MediaRouteButton) this.a.a.get()).equals(((iwc) adltVar).f());
    }
}
