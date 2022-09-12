package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cnwy  reason: default package */
/* loaded from: classes5.dex */
public abstract class cnwy extends clb implements cnwz {
    public cnwy() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
