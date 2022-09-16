package defpackage;
/* renamed from: kmq  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class kmq implements cqlc {
    static final cqlc a = new kmq();

    private kmq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bevj bevjVar = (bevj) cqkpVar;
        if (bevjVar.m().booleanValue()) {
            if (bevjVar.n().intValue() <= 0) {
                return cqtt.l(kmz.c, cqsg.f(nqo.ag, Float.valueOf(0.5f)));
            }
            return cqtt.l(kmz.b, cqsg.f(nqo.ag, Float.valueOf(0.5f)));
        }
        return cqta.f();
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
