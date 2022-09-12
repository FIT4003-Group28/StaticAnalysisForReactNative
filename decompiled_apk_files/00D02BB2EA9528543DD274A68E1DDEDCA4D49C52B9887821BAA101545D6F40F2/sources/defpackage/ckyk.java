package defpackage;

import android.os.Parcel;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
/* compiled from: PG */
/* renamed from: ckyk  reason: default package */
/* loaded from: classes5.dex */
public abstract class ckyk extends clb implements ckyl {
    public ckyk() {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSessionCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b(parcel.createByteArray(), (SystemParcelableWrapper) clc.d(parcel, SystemParcelableWrapper.CREATOR));
            return true;
        }
        return false;
    }
}
