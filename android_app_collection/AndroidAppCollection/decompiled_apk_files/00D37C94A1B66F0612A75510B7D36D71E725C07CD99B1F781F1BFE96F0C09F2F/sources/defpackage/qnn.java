package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: qnn  reason: default package */
/* loaded from: classes4.dex */
public final class qnn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = tqj.Q(parcel);
        ArrayList arrayList = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (tqj.M(readInt)) {
                case 2:
                    arrayList = tqj.aa(parcel, readInt);
                    break;
                case 3:
                    iArr = tqj.ag(parcel, readInt);
                    break;
                case 4:
                    j = tqj.R(parcel, readInt);
                    break;
                case 5:
                    str = tqj.Y(parcel, readInt);
                    break;
                case 6:
                    i = tqj.O(parcel, readInt);
                    break;
                case 7:
                    i2 = tqj.O(parcel, readInt);
                    break;
                case 8:
                    i3 = tqj.O(parcel, readInt);
                    break;
                case 9:
                    i4 = tqj.O(parcel, readInt);
                    break;
                case 10:
                    i5 = tqj.O(parcel, readInt);
                    break;
                case 11:
                    i6 = tqj.O(parcel, readInt);
                    break;
                case 12:
                    i7 = tqj.O(parcel, readInt);
                    break;
                case 13:
                    i8 = tqj.O(parcel, readInt);
                    break;
                case 14:
                    i9 = tqj.O(parcel, readInt);
                    break;
                case 15:
                    i10 = tqj.O(parcel, readInt);
                    break;
                case 16:
                    i11 = tqj.O(parcel, readInt);
                    break;
                case 17:
                    i12 = tqj.O(parcel, readInt);
                    break;
                case 18:
                    i13 = tqj.O(parcel, readInt);
                    break;
                case 19:
                    i14 = tqj.O(parcel, readInt);
                    break;
                case 20:
                    i15 = tqj.O(parcel, readInt);
                    break;
                case 21:
                    i16 = tqj.O(parcel, readInt);
                    break;
                case 22:
                    i17 = tqj.O(parcel, readInt);
                    break;
                case 23:
                    i18 = tqj.O(parcel, readInt);
                    break;
                case 24:
                    i19 = tqj.O(parcel, readInt);
                    break;
                case 25:
                    i20 = tqj.O(parcel, readInt);
                    break;
                case 26:
                    i21 = tqj.O(parcel, readInt);
                    break;
                case 27:
                    i22 = tqj.O(parcel, readInt);
                    break;
                case 28:
                    i23 = tqj.O(parcel, readInt);
                    break;
                case 29:
                    i24 = tqj.O(parcel, readInt);
                    break;
                case 30:
                    i25 = tqj.O(parcel, readInt);
                    break;
                case 31:
                    i26 = tqj.O(parcel, readInt);
                    break;
                case 32:
                    i27 = tqj.O(parcel, readInt);
                    break;
                case 33:
                    iBinder = tqj.T(parcel, readInt);
                    break;
                default:
                    tqj.ad(parcel, readInt);
                    break;
            }
        }
        tqj.ac(parcel, Q);
        return new NotificationOptions(arrayList, iArr, j, str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NotificationOptions[i];
    }
}
