package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: coji  reason: default package */
/* loaded from: classes5.dex */
public final class coji implements Parcelable.Creator<ActivityRecognitionResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityRecognitionResult createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        long j = 0;
        long j2 = 0;
        ArrayList arrayList = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                arrayList = cnwm.A(parcel, readInt, DetectedActivity.CREATOR);
            } else if (b == 2) {
                j = cnwm.k(parcel, readInt);
            } else if (b == 3) {
                j2 = cnwm.k(parcel, readInt);
            } else if (b == 4) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                bundle = cnwm.r(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ActivityRecognitionResult(arrayList, j, j2, i, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityRecognitionResult[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
