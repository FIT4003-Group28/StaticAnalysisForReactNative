package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: ckyh  reason: default package */
/* loaded from: classes5.dex */
public abstract class ckyh extends clb implements ckyi {
    public ckyh() {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceMicrophoneLevelCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b(parcel.readInt());
            return true;
        }
        return false;
    }
}
