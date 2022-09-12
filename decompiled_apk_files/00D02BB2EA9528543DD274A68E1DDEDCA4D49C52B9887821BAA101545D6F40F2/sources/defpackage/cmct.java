package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
/* compiled from: PG */
/* renamed from: cmct  reason: default package */
/* loaded from: classes5.dex */
public final class cmct implements Parcelable.Creator<InternalFrame> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InternalFrame createFromParcel(Parcel parcel) {
        return new InternalFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InternalFrame[] newArray(int i) {
        return new InternalFrame[i];
    }
}
