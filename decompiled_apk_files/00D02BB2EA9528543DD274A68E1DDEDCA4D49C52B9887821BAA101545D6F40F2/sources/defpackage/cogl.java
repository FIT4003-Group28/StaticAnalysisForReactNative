package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.learning.TrainingInterval;
/* compiled from: PG */
/* renamed from: cogl  reason: default package */
/* loaded from: classes5.dex */
public final class cogl implements Parcelable.Creator<TrainingInterval> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TrainingInterval createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                j = cnwm.k(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new TrainingInterval(i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TrainingInterval[] newArray(int i) {
        return new TrainingInterval[i];
    }
}
