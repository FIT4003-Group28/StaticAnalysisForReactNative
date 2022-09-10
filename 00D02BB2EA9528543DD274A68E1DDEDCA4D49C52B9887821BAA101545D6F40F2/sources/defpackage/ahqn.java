package defpackage;
/* compiled from: PG */
/* renamed from: ahqn  reason: default package */
/* loaded from: classes2.dex */
public final class ahqn extends ahqe {
    private final boolean b;
    private final boolean c;

    public ahqn(long j, boolean z, boolean z2) {
        super(j);
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.ahqe
    public final void c(ahqb ahqbVar) {
        if (this.b) {
            ahqbVar.h(this.a, this.c);
        }
    }

    @Override // defpackage.ahqe
    public final void d(ddrh ddrhVar) {
    }

    @Override // defpackage.ahqe
    public final String toString() {
        dbsb b = dbsc.b(this);
        b.a(super.toString());
        b.h("hasGpsSignal", this.b);
        return b.toString();
    }
}
