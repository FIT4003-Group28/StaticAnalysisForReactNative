package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: dans  reason: default package */
/* loaded from: classes5.dex */
public abstract class dans extends clb implements dant {
    public dans() {
        super("com.google.android.remotesearch.IRemoteSearchServiceSessionCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b(parcel.createByteArray());
            return true;
        }
        return false;
    }
}
