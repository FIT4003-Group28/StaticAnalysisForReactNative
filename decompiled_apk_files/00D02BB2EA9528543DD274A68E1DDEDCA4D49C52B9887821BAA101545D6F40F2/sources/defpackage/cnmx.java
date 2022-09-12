package defpackage;

import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnmx  reason: default package */
/* loaded from: classes.dex */
public abstract class cnmx extends cnvm {
    private final int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public cnmx(byte[] bArr) {
        cnwc.g(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] f(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] c();

    @Override // defpackage.cnvn
    public final coba d() {
        return cobb.b(c());
    }

    @Override // defpackage.cnvn
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        coba d;
        if (obj != null && (obj instanceof cnvn)) {
            try {
                cnvn cnvnVar = (cnvn) obj;
                if (cnvnVar.e() != this.a || (d = cnvnVar.d()) == null) {
                    return false;
                }
                return Arrays.equals(c(), (byte[]) cobb.c(d));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
