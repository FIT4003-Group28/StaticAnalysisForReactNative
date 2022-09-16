package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ajhf  reason: default package */
/* loaded from: classes.dex */
public final class ajhf implements thu {
    private final acvh b;

    public ajhf(acvh acvhVar) {
        this.b = acvhVar;
    }

    private static asny h() {
        asny b = asny.b(70);
        return b == null ? asny.LATENCY_ACTION_ELEMENTS_PERFORMANCE : b;
    }

    @Override // defpackage.thu
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.thu
    public final String b() {
        return this.b.d();
    }

    @Override // defpackage.thu
    public final void c(String str) {
        d(str);
    }

    @Override // defpackage.thu
    public final void d(String str) {
        this.b.i(str);
        asny h = h();
        aopa createBuilder = asno.a.createBuilder();
        createBuilder.copyOnWrite();
        asno asnoVar = (asno) createBuilder.instance;
        asnoVar.d = h.bL;
        asnoVar.b |= 1;
        createBuilder.copyOnWrite();
        asno asnoVar2 = (asno) createBuilder.instance;
        str.getClass();
        asnoVar2.b |= 2;
        asnoVar2.e = str;
        this.b.g((asno) createBuilder.mo39build());
    }

    @Override // defpackage.thu
    public final void e(String str, int i, thr thrVar) {
        acvh acvhVar = this.b;
        asny h = h();
        aopa createBuilder = asnr.a.createBuilder();
        String str2 = thrVar.a;
        createBuilder.copyOnWrite();
        asnr asnrVar = (asnr) createBuilder.instance;
        str2.getClass();
        asnrVar.b |= 1;
        asnrVar.c = str2;
        Long l = thrVar.b;
        Long l2 = thrVar.c;
        Long l3 = thrVar.d;
        if (l != null && l2 != null) {
            long longValue = l.longValue();
            createBuilder.copyOnWrite();
            asnr asnrVar2 = (asnr) createBuilder.instance;
            asnrVar2.b |= 8;
            asnrVar2.f = longValue;
            long longValue2 = l2.longValue();
            long longValue3 = l.longValue();
            createBuilder.copyOnWrite();
            asnr asnrVar3 = (asnr) createBuilder.instance;
            asnrVar3.b |= 4;
            asnrVar3.e = longValue2 - longValue3;
        } else if (l3 != null) {
            long longValue4 = l3.longValue();
            createBuilder.copyOnWrite();
            asnr asnrVar4 = (asnr) createBuilder.instance;
            asnrVar4.b |= 4;
            asnrVar4.e = longValue4;
        }
        Integer num = thrVar.e;
        if (num != null) {
            int intValue = num.intValue();
            createBuilder.copyOnWrite();
            asnr asnrVar5 = (asnr) createBuilder.instance;
            asnrVar5.b |= 64;
            asnrVar5.i = intValue;
        }
        thp thpVar = thrVar.f;
        if (thpVar != null) {
            aopa createBuilder2 = asnx.a.createBuilder();
            int i2 = thpVar.i;
            createBuilder2.copyOnWrite();
            asnx asnxVar = (asnx) createBuilder2.instance;
            asnxVar.b |= 32;
            asnxVar.h = i2;
            akvy akvyVar = thpVar.j;
            if (akvyVar != null) {
                boolean z = akvyVar.a;
                createBuilder2.copyOnWrite();
                asnx asnxVar2 = (asnx) createBuilder2.instance;
                asnxVar2.b |= 4;
                asnxVar2.e = z;
                long j = akvyVar.b;
                createBuilder2.copyOnWrite();
                asnx asnxVar3 = (asnx) createBuilder2.instance;
                asnxVar3.b |= 8;
                asnxVar3.f = j;
            }
            amvn<String> amvnVar = thpVar.a;
            if (amvnVar != null && !amvnVar.isEmpty()) {
                for (String str3 : amvnVar) {
                    aopa createBuilder3 = asnw.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    asnw asnwVar = (asnw) createBuilder3.instance;
                    str3.getClass();
                    asnwVar.b |= 1;
                    asnwVar.c = str3;
                    createBuilder2.copyOnWrite();
                    asnx asnxVar4 = (asnx) createBuilder2.instance;
                    asnw asnwVar2 = (asnw) createBuilder3.mo39build();
                    asnwVar2.getClass();
                    aopu aopuVar = asnxVar4.c;
                    if (!aopuVar.c()) {
                        asnxVar4.c = aopi.mutableCopy(aopuVar);
                    }
                    asnxVar4.c.add(asnwVar2);
                }
            }
            String str4 = thpVar.b;
            if (str4 != null) {
                createBuilder2.copyOnWrite();
                asnx asnxVar5 = (asnx) createBuilder2.instance;
                asnxVar5.b |= 16;
                asnxVar5.g = str4;
            }
            Integer num2 = thpVar.c;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                createBuilder2.copyOnWrite();
                asnx asnxVar6 = (asnx) createBuilder2.instance;
                asnxVar6.b |= 64;
                asnxVar6.i = intValue2;
            }
            Status status = thpVar.d;
            if (status != null) {
                aopa createBuilder4 = asnv.a.createBuilder();
                int value = status.getCode().value();
                createBuilder4.copyOnWrite();
                asnv asnvVar = (asnv) createBuilder4.instance;
                asnvVar.b |= 2;
                asnvVar.c = value;
                String str5 = thpVar.e;
                if (str5 != null) {
                    createBuilder4.copyOnWrite();
                    asnv asnvVar2 = (asnv) createBuilder4.instance;
                    asnvVar2.b |= 4;
                    asnvVar2.d = str5;
                }
                String str6 = thpVar.f;
                if (str6 != null) {
                    createBuilder4.copyOnWrite();
                    asnv asnvVar3 = (asnv) createBuilder4.instance;
                    asnvVar3.b |= 8;
                    asnvVar3.e = str6;
                }
                Boolean bool = thpVar.h;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    createBuilder4.copyOnWrite();
                    asnv asnvVar4 = (asnv) createBuilder4.instance;
                    asnvVar4.b |= 16;
                    asnvVar4.f = booleanValue;
                }
                Integer num3 = thpVar.g;
                if (num3 != null) {
                    int intValue3 = num3.intValue();
                    createBuilder4.copyOnWrite();
                    asnv asnvVar5 = (asnv) createBuilder4.instance;
                    asnvVar5.b |= 32;
                    asnvVar5.g = intValue3;
                }
                asnv asnvVar6 = (asnv) createBuilder4.mo39build();
                createBuilder2.copyOnWrite();
                asnx asnxVar7 = (asnx) createBuilder2.instance;
                asnvVar6.getClass();
                asnxVar7.j = asnvVar6;
                asnxVar7.b |= 256;
            }
            createBuilder.copyOnWrite();
            asnr asnrVar6 = (asnr) createBuilder.instance;
            asnx asnxVar8 = (asnx) createBuilder2.mo39build();
            asnxVar8.getClass();
            asnrVar6.g = asnxVar8;
            asnrVar6.b |= 16;
        }
        acvhVar.o(h, i, str, (asnr) createBuilder.mo39build());
    }

    @Override // defpackage.thu
    public final int f(String str, thr thrVar) {
        int a = a();
        e(str, a, thrVar);
        return a;
    }

    @Override // defpackage.thu
    public final void g(String str, thr thrVar) {
        e(str, a(), thrVar);
    }
}
