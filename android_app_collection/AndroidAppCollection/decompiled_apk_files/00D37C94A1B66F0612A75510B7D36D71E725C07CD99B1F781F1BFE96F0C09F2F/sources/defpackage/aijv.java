package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aijv  reason: default package */
/* loaded from: classes.dex */
public final class aijv extends aijj {
    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ ory a(Object obj) {
        augi augiVar = (augi) obj;
        aopa createBuilder = ory.a.createBuilder();
        String str = augiVar.e;
        createBuilder.copyOnWrite();
        ory oryVar = (ory) createBuilder.instance;
        str.getClass();
        oryVar.b |= 1;
        oryVar.c = str;
        String str2 = augiVar.f;
        createBuilder.copyOnWrite();
        ory oryVar2 = (ory) createBuilder.instance;
        str2.getClass();
        oryVar2.b |= 2;
        oryVar2.e = str2;
        int i = augiVar.g;
        createBuilder.copyOnWrite();
        ory oryVar3 = (ory) createBuilder.instance;
        oryVar3.b |= 4;
        oryVar3.f = i;
        String str3 = augiVar.h;
        createBuilder.copyOnWrite();
        ory oryVar4 = (ory) createBuilder.instance;
        str3.getClass();
        oryVar4.b |= 512;
        oryVar4.m = str3;
        createBuilder.copyOnWrite();
        ory oryVar5 = (ory) createBuilder.instance;
        oryVar5.b |= 32;
        oryVar5.i = false;
        long millis = TimeUnit.SECONDS.toMillis(augiVar.l);
        createBuilder.copyOnWrite();
        ory oryVar6 = (ory) createBuilder.instance;
        oryVar6.b |= 256;
        oryVar6.l = millis;
        createBuilder.copyOnWrite();
        ory oryVar7 = (ory) createBuilder.instance;
        oryVar7.b |= 2048;
        oryVar7.o = true;
        if ((augiVar.c & 32) != 0) {
            atub atubVar = augiVar.i;
            if (atubVar == null) {
                atubVar = atub.a;
            }
            if ((atubVar.b & 2) != 0) {
                atub atubVar2 = augiVar.i;
                if (atubVar2 == null) {
                    atubVar2 = atub.a;
                }
                attz attzVar = atubVar2.d;
                if (attzVar == null) {
                    attzVar = attz.a;
                }
                createBuilder.copyOnWrite();
                ory oryVar8 = (ory) createBuilder.instance;
                attzVar.getClass();
                oryVar8.s = attzVar;
                oryVar8.b |= 262144;
            }
            atub atubVar3 = augiVar.i;
            if (atubVar3 == null) {
                atubVar3 = atub.a;
            }
            if ((atubVar3.b & 1) != 0) {
                atub atubVar4 = augiVar.i;
                if (atubVar4 == null) {
                    atubVar4 = atub.a;
                }
                atty attyVar = atubVar4.c;
                if (attyVar == null) {
                    attyVar = atty.a;
                }
                createBuilder.copyOnWrite();
                ory oryVar9 = (ory) createBuilder.instance;
                attyVar.getClass();
                oryVar9.r = attyVar;
                oryVar9.b |= 65536;
            }
        }
        if ((augiVar.c & 64) != 0) {
            aweh awehVar = augiVar.j;
            if (awehVar == null) {
                awehVar = aweh.a;
            }
            createBuilder.copyOnWrite();
            ory oryVar10 = (ory) createBuilder.instance;
            awehVar.getClass();
            oryVar10.A = awehVar;
            oryVar10.b |= 268435456;
        }
        return (ory) createBuilder.mo39build();
    }

    @Override // defpackage.aijm
    public final aooq b() {
        return augi.b;
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return ((augi) obj).f;
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        return ((augi) obj).e;
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        return akzj.f((augi) obj, (augi) obj2);
    }
}
