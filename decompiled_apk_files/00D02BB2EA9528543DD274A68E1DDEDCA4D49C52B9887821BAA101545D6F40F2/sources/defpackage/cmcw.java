package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
/* compiled from: PG */
/* renamed from: cmcw  reason: default package */
/* loaded from: classes5.dex */
public final class cmcw implements Parcelable.Creator<TextInformationFrame> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TextInformationFrame createFromParcel(Parcel parcel) {
        return new TextInformationFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TextInformationFrame[] newArray(int i) {
        return new TextInformationFrame[i];
    }
}
