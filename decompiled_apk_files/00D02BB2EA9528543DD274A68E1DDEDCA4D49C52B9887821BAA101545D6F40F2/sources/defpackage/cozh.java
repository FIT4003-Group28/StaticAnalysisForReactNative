package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cozh  reason: default package */
/* loaded from: classes5.dex */
public final class cozh implements Parcelable.Creator<RecordConsentByConsentResultResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RecordConsentByConsentResultResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                arrayList = cnwm.y(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new RecordConsentByConsentResultResponse(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RecordConsentByConsentResultResponse[] newArray(int i) {
        return new RecordConsentByConsentResultResponse[i];
    }
}
