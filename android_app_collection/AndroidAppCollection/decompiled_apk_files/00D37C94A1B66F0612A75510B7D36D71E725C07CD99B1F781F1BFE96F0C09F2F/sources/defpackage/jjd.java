package defpackage;
/* compiled from: PG */
/* renamed from: jjd  reason: default package */
/* loaded from: classes3.dex */
public final class jjd {
    public static jjc a() {
        return new jjc(jjg.class);
    }

    public static final jio b(yve yveVar, ayqe ayqeVar) {
        yveVar.getClass();
        ayqeVar.getClass();
        return new jio(yveVar, ayqeVar);
    }

    public static aozl c(String str) {
        String b = emn.b(str);
        b.getClass();
        aqxo.z(!b.isEmpty(), "key cannot be empty");
        aopa createBuilder = aozn.a.createBuilder();
        createBuilder.copyOnWrite();
        aozn aoznVar = (aozn) createBuilder.instance;
        aoznVar.c |= 1;
        aoznVar.d = b;
        aozl aozlVar = new aozl(createBuilder);
        String x = emn.x(str);
        aopa aopaVar = aozlVar.a;
        aopaVar.copyOnWrite();
        aozn aoznVar2 = (aozn) aopaVar.instance;
        x.getClass();
        aoznVar2.c |= 2;
        aoznVar2.e = x;
        return aozlVar;
    }

    public static aqog d(String str, avyq avyqVar, float f, float f2) {
        aopa createBuilder = aqof.a.createBuilder();
        createBuilder.copyOnWrite();
        aqof aqofVar = (aqof) createBuilder.instance;
        aqofVar.b = 2;
        aqofVar.c = str;
        aqog f3 = aqoh.f(emn.e((aqof) createBuilder.mo39build()));
        f3.d(avyqVar);
        if (f2 > 0.0f) {
            f3.m(Float.valueOf(f));
            f3.c(Float.valueOf(f2));
        }
        return f3;
    }

    public static auej e(avhn avhnVar) {
        aopa createBuilder = auei.a.createBuilder();
        if (avhnVar != null) {
            createBuilder.copyOnWrite();
            auei aueiVar = (auei) createBuilder.instance;
            aueiVar.c = avhnVar;
            aueiVar.b |= 1;
        }
        aopa createBuilder2 = auej.a.createBuilder();
        auei aueiVar2 = (auei) createBuilder.mo39build();
        createBuilder2.copyOnWrite();
        auej auejVar = (auej) createBuilder2.instance;
        aueiVar2.getClass();
        auejVar.c = aueiVar2;
        auejVar.b = 2;
        return (auej) createBuilder2.mo39build();
    }

    public static avkn f(String str, avkl avklVar, amuk amukVar, ampq ampqVar) {
        String x = emn.x(str);
        x.getClass();
        aqxo.z(!x.isEmpty(), "key cannot be empty");
        aopa createBuilder = avkq.a.createBuilder();
        createBuilder.copyOnWrite();
        avkq avkqVar = (avkq) createBuilder.instance;
        avkqVar.c |= 1;
        avkqVar.d = x;
        avkn avknVar = new avkn(createBuilder);
        avknVar.b(avklVar);
        if (amukVar != null && !amukVar.isEmpty()) {
            amzt listIterator = amukVar.listIterator();
            while (listIterator.hasNext()) {
                auzy auzyVar = (auzy) listIterator.next();
                aopa aopaVar = avknVar.a;
                aopaVar.copyOnWrite();
                avkq avkqVar2 = (avkq) aopaVar.instance;
                auzyVar.getClass();
                aopu aopuVar = avkqVar2.f;
                if (!aopuVar.c()) {
                    avkqVar2.f = aopi.mutableCopy(aopuVar);
                }
                avkqVar2.f.add(auzyVar);
            }
        }
        if (ampqVar.h()) {
            aopa aopaVar2 = avknVar.a;
            aopaVar2.copyOnWrite();
            avkq avkqVar3 = (avkq) aopaVar2.instance;
            avkqVar3.g = ((avkm) ampqVar.c()).k;
            avkqVar3.c |= 4;
        }
        return avknVar;
    }

