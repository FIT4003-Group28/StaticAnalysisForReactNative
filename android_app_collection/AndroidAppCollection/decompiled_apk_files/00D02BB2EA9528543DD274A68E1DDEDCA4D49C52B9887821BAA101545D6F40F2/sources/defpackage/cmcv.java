package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
/* compiled from: PG */
/* renamed from: cmcv  reason: default package */
/* loaded from: classes5.dex */
public final class cmcv implements Parcelable.Creator<PrivFrame> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PrivFrame createFromParcel(Parcel parcel) {
        return new PrivFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PrivFrame[] newArray(int i) {
        return new PrivFrame[i];
    }
}
