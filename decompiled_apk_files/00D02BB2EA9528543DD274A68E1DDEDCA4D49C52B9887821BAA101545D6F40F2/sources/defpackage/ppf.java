package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.customchevron.webview.CustomChevronWebViewCallbacks;
/* compiled from: PG */
/* renamed from: ppf  reason: default package */
/* loaded from: classes7.dex */
public final class ppf implements Parcelable.Creator<CustomChevronWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CustomChevronWebViewCallbacks createFromParcel(Parcel parcel) {
        return new CustomChevronWebViewCallbacks("", "", 0, ppe.a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CustomChevronWebViewCallbacks[] newArray(int i) {
        return new CustomChevronWebViewCallbacks[i];
    }
}
