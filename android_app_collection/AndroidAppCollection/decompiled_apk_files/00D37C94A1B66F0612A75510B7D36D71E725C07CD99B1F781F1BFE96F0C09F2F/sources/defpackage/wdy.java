package defpackage;
/* compiled from: PG */
/* renamed from: wdy  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class wdy implements ampg {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    private final /* synthetic */ int c;

    public /* synthetic */ wdy(long j, String str, int i) {
        this.c = i;
        this.b = j;
        this.a = str;
    }

    public /* synthetic */ wdy(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public /* synthetic */ wdy(String str, long j, int i) {
        this.c = i;
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            String str = this.a;
            long j = this.b;
            aopa mo52toBuilder = ((awtd) obj).mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            awtd awtdVar = (awtd) mo52toBuilder.instance;
            aoqp aoqpVar = awtdVar.g;
            if (!aoqpVar.b) {
                awtdVar.g = aoqpVar.a();
            }
            awtdVar.g.put(str, Long.valueOf(j));
            return (awtd) mo52toBuilder.mo39build();
        } else if (i == 1) {
            String str2 = this.a;
            long j2 = this.b;
            fda fdaVar = (fda) obj;
            fcv fcvVar = fcv.a;
            aoqp aoqpVar2 = fdaVar.j;
            if (aoqpVar2.containsKey(str2)) {
                fcvVar = (fcv) aoqpVar2.get(str2);
            }
            aopa mo52toBuilder2 = fcvVar.mo52toBuilder();
            aopa mo52toBuilder3 = fdaVar.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            fcv fcvVar2 = (fcv) mo52toBuilder2.instance;
            fcvVar2.b = 2 | fcvVar2.b;
            fcvVar2.d = j2;
            mo52toBuilder2.copyOnWrite();
            fcv fcvVar3 = (fcv) mo52toBuilder2.instance;
            fcvVar3.b |= 1;
            fcvVar3.c = true;
            mo52toBuilder3.i(str2, (fcv) mo52toBuilder2.mo39build());
            return (fda) mo52toBuilder3.mo39build();
        } else if (i == 2) {
            long j3 = this.b;
            String str3 = this.a;
            aopa mo52toBuilder4 = ((awtw) obj).mo52toBuilder();
            mo52toBuilder4.copyOnWrite();
            awtw awtwVar = (awtw) mo52toBuilder4.instance;
            awtwVar.b = 2 | awtwVar.b;
            awtwVar.d = j3;
            mo52toBuilder4.copyOnWrite();
            awtw awtwVar2 = (awtw) mo52toBuilder4.instance;
            str3.getClass();
            awtwVar2.b |= 1;
            awtwVar2.c = str3;
            mo52toBuilder4.copyOnWrite();
            awtw awtwVar3 = (awtw) mo52toBuilder4.instance;
            awtwVar3.b |= 4;
            awtwVar3.e = true;
            return (awtw) mo52toBuilder4.mo39build();
        } else if (i == 3) {
            String str4 = this.a;
            long j4 = this.b;
            aopa mo52toBuilder5 = ((awus) obj).mo52toBuilder();
            mo52toBuilder5.bp(str4, j4);
            return (awus) mo52toBuilder5.mo39build();
        } else if (i == 4) {
            String str5 = this.a;
            long j5 = this.b;
            aopa mo52toBuilder6 = ((awvb) obj).mo52toBuilder();
            aopa createBuilder = awuz.a.createBuilder();
            createBuilder.copyOnWrite();
            awuz awuzVar = (awuz) createBuilder.instance;
            awuzVar.b = 1 | awuzVar.b;
            awuzVar.c = j5;
            mo52toBuilder6.bv(str5, (awuz) createBuilder.mo39build());
            return (awvb) mo52toBuilder6.mo39build();
        } else {
            String str6 = this.a;
            long j6 = this.b;
            aopa mo52toBuilder7 = ((awvh) obj).mo52toBuilder();
            mo52toBuilder7.bx(str6, j6);
            return (awvh) mo52toBuilder7.mo39build();
        }
    }
}
