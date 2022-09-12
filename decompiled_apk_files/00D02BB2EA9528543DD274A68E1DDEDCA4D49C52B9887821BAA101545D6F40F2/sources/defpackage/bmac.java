package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.place.riddler.webview.RiddlerWebViewCallbacks;
/* compiled from: PG */
/* renamed from: bmac  reason: default package */
/* loaded from: classes3.dex */
public final class bmac implements Parcelable.Creator<RiddlerWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RiddlerWebViewCallbacks createFromParcel(Parcel parcel) {
        return new RiddlerWebViewCallbacks();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RiddlerWebViewCallbacks[] newArray(int i) {
        return new RiddlerWebViewCallbacks[i];
    }
}
