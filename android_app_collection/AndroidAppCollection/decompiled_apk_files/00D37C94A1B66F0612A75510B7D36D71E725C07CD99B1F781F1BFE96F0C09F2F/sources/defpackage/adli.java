package defpackage;
/* compiled from: PG */
/* renamed from: adli  reason: default package */
/* loaded from: classes.dex */
public final class adli extends aipq {
    private final adlc b;
    private final azqb c;
    private final aijf d;

    public adli(ajag ajagVar, adlc adlcVar, azqb azqbVar, aijf aijfVar) {
        super(ajagVar);
        this.b = adlcVar;
        this.c = azqbVar;
        this.d = aijfVar;
    }

    private final boolean e() {
        return ((adoa) this.c.get()).e() != null;
    }

    @Override // defpackage.aipq
    public final ajag a() {
        return e() ? this.b : this.a;
    }

    public final void b() {
        aijf aijfVar = this.d;
        boolean e = e();
        if (e != aijfVar.m) {
            aijfVar.m = e;
            aijfVar.i();
        }
    }

    @Override // defpackage.aipq
    public final boolean c() {
        return !e();
    }

    @Override // defpackage.aipq
    public final boolean d() {
        return !e();
    }
}
