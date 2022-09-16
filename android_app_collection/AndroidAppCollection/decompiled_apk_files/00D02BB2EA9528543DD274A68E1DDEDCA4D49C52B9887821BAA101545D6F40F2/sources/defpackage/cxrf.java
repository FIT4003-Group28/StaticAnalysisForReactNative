package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.ManualChannel;
/* compiled from: PG */
/* renamed from: cxrf  reason: default package */
/* loaded from: classes5.dex */
public final class cxrf implements Parcelable.Creator<ManualChannel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ManualChannel createFromParcel(Parcel parcel) {
        return new ManualChannel(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ManualChannel[] newArray(int i) {
        return new ManualChannel[i];
    }
}
