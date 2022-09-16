package defpackage;
/* compiled from: PG */
/* renamed from: dyl  reason: default package */
/* loaded from: classes3.dex */
public final class dyl implements ajfe {
    private final dyo a;
    private final dxe b;
    private String c;
    private Integer d;
    private ajet e;
    private ajfq f;
    private Boolean g;
    private acvg h;
    private afhz i;

    public dyl(dyo dyoVar, dxe dxeVar) {
        this.a = dyoVar;
        this.b = dxeVar;
    }

    @Override // defpackage.ajfe
    public final ajff a() {
        axzl.n(this.c, String.class);
        axzl.n(this.d, Integer.class);
        axzl.n(this.e, ajet.class);
        axzl.n(this.f, ajfq.class);
        axzl.n(this.g, Boolean.class);
        return new dyn(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.ajfe
    public final /* bridge */ /* synthetic */ void c(ajet ajetVar) {
        ajetVar.getClass();
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

    @Override // defpackage.ajfe
    /* renamed from: i */
    public final void b(String str) {
        str.getClass();
        this.c = str;
    }
}
