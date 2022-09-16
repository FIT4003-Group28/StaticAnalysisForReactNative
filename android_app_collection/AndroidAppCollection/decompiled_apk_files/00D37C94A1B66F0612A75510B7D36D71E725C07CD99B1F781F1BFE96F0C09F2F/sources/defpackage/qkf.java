package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.VideoInfo;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: qkf  reason: default package */
/* loaded from: classes4.dex */
public final class qkf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = tqj.Q(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        ArrayList arrayList = null;
        AdBreakStatus adBreakStatus = null;
        VideoInfo videoInfo = null;
        MediaLiveSeekableRange mediaLiveSeekableRange = null;
        MediaQueueData mediaQueueData = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (tqj.M(readInt)) {
                case 2:
                    mediaInfo = (MediaInfo) tqj.U(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    j = tqj.R(parcel, readInt);
                    break;
                case 4:
                    i = tqj.O(parcel, readInt);
                    break;
                case 5:
                    d = tqj.K(parcel, readInt);
                    break;
                case 6:
                    i2 = tqj.O(parcel, readInt);
                    break;
                case 7:
                    i3 = tqj.O(parcel, readInt);
                    break;
                case 8:
                    j2 = tqj.R(parcel, readInt);
                    break;
                case 9:
                    j3 = tqj.R(parcel, readInt);
                    break;
                case 10:
                    d2 = tqj.K(parcel, readInt);
                    break;
                case 11:
                    z = tqj.ae(parcel, readInt);
                    break;
                case 12:
                    jArr = tqj.ah(parcel, readInt);
                    break;
                case 13:
                    i4 = tqj.O(parcel, readInt);
                    break;
                case 14:
                    i5 = tqj.O(parcel, readInt);
                    break;
                case 15:
                    str = tqj.Y(parcel, readInt);
                    break;
                case 16:
                    i6 = tqj.O(parcel, readInt);
                    break;
                case 17:
                    arrayList = tqj.ab(parcel, readInt, MediaQueueItem.CREATOR);
                    break;
                case 18:
                    z2 = tqj.ae(parcel, readInt);
                    break;
                case 19:
                    adBreakStatus = (AdBreakStatus) tqj.U(parcel, readInt, AdBreakStatus.CREATOR);
                    break;
                case 20:
                    videoInfo = (VideoInfo) tqj.U(parcel, readInt, VideoInfo.CREATOR);
                    break;
                case 21:
                    mediaLiveSeekableRange = (MediaLiveSeekableRange) tqj.U(parcel, readInt, MediaLiveSeekableRange.CREATOR);
                    break;
                case 22:
                    mediaQueueData = (MediaQueueData) tqj.U(parcel, readInt, MediaQueueData.CREATOR);
                    break;
                default:
                    tqj.ad(parcel, readInt);
                    break;
            }
        }
        tqj.ac(parcel, Q);
        return new MediaStatus(mediaInfo, j, i, d, i2, i3, j2, j3, d2, z, jArr, i4, i5, str, i6, arrayList, z2, adBreakStatus, videoInfo, mediaLiveSeekableRange, mediaQueueData);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaStatus[i];
    }
}
