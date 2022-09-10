package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.addaplace.webview.AddAPlaceWebViewCallbacks;
/* compiled from: PG */
/* renamed from: ctq  reason: default package */
/* loaded from: classes5.dex */
public final class ctq implements Parcelable.Creator<AddAPlaceWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AddAPlaceWebViewCallbacks createFromParcel(Parcel parcel) {
        return new AddAPlaceWebViewCallbacks(parcel.readBundle(AddAPlaceWebViewCallbacks.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AddAPlaceWebViewCallbacks[] newArray(int i) {
        return new AddAPlaceWebViewCallbacks[i];
    }
}
