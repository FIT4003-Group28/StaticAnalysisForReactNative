package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.mapsactivity.locationhistory.events.webview.EventWebViewCallbacks;
/* compiled from: PG */
/* renamed from: aofi  reason: default package */
/* loaded from: classes2.dex */
public final class aofi implements Parcelable.Creator<EventWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ EventWebViewCallbacks createFromParcel(Parcel parcel) {
        return new EventWebViewCallbacks();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ EventWebViewCallbacks[] newArray(int i) {
        return new EventWebViewCallbacks[i];
    }
}
