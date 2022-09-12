package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.SourceStatsEntity;
/* compiled from: PG */
/* renamed from: coxg  reason: default package */
/* loaded from: classes5.dex */
public final class coxg implements Parcelable.Creator<SourceStatsEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SourceStatsEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 3) {
                num = cnwm.j(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                num2 = cnwm.j(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new SourceStatsEntity(str, num, num2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SourceStatsEntity[] newArray(int i) {
        return new SourceStatsEntity[i];
    }
}
