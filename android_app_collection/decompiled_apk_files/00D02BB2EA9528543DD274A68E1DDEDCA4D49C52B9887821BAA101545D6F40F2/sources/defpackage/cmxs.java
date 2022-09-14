package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cmxs  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmxs extends clb implements cmxt {
    public cmxs() {
        super("com.google.android.gms.car.ICarConnectionListener");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b(parcel.readInt());
        } else if (i == 2) {
            c();
        } else if (i != 3) {
            return false;
        } else {
            parcel.readInt();
            d();
        }
        return true;
    }
}
