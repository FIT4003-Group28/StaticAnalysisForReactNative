package defpackage;
/* compiled from: PG */
/* renamed from: eadk  reason: default package */
/* loaded from: classes6.dex */
public final class eadk {
    final boolean a;
    @dzsi
    String[] b;
    @dzsi
    String[] c;
    boolean d;

    public eadk(eadl eadlVar) {
        this.a = eadlVar.c;
        this.b = eadlVar.e;
        this.c = eadlVar.f;
        this.d = eadlVar.d;
    }

    public eadk(boolean z) {
        this.a = z;
    }

    public final eadl a() {
        return new eadl(this);
    }

    public final void c() {
        if (this.a) {
            this.d = true;
            return;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public final void f(eaet... eaetVarArr) {
        if (this.a) {
            String[] strArr = new String[eaetVarArr.length];
            for (int i = 0; i < eaetVarArr.length; i++) {
                strArr[i] = eaetVarArr[i].f;
            }
            d(strArr);
            return;
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public final void b(String... strArr) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.b = (String[]) strArr.clone();
    }

    public final void d(String... strArr) {
        if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.c = (String[]) strArr.clone();
    }

    public final void e(eadh... eadhVarArr) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[eadhVarArr.length];
        for (int i = 0; i < eadhVarArr.length; i++) {
            strArr[i] = eadhVarArr[i].t;
        }
        b(strArr);
    }
}
