package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaMetadata extends AbstractSafeParcelable {
    private static final qkc e;
    public final List a;
    final Bundle b;
    public int c;
    private static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator CREATOR = new qjl(8);

    static {
        qkc qkcVar = new qkc();
        qkcVar.b("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        qkcVar.b("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        qkcVar.b("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        qkcVar.b("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        qkcVar.b("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        qkcVar.b("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        qkcVar.b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        qkcVar.b("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        qkcVar.b("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        qkcVar.b("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        qkcVar.b("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        qkcVar.b("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        qkcVar.b("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        qkcVar.b("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        qkcVar.b("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        qkcVar.b("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        qkcVar.b("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        qkcVar.b("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        qkcVar.b("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        qkcVar.b("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        qkcVar.b("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        qkcVar.b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        qkcVar.b("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        qkcVar.b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        qkcVar.b("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        qkcVar.b("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        qkcVar.b("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        qkcVar.b("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        e = qkcVar;
    }

    public MediaMetadata() {
        this(0);
    }

    public MediaMetadata(List list, Bundle bundle, int i) {
        this.a = list;
        this.b = bundle;
        this.c = i;
    }

    private final boolean d(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !d((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int a = e.a(str);
        if (a == 1 || a == 0) {
            return this.b.getString(str);
        }
        String str2 = d[1];
        StringBuilder sb = new StringBuilder(str.length() + 21 + String.valueOf(str2).length());
        sb.append("Value for ");
        sb.append(str);
        sb.append(" must be a ");
        sb.append(str2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void b(JSONObject jSONObject) {
        this.b.clear();
        this.a.clear();
        this.c = 0;
        try {
            this.c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            qqc.b(this.a, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.c;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    qkc qkcVar = e;
                    String str = (String) qkcVar.a.get(next);
                    if (str != null) {
                        if (hashSet.contains(str)) {
                            try {
                                Object obj = jSONObject.get(next);
                                if (obj != null) {
                                    int a = qkcVar.a(str);
                                    if (a != 1) {
                                        if (a != 2) {
                                            if (a == 3) {
                                                double optDouble = jSONObject.optDouble(next);
                                                if (!Double.isNaN(optDouble)) {
                                                    this.b.putDouble(str, optDouble);
                                                }
                                            } else if (a != 4) {
                                                if (a == 5) {
                                                    this.b.putLong(str, qpl.b(jSONObject.optLong(next)));
                                                }
                                            } else if (obj instanceof String) {
                                                String str2 = (String) obj;
                                                if (qqc.a(str2) != null) {
                                                    this.b.putString(str, str2);
                                                }
                                            }
                                        } else if (obj instanceof Integer) {
                                            this.b.putInt(str, ((Integer) obj).intValue());
                                        }
                                    } else if (obj instanceof String) {
                                        this.b.putString(str, (String) obj);
                                    }
                                }
                            } catch (JSONException unused2) {
                            }
                        }
                    } else {
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof String) {
                            this.b.putString(next, (String) obj2);
                        } else if (obj2 instanceof Integer) {
                            this.b.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Double) {
                            this.b.putDouble(next, ((Double) obj2).doubleValue());
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public final boolean c() {
        List list = this.a;
        return list != null && !list.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return d(this.b, mediaMetadata.b) && this.a.equals(mediaMetadata.a);
    }

    public final int hashCode() {
        Bundle bundle = this.b;
        int i = 17;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = this.b.get(str);
                i = (i * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (i * 31) + this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.J(parcel, 2, this.a);
        tqj.v(parcel, 3, this.b);
        tqj.s(parcel, 4, this.c);
        tqj.n(parcel, m);
    }

    public MediaMetadata(int i) {
        this(new ArrayList(), new Bundle(), i);
    }
}
