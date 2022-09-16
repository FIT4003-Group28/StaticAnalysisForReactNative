package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousChannel;
/* compiled from: PG */
/* renamed from: cxrm  reason: default package */
/* loaded from: classes5.dex */
public final class cxrm implements Parcelable.Creator<PopulousChannel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PopulousChannel createFromParcel(Parcel parcel) {
        return new PopulousChannel(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PopulousChannel[] newArray(int i) {
        return new PopulousChannel[i];
    }
}
