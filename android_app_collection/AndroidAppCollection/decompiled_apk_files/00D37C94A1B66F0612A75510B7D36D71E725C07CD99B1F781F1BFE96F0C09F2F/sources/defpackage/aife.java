package defpackage;
/* compiled from: PG */
/* renamed from: aife  reason: default package */
/* loaded from: classes.dex */
public final class aife extends aiel {
    private final int a;
    private final aifd b;
    private aiev c;

    public aife(int i) {
        this.a = i;
        this.b = new aifd(i);
    }

    public final synchronized int a() {
        aiev aievVar = this.c;
        if (aievVar != null) {
            return aievVar.b(this.a);
        }
        return 0;
    }

    public final synchronized void b(aiev aievVar) {
        aiev aievVar2 = this.c;
        if (aievVar2 == aievVar) {
            return;
        }
        if (aievVar2 != null) {
            aievVar2.j(this.b);
            int a = a();
            if (a > 0) {
                this.b.c(this.a, a);
            }
        }
        this.c = aievVar;
        if (aievVar == null) {
            return;
        }
        if (a() > 0) {
            this.b.a(this.a, 0, a());
        }
        this.c.e(this.b);
    }

    @Override // defpackage.ymz
    public final synchronized void h(int i, int i2) {
        throw null;
    }
}
