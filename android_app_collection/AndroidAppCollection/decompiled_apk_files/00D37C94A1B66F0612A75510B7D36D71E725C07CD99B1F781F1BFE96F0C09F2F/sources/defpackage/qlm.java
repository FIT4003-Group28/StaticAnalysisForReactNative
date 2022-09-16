package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qlm  reason: default package */
/* loaded from: classes4.dex */
public final class qlm extends dvd implements IInterface {
    final /* synthetic */ qlr a;

    public qlm() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlm(qlr qlrVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy");
        this.a = qlrVar;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                rad a = rac.a(this.a);
                parcel2.writeNoException();
                dve.i(parcel2, a);
                return true;
            case 2:
                this.a.i((Bundle) dve.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
                this.a.h((Bundle) dve.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                this.a.e(dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                long a2 = this.a.a();
                parcel2.writeNoException();
                parcel2.writeLong(a2);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(213380000);
                return true;
            case 7:
                this.a.g((Bundle) dve.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                this.a.f((Bundle) dve.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                this.a.j((Bundle) dve.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
