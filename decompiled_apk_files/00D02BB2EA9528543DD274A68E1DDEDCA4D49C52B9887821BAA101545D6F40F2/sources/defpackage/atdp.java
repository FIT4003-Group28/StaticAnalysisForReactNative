package defpackage;
/* compiled from: PG */
/* renamed from: atdp  reason: default package */
/* loaded from: classes2.dex */
public final class atdp extends atcy {
    public final asmm a;
    public final gga c;
    public final btyh d;
    @dzsi
    public atlq e;
    private final btrm f;
    private final btvo g;
    private final atdo h;

    public atdp(atcu atcuVar, atcw atcwVar, asmm asmmVar, gga ggaVar, btvo btvoVar, btrm btrmVar, btyh btyhVar) {
        super(atcuVar, atcwVar);
        this.h = new atdo(this);
        this.a = asmmVar;
        this.c = ggaVar;
        this.g = btvoVar;
        this.f = btrmVar;
        this.d = btyhVar;
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        this.e = atlqVar;
    }

    @Override // defpackage.atcy, defpackage.asmo
    public final void b() {
        btrm btrmVar = this.f;
        atdo atdoVar = this.h;
        dceq a = dcet.a();
        a.b(gdt.class, new atdq(gdt.class, atdoVar, bvrj.UI_THREAD));
        btrmVar.g(atdoVar, a.a());
    }

    @Override // defpackage.atcy, defpackage.asmo
    public final void c() {
        this.f.a(this.h);
    }

    public final boolean h() {
        atlq atlqVar;
        if (!this.g.getEnrouteParameters().a || (atlqVar = this.e) == null || !atlqVar.b()) {
            return false;
        }
        return vxx.d(this.e.m.g().a.h, this.g);
    }

    public final int i() {
        atlq atlqVar = this.e;
        if (atlqVar == null || !atlqVar.b()) {
            return 0;
        }
        return this.e.m.g().a.ai() - 2;
    }
}
