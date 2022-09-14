package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.video.ColorInfo;
/* compiled from: PG */
/* renamed from: cmob  reason: default package */
/* loaded from: classes5.dex */
public final class cmob implements Parcelable.Creator<ColorInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ColorInfo createFromParcel(Parcel parcel) {
        return new ColorInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ColorInfo[] newArray(int i) {
        return new ColorInfo[i];
    }
}