    public static avzz g(String str, long j) {
        String A = emn.A(str);
        A.getClass();
        aqxo.z(!A.isEmpty(), "key cannot be empty");
        aopa createBuilder = awac.a.createBuilder();
        createBuilder.copyOnWrite();
        awac awacVar = (awac) createBuilder.instance;
        awacVar.c |= 1;
        awacVar.d = A;
        avzz avzzVar = new avzz(createBuilder);
        aopa aopaVar = avzzVar.a;
        aopaVar.copyOnWrite();
        awac awacVar2 = (awac) aopaVar.instance;
        str.getClass();
        awacVar2.c |= 2;
        awacVar2.e = str;
        Long valueOf = Long.valueOf(j);
        aopa aopaVar2 = avzzVar.a;
        long longValue = valueOf.longValue();
        aopaVar2.copyOnWrite();
        awac awacVar3 = (awac) aopaVar2.instance;
        awacVar3.c |= 4;
        awacVar3.f = longValue;
        return avzzVar;
    }

    public static awjg h(agqa agqaVar) {
        awjg f = awjh.f(emn.c(agqaVar.a));
        String str = agqaVar.a;
        aopa aopaVar = f.a;
        aopaVar.copyOnWrite();
        awjj awjjVar = (awjj) aopaVar.instance;
        awjj awjjVar2 = awjj.a;
        awjjVar.c |= 4;
        awjjVar.e = str;
        String str2 = agqaVar.b;
        aopa aopaVar2 = f.a;
        aopaVar2.copyOnWrite();
        awjj awjjVar3 = (awjj) aopaVar2.instance;
        str2.getClass();
        awjjVar3.c |= 8;
        awjjVar3.f = str2;
        avhn e = agqaVar.c.e();
        aopa aopaVar3 = f.a;
        aopaVar3.copyOnWrite();
        awjj awjjVar4 = (awjj) aopaVar3.instance;
        e.getClass();
        awjjVar4.g = e;
        awjjVar4.c |= 16;
        return f;
    }

    public static awjp i(String str, long j) {
        String h = emn.h(str);
        h.getClass();
        aqxo.z(!h.isEmpty(), "key cannot be empty");
        aopa createBuilder = awjs.a.createBuilder();
        createBuilder.copyOnWrite();
        awjs awjsVar = (awjs) createBuilder.instance;
        awjsVar.c |= 1;
        awjsVar.d = h;
        awjp awjpVar = new awjp(createBuilder);
        Long valueOf = Long.valueOf(j);
        aopa aopaVar = awjpVar.a;
        long longValue = valueOf.longValue();
        aopaVar.copyOnWrite();
        awjs awjsVar2 = (awjs) aopaVar.instance;
        awjsVar2.c |= 32;
        awjsVar2.h = longValue;
        String y = emn.y(str);
        aopa aopaVar2 = awjpVar.a;
        aopaVar2.copyOnWrite();
        awjs awjsVar3 = (awjs) aopaVar2.instance;
        y.getClass();
        awjsVar3.c |= 4;
        awjsVar3.e = y;
        String q = emn.q(str);
        aopa aopaVar3 = awjpVar.a;
        aopaVar3.copyOnWrite();
        awjs awjsVar4 = (awjs) aopaVar3.instance;
        q.getClass();
        awjsVar4.c |= 16;
        awjsVar4.g = q;
        String s = emn.s(str);
        aopa aopaVar4 = awjpVar.a;
        aopaVar4.copyOnWrite();
        awjs awjsVar5 = (awjs) aopaVar4.instance;
        s.getClass();
        awjsVar5.c |= 8;
        awjsVar5.f = s;
        return awjpVar;
    }

    public static awkn j(String str, String str2) {
        String u = emn.u(str, str2);
        u.getClass();
        aqxo.z(!u.isEmpty(), "key cannot be empty");
        aopa createBuilder = awkq.a.createBuilder();
        createBuilder.copyOnWrite();
        awkq awkqVar = (awkq) createBuilder.instance;
        awkqVar.c |= 1;
        awkqVar.d = u;
        awkn awknVar = new awkn(createBuilder);
        String y = emn.y(str2);
        aopa aopaVar = awknVar.a;
        aopaVar.copyOnWrite();
        awkq awkqVar2 = (awkq) aopaVar.instance;
        y.getClass();
        awkqVar2.c |= 4;
        awkqVar2.e = y;
        return awknVar;
    }

