package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
/* compiled from: PG */
/* renamed from: cmbs  reason: default package */
/* loaded from: classes5.dex */
public final class cmbs implements Parcelable.Creator<Metadata> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Metadata createFromParcel(Parcel parcel) {
        return new Metadata(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Metadata[] newArray(int i) {
        return new Metadata[i];
    }
}
