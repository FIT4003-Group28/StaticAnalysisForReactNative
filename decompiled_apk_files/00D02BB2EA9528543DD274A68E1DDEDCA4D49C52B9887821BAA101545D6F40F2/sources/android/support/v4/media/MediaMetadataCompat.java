package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    static final aif<String, Integer> a;
    public final Bundle b;
    private MediaMetadata c;

    static {
        aif<String, Integer> aifVar = new aif<>();
        a = aifVar;
        aifVar.put("android.media.metadata.TITLE", 1);
        aifVar.put("android.media.metadata.ARTIST", 1);
        aifVar.put("android.media.metadata.DURATION", 0);
        aifVar.put("android.media.metadata.ALBUM", 1);
        aifVar.put("android.media.metadata.AUTHOR", 1);
        aifVar.put("android.media.metadata.WRITER", 1);
        aifVar.put("android.media.metadata.COMPOSER", 1);
        aifVar.put("android.media.metadata.COMPILATION", 1);
        aifVar.put("android.media.metadata.DATE", 1);
        aifVar.put("android.media.metadata.YEAR", 0);
        aifVar.put("android.media.metadata.GENRE", 1);
        aifVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aifVar.put("android.media.metadata.NUM_TRACKS", 0);
        aifVar.put("android.media.metadata.DISC_NUMBER", 0);
        aifVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aifVar.put("android.media.metadata.ART", 2);
        aifVar.put("android.media.metadata.ART_URI", 1);
        aifVar.put("android.media.metadata.ALBUM_ART", 2);
        aifVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aifVar.put("android.media.metadata.USER_RATING", 3);
        aifVar.put("android.media.metadata.RATING", 3);
        aifVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aifVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aifVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aifVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aifVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aifVar.put("android.media.metadata.MEDIA_ID", 1);
        aifVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aifVar.put("android.media.metadata.MEDIA_URI", 1);
        aifVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aifVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new lt();
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.b = parcel.readBundle(mm.class.getClassLoader());
    }

    public static MediaMetadataCompat c(Object obj) {
        if (obj != null) {
            Parcel obtain = Parcel.obtain();
            MediaMetadata mediaMetadata = (MediaMetadata) obj;
            mediaMetadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.c = mediaMetadata;
            return createFromParcel;
        }
        return null;
    }

    public final String a(String str) {
        CharSequence charSequence = this.b.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final Bitmap b(String str) {
        try {
            return (Bitmap) this.b.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }
}
