package defpackage;
/* compiled from: PG */
/* renamed from: cagl  reason: default package */
/* loaded from: classes4.dex */
public final class cagl extends cagi<dkcs, dkcu> {
    public cagl(buvc buvcVar, nvg nvgVar) {
        super(buvcVar, nvgVar);
    }

    @Override // defpackage.cagi
    protected final dssr<dkcs> c() {
        return (dssr) dkcs.c.cu(7);
    }

    @Override // defpackage.cagi
    public final void d(duld duldVar) {
        duvn duvnVar = duldVar.c;
        if (duvnVar == null) {
            duvnVar = duvn.b;
        }
        dkcs dkcsVar = duvnVar.a;
        if (dkcsVar == null) {
            dkcsVar = dkcs.c;
        }
        k(dkcsVar);
    }

    @Override // defpackage.cagi
    protected final /* bridge */ /* synthetic */ void e(dkcu dkcuVar) {
        dkcu dkcuVar2 = dkcuVar;
        for (dulb dulbVar : dkcuVar2.b) {
            this.b.p(l(dulbVar), dkcuVar2.c);
        }
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
        this.c = duldVar;
    }
}
