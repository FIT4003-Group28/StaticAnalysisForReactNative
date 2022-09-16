package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: qjk  reason: default package */
/* loaded from: classes4.dex */
public final class qjk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = tqj.Q(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        boolean z = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (tqj.M(readInt)) {
                case 2:
                    str = tqj.Y(parcel, readInt);
                    break;
                case 3:
                    str2 = tqj.Y(parcel, readInt);
                    break;
                case 4:
                    str3 = tqj.Y(parcel, readInt);
                    break;
                case 5:
                    str4 = tqj.Y(parcel, readInt);
                    break;
                case 6:
                    str5 = tqj.Y(parcel, readInt);
                    break;
                case 7:
                    i = tqj.O(parcel, readInt);
                    break;
                case 8:
                    arrayList = tqj.ab(parcel, readInt, WebImage.CREATOR);
                    break;
                case 9:
                    i2 = tqj.O(parcel, readInt);
                    break;
                case 10:
                    i3 = tqj.O(parcel, readInt);
                    break;
                case 11:
                    str6 = tqj.Y(parcel, readInt);
                    break;
                case 12:
                    str7 = tqj.Y(parcel, readInt);
                    break;
                case 13:
                    i4 = tqj.O(parcel, readInt);
                    break;
                case 14:
                    str8 = tqj.Y(parcel, readInt);
                    break;
                case 15:
                    bArr = tqj.af(parcel, readInt);
                    break;
                case 16:
                    str9 = tqj.Y(parcel, readInt);
                    break;
                case 17:
                    z = tqj.ae(parcel, readInt);
                    break;
                default:
                    tqj.ad(parcel, readInt);
                    break;
            }
        }
        tqj.ac(parcel, Q);
        return new CastDevice(str, str2, str3, str4, str5, i, arrayList, i2, i3, str6, str7, i4, str8, bArr, str9, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CastDevice[i];
    }
}