    public static awkv k(agqo agqoVar, boolean z) {
        String f = agqoVar.f();
        avhn d = agqoVar.d();
        aopa createBuilder = awku.a.createBuilder();
        String i = agqoVar.i();
        createBuilder.copyOnWrite();
        awku awkuVar = (awku) createBuilder.instance;
        i.getClass();
        awkuVar.b |= 1;
        awkuVar.c = i;
        awkv f2 = awkw.f(emn.y(f));
        String A = emn.A(f);
        aopa aopaVar = f2.a;
        aopaVar.copyOnWrite();
        awky awkyVar = (awky) aopaVar.instance;
        awky awkyVar2 = awky.a;
        A.getClass();
        awkyVar.c |= 8192;
        awkyVar.p = A;
        aopa aopaVar2 = f2.a;
        aopaVar2.copyOnWrite();
        awky awkyVar3 = (awky) aopaVar2.instance;
        f.getClass();
        awkyVar3.c |= 4;
        awkyVar3.e = f;
        String j = agqoVar.j();
        aopa aopaVar3 = f2.a;
        aopaVar3.copyOnWrite();
        awky awkyVar4 = (awky) aopaVar3.instance;
        j.getClass();
        awkyVar4.c |= 16;
        awkyVar4.g = j;
        Long valueOf = Long.valueOf(agqoVar.b());
        aopa aopaVar4 = f2.a;
        long longValue = valueOf.longValue();
        aopaVar4.copyOnWrite();
        awky awkyVar5 = (awky) aopaVar4.instance;
        awkyVar5.c |= 1024;
        awkyVar5.m = longValue;
        Long valueOf2 = Long.valueOf(agqoVar.d.getTime());
        aopa aopaVar5 = f2.a;
        long longValue2 = valueOf2.longValue();
        aopaVar5.copyOnWrite();
        awky awkyVar6 = (awky) aopaVar5.instance;
        awkyVar6.c |= 32;
        awkyVar6.h = longValue2;
        Integer valueOf3 = Integer.valueOf((int) agqoVar.a());
        aopa aopaVar6 = f2.a;
        int intValue = valueOf3.intValue();
        aopaVar6.copyOnWrite();
        awky awkyVar7 = (awky) aopaVar6.instance;
        awkyVar7.c |= 64;
        awkyVar7.i = intValue;
        if (d == null) {
            d = avhn.a;
        }
        aopa aopaVar7 = f2.a;
        aopaVar7.copyOnWrite();
        awky awkyVar8 = (awky) aopaVar7.instance;
        d.getClass();
        awkyVar8.j = d;
        awkyVar8.c |= 128;
        agqa agqaVar = agqoVar.a;
        if (agqaVar != null) {
            String c = emn.c(agqaVar.a);
            aopa aopaVar8 = f2.a;
            aopaVar8.copyOnWrite();
            awky awkyVar9 = (awky) aopaVar8.instance;
            c.getClass();
            awkyVar9.c |= 8;
            awkyVar9.f = c;
        }
        if (z) {
            String e = agqoVar.e();
            createBuilder.copyOnWrite();
            awku awkuVar2 = (awku) createBuilder.instance;
            e.getClass();
            awkuVar2.b |= 4;
            awkuVar2.e = e;
            String h = agqoVar.h();
            createBuilder.copyOnWrite();
            awku awkuVar3 = (awku) createBuilder.instance;
            h.getClass();
            awkuVar3.b |= 2;
            awkuVar3.d = h;
        }
        aopa aopaVar9 = f2.a;
        aopaVar9.copyOnWrite();
        awky awkyVar10 = (awky) aopaVar9.instance;
        awku awkuVar4 = (awku) createBuilder.mo39build();
        awkuVar4.getClass();
        awkyVar10.q = awkuVar4;
        awkyVar10.c |= 16384;
        return f2;
    }

    public static void l(aajs aajsVar, String str) {
        aajsVar.b().q(new jhq(str, 1)).C().Q();
    }

    public static void m(aajs aajsVar, String str) {
        ((aahy) aajsVar).c(true).q(new jhq(str)).C().Q();
    }
}
