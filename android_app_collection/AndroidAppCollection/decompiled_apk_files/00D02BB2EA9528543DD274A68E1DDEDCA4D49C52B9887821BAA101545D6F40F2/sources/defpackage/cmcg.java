package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
/* compiled from: PG */
/* renamed from: cmcg  reason: default package */
/* loaded from: classes5.dex */
public final class cmcg implements Parcelable.Creator<VorbisComment> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ VorbisComment createFromParcel(Parcel parcel) {
        return new VorbisComment(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ VorbisComment[] newArray(int i) {
        return new VorbisComment[i];
    }
}
