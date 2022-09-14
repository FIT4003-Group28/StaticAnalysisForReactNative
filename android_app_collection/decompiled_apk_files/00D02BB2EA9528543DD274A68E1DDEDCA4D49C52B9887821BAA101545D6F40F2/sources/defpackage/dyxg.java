package defpackage;
/* compiled from: PG */
/* renamed from: dyxg  reason: default package */
/* loaded from: classes6.dex */
public final class dyxg {
    public final boolean a;
    public String[] b;
    public String[] c;
    public boolean d;

    public dyxg(dyxh dyxhVar) {
        this.a = dyxhVar.b;
        this.b = dyxhVar.c;
        this.c = dyxhVar.d;
        this.d = dyxhVar.e;
    }

    public dyxg(boolean z) {
        this.a = z;
    }

    public final dyxh a() {
        return new dyxh(this);
    }

    public final void c(String... strArr) {
        if (this.a) {
            if (strArr == null) {
                this.b = null;
                return;
            } else {
                this.b = (String[]) strArr.clone();
                return;
            }
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public final void d(dyxu... dyxuVarArr) {
        if (this.a) {
            int length = dyxuVarArr.length;
            if (length != 0) {
                String[] strArr = new String[length];
                for (int i = 0; i < dyxuVarArr.length; i++) {
                    strArr[i] = dyxuVarArr[i].e;
                }
                this.c = strArr;
                return;
            }
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public final void e(String... strArr) {
        if (this.a) {
            if (strArr == null) {
                this.c = null;
                return;
            } else {
                this.c = (String[]) strArr.clone();
                return;
            }
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public final void f() {
        if (this.a) {
            this.d = true;
            return;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public final void b(dyxf... dyxfVarArr) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[dyxfVarArr.length];
        for (int i = 0; i < dyxfVarArr.length; i++) {
            strArr[i] = dyxfVarArr[i].aS;
        }
        this.b = strArr;
    }
}
