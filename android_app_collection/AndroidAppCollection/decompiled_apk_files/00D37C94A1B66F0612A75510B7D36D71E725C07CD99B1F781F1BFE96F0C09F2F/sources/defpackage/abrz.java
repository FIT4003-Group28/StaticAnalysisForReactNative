package defpackage;
/* compiled from: PG */
/* renamed from: abrz  reason: default package */
/* loaded from: classes.dex */
public final class abrz implements absu, absb {
    public abst a;
    public int b = 0;
    private final absc c = new absc(this);
    private final absz d;

    public abrz(absz abszVar) {
        this.d = abszVar;
    }

    @Override // defpackage.absb
    public final void a(int i) {
        this.b = i;
    }

    @Override // defpackage.absb
    public final synchronized void b() {
        abst abstVar = this.a;
        if (abstVar != null) {
            abstVar.a();
        }
    }

    @Override // defpackage.absu
    public final void c(abry abryVar) {
        this.c.a();
        this.b = 0;
    }

    @Override // defpackage.absu
    public final synchronized boolean e(boolean z, absw abswVar, abry abryVar) {
        int b = this.d.b();
        int a = this.d.a();
        if (b != 0 && a != 0) {
            this.c.b(b, a);
            this.c.e(z, abswVar, abryVar);
            return true;
        }
        return false;
    }
}
