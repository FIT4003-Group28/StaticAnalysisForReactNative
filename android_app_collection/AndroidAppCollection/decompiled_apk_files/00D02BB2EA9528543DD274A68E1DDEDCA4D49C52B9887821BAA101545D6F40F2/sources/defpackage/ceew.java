package defpackage;
/* compiled from: PG */
/* renamed from: ceew  reason: default package */
/* loaded from: classes4.dex */
public final class ceew extends ceez<dijv, dijx> {
    public ceew(buub buubVar, cgrc cgrcVar, dijv dijvVar) {
        super(cgrcVar, buubVar, dijvVar);
    }

    @Override // defpackage.ceez
    public final void d() {
        cgre.g(this.a, dijv.class, this);
    }

    @Override // defpackage.ceez
    protected final dssr<dijv> e() {
        return (dssr) dijv.c.cu(7);
    }

    @Override // defpackage.ceez
    protected final /* bridge */ /* synthetic */ void f(dijx dijxVar) {
        duld duldVar = dijxVar.c;
        if (duldVar == null) {
            duldVar = duld.f;
        }
        duuz duuzVar = duldVar.e;
        if (duuzVar == null) {
            duuzVar = duuz.c;
        }
        if ((duuzVar.a & 1) == 0) {
            this.c = null;
            return;
        }
        dijv dijvVar = duuzVar.b;
        if (dijvVar == null) {
            dijvVar = dijv.c;
        }
        this.c = dijvVar;
    }
}
