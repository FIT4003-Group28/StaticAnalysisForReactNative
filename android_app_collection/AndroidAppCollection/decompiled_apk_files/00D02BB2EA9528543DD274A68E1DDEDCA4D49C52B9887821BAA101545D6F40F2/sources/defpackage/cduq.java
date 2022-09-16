package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.ugc.post.photo.AutoValue_MediaData;
import com.google.android.apps.gmm.ugc.post.photo.MediaData;
/* compiled from: PG */
/* renamed from: cduq  reason: default package */
/* loaded from: classes4.dex */
public final class cduq implements Parcelable.Creator<AutoValue_MediaData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_MediaData createFromParcel(Parcel parcel) {
        char c;
        int i;
        Uri uri = (Uri) parcel.readParcelable(MediaData.class.getClassLoader());
        dbsg dbsgVar = (dbsg) parcel.readSerializable();
        String readString = parcel.readString();
        int hashCode = readString.hashCode();
        if (hashCode != -1852497085) {
            if (hashCode == 1990584267 && readString.equals("CLIENT")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (readString.equals("SERVER")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            i = 1;
        } else if (c != 1) {
            throw new IllegalArgumentException();
        } else {
            i = 2;
        }
        return new AutoValue_MediaData(uri, dbsgVar, i, (dbsg) parcel.readSerializable(), (dbsg) parcel.readSerializable(), (dbsg) parcel.readSerializable(), (dbsg) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_MediaData[] newArray(int i) {
        return new AutoValue_MediaData[i];
    }
}
