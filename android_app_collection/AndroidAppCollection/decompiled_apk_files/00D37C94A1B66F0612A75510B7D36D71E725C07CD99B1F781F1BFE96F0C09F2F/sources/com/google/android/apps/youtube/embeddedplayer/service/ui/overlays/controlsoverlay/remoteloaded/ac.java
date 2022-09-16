package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.model.PlayerViewModeData;
import j$.util.Optional;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ac implements ayqb {
    public final /* synthetic */ al a;
    private final /* synthetic */ int b;

    public /* synthetic */ ac(al alVar, int i) {
        this.b = i;
        this.a = alVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.G = (aafo) obj;
        } else if (i != 1) {
            if (i == 2) {
                this.a.T = ((aqtp) obj).m;
                return;
            }
            this.a.U = (Optional) obj;
        } else {
            al alVar = this.a;
            int i2 = ((PlayerViewModeData) obj).a;
            alVar.S = i2;
            if (i2 == 1) {
                alVar.kU();
            } else {
                alVar.kT();
            }
        }
    }
}
