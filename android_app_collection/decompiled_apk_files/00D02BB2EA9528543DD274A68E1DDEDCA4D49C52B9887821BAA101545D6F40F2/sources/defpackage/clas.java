package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: clas  reason: default package */
/* loaded from: classes5.dex */
public abstract class clas extends clb implements clat {
    public clas() {
        super("com.google.android.apps.gsa.staticplugins.opa.morris2.btlatency.IBtLatencyServiceCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b();
        } else if (i != 2) {
            return false;
        } else {
            c(parcel.readLong());
        }
        parcel2.writeNoException();
        return true;
    }
}
