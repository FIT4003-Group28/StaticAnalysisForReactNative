package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: kqb  reason: default package */
/* loaded from: classes3.dex */
public final class kqb extends ajwd {
    private final ajsm a;
    private final aypg b;

    public kqb(ajyi ajyiVar, aagi aagiVar, ards ardsVar) {
        ajsm ajsmVar = new ajsm();
        this.a = ajsmVar;
        ajsmVar.add(ardsVar);
        ajyiVar.a(ards.class);
        this.b = aagiVar.c().h(ardsVar.c, false).X(aypa.a()).ar();
    }

    @Override // defpackage.ajwd, defpackage.zdx
    public final void j() {
        ayqi.c((AtomicReference) this.b);
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.a;
    }
}
