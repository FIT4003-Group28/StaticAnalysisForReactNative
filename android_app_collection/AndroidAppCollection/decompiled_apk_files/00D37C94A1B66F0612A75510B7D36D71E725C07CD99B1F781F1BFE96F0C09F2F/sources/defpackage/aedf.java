package defpackage;
/* compiled from: PG */
/* renamed from: aedf  reason: default package */
/* loaded from: classes.dex */
public final class aedf extends aefo {
    public final long a;

    public aedf(long j) {
        super((aefn) null);
        this.a = j;
    }

    @Override // defpackage.aefo
    public final void a(acvg acvgVar) {
        aopa createBuilder = asno.a.createBuilder();
        aopa createBuilder2 = asnq.a.createBuilder();
        long j = this.a;
        createBuilder2.copyOnWrite();
        asnq asnqVar = (asnq) createBuilder2.instance;
        asnqVar.b |= 2048;
        asnqVar.h = j;
        createBuilder.copyOnWrite();
        asno asnoVar = (asno) createBuilder.instance;
        asnq asnqVar2 = (asnq) createBuilder2.mo39build();
        asnqVar2.getClass();
        asnoVar.v = asnqVar2;
        asnoVar.c |= 262144;
        acvgVar.a((asno) createBuilder.mo39build());
    }
}
