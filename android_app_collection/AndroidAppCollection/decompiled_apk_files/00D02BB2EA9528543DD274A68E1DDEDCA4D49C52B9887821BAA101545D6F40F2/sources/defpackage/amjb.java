package defpackage;
/* compiled from: PG */
/* renamed from: amjb  reason: default package */
/* loaded from: classes2.dex */
final class amjb implements Comparable<amjb> {
    final amhh a;
    int b = 1;
    int c;

    public amjb(amhh amhhVar, int i) {
        this.a = amhhVar;
        this.c = i;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(amjb amjbVar) {
        int i = this.b;
        int i2 = amjbVar.b;
        if (i != i2) {
            return decl.c(i, i2);
        }
        int b = this.a.v().b();
        int b2 = amjbVar.a.v().b();
        if (b != b2) {
            return decl.c(b, b2);
        }
        if (this.a.s().f() != amjbVar.a.s().f()) {
            return decl.c(this.a.s().f(), amjbVar.a.s().f());
        }
        return decl.c(hashCode(), amjbVar.hashCode());
    }
}
