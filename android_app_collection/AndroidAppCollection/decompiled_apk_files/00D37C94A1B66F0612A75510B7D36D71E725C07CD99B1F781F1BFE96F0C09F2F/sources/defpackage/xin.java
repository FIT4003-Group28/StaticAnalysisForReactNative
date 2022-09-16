package defpackage;
/* compiled from: PG */
/* renamed from: xin  reason: default package */
/* loaded from: classes4.dex */
public final class xin implements aaqw {
    private final azqb a;

    public xin(azqb azqbVar) {
        azqbVar.getClass();
        this.a = azqbVar;
    }

    @Override // defpackage.aaqw
    public final void a(aopa aopaVar) {
        ylr.b();
        xio xioVar = (xio) this.a.get();
        aror arorVar = ((aroy) aopaVar.instance).j;
        if (arorVar == null) {
            arorVar = aror.a;
        }
        aopa mo52toBuilder = arorVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ((aror) mo52toBuilder.instance).b = aror.emptyProtobufList();
        aopa createBuilder = asmc.a.createBuilder();
        String e = xioVar.e();
        createBuilder.copyOnWrite();
        asmc asmcVar = (asmc) createBuilder.instance;
        e.getClass();
        asmcVar.b |= 1;
        asmcVar.e = e;
        String d = xioVar.d();
        createBuilder.copyOnWrite();
        asmc asmcVar2 = (asmc) createBuilder.instance;
        d.getClass();
        asmcVar2.c = 2;
        asmcVar2.d = d;
        mo52toBuilder.copyOnWrite();
        aror arorVar2 = (aror) mo52toBuilder.instance;
        asmc asmcVar3 = (asmc) createBuilder.mo39build();
        asmcVar3.getClass();
        aopu aopuVar = arorVar2.b;
        if (!aopuVar.c()) {
            arorVar2.b = aopi.mutableCopy(aopuVar);
        }
        arorVar2.b.add(asmcVar3);
        aopaVar.copyOnWrite();
        aroy aroyVar = (aroy) aopaVar.instance;
        aror arorVar3 = (aror) mo52toBuilder.mo39build();
        arorVar3.getClass();
        aroyVar.j = arorVar3;
        aroyVar.b |= 256;
    }
}
