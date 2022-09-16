package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
/* compiled from: PG */
/* renamed from: cpjd  reason: default package */
/* loaded from: classes5.dex */
public final class cpjd implements Parcelable.Creator<MessageEventParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MessageEventParcelable createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 4) {
                bArr = cnwm.s(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                str2 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new MessageEventParcelable(i, str, bArr, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MessageEventParcelable[] newArray(int i) {
        return new MessageEventParcelable[i];
    }
}
