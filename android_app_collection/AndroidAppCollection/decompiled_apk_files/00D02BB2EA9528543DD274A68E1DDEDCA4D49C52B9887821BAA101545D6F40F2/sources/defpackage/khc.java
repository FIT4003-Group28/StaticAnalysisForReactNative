package defpackage;
/* compiled from: PG */
/* renamed from: khc  reason: default package */
/* loaded from: classes7.dex */
final class khc implements klr {
    final /* synthetic */ ckhf a;
    final /* synthetic */ mgn b;
    final /* synthetic */ khe c;

    public khc(khe kheVar, ckhf ckhfVar, mgn mgnVar) {
        this.c = kheVar;
        this.a = ckhfVar;
        this.b = mgnVar;
    }

    @Override // defpackage.klr
    public final void a(ldm ldmVar) {
        ckhf ckhfVar = this.a;
        if (ckhfVar != null) {
            kty.a(this.c.c, ckhfVar);
        }
        this.b.a(ldmVar);
    }

    @Override // defpackage.klr
    public final void b() {
    }
}
