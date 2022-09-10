package defpackage;
/* compiled from: PG */
/* renamed from: akxp  reason: default package */
/* loaded from: classes2.dex */
public abstract class akxp implements Runnable {
    private final bnsn a;
    @dzsi
    private bnuw b = null;
    private float c;

    public akxp(bnsn bnsnVar) {
        this.a = bnsnVar;
    }

    public abstract void a(int i, int i2, float f);

    public final void b() {
        bnrr bnrrVar = this.a.h;
        if (bnrrVar != null) {
            this.b = bnrrVar.A();
            this.c = bnrrVar.B();
        }
        this.a.k(this);
    }

    public final void c() {
        this.a.l(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        bnrr bnrrVar = this.a.h;
        if (bnrrVar != null) {
            bnuw A = bnrrVar.A();
            bnuw bnuwVar = this.b;
            if (bnuwVar != null && (!bnuwVar.equals(A) || this.c != bnrrVar.B())) {
                a(bnrrVar.y(), bnrrVar.z(), bnrrVar.B());
            }
            this.b = A;
            this.c = bnrrVar.B();
        }
    }
}
