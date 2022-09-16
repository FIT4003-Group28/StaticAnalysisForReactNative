package defpackage;
/* compiled from: PG */
/* renamed from: opp  reason: default package */
/* loaded from: classes3.dex */
final class opp implements ajfe {
    private final opr a;
    private final opn b;
    private String c;
    private Integer d;
    private ajet e;
    private ajfq f;
    private Boolean g;
    private acvg h;
    private afhz i;

    public opp(opr oprVar, opn opnVar) {
        this.a = oprVar;
        this.b = opnVar;
    }

    @Override // defpackage.ajfe
    public final ajff a() {
        axzl.n(this.c, String.class);
        axzl.n(this.d, Integer.class);
        axzl.n(this.e, ajet.class);
        axzl.n(this.f, ajfq.class);
        axzl.n(this.g, Boolean.class);
        return new opq(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.ajfe
    public final /* bridge */ /* synthetic */ void b(String str) {
        str.getClass();
        this.c = str;
    }

    @Override // defpackage.ajfe
    public final /* bridge */ /* synthetic */ void c(ajet ajetVar) {
        this.e = ajetVar;
    }

    @Override // defpackage.ajfe
    public final /* bridge */ /* synthetic */ void d(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.ajfe
    public final /* bridge */ /* synthetic */ void e(acvg acvgVar) {
        this.h = acvgVar;
    }

    @Override // defpackage.ajfe
    public final /* bridge */ /* synthetic */ void f(ajfq ajfqVar) {
        ajfqVar.getClass();
        this.f = ajfqVar;
    }

    @Override // defpackage.ajfe
    public final /* bridge */ /* synthetic */ void g(afhz afhzVar) {
        this.i = afhzVar;
    }

    @Override // defpackage.ajfe
    public final /* bridge */ /* synthetic */ void h(int i) {
        this.d = Integer.valueOf(i);
    }
}
