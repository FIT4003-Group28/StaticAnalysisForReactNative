package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
/* compiled from: PG */
/* renamed from: cmcx  reason: default package */
/* loaded from: classes5.dex */
public final class cmcx implements Parcelable.Creator<UrlLinkFrame> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UrlLinkFrame createFromParcel(Parcel parcel) {
        return new UrlLinkFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UrlLinkFrame[] newArray(int i) {
        return new UrlLinkFrame[i];
    }
}
