package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqh  reason: default package */
/* loaded from: classes2.dex */
public final class aqh extends aqu {
    final String a;
    final MediaRouter2.RoutingController b;
    final Messenger c;
    final Messenger d;
    final Handler f;
    final SparseArray<arf> e = new SparseArray<>();
    final AtomicInteger g = new AtomicInteger(1);
    private final Runnable n = new Runnable(this) { // from class: aqf
        private final aqh a;

        {
            this.a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.h = -1;
        }
    };
    int h = -1;

    public aqh(MediaRouter2.RoutingController routingController, String str) {
        Bundle controlHints;
        this.b = routingController;
        this.a = str;
        Messenger messenger = null;
        Messenger messenger2 = (routingController == null || (controlHints = routingController.getControlHints()) == null) ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        this.c = messenger2;
        this.d = messenger2 != null ? new Messenger(new aqg(this)) : messenger;
        this.f = new Handler(Looper.getMainLooper());
    }

    private final void j() {
        this.f.removeCallbacks(this.n);
        this.f.postDelayed(this.n, 1000L);
    }

    @Override // defpackage.aqx
    public final void a(int i) {
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.h = i;
        j();
    }

    @Override // defpackage.aqx
    public final void b(int i) {
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null) {
            return;
        }
        int i2 = this.h;
        if (i2 < 0) {
            i2 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i2 + i, this.b.getVolumeMax()));
        this.h = max;
        this.b.setVolume(max);
        j();
    }

    @Override // defpackage.aqx
    public final void c() {
        this.b.release();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str, int i) {
        int andIncrement = this.g.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = this.d;
        try {
            this.c.send(obtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str, int i) {
        int andIncrement = this.g.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 8;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = this.d;
        try {
            this.c.send(obtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }
}
