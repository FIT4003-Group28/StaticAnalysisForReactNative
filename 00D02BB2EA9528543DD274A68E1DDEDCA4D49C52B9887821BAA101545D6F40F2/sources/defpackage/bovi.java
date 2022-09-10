package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.reportaproblem.webview.ReportAProblemWebViewCallbacks;
/* compiled from: PG */
/* renamed from: bovi  reason: default package */
/* loaded from: classes3.dex */
public final class bovi implements Parcelable.Creator<ReportAProblemWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReportAProblemWebViewCallbacks createFromParcel(Parcel parcel) {
        return new ReportAProblemWebViewCallbacks(parcel.readBundle());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReportAProblemWebViewCallbacks[] newArray(int i) {
        return new ReportAProblemWebViewCallbacks[i];
    }
}
