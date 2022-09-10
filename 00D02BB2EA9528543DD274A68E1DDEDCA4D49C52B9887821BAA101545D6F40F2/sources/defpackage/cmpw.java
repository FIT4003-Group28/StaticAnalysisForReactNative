package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
/* compiled from: PG */
/* renamed from: cmpw  reason: default package */
/* loaded from: classes5.dex */
public final class cmpw implements Parcelable.Creator<DocumentSection> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DocumentSection createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        RegisterSectionInfo registerSectionInfo = null;
        byte[] bArr = null;
        int i = -1;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 3) {
                registerSectionInfo = (RegisterSectionInfo) cnwm.q(parcel, readInt, RegisterSectionInfo.CREATOR);
            } else if (b == 4) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                bArr = cnwm.s(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new DocumentSection(str, registerSectionInfo, i, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DocumentSection[] newArray(int i) {
        return new DocumentSection[i];
    }
}
