package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audit.LogAuditRecordsRequest;
/* compiled from: PG */
/* renamed from: cmqt  reason: default package */
/* loaded from: classes5.dex */
public final class cmqt implements Parcelable.Creator<LogAuditRecordsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LogAuditRecordsRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        byte[][] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
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
                    str = cnwm.o(parcel, readInt);
                    break;
                case 4:
                    bArr = cnwm.t(parcel, readInt);
                    break;
                case 5:
                    bArr2 = cnwm.s(parcel, readInt);
                    break;
                case 6:
                    bArr3 = cnwm.s(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new LogAuditRecordsRequest(i, i2, str, bArr, bArr2, bArr3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LogAuditRecordsRequest[] newArray(int i) {
        return new LogAuditRecordsRequest[i];
    }
}
