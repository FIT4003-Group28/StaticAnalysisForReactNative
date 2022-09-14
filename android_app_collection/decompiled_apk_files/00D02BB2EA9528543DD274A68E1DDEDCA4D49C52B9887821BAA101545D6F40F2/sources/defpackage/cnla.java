package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cnla  reason: default package */
/* loaded from: classes.dex */
public abstract class cnla extends clb implements cnlb {
    public cnla() {
        super("com.google.android.gms.clearcut.internal.IBootCountCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) clc.d(parcel, Status.CREATOR);
            b(parcel.readInt());
            return true;
        }
        return false;
    }
}
