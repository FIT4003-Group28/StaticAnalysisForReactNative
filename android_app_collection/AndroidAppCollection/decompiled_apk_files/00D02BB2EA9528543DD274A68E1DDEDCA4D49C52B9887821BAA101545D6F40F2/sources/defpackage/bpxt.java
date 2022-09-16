package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.reportmapissue.webview.RapWizardWebViewCallbacks;
/* compiled from: PG */
/* renamed from: bpxt  reason: default package */
/* loaded from: classes4.dex */
public final class bpxt implements Parcelable.Creator<RapWizardWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RapWizardWebViewCallbacks createFromParcel(Parcel parcel) {
        return new RapWizardWebViewCallbacks(parcel.readBundle(RapWizardWebViewCallbacks.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RapWizardWebViewCallbacks[] newArray(int i) {
        return new RapWizardWebViewCallbacks[i];
    }
}
