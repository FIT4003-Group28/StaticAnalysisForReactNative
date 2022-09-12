package defpackage;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ln  reason: default package */
/* loaded from: classes7.dex */
class ln extends MediaBrowser.SubscriptionCallback {
    final /* synthetic */ lp a;

    public ln(lp lpVar) {
        this.a = lpVar;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
        WeakReference<lm> weakReference = this.a.c;
        lm lmVar = weakReference == null ? null : weakReference.get();
        if (lmVar == null) {
            this.a.a(MediaBrowserCompat$MediaItem.a(list));
            return;
        }
        List<MediaBrowserCompat$MediaItem> a = MediaBrowserCompat$MediaItem.a(list);
        List<lp> list2 = lmVar.a;
        List<Bundle> list3 = lmVar.b;
        for (int i = 0; i < list2.size(); i++) {
            Bundle bundle = list3.get(i);
            if (bundle == null) {
                this.a.a(a);
            } else if (a != null) {
                int i2 = -1;
                int i3 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i4 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i3 != -1) {
                    i2 = i3;
                } else if (i4 == -1) {
                }
                int i5 = i4 * i2;
                int i6 = i5 + i4;
                if (i2 < 0 || i4 <= 0 || i5 >= a.size()) {
                    Collections.emptyList();
                } else {
                    if (i6 > a.size()) {
                        i6 = a.size();
                    }
                    a.subList(i5, i6);
                }
            }
        }
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str) {
        this.a.b();
    }
}
