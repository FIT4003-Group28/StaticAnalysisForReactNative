package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.app.g;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* loaded from: classes.dex */
    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        HandlerC0014a f582a;

        /* renamed from: b  reason: collision with root package name */
        boolean f583b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f584c;

        public void a() {
        }

        public void a(int i) {
        }

        public void a(Bundle bundle) {
        }

        public void a(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void a(b bVar) {
        }

        public void a(PlaybackStateCompat playbackStateCompat) {
        }

        public void a(CharSequence charSequence) {
        }

        public void a(String str, Bundle bundle) {
        }

        public void a(List<MediaSessionCompat.QueueItem> list) {
        }

        public void a(boolean z) {
        }

        public void b() {
        }

        public void b(int i) {
        }

        public a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f584c = android.support.v4.media.session.c.a(new b(this));
            } else {
                this.f584c = new c(this);
            }
        }

        void a(int i, Object obj, Bundle bundle) {
            if (this.f582a != null) {
                Message obtainMessage = this.f582a.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* loaded from: classes.dex */
        private static class b implements c.a {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<a> f587a;

            b(a aVar) {
                this.f587a = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.c.a
            public void a() {
                a aVar = this.f587a.get();
                if (aVar != null) {
                    aVar.b();
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void a(String str, Bundle bundle) {
                a aVar = this.f587a.get();
                if (aVar != null) {
                    if (aVar.f583b && Build.VERSION.SDK_INT < 23) {
                        return;
                    }
                    aVar.a(str, bundle);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void a(Object obj) {
                a aVar = this.f587a.get();
                if (aVar == null || aVar.f583b) {
                    return;
                }
                aVar.a(PlaybackStateCompat.a(obj));
            }

            @Override // android.support.v4.media.session.c.a
            public void b(Object obj) {
                a aVar = this.f587a.get();
                if (aVar != null) {
                    aVar.a(MediaMetadataCompat.a(obj));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void a(List<?> list) {
                a aVar = this.f587a.get();
                if (aVar != null) {
                    aVar.a(MediaSessionCompat.QueueItem.a(list));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void a(CharSequence charSequence) {
                a aVar = this.f587a.get();
                if (aVar != null) {
                    aVar.a(charSequence);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void a(Bundle bundle) {
                a aVar = this.f587a.get();
                if (aVar != null) {
                    aVar.a(bundle);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void a(int i, int i2, int i3, int i4, int i5) {
                a aVar = this.f587a.get();
                if (aVar != null) {
                    aVar.a(new b(i, i2, i3, i4, i5));
                }
            }
        }

        /* loaded from: classes.dex */
        private static class c extends a.AbstractBinderC0015a {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<a> f588a;

            @Override // android.support.v4.media.session.a
            public void a(boolean z) {
            }

            c(a aVar) {
                this.f588a = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void a(String str, Bundle bundle) {
                a aVar = this.f588a.get();
                if (aVar != null) {
                    aVar.a(1, str, bundle);
                }
            }

            public void a() {
                a aVar = this.f588a.get();
                if (aVar != null) {
                    aVar.a(8, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void a(PlaybackStateCompat playbackStateCompat) {
                a aVar = this.f588a.get();
                if (aVar != null) {
                    aVar.a(2, playbackStateCompat, null);
                }
            }

            public void a(MediaMetadataCompat mediaMetadataCompat) {
                a aVar = this.f588a.get();
                if (aVar != null) {
                    aVar.a(3, mediaMetadataCompat, null);
                }
            }

            public void a(List<MediaSessionCompat.QueueItem> list) {
                a aVar = this.f588a.get();
                if (aVar != null) {
                    aVar.a(5, list, null);
                }
            }

            public void a(CharSequence charSequence) {
                a aVar = this.f588a.get();
                if (aVar != null) {
                    aVar.a(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void b(boolean z) {
                a aVar = this.f588a.get();
                if (aVar != null) {
                    aVar.a(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void a(int i) {
                a aVar = this.f588a.get();
                if (aVar != null) {
                    aVar.a(9, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void b(int i) {
                a aVar = this.f588a.get();
                if (aVar != null) {
                    aVar.a(12, Integer.valueOf(i), null);
                }
            }

            public void a(Bundle bundle) {
                a aVar = this.f588a.get();
                if (aVar != null) {
                    aVar.a(7, bundle, null);
                }
            }

            public void a(ParcelableVolumeInfo parcelableVolumeInfo) {
                a aVar = this.f588a.get();
                if (aVar != null) {
                    aVar.a(4, parcelableVolumeInfo != null ? new b(parcelableVolumeInfo.f599a, parcelableVolumeInfo.f600b, parcelableVolumeInfo.f601c, parcelableVolumeInfo.f602d, parcelableVolumeInfo.e) : null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void b() {
                a aVar = this.f588a.get();
                if (aVar != null) {
                    aVar.a(13, null, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class HandlerC0014a extends Handler {

            /* renamed from: a  reason: collision with root package name */
            boolean f585a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f586b;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (!this.f585a) {
                    return;
                }
                switch (message.what) {
                    case 1:
                        this.f586b.a((String) message.obj, message.getData());
                        return;
                    case 2:
                        this.f586b.a((PlaybackStateCompat) message.obj);
                        return;
                    case 3:
                        this.f586b.a((MediaMetadataCompat) message.obj);
                        return;
                    case 4:
                        this.f586b.a((b) message.obj);
                        return;
                    case 5:
                        this.f586b.a((List) message.obj);
                        return;
                    case 6:
                        this.f586b.a((CharSequence) message.obj);
                        return;
                    case 7:
                        this.f586b.a((Bundle) message.obj);
                        return;
                    case 8:
                        this.f586b.b();
                        return;
                    case 9:
                        this.f586b.a(((Integer) message.obj).intValue());
                        return;
                    case 10:
                    default:
                        return;
                    case 11:
                        this.f586b.a(((Boolean) message.obj).booleanValue());
                        return;
                    case 12:
                        this.f586b.b(((Integer) message.obj).intValue());
                        return;
                    case 13:
                        this.f586b.a();
                        return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f589a;

        /* renamed from: b  reason: collision with root package name */
        private final int f590b;

        /* renamed from: c  reason: collision with root package name */
        private final int f591c;

        /* renamed from: d  reason: collision with root package name */
        private final int f592d;
        private final int e;

        b(int i, int i2, int i3, int i4, int i5) {
            this.f589a = i;
            this.f590b = i2;
            this.f591c = i3;
            this.f592d = i4;
            this.e = i5;
        }
    }

    /* loaded from: classes.dex */
    static class MediaControllerImplApi21 {

        /* renamed from: a  reason: collision with root package name */
        private final List<a> f578a;

        /* renamed from: b  reason: collision with root package name */
        private android.support.v4.media.session.b f579b;

        /* renamed from: c  reason: collision with root package name */
        private HashMap<a, a> f580c;

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.f579b == null) {
                return;
            }
            synchronized (this.f578a) {
                for (a aVar : this.f578a) {
                    a aVar2 = new a(aVar);
                    this.f580c.put(aVar, aVar2);
                    aVar.f583b = true;
                    try {
                        this.f579b.a(aVar2);
                        aVar.a();
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.f578a.clear();
            }
        }

        /* loaded from: classes.dex */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a  reason: collision with root package name */
            private WeakReference<MediaControllerImplApi21> f581a;

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f581a.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                mediaControllerImplApi21.f579b = b.a.a(g.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                mediaControllerImplApi21.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a extends a.c {
            a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void a() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void a(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void a(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void a(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }
    }
}
