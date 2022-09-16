package defpackage;
/* compiled from: PG */
/* renamed from: bakk  reason: default package */
/* loaded from: classes2.dex */
public final class bakk {
    public final bale a;
    public final bala b;
    public final bahl c;
    public final baht d;

    public bakk(bale baleVar, bala balaVar) {
        this.a = baleVar;
        this.b = balaVar;
        this.c = null;
        this.d = null;
    }

    public bakk(bale baleVar, bala balaVar, bahl bahlVar, baht bahtVar) {
        this.a = baleVar;
        this.b = balaVar;
        this.c = bahlVar;
        this.d = bahtVar;
    }

    public final String a(baig baigVar) {
        StringBuffer stringBuffer = new StringBuffer(e().b());
        f(stringBuffer, bahq.b(baigVar), bahq.e(baigVar));
        return stringBuffer.toString();
    }

    public final bahl b(bahl bahlVar) {
        bahl d = bahq.d(bahlVar);
        bahl bahlVar2 = this.c;
        if (bahlVar2 != null) {
            d = bahlVar2;
        }
        baht bahtVar = this.d;
        return bahtVar != null ? d.b(bahtVar) : d;
    }

    public final bakk c(baht bahtVar) {
        return this.d == bahtVar ? this : new bakk(this.a, this.b, this.c, bahtVar);
    }

    public final bakk d() {
        return c(baht.a);
    }

    public final bale e() {
        bale baleVar = this.a;
        if (baleVar != null) {
            return baleVar;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    public final void f(StringBuffer stringBuffer, long j, bahl bahlVar) {
        bale e = e();
        bahl b = b(bahlVar);
        baht z = b.z();
        int a = z.a(j);
        long j2 = a;
        long j3 = j + j2;
        if ((j ^ j3) < 0 && (j2 ^ j) >= 0) {
            z = baht.a;
            a = 0;
            j3 = j;
        }
        e.d(stringBuffer, j3, b.a(), a, z, null);
    }
}
