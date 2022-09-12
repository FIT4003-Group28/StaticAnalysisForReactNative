package defpackage;
/* compiled from: PG */
/* renamed from: akfo  reason: default package */
/* loaded from: classes2.dex */
public class akfo extends akfu implements akfx {
    private boolean a;
    private final CharSequence b;
    private final CharSequence c;
    private final cqtv d;
    private final boolean e;

    public akfo(gga ggaVar, cqhn cqhnVar, akft akftVar, boolean z, int i, int i2, int i3, int i4, cqtv cqtvVar, @dzsi cjtd cjtdVar, @dzsi cjtd cjtdVar2, boolean z2) {
        super(ggaVar, cqhnVar, akftVar, false, i, i2, cjtdVar, cjtdVar2);
        this.a = false;
        String string = ggaVar.getString(i3);
        this.b = string;
        this.c = i4 != 0 ? ggaVar.getString(i4) : string;
        this.d = cqtvVar;
        this.e = z2;
    }

    public void a(boolean z) {
        this.a = z;
        cqkx.p(this);
    }

    @Override // defpackage.akfx
    public cqtv b() {
        return this.d;
    }

    @Override // defpackage.akfx
    public jib c() {
        jhz a = jhz.a();
        a.a = this.b;
        a.n = this.c;
        a.i = null;
        a.j = null;
        a.f(null);
        a.x = this.a;
        return a.b();
    }

    @Override // defpackage.akfx
    public Boolean d() {
        return Boolean.valueOf(this.e);
    }
}
