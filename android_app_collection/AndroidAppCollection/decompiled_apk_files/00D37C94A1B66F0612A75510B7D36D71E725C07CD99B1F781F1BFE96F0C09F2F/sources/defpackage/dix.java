package defpackage;
/* compiled from: PG */
/* renamed from: dix  reason: default package */
/* loaded from: classes3.dex */
public final class dix extends dis {
    public final cyr b;

    public dix(div divVar) {
        super(divVar);
        cyr cyrVar = divVar.b;
        if (cyrVar != null) {
            this.b = cyrVar;
            return;
        }
        throw new IllegalStateException("Component must be provided.");
    }

    public static div p() {
        return new div();
    }

    public static dlj q() {
        div p = p();
        p.b = new diw();
        return p.e();
    }

    @Override // defpackage.dis, defpackage.dlj
    public final cyr b() {
        return this.b;
    }

    @Override // defpackage.dis, defpackage.dlj
    public final boolean j() {
        return true;
    }

    @Override // defpackage.dis, defpackage.dlj
    public final void l() {
    }

    @Override // defpackage.dis, defpackage.dlj
    public final void m() {
    }

    @Override // defpackage.dis, defpackage.dlj
    public final void n() {
    }

    @Override // defpackage.dlj
    public final String r() {
        return this.b.o();
    }
}
