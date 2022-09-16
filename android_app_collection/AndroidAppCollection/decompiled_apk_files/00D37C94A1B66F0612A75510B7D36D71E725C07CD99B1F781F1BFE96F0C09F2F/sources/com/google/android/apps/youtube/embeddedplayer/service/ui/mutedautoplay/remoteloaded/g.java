package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlayerViewModeData;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class g implements com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c {
    public final azpm a = azpm.e();
    private final /* synthetic */ int b;

    public g(int i) {
        this.b = i;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final void e() {
    }

    public g() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final void b(BusSupported$Data busSupported$Data) {
        if (this.b == 0) {
            if (!busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.MUTED_AUTOPLAY_STATE) || !(busSupported$Data instanceof MutedAutoplayState)) {
                return;
            }
            this.a.c((MutedAutoplayState) busSupported$Data);
        } else if (!busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.PLAYER_VIEW_MODE) || !(busSupported$Data instanceof PlayerViewModeData)) {
        } else {
            this.a.c((PlayerViewModeData) busSupported$Data);
        }
    }
}
