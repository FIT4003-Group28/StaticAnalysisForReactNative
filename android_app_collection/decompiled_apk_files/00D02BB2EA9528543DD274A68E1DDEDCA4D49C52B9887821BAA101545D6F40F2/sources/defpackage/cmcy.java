package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
/* compiled from: PG */
/* renamed from: cmcy  reason: default package */
/* loaded from: classes5.dex */
public final class cmcy implements Parcelable.Creator<MdtaMetadataEntry> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MdtaMetadataEntry createFromParcel(Parcel parcel) {
        return new MdtaMetadataEntry(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MdtaMetadataEntry[] newArray(int i) {
        return new MdtaMetadataEntry[i];
    }
}
