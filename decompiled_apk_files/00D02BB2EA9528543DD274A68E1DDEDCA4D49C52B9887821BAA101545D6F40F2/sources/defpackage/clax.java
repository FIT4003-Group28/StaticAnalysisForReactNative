package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.viewer.client.Dimensions;
/* compiled from: PG */
/* renamed from: clax  reason: default package */
/* loaded from: classes5.dex */
public final class clax implements Parcelable.Creator<Dimensions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Dimensions createFromParcel(Parcel parcel) {
        return new Dimensions(parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Dimensions[] newArray(int i) {
        return new Dimensions[i];
    }
}
