package defpackage;
/* compiled from: PG */
/* renamed from: alko  reason: default package */
/* loaded from: classes.dex */
public final class alko extends amxj {
    protected boolean a;
    private final alkq b;

    public alko(alkq alkqVar, bnrz bnrzVar) {
        super(bnrzVar);
        this.a = false;
        this.b = alkqVar;
    }

    @Override // defpackage.bnsc, defpackage.bnsa
    public final void a(long j) {
        this.b.f();
    }

    @Override // defpackage.amxj, defpackage.bnsc, defpackage.bnsa
    public final void b(@dzsi bnsa bnsaVar, @dzsi bnsa bnsaVar2, bnrr bnrrVar) {
        if (!this.a) {
            super.b(bnsaVar, bnsaVar2, bnrrVar);
            return;
        }
        ((amxj) this).g = alkl.a;
        super.b(bnsaVar, bnsaVar2, bnrrVar);
        this.p = true;
        ((amxj) this).g = alkm.a;
        super.b(bnsaVar, bnsaVar2, bnrrVar);
        ((amxj) this).g = alkn.a;
    }
}
