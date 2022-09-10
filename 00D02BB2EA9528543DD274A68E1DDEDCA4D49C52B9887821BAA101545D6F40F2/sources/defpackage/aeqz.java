package defpackage;
/* compiled from: PG */
/* renamed from: aeqz  reason: default package */
/* loaded from: classes2.dex */
final class aeqz implements aerz {
    final /* synthetic */ aerb a;

    public aeqz(aerb aerbVar) {
        this.a = aerbVar;
    }

    @Override // defpackage.aerz
    public final void a(aeui aeuiVar) {
        if (!this.a.r()) {
            return;
        }
        this.a.n(aeuiVar);
        synchronized (this.a) {
            for (aerz aerzVar : this.a.i) {
                aerzVar.a(aeuiVar);
            }
        }
    }
}
