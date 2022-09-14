package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.merchantmode.webview.ReplyToReviewsWebViewCallbacks;
/* compiled from: PG */
/* renamed from: aptw  reason: default package */
/* loaded from: classes2.dex */
public final class aptw implements Parcelable.Creator<ReplyToReviewsWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReplyToReviewsWebViewCallbacks createFromParcel(Parcel parcel) {
        return new ReplyToReviewsWebViewCallbacks(parcel.readBundle(getClass().getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReplyToReviewsWebViewCallbacks[] newArray(int i) {
        return new ReplyToReviewsWebViewCallbacks[i];
    }
}
