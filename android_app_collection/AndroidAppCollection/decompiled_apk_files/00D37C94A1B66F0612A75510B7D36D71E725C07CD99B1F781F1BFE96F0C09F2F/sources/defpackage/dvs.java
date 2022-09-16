package defpackage;

import android.os.Parcel;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
/* compiled from: PG */
/* renamed from: dvs  reason: default package */
/* loaded from: classes3.dex */
public abstract class dvs extends dvd implements dvt {
    public dvs() {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSessionCallback");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a(parcel.createByteArray(), (SystemParcelableWrapper) dve.a(parcel, SystemParcelableWrapper.CREATOR));
            return true;
        }
        return false;
    }
}
