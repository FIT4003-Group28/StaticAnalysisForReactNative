package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: axfo  reason: default package */
/* loaded from: classes2.dex */
public abstract class axfo extends dvd implements axfp {
    public axfo() {
        super("com.google.vr.vrcore.common.api.ITransitionCallbacks");
    }

    @Override // defpackage.dvd
    protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            onTransitionComplete();
            return true;
        }
        return false;
    }
}
