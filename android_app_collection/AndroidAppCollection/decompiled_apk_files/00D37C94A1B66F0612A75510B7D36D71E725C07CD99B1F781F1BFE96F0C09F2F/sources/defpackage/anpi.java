package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: anpi  reason: default package */
/* loaded from: classes.dex */
final class anpi extends anmp {
    public anpi(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anps) aopi.parseFrom(anps.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anps anpsVar = (anps) aoquVar;
        aopa createBuilder = anpr.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anpr) createBuilder.instance).b = 0;
        aoob x = aoob.x(anum.a(anpsVar.b));
        createBuilder.copyOnWrite();
        ((anpr) createBuilder.instance).c = x;
        anpt anptVar = anpsVar.c;
        if (anptVar == null) {
            anptVar = anpt.a;
        }
        createBuilder.copyOnWrite();
        anptVar.getClass();
        ((anpr) createBuilder.instance).d = anptVar;
        return (anpr) createBuilder.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        aopa createBuilder = anps.a.createBuilder();
        createBuilder.copyOnWrite();
        anps.a((anps) createBuilder.instance);
        aopa createBuilder2 = anpt.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anpt) createBuilder2.instance).b = 16;
        anpt anptVar = (anpt) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        anptVar.getClass();
        ((anps) createBuilder.instance).c = anptVar;
        hashMap.put("AES_CMAC", new anmo((anps) createBuilder.mo39build(), 1));
        aopa createBuilder3 = anps.a.createBuilder();
        createBuilder3.copyOnWrite();
        anps.a((anps) createBuilder3.instance);
        aopa createBuilder4 = anpt.a.createBuilder();
        createBuilder4.copyOnWrite();
        ((anpt) createBuilder4.instance).b = 16;
        anpt anptVar2 = (anpt) createBuilder4.mo39build();
        createBuilder3.copyOnWrite();
        anptVar2.getClass();
        ((anps) createBuilder3.instance).c = anptVar2;
        hashMap.put("AES256_CMAC", new anmo((anps) createBuilder3.mo39build(), 1));
        aopa createBuilder5 = anps.a.createBuilder();
        createBuilder5.copyOnWrite();
        anps.a((anps) createBuilder5.instance);
        aopa createBuilder6 = anpt.a.createBuilder();
        createBuilder6.copyOnWrite();
        ((anpt) createBuilder6.instance).b = 16;
        anpt anptVar3 = (anpt) createBuilder6.mo39build();
        createBuilder5.copyOnWrite();
        anptVar3.getClass();
        ((anps) createBuilder5.instance).c = anptVar3;
        hashMap.put("AES256_CMAC_RAW", new anmo((anps) createBuilder5.mo39build(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anps anpsVar = (anps) aoquVar;
        anpt anptVar = anpsVar.c;
        if (anptVar == null) {
            anptVar = anpt.a;
        }
        anpj.i(anptVar);
        anpj.j(anpsVar.b);
    }
}
