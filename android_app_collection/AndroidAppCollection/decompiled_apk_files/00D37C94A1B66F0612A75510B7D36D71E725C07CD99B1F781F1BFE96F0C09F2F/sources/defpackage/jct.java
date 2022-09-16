package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Map;
/* compiled from: PG */
/* renamed from: jct  reason: default package */
/* loaded from: classes3.dex */
public final class jct extends jau {
    private final azqb a;

    public jct(azqb azqbVar) {
        this.a = azqbVar;
    }

    private static atyn h(agqv agqvVar, Map map) {
        asaj asajVar;
        PlayerResponseModel playerResponseModel = agqvVar.p;
        if (playerResponseModel == null) {
            asajVar = asaj.a;
        } else {
            asajVar = playerResponseModel.a;
        }
        String m = agqvVar.m();
        long j = agqvVar.f;
        amvn f = jfw.f(map, agqvVar.m());
        String s = emn.s(m);
        s.getClass();
        aqxo.z(!s.isEmpty(), "key cannot be empty");
        aopa createBuilder = atyq.a.createBuilder();
        createBuilder.copyOnWrite();
        atyq atyqVar = (atyq) createBuilder.instance;
        atyqVar.c |= 1;
        atyqVar.d = s;
        atyn atynVar = new atyn(createBuilder);
        aoob byteString = asajVar.toByteString();
        aopa aopaVar = atynVar.a;
        aopaVar.copyOnWrite();
        atyq atyqVar2 = (atyq) aopaVar.instance;
        atyqVar2.c |= 2;
        atyqVar2.e = byteString;
        Long valueOf = Long.valueOf(j);
        aopa aopaVar2 = atynVar.a;
        long longValue = valueOf.longValue();
        aopaVar2.copyOnWrite();
        atyq atyqVar3 = (atyq) aopaVar2.instance;
        atyqVar3.c |= 8;
        atyqVar3.g = longValue;
        String x = emn.x(m);
        aopa aopaVar3 = atynVar.a;
        aopaVar3.copyOnWrite();
        atyq atyqVar4 = (atyq) aopaVar3.instance;
        x.getClass();
        atyqVar4.c |= 32;
        atyqVar4.i = x;
        String l = emn.l(m);
        aopa aopaVar4 = atynVar.a;
        aopaVar4.copyOnWrite();
        atyq atyqVar5 = (atyq) aopaVar4.instance;
        l.getClass();
        atyqVar5.c |= 64;
        atyqVar5.k = l;
        amzs it = f.iterator();
        while (it.hasNext()) {
            String[] strArr = {emn.b((String) it.next())};
            for (int i = 0; i <= 0; i++) {
                String str = strArr[i];
                aopa aopaVar5 = atynVar.a;
                aopaVar5.copyOnWrite();
                atyq atyqVar6 = (atyq) aopaVar5.instance;
                str.getClass();
                aopu aopuVar = atyqVar6.j;
                if (!aopuVar.c()) {
                    atyqVar6.j = aopi.mutableCopy(aopuVar);
                }
                atyqVar6.j.add(str);
            }
        }
        return atynVar;
    }

    private final Map i() {
        return ((agrf) this.a.get()).a().g().f();
    }

    @Override // defpackage.jau
    protected final amvn a(agwh agwhVar) {
        amvl i = amvn.i();
        Map i2 = i();
        for (agqv agqvVar : agwhVar.j()) {
            i.c(h(agqvVar, i2));
        }
        return i.g();
    }

    @Override // defpackage.jau
    protected final void b(aajs aajsVar, agqv agqvVar) {
        aajsVar.j(h(agqvVar, i()));
    }

    @Override // defpackage.jau
    protected final void e(aajs aajsVar, String str) {
        aajsVar.g(emn.s(str));
    }
}
