package defpackage;
/* compiled from: PG */
/* renamed from: caev  reason: default package */
/* loaded from: classes4.dex */
public final class caev extends cagi<duyo, duyq> {
    /* JADX INFO: Access modifiers changed from: protected */
    public caev(buvu buvuVar, nvg nvgVar) {
        super(buvuVar, nvgVar);
    }

    @Override // defpackage.cagi
    protected final dssr<duyo> c() {
        return (dssr) duyo.e.cu(7);
    }

    @Override // defpackage.cagi
    public final void d(duld duldVar) {
        duvl duvlVar = duldVar.d;
        if (duvlVar == null) {
            duvlVar = duvl.c;
        }
        if ((duvlVar.a & 2) != 0) {
            duvl duvlVar2 = duldVar.d;
            if (duvlVar2 == null) {
                duvlVar2 = duvl.c;
            }
            duyo duyoVar = duvlVar2.b;
            if (duyoVar == null) {
                duyoVar = duyo.e;
            }
            k(duyoVar);
        }
    }

    @Override // defpackage.cagi
    protected final /* bridge */ /* synthetic */ void e(duyq duyqVar) {
        duyq duyqVar2 = duyqVar;
        for (dulb dulbVar : duyqVar2.b) {
            this.b.p(l(dulbVar), duyqVar2.c);
        }
        dusk duskVar = duyqVar2.a;
        if (duskVar == null) {
            duskVar = dusk.c;
        }
        if ((duskVar.a & 2) != 0) {
            dusk duskVar2 = duyqVar2.a;
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
}
