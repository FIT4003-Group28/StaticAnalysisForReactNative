package defpackage;
/* compiled from: PG */
/* renamed from: arch  reason: default package */
/* loaded from: classes2.dex */
final class arch implements arcb {
    public aktc a;
    private final akty d;
    private ardg f;
    private boolean e = false;
    public boolean c = false;
    public final aktb b = new aktb(new akra(), dmlo.BOTTOM);

    public arch(akty aktyVar, aktc aktcVar) {
        this.d = aktyVar;
        this.a = aktcVar;
    }

    @Override // defpackage.arcb
    public final void a(boolean z) {
        if (z != this.e) {
            this.e = z;
            if (z) {
                this.d.f(this.a);
            } else {
                this.d.g(this.a);
            }
            this.c = false;
        }
    }

    @Override // defpackage.arcb
    public final void b() {
        this.d.g(this.a);
        this.d.e(this.a);
    }

    public final void c(aktc aktcVar) {
        aktc aktcVar2 = this.a;
        this.d.g(aktcVar2);
        this.d.e(aktcVar2);
        this.a = aktcVar;
        ardg ardgVar = this.f;
        if (ardgVar != null) {
            aktcVar.e(ardgVar);
        }
        if (this.e) {
            this.d.f(aktcVar);
        }
        this.c = false;
    }

    public final void d(ardg ardgVar) {
        this.a.e(ardgVar);
        this.f = ardgVar;
    }
}
