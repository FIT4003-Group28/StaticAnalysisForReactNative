package defpackage;
/* compiled from: PG */
/* renamed from: jda  reason: default package */
/* loaded from: classes3.dex */
public final class jda extends jat {
    private static final awjk g(agqh agqhVar) {
        String str = agqhVar.a.a;
        long j = agqhVar.e;
        long j2 = agqhVar.f;
        String g = emn.g(str);
        g.getClass();
        aqxo.z(!g.isEmpty(), "key cannot be empty");
        aopa createBuilder = awjn.a.createBuilder();
        createBuilder.copyOnWrite();
        awjn awjnVar = (awjn) createBuilder.instance;
        awjnVar.c |= 1;
        awjnVar.d = g;
        awjk awjkVar = new awjk(createBuilder);
        Long valueOf = Long.valueOf(j);
        aopa aopaVar = awjkVar.a;
        long longValue = valueOf.longValue();
        aopaVar.copyOnWrite();
        awjn awjnVar2 = (awjn) aopaVar.instance;
        awjnVar2.c |= 8;
        awjnVar2.g = longValue;
        String t = emn.t(str);
        aopa aopaVar2 = awjkVar.a;
        aopaVar2.copyOnWrite();
        awjn awjnVar3 = (awjn) aopaVar2.instance;
        t.getClass();
        awjnVar3.c |= 4;
        awjnVar3.e = t;
        Long valueOf2 = Long.valueOf(j2);
        aopa aopaVar3 = awjkVar.a;
        long longValue2 = valueOf2.longValue();
        aopaVar3.copyOnWrite();
        awjn awjnVar4 = (awjn) aopaVar3.instance;
        awjnVar4.c |= 16;
        awjnVar4.h = longValue2;
        return awjkVar;
    }

    @Override // defpackage.jat
    protected final amvn a(agvv agvvVar) {
        amvl i = amvn.i();
        for (agqh agqhVar : agvvVar.j()) {
            i.c(g(agqhVar));
        }
        return i.g();
    }

    @Override // defpackage.jat
    protected final void c(aajs aajsVar, agqh agqhVar) {
        aajsVar.j(g(agqhVar));
    }

    @Override // defpackage.jat
    protected final void d(aajs aajsVar, String str) {
        aajsVar.g(emn.g(str));
    }
}
