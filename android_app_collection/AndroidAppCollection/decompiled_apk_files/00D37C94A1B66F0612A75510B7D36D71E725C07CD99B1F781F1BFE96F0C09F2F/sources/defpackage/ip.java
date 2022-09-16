package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.google.android.youtube.R;
import j$.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: ip  reason: default package */
/* loaded from: classes3.dex */
public final class ip {
    public final il a;
    public final MediaSessionCompat$Token b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public ip(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.b = mediaSessionCompat$Token;
        this.a = new in(context, mediaSessionCompat$Token);
    }

    public static void d(Activity activity, ip ipVar) {
        activity.getWindow().getDecorView().setTag(R.id.media_controller_compat_view_tag, ipVar);
        activity.setMediaController(ipVar != null ? new MediaController(activity, (MediaSession.Token) ipVar.b.b) : null);
    }

    public final MediaMetadataCompat a() {
        MediaMetadata metadata = ((in) this.a).a.getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.c(metadata);
        }
        return null;
    }

    public final io b() {
        MediaController.TransportControls transportControls = ((in) this.a).a.getTransportControls();
        if (Build.VERSION.SDK_INT >= 29) {
            return new io(transportControls);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return new io(transportControls);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return new io(transportControls);
        }
        return new io(transportControls);
    }

    public final PlaybackStateCompat c() {
        il ilVar = this.a;
        in inVar = (in) ilVar;
        if (inVar.e.a() != null) {
            try {
                return ((in) ilVar).e.a().a();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = inVar.a.getPlaybackState();
        if (playbackState == null) {
            return null;
        }
        return PlaybackStateCompat.a(playbackState);
    }

    public final void e(ik ikVar) {
        if (ikVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.c.remove(ikVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            il ilVar = this.a;
            ((in) ilVar).a.unregisterCallback(ikVar.a);
            synchronized (((in) ilVar).b) {
                if (((in) ilVar).e.a() != null) {
                    try {
                        im imVar = (im) ((in) ilVar).d.remove(ikVar);
                        if (imVar != null) {
                            ikVar.c = null;
                            ((in) ilVar).e.a().c(imVar);
                        }
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                    }
                } else {
                    ((in) ilVar).c.remove(ikVar);
                }
            }
        } finally {
            ikVar.e(null);
        }
    }

    public ip(Context context, iz izVar) {
        MediaSessionCompat$Token b = izVar.b();
        this.b = b;
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new in(context, b);
        } else {
            this.a = new in(context, b);
        }
    }
}
