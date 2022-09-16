package defpackage;
/* compiled from: PG */
/* renamed from: adcm  reason: default package */
/* loaded from: classes.dex */
public final class adcm {
    private final aazr a;

    static {
        zep.a("HandoffRequester");
    }

    public adcm(aazr aazrVar) {
        this.a = aazrVar;
    }

    public final ankt a(arfq arfqVar) {
        aopa createBuilder = arun.a.createBuilder();
        createBuilder.copyOnWrite();
        arun arunVar = (arun) createBuilder.instance;
        arfqVar.getClass();
        arunVar.d = arfqVar;
        arunVar.b |= 2;
        aazr aazrVar = this.a;
        return aazrVar.b.b(new aazq(aazrVar.e, aazrVar.a.c(), createBuilder), aazrVar.c);
    }
}
