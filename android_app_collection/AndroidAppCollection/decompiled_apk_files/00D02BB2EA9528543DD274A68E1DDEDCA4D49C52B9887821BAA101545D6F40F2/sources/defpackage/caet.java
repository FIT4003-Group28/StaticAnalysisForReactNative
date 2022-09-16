package defpackage;
/* compiled from: PG */
/* renamed from: caet  reason: default package */
/* loaded from: classes4.dex */
public final class caet extends cagi<dijv, dijx> {
    /* JADX INFO: Access modifiers changed from: protected */
    public caet(buub buubVar, nvg nvgVar) {
        super(buubVar, nvgVar);
        this.f = buubVar;
    }

    @Override // defpackage.cagi
    protected final dssr<dijv> c() {
        return (dssr) dijv.c.cu(7);
    }

    @Override // defpackage.cagi
    public final void d(duld duldVar) {
        duuz duuzVar = duldVar.e;
        if (duuzVar == null) {
            duuzVar = duuz.c;
        }
        if ((duuzVar.a & 1) != 0) {
            duuz duuzVar2 = duldVar.e;
            if (duuzVar2 == null) {
                duuzVar2 = duuz.c;
            }
            dijv dijvVar = duuzVar2.b;
            if (dijvVar == null) {
                dijvVar = dijv.c;
            }
            k(dijvVar);
        }
    }

    @Override // defpackage.cagi
    protected final /* bridge */ /* synthetic */ void e(dijx dijxVar) {
        dijx dijxVar2 = dijxVar;
        for (dulb dulbVar : dijxVar2.b) {
            this.b.p(l(dulbVar), "");
        }
        if ((dijxVar2.a & 1) != 0) {
            duld duldVar = dijxVar2.c;
            if (duldVar == null) {
                duldVar = duld.f;
            }
            this.c = duldVar;
        }
    }
}
