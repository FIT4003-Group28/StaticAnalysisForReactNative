package defpackage;

import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: PG */
/* renamed from: lp  reason: default package */
/* loaded from: classes7.dex */
public class lp {
    final MediaBrowser.SubscriptionCallback a;
    final IBinder b = new Binder();
    WeakReference<lm> c;

    public lp() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new lo(this);
        } else {
            this.a = new ln(this);
        }
    }

    public void a(List<MediaBrowserCompat$MediaItem> list) {
        throw null;
    }

    public void b() {
        throw null;
    }
}
