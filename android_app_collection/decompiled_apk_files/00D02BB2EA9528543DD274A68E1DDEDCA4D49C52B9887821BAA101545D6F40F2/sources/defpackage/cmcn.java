package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
/* compiled from: PG */
/* renamed from: cmcn  reason: default package */
/* loaded from: classes5.dex */
public final class cmcn implements Parcelable.Creator<ChapterTocFrame> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChapterTocFrame createFromParcel(Parcel parcel) {
        return new ChapterTocFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChapterTocFrame[] newArray(int i) {
        return new ChapterTocFrame[i];
    }
}
