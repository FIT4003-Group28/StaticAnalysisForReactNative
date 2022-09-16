package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahdw  reason: default package */
/* loaded from: classes.dex */
public final class ahdw {
    static final byte[] a = {0};
    static final byte[] b = {1};
    public static final /* synthetic */ int c = 0;
    private final ArrayDeque d = new ArrayDeque();
    private final MessageDigest e;
    private int f;
    private final boolean g;

    public ahdw() {
        try {
            this.e = MessageDigest.getInstance("SHA-256");
            this.g = false;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public static ahdt a(boolean z) {
        return new ahds(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] e(byte[] bArr) {
        return Arrays.copyOf(bArr, 10);
    }

    private final void f() {
        while (this.d.size() >= 2) {
            ahdu ahduVar = (ahdu) this.d.pop();
            ahdu ahduVar2 = (ahdu) this.d.pop();
            if (ahduVar.a == ahduVar2.a) {
                this.e.reset();
                this.e.update(b);
                this.e.update(ahduVar2.b);
                this.e.update(ahduVar.b);
                byte[] digest = this.e.digest();
                ArrayDeque arrayDeque = this.d;
                int i = ahduVar2.a + 1;
                if (this.g) {
                    digest = e(digest);
                }
                arrayDeque.push(new ahdu(i, digest));
            } else {
                this.d.push(ahduVar2);
                this.d.push(ahduVar);
                return;
            }
        }
    }

    public final void b(byte[] bArr) {
        this.d.push(new ahdu(0, bArr));
        this.f++;
        f();
    }

    public final void c() {
        this.d.clear();
        this.f = 0;
    }

    public final byte[] d() {
        while (this.d.size() > 1) {
            ahdu ahduVar = (ahdu) this.d.peek();
            if (ahduVar != null) {
                ahduVar.a++;
                f();
            }
        }
        ahdu ahduVar2 = (ahdu) this.d.peek();
        if (this.d.size() != 1 || ahduVar2 == null) {
            this.e.reset();
            return this.g ? e(this.e.digest()) : this.e.digest();
        }
        return ahduVar2.b;
    }

    public ahdw(boolean z) {
        try {
            this.e = MessageDigest.getInstance("SHA-256");
            this.g = z;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
