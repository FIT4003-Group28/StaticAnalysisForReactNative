package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: clu  reason: default package */
/* loaded from: classes5.dex */
public abstract class clu extends clb implements clv {
    public clu() {
        super("com.google.android.apps.auto.sdk.IImeCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            boolean b = b();
            parcel2.writeNoException();
            parcel2.writeInt(b ? 1 : 0);
        } else if (i == 2) {
            c();
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            d();
            parcel2.writeNoException();
        }
        return true;
    }
}
