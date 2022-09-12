package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cnvm  reason: default package */
/* loaded from: classes.dex */
public abstract class cnvm extends clb implements cnvn {
    public cnvm() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            coba d = d();
            parcel2.writeNoException();
            clc.f(parcel2, d);
        } else if (i != 2) {
            return false;
        } else {
            int e = e();
            parcel2.writeNoException();
            parcel2.writeInt(e);
        }
        return true;
    }
}
