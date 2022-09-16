package defpackage;
/* compiled from: PG */
/* renamed from: hyc  reason: default package */
/* loaded from: classes3.dex */
final class hyc implements xlj {
    final /* synthetic */ hyd a;
    private int b = 0;
    private String c;

    public hyc(hyd hydVar) {
        this.a = hydVar;
    }

    @Override // defpackage.xlj
    public final void a() {
        this.a.b.c(this.b);
        this.b = 0;
        this.a.a.b(this.c);
    }

    @Override // defpackage.xlj
    public final void b() {
        this.b = this.a.b.a();
        this.c = this.a.a.a();
    }
}
