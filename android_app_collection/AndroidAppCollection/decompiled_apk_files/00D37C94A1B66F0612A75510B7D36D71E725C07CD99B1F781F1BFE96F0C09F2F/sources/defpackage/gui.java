package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
/* compiled from: PG */
/* renamed from: gui  reason: default package */
/* loaded from: classes3.dex */
final class gui extends ajbg {
    final /* synthetic */ SfvAudioItemPlaybackController a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gui(SfvAudioItemPlaybackController sfvAudioItemPlaybackController, long j, long j2) {
        super(j, j2, 1, 1, null);
        this.a = sfvAudioItemPlaybackController;
    }

    @Override // defpackage.ajbg
    protected final void a() {
        Handler handler = new Handler();
        final SfvAudioItemPlaybackController sfvAudioItemPlaybackController = this.a;
        handler.post(new Runnable() { // from class: guh
            @Override // java.lang.Runnable
            public final void run() {
                SfvAudioItemPlaybackController.this.i();
            }
        });
    }
}
