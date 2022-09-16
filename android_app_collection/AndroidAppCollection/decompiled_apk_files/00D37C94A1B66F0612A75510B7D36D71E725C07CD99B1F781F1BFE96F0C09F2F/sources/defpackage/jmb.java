package defpackage;

import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: jmb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jmb implements Consumer {
    public final /* synthetic */ aopc a;
    private final /* synthetic */ int b;

    public /* synthetic */ jmb(aopc aopcVar, int i) {
        this.b = i;
        this.a = aopcVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? consumer.getClass() : consumer.getClass();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            aopc aopcVar = this.a;
            aube aubeVar = (aube) obj;
            aopa createBuilder = asgf.a.createBuilder();
            createBuilder.copyOnWrite();
            asgf asgfVar = (asgf) createBuilder.instance;
            aubeVar.getClass();
            asgfVar.c = aubeVar;
            asgfVar.b = 78882851;
            aopcVar.copyOnWrite();
            asgt asgtVar = (asgt) aopcVar.instance;
            asgf asgfVar2 = (asgf) createBuilder.mo39build();
            asgt asgtVar2 = asgt.a;
            asgfVar2.getClass();
            asgtVar.f = asgfVar2;
            asgtVar.b |= 32;
            return;
        }
        aopc aopcVar2 = this.a;
        arag aragVar = (arag) obj;
        aopa createBuilder2 = audf.a.createBuilder();
        aopa createBuilder3 = atfa.a.createBuilder();
        aopa createBuilder4 = atfb.a.createBuilder();
        createBuilder4.copyOnWrite();
        atfb atfbVar = (atfb) createBuilder4.instance;
        atfbVar.c = 2;
        atfbVar.b |= 1;
        createBuilder3.copyOnWrite();
        atfa atfaVar = (atfa) createBuilder3.instance;
        atfb atfbVar2 = (atfb) createBuilder4.mo39build();
        atfbVar2.getClass();
        atfaVar.g = atfbVar2;
        atfaVar.b |= 16;
        aopa createBuilder5 = atfd.a.createBuilder();
        aopa createBuilder6 = atfc.a.createBuilder();
        createBuilder6.copyOnWrite();
        atfc atfcVar = (atfc) createBuilder6.instance;
        aragVar.getClass();
        atfcVar.c = aragVar;
        atfcVar.b |= 1;
        createBuilder5.copyOnWrite();
        atfd atfdVar = (atfd) createBuilder5.instance;
        atfc atfcVar2 = (atfc) createBuilder6.mo39build();
        atfcVar2.getClass();
        atfdVar.c = atfcVar2;
        atfdVar.b |= 1;
        createBuilder3.copyOnWrite();
        atfa atfaVar2 = (atfa) createBuilder3.instance;
        atfd atfdVar2 = (atfd) createBuilder5.mo39build();
        atfdVar2.getClass();
        atfaVar2.f = atfdVar2;
        atfaVar2.b |= 2;
        atfa atfaVar3 = (atfa) createBuilder3.mo39build();
        createBuilder2.copyOnWrite();
        audf audfVar = (audf) createBuilder2.instance;
        atfaVar3.getClass();
        audfVar.g = atfaVar3;
        audfVar.b |= 512;
        aopcVar2.cu(createBuilder2);
    }
}
