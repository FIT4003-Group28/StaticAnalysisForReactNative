package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jcr  reason: default package */
/* loaded from: classes3.dex */
public final class jcr extends jau {
    private static atsq h(agqu agquVar) {
        atsp atspVar;
        if (agquVar == null) {
            return null;
        }
        String q = emn.q(agquVar.a);
        q.getClass();
        aqxo.z(!q.isEmpty(), "key cannot be empty");
        aopa createBuilder = atst.a.createBuilder();
        createBuilder.copyOnWrite();
        atst atstVar = (atst) createBuilder.instance;
        atstVar.c |= 1;
        atstVar.d = q;
        atsq atsqVar = new atsq(createBuilder);
        aoob byteString = agquVar.b.toByteString();
        aopa aopaVar = atsqVar.a;
        aopaVar.copyOnWrite();
        atst atstVar2 = (atst) aopaVar.instance;
        atstVar2.c |= 8;
        atstVar2.g = byteString;
        int ak = akel.ak(agquVar.b.h);
        if (ak == 0) {
            ak = 1;
        }
        int i = ak - 1;
        if (i == 1) {
            atspVar = atsp.OFFLINE_VIDEO_POLICY_ACTION_OK;
        } else if (i == 3) {
            atspVar = atsp.OFFLINE_VIDEO_POLICY_ACTION_DISABLE;
        } else {
            atspVar = atsp.OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN;
        }
        aopa aopaVar2 = atsqVar.a;
        aopaVar2.copyOnWrite();
        atst atstVar3 = (atst) aopaVar2.instance;
        atstVar3.e = atspVar.e;
        atstVar3.c |= 2;
        Long valueOf = Long.valueOf(agquVar.b());
        aopa aopaVar3 = atsqVar.a;
        long longValue = valueOf.longValue();
        aopaVar3.copyOnWrite();
        atst atstVar4 = (atst) aopaVar3.instance;
        atstVar4.c |= 4;
        atstVar4.f = longValue;
        atqu atquVar = agquVar.b.l;
        if (atquVar == null) {
            atquVar = atqu.a;
        }
        aopa aopaVar4 = atsqVar.a;
        aopaVar4.copyOnWrite();
        atst atstVar5 = (atst) aopaVar4.instance;
        atquVar.getClass();
        atstVar5.h = atquVar;
        atstVar5.c |= 16;
        Long valueOf2 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(agquVar.d));
        aopa aopaVar5 = atsqVar.a;
        long longValue2 = valueOf2.longValue();
        aopaVar5.copyOnWrite();
        atst atstVar6 = (atst) aopaVar5.instance;
        atstVar6.c |= 32;
        atstVar6.i = longValue2;
        atse atseVar = agquVar.b;
        if (atseVar.c == 15) {
            atqt atqtVar = (atqt) atseVar.d;
            aopa aopaVar6 = atsqVar.a;
            aopaVar6.copyOnWrite();
            atst atstVar7 = (atst) aopaVar6.instance;
            atqtVar.getClass();
            atstVar7.j = atqtVar;
            atstVar7.c |= 64;
        }
        return atsqVar;
    }

    private static void i(aajs aajsVar, agqv agqvVar) {
        atsq h = h(agqvVar.j);
        if (h != null) {
            aajsVar.j(h);
        }
    }

    @Override // defpackage.jau
    protected final amvn a(agwh agwhVar) {
        atsq h;
        amvl i = amvn.i();
        for (agqv agqvVar : agwhVar.j()) {
            if (agqvVar != null && (h = h(agqvVar.j)) != null) {
                i.c(h);
            }
        }
        return i.g();
    }

    @Override // defpackage.jau
    protected final void b(aajs aajsVar, agqv agqvVar) {
        i(aajsVar, agqvVar);
    }

    @Override // defpackage.jau
    protected final void e(aajs aajsVar, String str) {
        aajsVar.g(emn.q(str));
    }

    @Override // defpackage.jau
    protected final void g(aajs aajsVar, agqv agqvVar) {
        i(aajsVar, agqvVar);
    }
}
