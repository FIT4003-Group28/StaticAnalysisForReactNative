package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: rxh  reason: default package */
/* loaded from: classes4.dex */
public final class rxh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = tqj.Q(parcel);
        ArrayList f = tqn.f();
        ArrayList f2 = tqn.f();
        ArrayList f3 = tqn.f();
        ArrayList arrayList = f;
        ArrayList arrayList2 = f2;
        ArrayList arrayList3 = f3;
        ArrayList f4 = tqn.f();
        ArrayList f5 = tqn.f();
        ArrayList f6 = tqn.f();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        TimeInterval timeInterval = null;
        String str9 = null;
        String str10 = null;
        int i = 0;
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
                    str6 = tqj.Y(parcel, readInt);
                    break;
                case 8:
                    str7 = tqj.Y(parcel, readInt);
                    break;
                case 9:
                    str8 = tqj.Y(parcel, readInt);
                    break;
                case 10:
                    i = tqj.O(parcel, readInt);
                    break;
                case 11:
                    arrayList = tqj.ab(parcel, readInt, WalletObjectMessage.CREATOR);
                    break;
                case 12:
                    timeInterval = (TimeInterval) tqj.U(parcel, readInt, TimeInterval.CREATOR);
                    break;
                case 13:
                    arrayList2 = tqj.ab(parcel, readInt, LatLng.CREATOR);
                    break;
                case 14:
                    str9 = tqj.Y(parcel, readInt);
                    break;
                case 15:
                    str10 = tqj.Y(parcel, readInt);
                    break;
                case 16:
                    arrayList3 = tqj.ab(parcel, readInt, LabelValueRow.CREATOR);
                    break;
                case 17:
                    z = tqj.ae(parcel, readInt);
                    break;
                case 18:
                    f4 = tqj.ab(parcel, readInt, UriData.CREATOR);
                    break;
                case 19:
                    f5 = tqj.ab(parcel, readInt, TextModuleData.CREATOR);
                    break;
                case 20:
                    f6 = tqj.ab(parcel, readInt, UriData.CREATOR);
                    break;
                default:
                    tqj.ad(parcel, readInt);
                    break;
            }
        }
        tqj.ac(parcel, Q);
        return new CommonWalletObject(str, str2, str3, str4, str5, str6, str7, str8, i, arrayList, timeInterval, arrayList2, str9, str10, arrayList3, z, f4, f5, f6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CommonWalletObject[i];
    }
}
