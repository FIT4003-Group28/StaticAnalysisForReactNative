package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
/* compiled from: PG */
/* renamed from: qiv  reason: default package */
/* loaded from: classes4.dex */
public class qiv extends dvd implements IInterface {
    public qiv() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    public void a(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ProxyResponse proxyResponse = (ProxyResponse) dve.a(parcel, ProxyResponse.CREATOR);
            throw new UnsupportedOperationException();
        } else if (i != 2) {
            return false;
        } else {
            a(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }
}
