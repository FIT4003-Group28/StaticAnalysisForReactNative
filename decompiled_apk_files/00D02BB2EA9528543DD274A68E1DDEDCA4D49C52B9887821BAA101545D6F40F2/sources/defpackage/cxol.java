package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.licenses.License;
/* compiled from: PG */
/* renamed from: cxol  reason: default package */
/* loaded from: classes5.dex */
public final class cxol implements Parcelable.Creator<License> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ License createFromParcel(Parcel parcel) {
        return new License(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ License[] newArray(int i) {
        return new License[i];
    }
}
