package defpackage;
/* compiled from: PG */
/* renamed from: acwu  reason: default package */
/* loaded from: classes.dex */
public final class acwu implements acwt {
    @dzsi
    public alad a;
    private final dxio<akpm> b;

    public acwu(dxio<akpm> dxioVar) {
        this.b = dxioVar;
    }

    @Override // defpackage.acwt
    public final void a() {
        this.a = this.b.a().n();
    }

    @Override // defpackage.acwt
    public final void b() {
        alad aladVar = this.a;
        if (aladVar != null) {
            this.b.a().p(akyt.e(aladVar));
            this.a = null;
        }
    }
}
