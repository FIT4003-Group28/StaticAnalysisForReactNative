package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f558a = Log.isLoggable("MediaBrowserCompat", 3);

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a(String str, Bundle bundle, Bundle bundle2) {
        }

        public void b(String str, Bundle bundle, Bundle bundle2) {
        }

        public void c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(MediaItem mediaItem) {
        }

        public void a(String str) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public void a(String str, Bundle bundle) {
        }

        public void a(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private final int f561a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaDescriptionCompat f562b;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        MediaItem(Parcel parcel) {
            this.f561a = parcel.readInt();
            this.f562b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f561a);
            this.f562b.writeToParcel(parcel, i);
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f561a + ", mDescription=" + this.f562b + '}';
        }
    }

    /* loaded from: classes.dex */
    private static class ItemReceiver extends android.support.v4.f.c {

        /* renamed from: d  reason: collision with root package name */
        private final String f560d;
        private final b e;

        @Override // android.support.v4.f.c
        protected void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.e.a(this.f560d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.e.a((MediaItem) parcelable);
            } else {
                this.e.a(this.f560d);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class SearchResultReceiver extends android.support.v4.f.c {

        /* renamed from: d  reason: collision with root package name */
        private final String f563d;
        private final Bundle e;
        private final c f;

        @Override // android.support.v4.f.c
        protected void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f.a(this.f563d, this.e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.f.a(this.f563d, this.e, arrayList);
        }
    }

    /* loaded from: classes.dex */
    private static class CustomActionResultReceiver extends android.support.v4.f.c {

        /* renamed from: d  reason: collision with root package name */
        private final String f559d;
        private final Bundle e;
        private final a f;

        @Override // android.support.v4.f.c
        protected void a(int i, Bundle bundle) {
            if (this.f == null) {
                return;
            }
            switch (i) {
                case -1:
                    this.f.c(this.f559d, this.e, bundle);
                    return;
                case 0:
                    this.f.b(this.f559d, this.e, bundle);
                    return;
                case 1:
                    this.f.a(this.f559d, this.e, bundle);
                    return;
                default:
                    Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.e + ", resultData=" + bundle + ")");
                    return;
            }
        }
    }
}
