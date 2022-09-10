package defpackage;

import defpackage.dssi;
import defpackage.dssj;
/* compiled from: PG */
/* renamed from: bzwb  reason: default package */
/* loaded from: classes4.dex */
public final class bzwb<M extends dssj, B extends dssi> implements dbty<B> {
    private final bzwd<M> a;
    private final B b;
    @dzsi
    private B c;

    public bzwb(bzwd<M> bzwdVar, M m) {
        this.a = bzwdVar;
        dsqw dsqwVar = (dsqw) m;
        dsqp dsqpVar = (dsqp) dsqwVar.cu(5);
        dsqpVar.bC(dsqwVar);
        this.b = dsqpVar;
        this.c = null;
    }

    @Override // defpackage.dbty
    /* renamed from: b */
    public final synchronized B a() {
        if (this.c == null) {
            M a = this.a.a();
            if (a == null) {
                this.c = this.b;
            } else {
                this.c = (B) a.Nn();
            }
        }
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void c() {
        B b = this.c;
        if (b != null) {
            this.a.b(b.bK());
        }
    }
}
