package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.lens.sdk.intent.BinderBitmap;
/* compiled from: PG */
/* renamed from: csfm  reason: default package */
/* loaded from: classes5.dex */
public final class csfm implements Parcelable.Creator<BinderBitmap> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BinderBitmap createFromParcel(Parcel parcel) {
        return new BinderBitmap(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BinderBitmap[] newArray(int i) {
        return new BinderBitmap[i];
    }
}
