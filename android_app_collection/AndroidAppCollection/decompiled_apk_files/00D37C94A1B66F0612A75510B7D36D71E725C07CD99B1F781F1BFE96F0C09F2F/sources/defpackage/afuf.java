package defpackage;
/* compiled from: PG */
/* renamed from: afuf */
/* loaded from: classes.dex */
public final class afuf {
    public final amup a;
    private final yve b;
    private final avex c;

    public afuf(yme ymeVar, amup amupVar, yve yveVar) {
        this.b = yveVar;
        this.a = amupVar;
        avex avexVar = ymeVar.d().g;
        this.c = avexVar == null ? avex.a : avexVar;
    }

    public final long a(String str) {
        ankt a = this.b.a();
        if (a.isDone()) {
            str.getClass();
            aoqp aoqpVar = ((awus) ylx.h(a, awus.a)).h;
            if (!aoqpVar.containsKey(str)) {
                return -1L;
            }
            return ((Long) aoqpVar.get(str)).longValue();
        }
        return -2L;
    }

    public final synchronized aqlk b(String str, long j) {
        long a = a(str);
        if (a != -2) {
            str.getClass();
            aoqp aoqpVar = ((awus) this.b.c()).c;
            if (aoqpVar.containsKey(str) && ((Boolean) aoqpVar.get(str)).booleanValue()) {
                aopa createBuilder = aqlk.a.createBuilder();
                int c = aqmv.c(((Integer) this.a.get(str)).intValue());
                createBuilder.copyOnWrite();
                aqlk aqlkVar = (aqlk) createBuilder.instance;
                int i = c - 1;
                if (c == 0) {
                    throw null;
                }
                aqlkVar.c = i;
                aqlkVar.b |= 1;
                awus awusVar = (awus) this.b.c();
                str.getClass();
                aoqp aoqpVar2 = awusVar.d;
                int i2 = 0;
                int intValue = aoqpVar2.containsKey(str) ? ((Integer) aoqpVar2.get(str)).intValue() : 0;
                createBuilder.copyOnWrite();
                aqlk aqlkVar2 = (aqlk) createBuilder.instance;
                aqlkVar2.b |= 2;
                aqlkVar2.d = intValue;
                str.getClass();
                aoqp aoqpVar3 = awusVar.e;
                int intValue2 = aoqpVar3.containsKey(str) ? ((Integer) aoqpVar3.get(str)).intValue() : 0;
                createBuilder.copyOnWrite();
                aqlk aqlkVar3 = (aqlk) createBuilder.instance;
                aqlkVar3.b |= 4;
                aqlkVar3.e = intValue2;
                str.getClass();
                aoqp aoqpVar4 = awusVar.i;
                int intValue3 = aoqpVar4.containsKey(str) ? ((Integer) aoqpVar4.get(str)).intValue() : 0;
                createBuilder.copyOnWrite();
                aqlk aqlkVar4 = (aqlk) createBuilder.instance;
                aqlkVar4.b |= 64;
                aqlkVar4.h = intValue3;
                str.getClass();
                aoqp aoqpVar5 = awusVar.g;
                if (aoqpVar5.containsKey(str)) {
                    i2 = ((Integer) aoqpVar5.get(str)).intValue();
                }
                if (i2 != 0) {
                    str.getClass();
                    aoqp aoqpVar6 = awusVar.f;
                    long longValue = (aoqpVar6.containsKey(str) ? ((Long) aoqpVar6.get(str)).longValue() : 0L) / i2;
                    createBuilder.copyOnWrite();
                    aqlk aqlkVar5 = (aqlk) createBuilder.instance;
                    aqlkVar5.b |= 8;
                    aqlkVar5.f = (int) longValue;
                }
                if (a == -1) {
                    createBuilder.copyOnWrite();
                    aqlk aqlkVar6 = (aqlk) createBuilder.instance;
                    aqlkVar6.b |= 32;
                    aqlkVar6.g = -1;
                } else {
                    createBuilder.copyOnWrite();
                    aqlk aqlkVar7 = (aqlk) createBuilder.instance;
                    aqlkVar7.b |= 32;
                    aqlkVar7.g = (int) (j - a);
                }
                return (aqlk) createBuilder.mo39build();
            }
        }
        return null;
    }

    public final void c(String str) {
        ylx.m(this.b.b(new wdx(str, 17)), afsc.b);
    }

    public final synchronized void h(final String str, final int i, final long j) {
        if (!this.a.containsKey(str)) {
            return;
        }
        ylx.m(this.b.b(new ampg() { // from class: afue
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                String str2 = str;
                long j2 = j;
                int i2 = i;
                awus awusVar = (awus) obj;
                aopa mo52toBuilder = awusVar.mo52toBuilder();
                aoqp aoqpVar = awusVar.f;
                mo52toBuilder.br(str2, (aoqpVar.containsKey(str2) ? ((Long) aoqpVar.get(str2)).longValue() : 0L) + j2);
                aoqp aoqpVar2 = awusVar.g;
                int i3 = 0;
                mo52toBuilder.bl(str2, (aoqpVar2.containsKey(str2) ? ((Integer) aoqpVar2.get(str2)).intValue() : 0) + 1);
                aoqp aoqpVar3 = awusVar.i;
                if (aoqpVar3.containsKey(str2)) {
                    i3 = ((Integer) aoqpVar3.get(str2)).intValue();
                }
                mo52toBuilder.bm(str2, i3 + i2);
                mo52toBuilder.bn(str2, true);
                return (awus) mo52toBuilder.mo39build();
            }
        }), afsc.c);
    }

    public final void i(String str, long j) {
        if (!this.a.containsKey(str)) {
            return;
        }
        ylx.m(this.b.b(new wdy(str, j, 3)), afsc.d);
    }

    public final synchronized void j(final String str, final int i, final int i2) {
        if (!this.a.containsKey(str)) {
            return;
        }
        ylx.m(this.b.b(new ampg() { // from class: afud
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                String str2 = str;
                int i3 = i;
                int i4 = i2;
                awus awusVar = (awus) obj;
                aopa mo52toBuilder = awusVar.mo52toBuilder();
                mo52toBuilder.bq(str2, i3);
                str2.getClass();
                aoqp aoqpVar = awusVar.e;
                mo52toBuilder.bo(str2, (aoqpVar.containsKey(str2) ? ((Integer) aoqpVar.get(str2)).intValue() : 0) + i4);
                mo52toBuilder.bn(str2, true);
                return (awus) mo52toBuilder.mo39build();
            }
        }), afsc.e);
    }

    public final boolean k() {
        avex avexVar = this.c;
        return avexVar != null && avexVar.b;
    }
}
