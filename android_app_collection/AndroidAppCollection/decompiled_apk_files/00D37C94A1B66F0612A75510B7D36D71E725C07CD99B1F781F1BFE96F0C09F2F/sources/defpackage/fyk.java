package defpackage;
/* compiled from: PG */
/* renamed from: fyk  reason: default package */
/* loaded from: classes3.dex */
public final class fyk implements fxz {
    private final arfu a;

    public fyk(String str, String str2, String str3) {
        aopa createBuilder = arfu.a.createBuilder();
        aopc aopcVar = (aopc) arhs.a.createBuilder();
        arhr arhrVar = arhr.PLAY_ARROW;
        aopcVar.copyOnWrite();
        arhs arhsVar = (arhs) aopcVar.instance;
        arhsVar.c = arhrVar.pS;
        arhsVar.b |= 1;
        createBuilder.copyOnWrite();
        arfu arfuVar = (arfu) createBuilder.instance;
        arhs arhsVar2 = (arhs) aopcVar.mo39build();
        arhsVar2.getClass();
        arfuVar.e = arhsVar2;
        arfuVar.b |= 1;
        aopa createBuilder2 = aovr.a.createBuilder();
        zgh.m(str3);
        createBuilder2.copyOnWrite();
        aovr aovrVar = (aovr) createBuilder2.instance;
        aovrVar.b |= 2;
        aovrVar.c = str3;
        createBuilder.copyOnWrite();
        arfu arfuVar2 = (arfu) createBuilder.instance;
        aovr aovrVar2 = (aovr) createBuilder2.mo39build();
        aovrVar2.getClass();
        arfuVar2.f = aovrVar2;
        arfuVar2.b |= 8;
        aopa createBuilder3 = attf.a.createBuilder();
        createBuilder3.copyOnWrite();
        attf attfVar = (attf) createBuilder3.instance;
        attfVar.b |= 1;
        attfVar.c = str2;
        zgh.m(str);
        createBuilder3.copyOnWrite();
        attf attfVar2 = (attf) createBuilder3.instance;
        attfVar2.b |= 2;
        attfVar2.d = str;
        createBuilder3.copyOnWrite();
        attf attfVar3 = (attf) createBuilder3.instance;
        attfVar3.b |= 4;
        attfVar3.e = 0;
        aopc aopcVar2 = (aopc) apzg.a.createBuilder();
        aopcVar2.e(attg.a, (attf) createBuilder3.mo39build());
        createBuilder.copyOnWrite();
        arfu arfuVar3 = (arfu) createBuilder.instance;
        apzg apzgVar = (apzg) aopcVar2.mo39build();
        apzgVar.getClass();
        arfuVar3.d = apzgVar;
        arfuVar3.c = 3;
        this.a = (arfu) createBuilder.mo39build();
    }

    @Override // defpackage.fxz
    public final apzg a() {
        arfu arfuVar = this.a;
        if (arfuVar.c == 3) {
            return (apzg) arfuVar.d;
        }
        return null;
    }

    @Override // defpackage.fxz
    public final apzg b() {
        arfu arfuVar = this.a;
        if (arfuVar.c == 2) {
            return (apzg) arfuVar.d;
        }
        return null;
    }

    @Override // defpackage.fxz
    public final arhs c() {
        arfu arfuVar = this.a;
        if ((arfuVar.b & 1) != 0) {
            arhs arhsVar = arfuVar.e;
            return arhsVar == null ? arhs.a : arhsVar;
        }
        return null;
    }

    @Override // defpackage.fxz
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.fxz
    public final String e() {
        arfu arfuVar = this.a;
        if ((arfuVar.b & 8) != 0) {
            aovr aovrVar = arfuVar.f;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            return aovrVar.c;
        }
        return null;
    }
}
