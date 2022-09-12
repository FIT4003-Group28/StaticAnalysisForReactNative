package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.personalscore.library.webview.LocalPreferencesWebViewCallbacks;
/* compiled from: PG */
/* renamed from: bbmd  reason: default package */
/* loaded from: classes3.dex */
public final class bbmd implements Parcelable.Creator<LocalPreferencesWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocalPreferencesWebViewCallbacks createFromParcel(Parcel parcel) {
        return new LocalPreferencesWebViewCallbacks(parcel.readBundle(getClass().getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocalPreferencesWebViewCallbacks[] newArray(int i) {
        return new LocalPreferencesWebViewCallbacks[i];
    }
}
