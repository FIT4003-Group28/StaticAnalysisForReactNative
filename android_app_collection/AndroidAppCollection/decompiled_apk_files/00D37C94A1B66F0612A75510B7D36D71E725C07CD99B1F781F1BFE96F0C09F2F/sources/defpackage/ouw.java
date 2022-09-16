package defpackage;

import android.media.AudioTrack;
import android.media.PlaybackParams;
/* compiled from: PG */
/* renamed from: ouw  reason: default package */
/* loaded from: classes4.dex */
final class ouw extends ouv {
    private PlaybackParams f;
    private float g = 1.0f;

    private final void i() {
        PlaybackParams playbackParams;
        AudioTrack audioTrack = this.a;
        if (audioTrack == null || (playbackParams = this.f) == null) {
            return;
        }
        audioTrack.setPlaybackParams(playbackParams);
    }

    @Override // defpackage.ouu
    public final float a() {
        return this.g;
    }

    @Override // defpackage.ouv, defpackage.ouu
    public final void f(AudioTrack audioTrack, boolean z) {
        super.f(audioTrack, z);
        i();
    }

    @Override // defpackage.ouu
    public final void g(PlaybackParams playbackParams) {
        if (playbackParams == null) {
            playbackParams = new PlaybackParams();
        }
        PlaybackParams allowDefaults = playbackParams.allowDefaults();
        this.f = allowDefaults;
        this.g = allowDefaults.getSpeed();
        i();
    }
}
