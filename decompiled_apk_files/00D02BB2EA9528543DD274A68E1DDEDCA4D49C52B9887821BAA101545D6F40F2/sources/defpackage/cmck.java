package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
/* compiled from: PG */
/* renamed from: cmck  reason: default package */
/* loaded from: classes5.dex */
public final class cmck implements Parcelable.Creator<ApicFrame> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ApicFrame createFromParcel(Parcel parcel) {
        return new ApicFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ApicFrame[] newArray(int i) {
        return new ApicFrame[i];
    }
}
