package defpackage;

import android.os.Bundle;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: daid  reason: default package */
/* loaded from: classes5.dex */
public abstract class daid extends clb implements daie {
    public daid() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((Bundle) clc.d(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            c((Bundle) clc.d(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle = (Bundle) clc.d(parcel, Bundle.CREATOR);
        }
        return true;
    }
}
