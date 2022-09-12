package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.ExperimentTokens;
/* compiled from: PG */
/* renamed from: coxl  reason: default package */
/* loaded from: classes5.dex */
public final class coxl implements Parcelable.Creator<ExperimentTokens> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ExperimentTokens createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    bArr = cnwm.s(parcel, readInt);
                    break;
                case 4:
                    bArr2 = cnwm.t(parcel, readInt);
                    break;
                case 5:
                    bArr3 = cnwm.t(parcel, readInt);
                    break;
                case 6:
                    bArr4 = cnwm.t(parcel, readInt);
                    break;
                case 7:
                    bArr5 = cnwm.t(parcel, readInt);
                    break;
                case 8:
                    iArr = cnwm.u(parcel, readInt);
                    break;
                case 9:
                    bArr6 = cnwm.t(parcel, readInt);
                    break;
                case 10:
                    iArr2 = cnwm.u(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new ExperimentTokens(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ExperimentTokens[] newArray(int i) {
        return new ExperimentTokens[i];
    }
}
