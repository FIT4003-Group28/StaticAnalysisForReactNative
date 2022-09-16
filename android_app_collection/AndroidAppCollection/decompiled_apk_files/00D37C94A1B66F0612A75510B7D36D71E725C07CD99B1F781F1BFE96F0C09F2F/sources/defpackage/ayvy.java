package defpackage;
/* compiled from: PG */
/* renamed from: ayvy  reason: default package */
/* loaded from: classes2.dex */
public final class ayvy extends ayua {
    final ayqf c;

    public ayvy(aynx aynxVar, ayqf ayqfVar) {
        super(aynxVar);
        this.c = ayqfVar;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        if (bameVar instanceof ayre) {
            this.b.ac(new ayvw((ayre) bameVar, this.c));
        } else {
            this.b.ac(new ayvx(bameVar, this.c));
        }
    }
}
