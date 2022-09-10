package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.merchantmode.webview.DeletePostsWebViewCallbacks;
/* compiled from: PG */
/* renamed from: apte  reason: default package */
/* loaded from: classes2.dex */
public final class apte implements Parcelable.Creator<DeletePostsWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeletePostsWebViewCallbacks createFromParcel(Parcel parcel) {
        return new DeletePostsWebViewCallbacks(parcel.readBundle(getClass().getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeletePostsWebViewCallbacks[] newArray(int i) {
        return new DeletePostsWebViewCallbacks[i];
    }
}
