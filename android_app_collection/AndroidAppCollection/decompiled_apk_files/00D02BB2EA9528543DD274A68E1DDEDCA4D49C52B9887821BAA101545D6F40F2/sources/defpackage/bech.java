package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.place.action.webview.ChattyFormsWebViewCallbacks;
/* compiled from: PG */
/* renamed from: bech  reason: default package */
/* loaded from: classes3.dex */
public final class bech implements Parcelable.Creator<ChattyFormsWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChattyFormsWebViewCallbacks createFromParcel(Parcel parcel) {
        return new ChattyFormsWebViewCallbacks();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChattyFormsWebViewCallbacks[] newArray(int i) {
        return new ChattyFormsWebViewCallbacks[i];
    }
}
