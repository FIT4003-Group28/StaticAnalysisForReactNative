package defpackage;
/* compiled from: PG */
/* renamed from: acsm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acsm implements ampg {
    public final /* synthetic */ aopa a;
    private final /* synthetic */ int b;

    public /* synthetic */ acsm(aopa aopaVar) {
        this.a = aopaVar;
    }

    public /* synthetic */ acsm(aopa aopaVar, int i) {
        this.b = i;
        this.a = aopaVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                aopa aopaVar = this.a;
                aryz aryzVar = (aryz) obj;
                aopaVar.copyOnWrite();
                orh orhVar = (orh) aopaVar.instance;
                orh orhVar2 = orh.a;
                aryzVar.getClass();
                orhVar.e = aryzVar;
                orhVar.b |= 2;
                return aopaVar;
            }
            aopa aopaVar2 = this.a;
            tui tuiVar = (tui) obj;
            if (tuiVar == tui.DOWNLOADED || tuiVar == tui.PENDING) {
                aopaVar2.copyOnWrite();
                angu anguVar = (angu) aopaVar2.instance;
                angu anguVar2 = angu.a;
                anguVar.c = anha.a(4);
                anguVar.b = 1 | anguVar.b;
            } else {
                aopaVar2.copyOnWrite();
                angu anguVar3 = (angu) aopaVar2.instance;
                angu anguVar4 = angu.a;
                anguVar3.c = anha.a(5);
                anguVar3.b = 1 | anguVar3.b;
            }
            return (angu) aopaVar2.mo39build();
        }
        aopa aopaVar3 = this.a;
        awtn awtnVar = (awtn) obj;
        int i2 = acss.m;
        long j = awtnVar.c;
        if (j != -1) {
            aopaVar3.copyOnWrite();
            aqzo aqzoVar = (aqzo) aopaVar3.instance;
            aqzo aqzoVar2 = aqzo.a;
            aqzoVar.b |= 2;
            aqzoVar.d = j;
            aopa mo52toBuilder = awtnVar.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            awtn awtnVar2 = (awtn) mo52toBuilder.instance;
            awtnVar2.b = 1 | awtnVar2.b;
            awtnVar2.c = j + 1;
            return (awtn) mo52toBuilder.mo39build();
        }
        aopaVar3.copyOnWrite();
        aqzo aqzoVar3 = (aqzo) aopaVar3.instance;
        aqzo aqzoVar4 = aqzo.a;
        aqzoVar3.b |= 2;
        aqzoVar3.d = 0L;
        aopa mo52toBuilder2 = awtnVar.mo52toBuilder();
        mo52toBuilder2.copyOnWrite();
        awtn awtnVar3 = (awtn) mo52toBuilder2.instance;
        awtnVar3.b = 1 | awtnVar3.b;
        awtnVar3.c = 1L;
        return (awtn) mo52toBuilder2.mo39build();
    }
}
