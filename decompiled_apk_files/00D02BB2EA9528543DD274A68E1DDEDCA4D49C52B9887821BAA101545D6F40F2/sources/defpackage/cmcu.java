package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
/* compiled from: PG */
/* renamed from: cmcu  reason: default package */
/* loaded from: classes5.dex */
public final class cmcu implements Parcelable.Creator<MlltFrame> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MlltFrame createFromParcel(Parcel parcel) {
        return new MlltFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MlltFrame[] newArray(int i) {
        return new MlltFrame[i];
    }
}
