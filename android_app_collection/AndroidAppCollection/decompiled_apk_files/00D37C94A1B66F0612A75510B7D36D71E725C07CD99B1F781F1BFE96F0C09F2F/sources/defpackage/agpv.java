package defpackage;
/* compiled from: PG */
/* renamed from: agpv  reason: default package */
/* loaded from: classes.dex */
public final class agpv implements agpw {
    private aajk a;

    public agpv(aajk aajkVar) {
        aajkVar.getClass();
        this.a = aajkVar;
    }

    @Override // defpackage.agpw
    public final synchronized int a(String str, int i) {
        throw null;
    }

    @Override // defpackage.agpw
    public final synchronized long b(String str) {
        throw null;
    }

    @Override // defpackage.agpw
    public final synchronized long c(String str, long j) {
        throw null;
    }

    public final synchronized aajk d() {
        return this.a;
    }

    @Override // defpackage.agpw
    public final synchronized String e(String str) {
        throw null;
    }

    @Override // defpackage.agpw
    public final synchronized void f(String str, boolean z) {
        aopa mo52toBuilder = this.a.b.mo52toBuilder();
        abga.i("license_released", Boolean.toString(true), mo52toBuilder);
        this.a = abga.h(mo52toBuilder);
    }

    @Override // defpackage.agpw
    public final synchronized void g(String str, byte[] bArr) {
        throw null;
    }

    @Override // defpackage.agpw
    public final synchronized void h(String str, int i) {
        throw null;
    }

    @Override // defpackage.agpw
    public final synchronized void i(String str, long j) {
        throw null;
    }

    @Override // defpackage.agpw
    public final synchronized void j(String str, String str2) {
        throw null;
    }

    @Override // defpackage.agpw
    public final synchronized boolean k(String str) {
        return l("license_released", false);
    }

    @Override // defpackage.agpw
    public final synchronized boolean l(String str, boolean z) {
        String c = this.a.c("license_released");
        if (c == null) {
            return false;
        }
        return Boolean.parseBoolean(c);
    }

    @Override // defpackage.agpw
    public final synchronized byte[] m(String str) {
        throw null;
    }
}
