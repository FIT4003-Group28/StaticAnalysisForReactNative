package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.place.action.webview.ChattyPostWebViewCallbacks;
/* compiled from: PG */
/* renamed from: becj  reason: default package */
/* loaded from: classes3.dex */
public final class becj implements Parcelable.Creator<ChattyPostWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChattyPostWebViewCallbacks createFromParcel(Parcel parcel) {
        return new ChattyPostWebViewCallbacks();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChattyPostWebViewCallbacks[] newArray(int i) {
        return new ChattyPostWebViewCallbacks[i];
    }
}
