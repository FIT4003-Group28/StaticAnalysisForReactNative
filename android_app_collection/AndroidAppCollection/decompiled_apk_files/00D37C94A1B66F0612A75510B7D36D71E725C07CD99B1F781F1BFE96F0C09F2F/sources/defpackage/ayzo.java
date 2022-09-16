package defpackage;
/* compiled from: PG */
/* renamed from: ayzo  reason: default package */
/* loaded from: classes2.dex */
public final class ayzo extends ayua {
    final ayqe c;
    final int d;

    public ayzo(aynx aynxVar, ayqe ayqeVar, int i) {
        super(aynxVar);
        this.c = ayqeVar;
        this.d = i;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        if (azww.d(this.b, bameVar, this.c)) {
            return;
        }
        this.b.ac(new ayzn(bameVar, this.c, this.d));
    }
}
