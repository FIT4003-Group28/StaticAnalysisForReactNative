package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.ugc.hashtags.webview.HashtagSearchWebViewCallbacks;
/* compiled from: PG */
/* renamed from: ccau  reason: default package */
/* loaded from: classes4.dex */
public final class ccau implements Parcelable.Creator<HashtagSearchWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ HashtagSearchWebViewCallbacks createFromParcel(Parcel parcel) {
        return new HashtagSearchWebViewCallbacks();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ HashtagSearchWebViewCallbacks[] newArray(int i) {
        return new HashtagSearchWebViewCallbacks[i];
    }
}
