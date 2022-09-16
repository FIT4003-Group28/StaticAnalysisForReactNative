package defpackage;
/* compiled from: PG */
/* renamed from: abfj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abfj implements ampg {
    public final /* synthetic */ abfl a;
    private final /* synthetic */ int b;

    public /* synthetic */ abfj(abfl abflVar) {
        this.a = abflVar;
    }

    public /* synthetic */ abfj(abfl abflVar, int i) {
        this.b = i;
        this.a = abflVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            abfl abflVar = this.a;
            awtm awtmVar = (awtm) obj;
            aopa mo52toBuilder = awtmVar.mo52toBuilder();
            ampg ampgVar = abflVar.a;
            if (ampgVar != null) {
                atzv atzvVar = awtmVar.c;
                if (atzvVar == null) {
                    atzvVar = atzv.a;
                }
                Object apply = ampgVar.apply(atzvVar);
                mo52toBuilder.copyOnWrite();
                awtm awtmVar2 = (awtm) mo52toBuilder.instance;
                awtmVar2.c = (atzv) apply;
                awtmVar2.b |= 1;
            }
            ampg ampgVar2 = abflVar.b;
            if (ampgVar2 != null) {
                apij apijVar = awtmVar.d;
                if (apijVar == null) {
                    apijVar = apij.a;
                }
                apij apijVar2 = (apij) ampgVar2.apply(apijVar);
                mo52toBuilder.copyOnWrite();
                awtm awtmVar3 = (awtm) mo52toBuilder.instance;
                apijVar2.getClass();
                awtmVar3.d = apijVar2;
                awtmVar3.b |= 2;
            }
            return (awtm) mo52toBuilder.mo39build();
        }
        abfl abflVar2 = this.a;
        aopa mo52toBuilder2 = ((awtk) obj).mo52toBuilder();
        boolean booleanValue = abflVar2.c.booleanValue();
        mo52toBuilder2.copyOnWrite();
        awtk awtkVar = (awtk) mo52toBuilder2.instance;
        awtkVar.b |= 1;
        awtkVar.c = booleanValue;
        return (awtk) mo52toBuilder2.mo39build();
    }
}
