package defpackage;

import android.os.Bundle;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: damk  reason: default package */
/* loaded from: classes5.dex */
public abstract class damk extends clb implements daml {
    public damk() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                d(parcel.readInt(), (Bundle) clc.d(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) clc.d(parcel, Bundle.CREATOR);
                g(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) clc.d(parcel, Bundle.CREATOR);
                f(readInt2);
                return true;
            case 5:
                int readInt3 = parcel.readInt();
                Bundle bundle3 = (Bundle) clc.d(parcel, Bundle.CREATOR);
                k(readInt3);
                return true;
            case 6:
                e((Bundle) clc.d(parcel, Bundle.CREATOR));
                return true;
            case 7:
                parcel.createTypedArrayList(Bundle.CREATOR);
                l();
                return true;
            case 8:
                Bundle bundle4 = (Bundle) clc.d(parcel, Bundle.CREATOR);
                j();
                return true;
            case 9:
                Bundle bundle5 = (Bundle) clc.d(parcel, Bundle.CREATOR);
                i();
                return true;
            case 10:
                Bundle bundle6 = (Bundle) clc.d(parcel, Bundle.CREATOR);
                m();
                return true;
            case 11:
                Bundle bundle7 = (Bundle) clc.d(parcel, Bundle.CREATOR);
                h();
                return true;
            case 12:
                b((Bundle) clc.d(parcel, Bundle.CREATOR));
                return true;
            case 13:
                c((Bundle) clc.d(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
