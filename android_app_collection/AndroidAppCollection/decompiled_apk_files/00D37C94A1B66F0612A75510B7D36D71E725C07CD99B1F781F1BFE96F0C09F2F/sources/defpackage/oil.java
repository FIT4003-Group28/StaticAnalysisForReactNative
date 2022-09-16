package defpackage;

import android.app.PictureInPictureUiState;
/* compiled from: PG */
/* renamed from: oil  reason: default package */
/* loaded from: classes3.dex */
public abstract class oil extends ogk implements ghd, ogq {
    private boolean w;

    @Override // defpackage.ogq
    public final boolean b() {
        return super.isInPictureInPictureMode();
    }

    @Override // android.app.Activity, defpackage.ghd
    public final boolean isInMultiWindowMode() {
        return this.w;
    }

    @Override // defpackage.dt, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        this.w = z;
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        t(pictureInPictureUiState.isStashed());
    }

    protected void t(boolean z) {
        throw null;
    }
}
