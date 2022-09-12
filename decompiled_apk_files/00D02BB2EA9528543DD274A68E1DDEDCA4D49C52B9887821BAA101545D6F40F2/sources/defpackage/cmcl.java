package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
/* compiled from: PG */
/* renamed from: cmcl  reason: default package */
/* loaded from: classes5.dex */
public final class cmcl implements Parcelable.Creator<BinaryFrame> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BinaryFrame createFromParcel(Parcel parcel) {
        return new BinaryFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BinaryFrame[] newArray(int i) {
        return new BinaryFrame[i];
    }
}
