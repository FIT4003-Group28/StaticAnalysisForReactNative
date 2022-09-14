package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.lens.sdk.intent.LensImage;
/* compiled from: PG */
/* renamed from: csfp  reason: default package */
/* loaded from: classes5.dex */
public final class csfp implements Parcelable.Creator<LensImage> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LensImage createFromParcel(Parcel parcel) {
        return new LensImage(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LensImage[] newArray(int i) {
        return new LensImage[i];
    }
}
