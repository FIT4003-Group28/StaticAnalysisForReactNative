package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
/* compiled from: PG */
/* renamed from: cmcp  reason: default package */
/* loaded from: classes5.dex */
public final class cmcp implements Parcelable.Creator<GeobFrame> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GeobFrame createFromParcel(Parcel parcel) {
        return new GeobFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GeobFrame[] newArray(int i) {
        return new GeobFrame[i];
    }
}
