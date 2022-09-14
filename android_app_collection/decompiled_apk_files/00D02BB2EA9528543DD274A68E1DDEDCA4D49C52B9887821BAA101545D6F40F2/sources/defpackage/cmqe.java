package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;
/* compiled from: PG */
/* renamed from: cmqe  reason: default package */
/* loaded from: classes5.dex */
public final class cmqe implements Parcelable.Creator<UsageInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UsageInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        DocumentId documentId = null;
        String str = null;
        DocumentContents documentContents = null;
        String str2 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        int i2 = -1;
        int i3 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    documentId = (DocumentId) cnwm.q(parcel, readInt, DocumentId.CREATOR);
                    break;
                case 2:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 3:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 4:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    documentContents = (DocumentContents) cnwm.q(parcel, readInt, DocumentContents.CREATOR);
                    break;
                case 6:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 7:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 8:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 9:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new UsageInfo(documentId, j, i, str, documentContents, z, i2, i3, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UsageInfo[] newArray(int i) {
        return new UsageInfo[i];
    }
}
