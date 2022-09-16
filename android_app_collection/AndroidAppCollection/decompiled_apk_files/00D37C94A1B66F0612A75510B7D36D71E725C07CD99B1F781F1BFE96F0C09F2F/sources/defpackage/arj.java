package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: arj  reason: default package */
/* loaded from: classes2.dex */
final class arj extends arm {
    final /* synthetic */ arn a;
    final /* synthetic */ Bundle b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arj(Object obj, arn arnVar, Bundle bundle) {
        super(obj);
        this.a = arnVar;
        this.b = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arm
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (obj == 0) {
            this.a.a(null);
            return;
        }
        List<MediaBrowserCompat$MediaItem> list = obj;
        if ((this.h & 1) != 0) {
            list = arx.a(obj, this.b);
        }
        ArrayList arrayList = new ArrayList();
        for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
            Parcel obtain = Parcel.obtain();
            mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
            arrayList.add(obtain);
        }
        this.a.a(arrayList);
    }
}
