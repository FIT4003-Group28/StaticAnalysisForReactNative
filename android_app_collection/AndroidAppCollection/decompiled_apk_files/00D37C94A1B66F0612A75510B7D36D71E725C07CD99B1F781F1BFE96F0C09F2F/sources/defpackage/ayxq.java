package defpackage;
/* compiled from: PG */
/* renamed from: ayxq  reason: default package */
/* loaded from: classes2.dex */
public final class ayxq extends ayua {
    final ayor c;
    final int d;

    public ayxq(aynx aynxVar, ayor ayorVar, int i) {
        super(aynxVar);
        this.c = ayorVar;
        this.d = i;
    }

    @Override // defpackage.aynx
    public final void ae(bame bameVar) {
        ayoq a = this.c.a();
        if (bameVar instanceof ayre) {
            this.b.ac(new ayxo((ayre) bameVar, a, this.d));
        } else {
            this.b.ac(new ayxp(bameVar, a, this.d));
        }
    }
}
