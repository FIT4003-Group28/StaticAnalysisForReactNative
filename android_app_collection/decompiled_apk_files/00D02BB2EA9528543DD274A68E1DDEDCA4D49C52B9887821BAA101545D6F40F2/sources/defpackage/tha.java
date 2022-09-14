package defpackage;
/* compiled from: PG */
/* renamed from: tha  reason: default package */
/* loaded from: classes7.dex */
public final class tha implements tgg {
    private final dxio<akfa> a;
    private final tgx b;
    private final thd c;

    public tha(tgx tgxVar, dxio<akfa> dxioVar, thd thdVar) {
        this.b = tgxVar;
        this.a = dxioVar;
        this.c = thdVar;
    }

    @Override // defpackage.tgg
    public final void a() {
        btlu j = this.a.a().j();
        tgx tgxVar = this.b;
        thd thdVar = this.c;
        tgs a = thd.a(thdVar.a, j, dbpy.a, dbpy.a);
        ((tgp) a).e = 3;
        tgxVar.a(a.a());
    }
}
