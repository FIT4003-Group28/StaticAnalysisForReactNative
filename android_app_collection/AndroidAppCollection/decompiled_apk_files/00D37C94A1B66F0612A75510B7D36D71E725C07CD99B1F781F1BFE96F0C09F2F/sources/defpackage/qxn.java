package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: qxn  reason: default package */
/* loaded from: classes4.dex */
public abstract class qxn extends dvd implements qxo {
    private int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public qxn(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        qnm.c(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        rad f;
        if (obj != null && (obj instanceof qxo)) {
            try {
                qxo qxoVar = (qxo) obj;
                if (qxoVar.qk() != this.a || (f = qxoVar.f()) == null) {
                    return false;
                }
                return Arrays.equals(qj(), (byte[]) rac.b(f));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    @Override // defpackage.qxo
    public final rad f() {
        return rac.a(qj());
    }

    public final int hashCode() {
        return this.a;
    }

    public abstract byte[] qj();

    @Override // defpackage.qxo
    public final int qk() {
        return this.a;
    }

    public qxn() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            rad f = f();
            parcel2.writeNoException();
            dve.i(parcel2, f);
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.a;
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        }
        return true;
    }
}
