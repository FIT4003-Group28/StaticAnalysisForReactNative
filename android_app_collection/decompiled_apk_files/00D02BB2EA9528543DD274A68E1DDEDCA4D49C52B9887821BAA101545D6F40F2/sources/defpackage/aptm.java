package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.merchantmode.webview.InsightsReportWebViewCallbacks;
/* compiled from: PG */
/* renamed from: aptm  reason: default package */
/* loaded from: classes2.dex */
public final class aptm implements Parcelable.Creator<InsightsReportWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InsightsReportWebViewCallbacks createFromParcel(Parcel parcel) {
        return new InsightsReportWebViewCallbacks(parcel.readBundle(getClass().getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InsightsReportWebViewCallbacks[] newArray(int i) {
        return new InsightsReportWebViewCallbacks[i];
    }
}
