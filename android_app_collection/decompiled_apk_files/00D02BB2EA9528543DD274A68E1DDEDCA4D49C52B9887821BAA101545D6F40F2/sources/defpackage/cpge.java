package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.label.internal.client.LabelOptions;
/* compiled from: PG */
/* renamed from: cpge  reason: default package */
/* loaded from: classes5.dex */
public final class cpge implements Parcelable.Creator<LabelOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LabelOptions createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new LabelOptions(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LabelOptions[] newArray(int i) {
        return new LabelOptions[i];
    }
}
