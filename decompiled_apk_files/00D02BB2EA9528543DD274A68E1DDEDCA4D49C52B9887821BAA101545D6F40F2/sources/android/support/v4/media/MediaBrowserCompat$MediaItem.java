package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new lk();
    public final int a;
    public final MediaDescriptionCompat b;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public static List<MediaBrowserCompat$MediaItem> a(List<?> list) {
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
                    mediaBrowserCompat$MediaItem = new MediaBrowserCompat$MediaItem(MediaDescriptionCompat.a(mediaItem.getDescription()), mediaItem.getFlags());
                } else {
                    mediaBrowserCompat$MediaItem = null;
                }
                arrayList.add(mediaBrowserCompat$MediaItem);
            }
            return arrayList;
        }
        return null;
    }

    public final String b() {
        return this.b.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, i);
    }

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("description cannot be null");
        }
        if (!TextUtils.isEmpty(mediaDescriptionCompat.a)) {
            this.a = i;
            this.b = mediaDescriptionCompat;
            return;
        }
        throw new IllegalArgumentException("description must have a non-empty media id");
    }
}
