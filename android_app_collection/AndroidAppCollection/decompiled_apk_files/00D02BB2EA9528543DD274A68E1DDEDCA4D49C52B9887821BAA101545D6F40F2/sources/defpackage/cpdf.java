package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.ConsentFlowConfig;
/* compiled from: PG */
/* renamed from: cpdf  reason: default package */
/* loaded from: classes.dex */
public final class cpdf implements Parcelable.Creator<ConsentFlowConfig> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConsentFlowConfig createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 3:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 4:
                    z3 = cnwm.g(parcel, readInt);
                    break;
                case 5:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 6:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 7:
                    z4 = cnwm.g(parcel, readInt);
                    break;
                case 8:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new ConsentFlowConfig(z, z2, z3, i, i2, z4, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConsentFlowConfig[] newArray(int i) {
        return new ConsentFlowConfig[i];
    }
}
