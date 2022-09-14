package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.ClientId;
/* compiled from: PG */
/* renamed from: cyej  reason: default package */
/* loaded from: classes5.dex */
public final class cyej implements Parcelable.Creator<ClientId> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ClientId createFromParcel(Parcel parcel) {
        return ClientId.a.get(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ClientId[] newArray(int i) {
        return new ClientId[i];
    }
}
