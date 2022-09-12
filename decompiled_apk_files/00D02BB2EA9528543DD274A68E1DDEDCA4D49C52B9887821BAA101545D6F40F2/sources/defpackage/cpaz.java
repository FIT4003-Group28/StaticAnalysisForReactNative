package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.globalactions.GlobalActionCard;
/* compiled from: PG */
/* renamed from: cpaz  reason: default package */
/* loaded from: classes5.dex */
public final class cpaz implements Parcelable.Creator<GetGlobalActionCardsResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetGlobalActionCardsResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        GlobalActionCard[] globalActionCardArr = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                globalActionCardArr = (GlobalActionCard[]) cnwm.z(parcel, readInt, GlobalActionCard.CREATOR);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new GetGlobalActionCardsResponse(globalActionCardArr, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetGlobalActionCardsResponse[] newArray(int i) {
        return new GetGlobalActionCardsResponse[i];
    }
}
