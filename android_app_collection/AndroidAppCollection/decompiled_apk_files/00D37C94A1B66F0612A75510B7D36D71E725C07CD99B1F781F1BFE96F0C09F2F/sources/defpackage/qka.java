package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.VastAdsRequest;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: qka  reason: default package */
/* loaded from: classes4.dex */
public final class qka implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = tqj.Q(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        MediaMetadata mediaMetadata = null;
        ArrayList arrayList = null;
        TextTrackStyle textTrackStyle = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        VastAdsRequest vastAdsRequest = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (tqj.M(readInt)) {
                case 2:
                    str = tqj.Y(parcel, readInt);
                    break;
                case 3:
                    i = tqj.O(parcel, readInt);
                    break;
                case 4:
                    str2 = tqj.Y(parcel, readInt);
                    break;
                case 5:
                    mediaMetadata = (MediaMetadata) tqj.U(parcel, readInt, MediaMetadata.CREATOR);
                    break;
                case 6:
                    j = tqj.R(parcel, readInt);
                    break;
                case 7:
                    arrayList = tqj.ab(parcel, readInt, MediaTrack.CREATOR);
                    break;
                case 8:
                    textTrackStyle = (TextTrackStyle) tqj.U(parcel, readInt, TextTrackStyle.CREATOR);
                    break;
                case 9:
                    str3 = tqj.Y(parcel, readInt);
                    break;
                case 10:
                    arrayList2 = tqj.ab(parcel, readInt, AdBreakInfo.CREATOR);
                    break;
                case 11:
                    arrayList3 = tqj.ab(parcel, readInt, AdBreakClipInfo.CREATOR);
                    break;
                case 12:
                    str4 = tqj.Y(parcel, readInt);
                    break;
                case 13:
                    vastAdsRequest = (VastAdsRequest) tqj.U(parcel, readInt, VastAdsRequest.CREATOR);
                    break;
                case 14:
                    j2 = tqj.R(parcel, readInt);
                    break;
                case 15:
                    str5 = tqj.Y(parcel, readInt);
                    break;
                case 16:
                    str6 = tqj.Y(parcel, readInt);
                    break;
                case 17:
                    str7 = tqj.Y(parcel, readInt);
                    break;
                case 18:
                    str8 = tqj.Y(parcel, readInt);
                    break;
                default:
                    tqj.ad(parcel, readInt);
                    break;
            }
        }
        tqj.ac(parcel, Q);
        return new MediaInfo(str, i, str2, mediaMetadata, j, arrayList, textTrackStyle, str3, arrayList2, arrayList3, str4, vastAdsRequest, j2, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaInfo[i];
    }
}
