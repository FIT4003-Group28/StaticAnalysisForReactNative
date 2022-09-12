package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;
import com.google.android.gms.learning.TrainingInterval;
/* compiled from: PG */
/* renamed from: cogj  reason: default package */
/* loaded from: classes5.dex */
public final class cogj implements Parcelable.Creator<InAppTrainerOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InAppTrainerOptions createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        InAppTrainingConstraints inAppTrainingConstraints = null;
        Uri uri3 = null;
        TrainingInterval trainingInterval = null;
        byte[] bArr = null;
        Uri uri4 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 2:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 3:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 4:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    uri2 = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
                    break;
                case 8:
                default:
                    cnwm.d(parcel, readInt);
                    break;
                case 9:
                    inAppTrainingConstraints = (InAppTrainingConstraints) cnwm.q(parcel, readInt, InAppTrainingConstraints.CREATOR);
                    break;
                case 10:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 11:
                    uri3 = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
                    break;
                case 12:
                    trainingInterval = (TrainingInterval) cnwm.q(parcel, readInt, TrainingInterval.CREATOR);
                    break;
                case 13:
                    bArr = cnwm.s(parcel, readInt);
                    break;
                case 14:
                    uri4 = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new InAppTrainerOptions(str, i, z, str2, i2, uri, uri2, inAppTrainingConstraints, j, uri3, trainingInterval, bArr, uri4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InAppTrainerOptions[] newArray(int i) {
        return new InAppTrainerOptions[i];
    }
}
