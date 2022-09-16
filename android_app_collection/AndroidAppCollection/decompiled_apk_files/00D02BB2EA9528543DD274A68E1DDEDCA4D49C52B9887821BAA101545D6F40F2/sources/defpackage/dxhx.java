package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.sdk.android.authentication.AuthenticationResponse;
/* compiled from: PG */
/* renamed from: dxhx  reason: default package */
/* loaded from: classes6.dex */
public final class dxhx implements Parcelable.Creator<AuthenticationResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AuthenticationResponse createFromParcel(Parcel parcel) {
        return new AuthenticationResponse(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AuthenticationResponse[] newArray(int i) {
        return new AuthenticationResponse[i];
    }
}
