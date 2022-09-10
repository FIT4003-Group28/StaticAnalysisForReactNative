package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ssd  reason: default package */
/* loaded from: classes7.dex */
public final class ssd implements qdo {
    private final btzp<djya, djyi> a;
    private final Executor b;
    @dzsi
    private btzc c;

    public ssd(buwa buwaVar, vly vlyVar, Executor executor) {
        this.a = vlyVar.a(buwaVar);
        this.b = executor;
    }

    @Override // defpackage.qdo
    public final void a(qdm qdmVar, degu<dspd> deguVar) {
        btzc btzcVar = this.c;
        if (btzcVar != null) {
            btzcVar.a();
        }
        djxz bZ = djya.d.bZ();
        qaz qazVar = (qaz) qdmVar;
        drih drihVar = qazVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djya djyaVar = (djya) bZ.b;
        drihVar.getClass();
        djyaVar.b = drihVar;
        djyaVar.a |= 1;
        dnqh dnqhVar = qazVar.b;
        djya djyaVar2 = (djya) bZ.b;
        dnqhVar.getClass();
        djyaVar2.c = dnqhVar;
        djyaVar2.a |= 2;
        this.c = this.a.b(bZ.bK(), new ssc(deguVar), this.b);
    }
}
