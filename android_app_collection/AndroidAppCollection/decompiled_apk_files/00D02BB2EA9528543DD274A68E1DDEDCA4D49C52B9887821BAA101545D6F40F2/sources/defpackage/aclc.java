package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: aclc  reason: default package */
/* loaded from: classes2.dex */
public abstract class aclc extends clb implements acld {
    public aclc() {
        super("com.google.android.apps.gmm.gsashared.api.timeline.IPostVisitBadgeService");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        aclb aclbVar;
        if (i == 1) {
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                aclbVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gmm.gsashared.api.timeline.IPostVisitBadgeListener");
                if (queryLocalInterface instanceof aclb) {
                    aclbVar = (aclb) queryLocalInterface;
                } else {
                    aclbVar = new aclb(readStrongBinder);
                }
            }
            b(readString, readLong, aclbVar);
            return true;
        }
        return false;
    }
}
