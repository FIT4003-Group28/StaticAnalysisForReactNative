package defpackage;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.List;
/* compiled from: PG */
/* renamed from: lo  reason: default package */
/* loaded from: classes7.dex */
final class lo extends ln {
    public lo(lp lpVar) {
        super(lpVar);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
        mm.a(bundle);
        MediaBrowserCompat$MediaItem.a(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str, Bundle bundle) {
        mm.a(bundle);
    }
}
