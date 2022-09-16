package defpackage;
/* compiled from: PG */
/* renamed from: awke  reason: default package */
/* loaded from: classes2.dex */
public final class awke extends abga {
    public final aopa a;

    private awke() {
        awki awkiVar = awki.a;
        throw null;
    }

    public awke(aopa aopaVar) {
        this.a = aopaVar;
    }

    @Override // defpackage.abga
    public final /* bridge */ /* synthetic */ aajj a(aajl aajlVar) {
        return new awkg((awki) this.a.mo39build(), aajlVar);
    }

    public final void b(Integer num, auej auejVar) {
        if (auejVar == null) {
            return;
        }
        aopa aopaVar = this.a;
        int intValue = num.intValue();
        aopaVar.copyOnWrite();
        awki awkiVar = (awki) aopaVar.instance;
        awki awkiVar2 = awki.a;
        aoqp aoqpVar = awkiVar.n;
        if (!aoqpVar.b) {
            awkiVar.n = aoqpVar.a();
        }
        awkiVar.n.put(Integer.valueOf(intValue), auejVar);
    }
}
