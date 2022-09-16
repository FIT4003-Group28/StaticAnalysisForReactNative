package defpackage;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
/* compiled from: PG */
/* renamed from: arg  reason: default package */
/* loaded from: classes2.dex */
final class arg extends arm {
    final /* synthetic */ arn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arg(Object obj, arn arnVar) {
        super(obj);
        this.a = arnVar;
    }

    @Override // defpackage.arm
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) obj;
        if (mediaBrowserCompat$MediaItem == null) {
            this.a.a(null);
            return;
        }
        Parcel obtain = Parcel.obtain();
        mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
        this.a.a(obtain);
    }
}
