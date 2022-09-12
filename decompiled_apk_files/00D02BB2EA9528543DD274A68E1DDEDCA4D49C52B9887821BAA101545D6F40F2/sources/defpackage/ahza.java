package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.locationsharing.interprocess.api.ReportingState;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ahza  reason: default package */
/* loaded from: classes2.dex */
public final class ahza implements Parcelable.Creator<ReportingState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReportingState createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        String str = null;
        ArrayList<Integer> arrayList = null;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 7) {
                arrayList = cnwm.x(parcel, readInt);
            } else if (b != 8) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ReportingState(str, i, arrayList, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReportingState[] newArray(int i) {
        return new ReportingState[i];
    }
}
