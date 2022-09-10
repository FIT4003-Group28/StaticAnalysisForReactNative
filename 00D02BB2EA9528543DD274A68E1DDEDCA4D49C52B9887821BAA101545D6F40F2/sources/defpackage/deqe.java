package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
/* compiled from: PG */
/* renamed from: deqe  reason: default package */
/* loaded from: classes6.dex */
public abstract class deqe extends clb implements deqf {
    public deqe() {
        super("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    public static deqf asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        if (queryLocalInterface instanceof deqf) {
            return (deqf) queryLocalInterface;
        }
        return new deqd(iBinder);
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((Status) clc.d(parcel, Status.CREATOR), (DynamicLinkData) clc.d(parcel, DynamicLinkData.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            Status status = (Status) clc.d(parcel, Status.CREATOR);
            ShortDynamicLinkImpl shortDynamicLinkImpl = (ShortDynamicLinkImpl) clc.d(parcel, ShortDynamicLinkImpl.CREATOR);
            c();
        }
        return true;
    }
}
