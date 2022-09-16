package defpackage;
/* compiled from: PG */
/* renamed from: acte  reason: default package */
/* loaded from: classes.dex */
public final class acte extends acum {
    @Deprecated
    public acte(actj actjVar) {
        actjVar.getClass();
        aopa createBuilder = awbs.a.createBuilder();
        int i = actjVar.II;
        createBuilder.copyOnWrite();
        awbs awbsVar = (awbs) createBuilder.instance;
        awbsVar.b |= 2;
        awbsVar.d = i;
        this.a = (awbs) createBuilder.mo39build();
    }

    public static acte a(aoqu aoquVar) {
        if (aoquVar == null) {
            zep.m("INTERACTIONLOGGINGBUG->", "loggingDirectable is null when creating visual element container!");
            return null;
        }
        return new acte(acun.b(aoquVar));
    }

    public acte(acup acupVar) {
        acupVar.getClass();
        aopa createBuilder = awbs.a.createBuilder();
        int i = acupVar.a;
        createBuilder.copyOnWrite();
        awbs awbsVar = (awbs) createBuilder.instance;
        awbsVar.b |= 2;
        awbsVar.d = i;
        this.a = (awbs) createBuilder.mo39build();
    }

    public acte(aoob aoobVar) {
        aoobVar.getClass();
        aopa createBuilder = awbs.a.createBuilder();
        createBuilder.copyOnWrite();
        awbs awbsVar = (awbs) createBuilder.instance;
        awbsVar.b |= 1;
        awbsVar.c = aoobVar;
        this.a = (awbs) createBuilder.mo39build();
    }

    public acte(asvv asvvVar) {
        awbs awbsVar;
        this.a = awbs.a;
        if (asvvVar == null) {
            zep.m("INTERACTIONLOGGINGBUG->", "LoggingDirective is null when creating visual element container!");
            return;
        }
        aopa createBuilder = awbs.a.createBuilder();
        apxf apxfVar = asvvVar.h;
        if (((apxfVar == null ? apxf.a : apxfVar).b & 1) == 0) {
            aoob aoobVar = asvvVar.d;
            createBuilder.copyOnWrite();
            awbs awbsVar2 = (awbs) createBuilder.instance;
            aoobVar.getClass();
            awbsVar2.b |= 1;
            awbsVar2.c = aoobVar;
            awbsVar = (awbs) createBuilder.mo39build();
        } else {
            apxf apxfVar2 = asvvVar.h;
            apxfVar2 = apxfVar2 == null ? apxf.a : apxfVar2;
            int i = apxfVar2.c;
            createBuilder.copyOnWrite();
            awbs awbsVar3 = (awbs) createBuilder.instance;
            awbsVar3.b |= 2;
            awbsVar3.d = i;
            aopa createBuilder2 = awbs.a.createBuilder();
            aoob aoobVar2 = asvvVar.d;
            createBuilder2.copyOnWrite();
            awbs awbsVar4 = (awbs) createBuilder2.instance;
            aoobVar2.getClass();
            awbsVar4.b |= 1;
            awbsVar4.c = aoobVar2;
            createBuilder.copyOnWrite();
            awbs awbsVar5 = (awbs) createBuilder.instance;
            awbs awbsVar6 = (awbs) createBuilder2.mo39build();
            awbsVar6.getClass();
            awbsVar5.g = awbsVar6;
            awbsVar5.b |= 16;
            if ((apxfVar2.b & 2) != 0) {
                int i2 = apxfVar2.d;
                createBuilder.copyOnWrite();
                awbs awbsVar7 = (awbs) createBuilder.instance;
                awbsVar7.b |= 8;
                awbsVar7.f = i2;
            }
            if ((apxfVar2.b & 4) != 0) {
                int i3 = apxfVar2.e;
                createBuilder.copyOnWrite();
                awbs awbsVar8 = (awbs) createBuilder.instance;
                awbsVar8.b |= 8;
                awbsVar8.f = i3;
            }
            if ((apxfVar2.b & 8) != 0) {
                apxg apxgVar = apxfVar2.f;
                apxgVar = apxgVar == null ? apxg.a : apxgVar;
                createBuilder.copyOnWrite();
                awbs awbsVar9 = (awbs) createBuilder.instance;
                apxgVar.getClass();
                awbsVar9.h = apxgVar;
                awbsVar9.b |= 64;
            }
            awbsVar = (awbs) createBuilder.mo39build();
        }
        if (awbsVar != null) {
            this.a = awbsVar;
        }
        this.b = asvvVar;
    }

    public acte(byte[] bArr) {
        bArr.getClass();
        aopa createBuilder = awbs.a.createBuilder();
        aoob x = aoob.x(bArr);
        createBuilder.copyOnWrite();
        awbs awbsVar = (awbs) createBuilder.instance;
        awbsVar.b |= 1;
        awbsVar.c = x;
        this.a = (awbs) createBuilder.mo39build();
    }
}
