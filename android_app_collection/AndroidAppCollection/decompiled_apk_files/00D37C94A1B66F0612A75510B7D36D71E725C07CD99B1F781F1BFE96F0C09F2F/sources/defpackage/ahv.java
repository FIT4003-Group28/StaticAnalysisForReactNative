package defpackage;
/* compiled from: PG */
/* renamed from: ahv  reason: default package */
/* loaded from: classes.dex */
public final class ahv extends ahu {
    public int m;

    public ahv(aid aidVar) {
        super(aidVar);
        this.l = aidVar instanceof ahz ? 2 : 3;
    }

    @Override // defpackage.ahu
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        for (ahs ahsVar : this.j) {
            ahsVar.f();
        }
    }
}
