package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
/* compiled from: PG */
/* renamed from: cmco  reason: default package */
/* loaded from: classes5.dex */
public final class cmco implements Parcelable.Creator<CommentFrame> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CommentFrame createFromParcel(Parcel parcel) {
        return new CommentFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CommentFrame[] newArray(int i) {
        return new CommentFrame[i];
    }
}
