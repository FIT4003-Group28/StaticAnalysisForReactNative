package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cmxv  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmxv extends clb implements cmxw {
    public cmxv() {
        super("com.google.android.gms.car.ICarMessageCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b(parcel.readInt(), parcel.readInt(), parcel.readInt());
        } else if (i != 2) {
            return false;
        } else {
            c(parcel.readInt());
        }
        return true;
    }
}
