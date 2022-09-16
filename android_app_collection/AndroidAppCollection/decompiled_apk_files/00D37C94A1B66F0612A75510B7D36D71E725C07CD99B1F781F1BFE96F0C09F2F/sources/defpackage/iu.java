package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
/* compiled from: PG */
/* renamed from: iu  reason: default package */
/* loaded from: classes3.dex */
class iu implements it {
    final MediaSession a;
    final MediaSessionCompat$Token b;
    final Object c = new Object();
    boolean d = false;
    final RemoteCallbackList e = new RemoteCallbackList();
    PlaybackStateCompat f;
    MediaMetadataCompat g;
    int h;
    is i;
    ary j;

    public iu(Context context, String str) {
        MediaSession s = s(context, str);
        this.a = s;
        this.b = new MediaSessionCompat$Token(s.getSessionToken(), new ig(this));
        q();
    }

    @Override // defpackage.it
    public final is a() {
        is isVar;
        synchronized (this.c) {
            isVar = this.i;
        }
        return isVar;
    }

    @Override // defpackage.it
    public final MediaSessionCompat$Token b() {
        return this.b;
    }

    @Override // defpackage.it
    public final PlaybackStateCompat c() {
        return this.f;
    }

    @Override // defpackage.it
    public ary d() {
        ary aryVar;
        synchronized (this.c) {
            aryVar = this.j;
        }
        return aryVar;
    }

    @Override // defpackage.it
    public final String e() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return (String) this.a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.a, new Object[0]);
        } catch (Exception e) {
            Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            return null;
        }
    }

    @Override // defpackage.it
    public final void f() {
        this.d = true;
        this.e.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = this.a.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(this.a);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
            }
        }
        this.a.setCallback(null);
        this.a.release();
    }

    @Override // defpackage.it
    public final void g(boolean z) {
        this.a.setActive(z);
    }

    @Override // defpackage.it
    public void i(ary aryVar) {
        synchronized (this.c) {
            this.j = aryVar;
        }
    }

    @Override // defpackage.it
    public final void j(PendingIntent pendingIntent) {
        this.a.setMediaButtonReceiver(pendingIntent);
    }

    @Override // defpackage.it
    public final void l(PlaybackStateCompat playbackStateCompat) {
        this.f = playbackStateCompat;
        int beginBroadcast = this.e.beginBroadcast();
        while (true) {
            beginBroadcast--;
            if (beginBroadcast < 0) {
                break;
            }
            try {
                ((ie) this.e.getBroadcastItem(beginBroadcast)).a(playbackStateCompat);
            } catch (RemoteException unused) {
            }
        }
        this.e.finishBroadcast();
        MediaSession mediaSession = this.a;
        if (playbackStateCompat.l == null) {
            PlaybackState.Builder i = ja.i();
            ja.x(i, playbackStateCompat.a, playbackStateCompat.b, playbackStateCompat.d, playbackStateCompat.h);
            ja.u(i, playbackStateCompat.c);
            ja.s(i, playbackStateCompat.e);
            ja.v(i, playbackStateCompat.g);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.i) {
                PlaybackState.CustomAction customAction2 = customAction.e;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder j = ja.j(customAction.a, customAction.b, customAction.c);
                    ja.w(j, customAction.d);
                    customAction2 = ja.k(j);
                }
                ja.r(i, customAction2);
            }
            ja.t(i, playbackStateCompat.j);
            if (Build.VERSION.SDK_INT >= 22) {
                jb.b(i, playbackStateCompat.k);
            }
            playbackStateCompat.l = ja.l(i);
        }
        mediaSession.setPlaybackState(playbackStateCompat.l);
    }

    @Override // defpackage.it
    public final void m(int i) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        this.a.setPlaybackToLocal(builder.build());
    }

    @Override // defpackage.it
    public final void n(asd asdVar) {
        this.a.setPlaybackToRemote((VolumeProvider) asdVar.a());
    }

    @Override // defpackage.it
    public final void o(PendingIntent pendingIntent) {
        this.a.setSessionActivity(pendingIntent);
    }

    @Override // defpackage.it
    public final boolean p() {
        return this.a.isActive();
    }

    @Override // defpackage.it
    public final void q() {
        this.a.setFlags(3);
    }

    @Override // defpackage.it
    public void r() {
        this.h = 2;
    }

    public MediaSession s(Context context, String str) {
        return new MediaSession(context, str);
    }

    @Override // defpackage.it
    public final void h(is isVar, Handler handler) {
        synchronized (this.c) {
            this.i = isVar;
            iq iqVar = null;
            this.a.setCallback(isVar == null ? null : isVar.b, handler);
            if (isVar != null) {
                synchronized (isVar.a) {
                    isVar.c = new WeakReference(this);
                    iq iqVar2 = isVar.d;
                    if (iqVar2 != null) {
                        iqVar2.removeCallbacksAndMessages(null);
                    }
                    if (handler != null) {
                        iqVar = new iq(isVar, handler.getLooper());
                    }
                    isVar.d = iqVar;
                }
            }
        }
    }

    @Override // defpackage.it
    public final void k(MediaMetadataCompat mediaMetadataCompat) {
        MediaMetadata mediaMetadata;
        this.g = mediaMetadataCompat;
        MediaSession mediaSession = this.a;
        if (mediaMetadataCompat == null) {
            mediaMetadata = null;
        } else {
            if (mediaMetadataCompat.c == null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadataCompat.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat.c = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
            mediaMetadata = mediaMetadataCompat.c;
        }
        mediaSession.setMetadata(mediaMetadata);
    }
}
