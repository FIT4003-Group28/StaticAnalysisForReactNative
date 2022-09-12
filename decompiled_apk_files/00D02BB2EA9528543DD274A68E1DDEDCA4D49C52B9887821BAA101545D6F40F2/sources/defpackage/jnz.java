package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.base.webcontent.WebContentWebViewCallbacks;
/* compiled from: PG */
/* renamed from: jnz  reason: default package */
/* loaded from: classes7.dex */
public final class jnz implements Parcelable.Creator<WebContentWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ WebContentWebViewCallbacks createFromParcel(Parcel parcel) {
        return new WebContentWebViewCallbacks();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ WebContentWebViewCallbacks[] newArray(int i) {
        return new WebContentWebViewCallbacks[i];
    }
}
