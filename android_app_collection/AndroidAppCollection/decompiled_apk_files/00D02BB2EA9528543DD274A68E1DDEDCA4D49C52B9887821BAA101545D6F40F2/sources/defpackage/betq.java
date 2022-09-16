package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.place.deals.webview.DealsWebviewCallbacks;
/* compiled from: PG */
/* renamed from: betq  reason: default package */
/* loaded from: classes3.dex */
public final class betq implements Parcelable.Creator<DealsWebviewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DealsWebviewCallbacks createFromParcel(Parcel parcel) {
        return new DealsWebviewCallbacks();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DealsWebviewCallbacks[] newArray(int i) {
        return new DealsWebviewCallbacks[i];
    }
}
