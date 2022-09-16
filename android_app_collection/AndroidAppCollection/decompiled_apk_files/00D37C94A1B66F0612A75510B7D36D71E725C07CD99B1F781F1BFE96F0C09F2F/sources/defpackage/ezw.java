package defpackage;
/* compiled from: PG */
/* renamed from: ezw  reason: default package */
/* loaded from: classes3.dex */
public final class ezw {
    private apzg a;

    public ezw(apzg apzgVar) {
        apzgVar.getClass();
        this.a = apzgVar;
    }

    public final synchronized apzg a() {
        return this.a;
    }

    public final synchronized String b() {
        apzg apzgVar;
        aijm a;
        apzgVar = this.a;
        a = aijn.a(apzgVar);
        return a != null ? a.j(apzgVar) : "";
    }

    public final synchronized String c() {
        apzg apzgVar;
        aijm a;
        apzgVar = this.a;
        a = aijn.a(apzgVar);
        return a != null ? a.k(apzgVar) : "";
    }

    public final synchronized void d(apzg apzgVar) {
        apzgVar.getClass();
        if (this.a != apzgVar && f(apzgVar)) {
            this.a = apzgVar;
        }
    }

    public final synchronized boolean e() {
        return this.a.qn(attg.a);
    }

    public final synchronized boolean f(apzg apzgVar) {
        return aijn.d(this.a, apzgVar);
    }
}
