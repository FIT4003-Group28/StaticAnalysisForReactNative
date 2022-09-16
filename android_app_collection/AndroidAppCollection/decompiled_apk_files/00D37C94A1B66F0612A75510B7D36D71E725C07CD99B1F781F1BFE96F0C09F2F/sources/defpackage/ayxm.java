package defpackage;
/* compiled from: PG */
/* renamed from: ayxm  reason: default package */
/* loaded from: classes2.dex */
public final class ayxm extends ayua {
    final ayqe c;

    public ayxm(aynx aynxVar, ayqe ayqeVar) {
        super(aynxVar);
        this.c = ayqeVar;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        if (bameVar instanceof ayre) {
            this.b.ac(new ayxk((ayre) bameVar, this.c));
        } else {
            this.b.ac(new ayxl(bameVar, this.c));
        }
    }
}
