package defpackage;
/* compiled from: PG */
/* renamed from: aedu  reason: default package */
/* loaded from: classes.dex */
public final class aedu extends aefo {
    public final String a;

    public aedu(String str) {
        super((aefn) null);
        this.a = str;
    }

    @Override // defpackage.aefo
    public final void a(acvg acvgVar) {
        aopa createBuilder = asno.a.createBuilder();
        aopa createBuilder2 = asnq.a.createBuilder();
        String str = this.a;
        createBuilder2.copyOnWrite();
        asnq asnqVar = (asnq) createBuilder2.instance;
        str.getClass();
        asnqVar.b |= 512;
        asnqVar.f = str;
        createBuilder.copyOnWrite();
        asno asnoVar = (asno) createBuilder.instance;
        asnq asnqVar2 = (asnq) createBuilder2.mo39build();
        asnqVar2.getClass();
        asnoVar.v = asnqVar2;
        asnoVar.c |= 262144;
        acvgVar.a((asno) createBuilder.mo39build());
    }
}
