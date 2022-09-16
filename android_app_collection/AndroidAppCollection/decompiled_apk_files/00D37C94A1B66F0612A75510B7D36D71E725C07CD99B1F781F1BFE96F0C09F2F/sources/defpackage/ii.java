package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ii  reason: default package */
/* loaded from: classes3.dex */
final class ii extends MediaController.Callback {
    private final WeakReference a;

    public ii(ik ikVar) {
        this.a = new WeakReference(ikVar);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((ik) this.a.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            int i = AudioAttributesCompat.b;
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        iz.c(bundle);
        ik ikVar = (ik) this.a.get();
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        ik ikVar = (ik) this.a.get();
        if (ikVar != null) {
            ikVar.a(MediaMetadataCompat.c(mediaMetadata));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        ik ikVar = (ik) this.a.get();
        if (ikVar == null || ikVar.c != null) {
            return;
        }
        ikVar.b(PlaybackStateCompat.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((ik) this.a.get()) == null || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(MediaDescriptionCompat.a(iy.oW(queueItem)), iy.oV(queueItem));
            } else {
                mediaSessionCompat$QueueItem = null;
            }
            arrayList.add(mediaSessionCompat$QueueItem);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        ik ikVar = (ik) this.a.get();
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        ik ikVar = (ik) this.a.get();
        if (ikVar != null) {
            ikVar.c();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        iz.c(bundle);
        ik ikVar = (ik) this.a.get();
    }
}
