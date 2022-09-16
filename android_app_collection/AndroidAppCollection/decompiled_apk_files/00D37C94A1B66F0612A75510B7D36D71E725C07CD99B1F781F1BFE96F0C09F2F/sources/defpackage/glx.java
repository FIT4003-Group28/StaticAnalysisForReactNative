package defpackage;

import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.protos.youtube.api.innertube.SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: glx  reason: default package */
/* loaded from: classes3.dex */
public final class glx implements aafl {
    private final YouTubeControlsOverlay a;

    public glx(YouTubeControlsOverlay youTubeControlsOverlay) {
        this.a = youTubeControlsOverlay;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand = (SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand) apzgVar.qm(SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.setPlayerControlsOverlayVisibilityCommand);
        if ((setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.b & 1) != 0) {
            if (setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.c) {
                this.a.Q();
            } else {
                this.a.nf();
            }
        }
    }
}
