package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.mapsactivity.webview.AutoValue_TransparentWebViewConfig;
/* compiled from: PG */
/* renamed from: apli  reason: default package */
/* loaded from: classes2.dex */
public final class apli implements Parcelable.Creator<AutoValue_TransparentWebViewConfig> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_TransparentWebViewConfig createFromParcel(Parcel parcel) {
        return new AutoValue_TransparentWebViewConfig(parcel.readString(), (dszg) Enum.valueOf(dszg.class, parcel.readString()), (dbsg) parcel.readSerializable(), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, (dbsg) parcel.readSerializable(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_TransparentWebViewConfig[] newArray(int i) {
        return new AutoValue_TransparentWebViewConfig[i];
    }
}
