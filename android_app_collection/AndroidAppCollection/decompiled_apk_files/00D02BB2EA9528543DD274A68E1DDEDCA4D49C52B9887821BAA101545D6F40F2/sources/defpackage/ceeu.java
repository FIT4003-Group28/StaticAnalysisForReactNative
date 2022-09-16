package defpackage;
/* compiled from: PG */
/* renamed from: ceeu  reason: default package */
/* loaded from: classes4.dex */
public final class ceeu extends ceez<dkcs, dkcu> {
    public ceeu(buvc buvcVar, cgrc cgrcVar, dkcs dkcsVar) {
        super(cgrcVar, buvcVar, dkcsVar);
    }

    @Override // defpackage.ceez
    public final void d() {
        cgre.g(this.a, dkcs.class, this);
    }

    @Override // defpackage.ceez
    protected final dssr<dkcs> e() {
        return (dssr) dkcs.c.cu(7);
    }

    @Override // defpackage.ceez
    protected final /* bridge */ /* synthetic */ void f(dkcu dkcuVar) {
        dkcu dkcuVar2 = dkcuVar;
        dusk duskVar = dkcuVar2.a;
        if (duskVar == null) {
            duskVar = dusk.c;
        }
        if ((duskVar.a & 2) == 0) {
            this.c = null;
            return;
        }
        dusk duskVar2 = dkcuVar2.a;
        if (duskVar2 == null) {
            duskVar2 = dusk.c;
        }
        duld duldVar = duskVar2.b;
        if (duldVar == null) {
            duldVar = duld.f;
        }
        duvn duvnVar = duldVar.c;
        if (duvnVar == null) {
            duvnVar = duvn.b;
        }
        dkcs dkcsVar = duvnVar.a;
        if (dkcsVar == null) {
            dkcsVar = dkcs.c;
        }
        this.c = dkcsVar;
    }
}
