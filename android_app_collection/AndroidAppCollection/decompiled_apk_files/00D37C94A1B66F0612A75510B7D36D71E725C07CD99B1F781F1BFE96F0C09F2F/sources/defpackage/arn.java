package defpackage;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: arn  reason: default package */
/* loaded from: classes2.dex */
final class arn {
    final MediaBrowserService.Result a;

    public arn(MediaBrowserService.Result result) {
        this.a = result;
    }

    public final void a(Object obj) {
        ArrayList arrayList = null;
        if (obj instanceof List) {
            MediaBrowserService.Result result = this.a;
            List<Parcel> list = (List) obj;
            if (list != null) {
                arrayList = new ArrayList();
                for (Parcel parcel : list) {
                    parcel.setDataPosition(0);
                    arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            result.sendResult(arrayList);
        } else if (obj instanceof Parcel) {
            Parcel parcel2 = (Parcel) obj;
            parcel2.setDataPosition(0);
            this.a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        } else {
            this.a.sendResult(null);
        }
    }
}
