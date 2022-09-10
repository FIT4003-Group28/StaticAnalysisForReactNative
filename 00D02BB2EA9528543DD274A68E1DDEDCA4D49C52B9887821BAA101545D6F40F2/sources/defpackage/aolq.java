package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.mapsactivity.locationhistory.retention.webview.RetentionWebViewCallbacks;
/* compiled from: PG */
/* renamed from: aolq  reason: default package */
/* loaded from: classes2.dex */
public final class aolq implements Parcelable.Creator<RetentionWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RetentionWebViewCallbacks createFromParcel(Parcel parcel) {
        return new RetentionWebViewCallbacks();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RetentionWebViewCallbacks[] newArray(int i) {
        return new RetentionWebViewCallbacks[i];
    }
}
