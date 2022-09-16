package defpackage;
/* compiled from: PG */
/* renamed from: fco  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fco implements ampg {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ fco(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public /* synthetic */ fco(String str, boolean z, int i) {
        this.c = i;
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            String str = this.a;
            boolean z = this.b;
            fda fdaVar = (fda) obj;
            fcv fcvVar = fcv.a;
            aoqp aoqpVar = fdaVar.j;
            if (aoqpVar.containsKey(str)) {
                fcvVar = (fcv) aoqpVar.get(str);
            }
            aopa mo52toBuilder = fcvVar.mo52toBuilder();
            aopa mo52toBuilder2 = fdaVar.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            fcv fcvVar2 = (fcv) mo52toBuilder.instance;
            fcvVar2.b |= 4;
            fcvVar2.e = z;
            mo52toBuilder2.i(str, (fcv) mo52toBuilder.mo39build());
            return (fda) mo52toBuilder2.mo39build();
        } else if (i != 1) {
            if (i != 2) {
                String str2 = this.a;
                boolean z2 = this.b;
                aopa mo52toBuilder3 = ((awvh) obj).mo52toBuilder();
                mo52toBuilder3.bw(str2, z2);
                return (awvh) mo52toBuilder3.mo39build();
            }
            String str3 = this.a;
            boolean z3 = this.b;
            aopa mo52toBuilder4 = ((awuj) obj).mo52toBuilder();
            mo52toBuilder4.bk(str3, z3);
            return (awuj) mo52toBuilder4.mo39build();
        } else {
            String str4 = this.a;
            boolean z4 = this.b;
            fda fdaVar2 = (fda) obj;
            fcv fcvVar3 = fcv.a;
            aoqp aoqpVar2 = fdaVar2.j;
            if (aoqpVar2.containsKey(str4)) {
                fcvVar3 = (fcv) aoqpVar2.get(str4);
            }
            aopa mo52toBuilder5 = fcvVar3.mo52toBuilder();
            aopa mo52toBuilder6 = fdaVar2.mo52toBuilder();
            mo52toBuilder5.copyOnWrite();
            fcv fcvVar4 = (fcv) mo52toBuilder5.instance;
            fcvVar4.b |= 8;
            fcvVar4.f = z4;
            mo52toBuilder6.i(str4, (fcv) mo52toBuilder5.mo39build());
            return (fda) mo52toBuilder6.mo39build();
        }
    }
}
