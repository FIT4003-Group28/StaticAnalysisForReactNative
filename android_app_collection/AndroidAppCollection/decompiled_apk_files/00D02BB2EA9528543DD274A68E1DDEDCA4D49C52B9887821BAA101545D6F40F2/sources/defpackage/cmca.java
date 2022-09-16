package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
/* compiled from: PG */
/* renamed from: cmca  reason: default package */
/* loaded from: classes5.dex */
public final class cmca implements Parcelable.Creator<AppInfoTable> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AppInfoTable createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        cmmn.f(readString);
        return new AppInfoTable(parcel.readInt(), readString);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AppInfoTable[] newArray(int i) {
        return new AppInfoTable[i];
    }
}
