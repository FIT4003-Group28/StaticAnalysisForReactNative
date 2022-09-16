package defpackage;
/* compiled from: PG */
/* renamed from: ayvi  reason: default package */
/* loaded from: classes2.dex */
public final class ayvi extends ayua {
    final ayqe c;

    public ayvi(aynx aynxVar, ayqe ayqeVar) {
        super(aynxVar);
        this.c = ayqeVar;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        if (bameVar instanceof ayre) {
            this.b.ac(new ayvg((ayre) bameVar, this.c));
        } else {
            this.b.ac(new ayvh(bameVar, this.c));
        }
    }
}
