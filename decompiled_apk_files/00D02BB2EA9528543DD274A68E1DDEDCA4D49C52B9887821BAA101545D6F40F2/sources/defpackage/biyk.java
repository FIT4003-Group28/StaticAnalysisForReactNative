package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.place.placeinfo.webview.PlaceInfoLinkWebviewCallbacks;
/* compiled from: PG */
/* renamed from: biyk  reason: default package */
/* loaded from: classes3.dex */
public final class biyk implements Parcelable.Creator<PlaceInfoLinkWebviewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceInfoLinkWebviewCallbacks createFromParcel(Parcel parcel) {
        return new PlaceInfoLinkWebviewCallbacks();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceInfoLinkWebviewCallbacks[] newArray(int i) {
        return new PlaceInfoLinkWebviewCallbacks[i];
    }
}
