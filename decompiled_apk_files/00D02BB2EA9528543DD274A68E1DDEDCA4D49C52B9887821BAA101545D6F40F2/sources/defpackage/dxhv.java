package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
/* compiled from: PG */
/* renamed from: dxhv  reason: default package */
/* loaded from: classes6.dex */
public final class dxhv implements Parcelable.Creator<AuthenticationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AuthenticationRequest createFromParcel(Parcel parcel) {
        return new AuthenticationRequest(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AuthenticationRequest[] newArray(int i) {
        return new AuthenticationRequest[i];
    }
}
