package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
/* compiled from: PG */
/* renamed from: cmcf  reason: default package */
/* loaded from: classes5.dex */
public final class cmcf implements Parcelable.Creator<PictureFrame> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PictureFrame createFromParcel(Parcel parcel) {
        return new PictureFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PictureFrame[] newArray(int i) {
        return new PictureFrame[i];
    }
}
