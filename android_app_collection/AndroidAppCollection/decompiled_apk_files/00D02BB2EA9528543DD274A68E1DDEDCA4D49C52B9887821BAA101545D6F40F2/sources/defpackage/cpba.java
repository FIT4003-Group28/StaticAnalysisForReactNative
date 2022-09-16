package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.globalactions.GlobalActionCard;
/* compiled from: PG */
/* renamed from: cpba  reason: default package */
/* loaded from: classes5.dex */
public final class cpba implements Parcelable.Creator<GlobalActionCard> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GlobalActionCard createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        Bitmap bitmap = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bitmap bitmap2 = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 2:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    bitmap = (Bitmap) cnwm.q(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 4:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 6:
                    bitmap2 = (Bitmap) cnwm.q(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 7:
                    pendingIntent = (PendingIntent) cnwm.q(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 8:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new GlobalActionCard(i, str, bitmap, str2, str3, str4, bitmap2, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GlobalActionCard[] newArray(int i) {
        return new GlobalActionCard[i];
    }
}
