package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.merchantmode.webview.CreatePostsWebViewCallbacks;
/* compiled from: PG */
/* renamed from: apsz  reason: default package */
/* loaded from: classes2.dex */
public final class apsz implements Parcelable.Creator<CreatePostsWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CreatePostsWebViewCallbacks createFromParcel(Parcel parcel) {
        return new CreatePostsWebViewCallbacks(parcel.readBundle(getClass().getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CreatePostsWebViewCallbacks[] newArray(int i) {
        return new CreatePostsWebViewCallbacks[i];
    }
}
