package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: clq  reason: default package */
/* loaded from: classes5.dex */
public abstract class clq extends clb implements clr {
    public clq() {
        super("com.google.android.apps.auto.sdk.IDrawerCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i == 2) {
                b();
            } else if (i == 3) {
                c();
            } else if (i != 4) {
                return false;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
