package defpackage;
/* compiled from: PG */
/* renamed from: aebq  reason: default package */
/* loaded from: classes.dex */
public final class aebq extends aefo {
    public final int a;

    public aebq(int i) {
        super((aefn) null);
        this.a = i;
    }

    @Override // defpackage.aefo
    public final void a(acvg acvgVar) {
        aopa createBuilder = asno.a.createBuilder();
        aopa createBuilder2 = asnq.a.createBuilder();
        aopa createBuilder3 = asnp.a.createBuilder();
        createBuilder3.copyOnWrite();
        asnp asnpVar = (asnp) createBuilder3.instance;
        asnpVar.b |= 1;
        asnpVar.c = false;
        int i = this.a;
        createBuilder3.copyOnWrite();
        asnp asnpVar2 = (asnp) createBuilder3.instance;
        asnpVar2.e = alwb.n(i);
        asnpVar2.b |= 4;
        createBuilder2.as((asnp) createBuilder3.mo39build());
        createBuilder.copyOnWrite();
        asno asnoVar = (asno) createBuilder.instance;
        asnq asnqVar = (asnq) createBuilder2.mo39build();
        asnqVar.getClass();
        asnoVar.v = asnqVar;
        asnoVar.c |= 262144;
        acvgVar.a((asno) createBuilder.mo39build());
    }
}
