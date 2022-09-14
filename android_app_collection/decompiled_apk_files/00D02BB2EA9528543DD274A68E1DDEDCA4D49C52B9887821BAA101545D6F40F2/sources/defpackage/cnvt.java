package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
/* compiled from: PG */
/* renamed from: cnvt  reason: default package */
/* loaded from: classes5.dex */
public final class cnvt implements Parcelable.Creator<MethodInvocation> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MethodInvocation createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 2:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 3:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 4:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 5:
                    j2 = cnwm.k(parcel, readInt);
                    break;
                case 6:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 7:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MethodInvocation[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
