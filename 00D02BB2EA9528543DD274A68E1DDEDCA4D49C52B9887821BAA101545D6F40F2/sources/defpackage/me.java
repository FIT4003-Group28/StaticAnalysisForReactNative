package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: me  reason: default package */
/* loaded from: classes7.dex */
public final class me implements mc {
    public final MediaController a;
    public final Object b = new Object();
    public final List<mb> c = new ArrayList();
    public final HashMap<mb, md> d = new HashMap<>();
    public final MediaSessionCompat$Token e;

    public me(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.b);
        this.a = mediaController;
        if (mediaSessionCompat$Token.b() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiver(this) { // from class: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                private WeakReference<me> a;

                {
                    super(null);
                    this.a = new WeakReference<>(this);
                }

                @Override // android.os.ResultReceiver
                protected final void onReceiveResult(int i, Bundle bundle) {
                    lx lxVar;
                    me meVar = this.a.get();
                    if (meVar == null || bundle == null) {
                        return;
                    }
                    synchronized (meVar.b) {
                        MediaSessionCompat$Token mediaSessionCompat$Token2 = meVar.e;
                        IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                        if (binder == null) {
                            lxVar = null;
                        } else {
                            IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof lx)) {
                                lxVar = new lx(binder);
                            } else {
                                lxVar = (lx) queryLocalInterface;
                            }
                        }
                        synchronized (mediaSessionCompat$Token2.a) {
                            mediaSessionCompat$Token2.c = lxVar;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token3 = meVar.e;
                        try {
                            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                            if (bundle2 != null) {
                                bundle2.setClassLoader(bao.class.getClassLoader());
                                Parcelable parcelable = bundle2.getParcelable("a");
                                if (!(parcelable instanceof ParcelImpl)) {
                                    throw new IllegalArgumentException("Invalid parcel");
                                }
                                bar barVar = ((ParcelImpl) parcelable).a;
                            }
                        } catch (RuntimeException unused) {
                        }
                        synchronized (mediaSessionCompat$Token3.a) {
                        }
                        if (meVar.e.b() != null) {
                            for (mb mbVar : meVar.c) {
                                md mdVar = new md(mbVar);
                                meVar.d.put(mbVar, mdVar);
                                mbVar.c = mdVar;
                                try {
                                    meVar.e.b().a(mdVar);
                                    mbVar.d(13, null, null);
                                } catch (RemoteException unused2) {
                                }
                            }
                            meVar.c.clear();
                        }
                    }
                }
            });
        }
    }
}
