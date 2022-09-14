package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
/* compiled from: PG */
/* renamed from: cmcm  reason: default package */
/* loaded from: classes5.dex */
public final class cmcm implements Parcelable.Creator<ChapterFrame> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChapterFrame createFromParcel(Parcel parcel) {
        return new ChapterFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChapterFrame[] newArray(int i) {
        return new ChapterFrame[i];
    }
}
