package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abtd  reason: default package */
/* loaded from: classes.dex */
public final class abtd implements abwy {
    final /* synthetic */ abte a;

    public abtd(abte abteVar) {
        this.a = abteVar;
    }

    @Override // defpackage.abwy
    public final void a(Object obj) {
        abte abteVar = this.a;
        if (abteVar.c && (obj instanceof astr)) {
            astr astrVar = (astr) obj;
            abteVar.a();
            abte abteVar2 = this.a;
            astrVar.copyOnWrite();
            astt asttVar = astt.a;
            ((astt) astrVar.instance).d = astt.emptyProtobufList();
            for (abtf abtfVar : abteVar2.b) {
                aopa createBuilder = asts.a.createBuilder();
                String str = abtfVar.a;
                createBuilder.copyOnWrite();
                asts astsVar = (asts) createBuilder.instance;
                str.getClass();
                astsVar.b |= 1;
                astsVar.c = str;
                float f = abtfVar.c;
                createBuilder.copyOnWrite();
                asts astsVar2 = (asts) createBuilder.instance;
                astsVar2.b |= 4;
                astsVar2.e = f;
                float f2 = abtfVar.d;
                createBuilder.copyOnWrite();
                asts astsVar3 = (asts) createBuilder.instance;
                astsVar3.b |= 8;
                astsVar3.f = f2;
                long j = abtfVar.b;
                createBuilder.copyOnWrite();
                asts astsVar4 = (asts) createBuilder.instance;
                astsVar4.b |= 2;
                astsVar4.d = j;
                asts astsVar5 = (asts) createBuilder.mo39build();
                astrVar.copyOnWrite();
                astt asttVar2 = (astt) astrVar.instance;
                astsVar5.getClass();
                aopu aopuVar = asttVar2.d;
                if (!aopuVar.c()) {
                    asttVar2.d = aopi.mutableCopy(aopuVar);
                }
                asttVar2.d.add(astsVar5);
            }
            this.a.b.clear();
            this.a.e();
        }
    }
}
