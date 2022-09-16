package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.ReportingState;
/* compiled from: PG */
/* renamed from: coql  reason: default package */
/* loaded from: classes5.dex */
public final class coql implements Parcelable.Creator<ReportingState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReportingState createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Integer num = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 3:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 4:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 5:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 6:
                default:
                    cnwm.d(parcel, readInt);
                    break;
                case 7:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 8:
                    num = cnwm.j(parcel, readInt);
                    break;
                case 9:
                    i4 = cnwm.i(parcel, readInt);
                    break;
                case 10:
                    z3 = cnwm.g(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new ReportingState(i, i2, z, z2, i3, i4, num, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReportingState[] newArray(int i) {
        return new ReportingState[i];
    }
}
