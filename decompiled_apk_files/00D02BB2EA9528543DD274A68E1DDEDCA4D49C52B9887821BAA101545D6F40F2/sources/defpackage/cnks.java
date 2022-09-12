package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
/* compiled from: PG */
/* renamed from: cnks  reason: default package */
/* loaded from: classes.dex */
public final class cnks implements Parcelable.Creator<LogEventParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LogEventParcelable createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        PlayLoggerContext playLoggerContext = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        ExperimentTokens[] experimentTokensArr = null;
        boolean z = true;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    playLoggerContext = (PlayLoggerContext) cnwm.q(parcel, readInt, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArr = cnwm.s(parcel, readInt);
                    break;
                case 4:
                    iArr = cnwm.u(parcel, readInt);
                    break;
                case 5:
                    strArr = cnwm.w(parcel, readInt);
                    break;
                case 6:
                    iArr2 = cnwm.u(parcel, readInt);
                    break;
                case 7:
                    bArr2 = cnwm.t(parcel, readInt);
                    break;
                case 8:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 9:
                    experimentTokensArr = (ExperimentTokens[]) cnwm.z(parcel, readInt, ExperimentTokens.CREATOR);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new LogEventParcelable(playLoggerContext, bArr, iArr, strArr, iArr2, bArr2, z, experimentTokensArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LogEventParcelable[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
