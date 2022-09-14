package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
/* compiled from: PG */
/* renamed from: cmcz  reason: default package */
/* loaded from: classes5.dex */
public final class cmcz implements Parcelable.Creator<MotionPhotoMetadata> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MotionPhotoMetadata createFromParcel(Parcel parcel) {
        return new MotionPhotoMetadata(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MotionPhotoMetadata[] newArray(int i) {
        return new MotionPhotoMetadata[i];
    }
}
