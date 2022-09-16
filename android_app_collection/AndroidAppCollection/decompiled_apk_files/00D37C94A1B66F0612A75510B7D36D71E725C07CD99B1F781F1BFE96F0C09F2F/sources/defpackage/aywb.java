package defpackage;
/* compiled from: PG */
/* renamed from: aywb  reason: default package */
/* loaded from: classes2.dex */
public final class aywb extends ayua {
    final ayqe c;
    final int d;
    final int e;

    public aywb(aynx aynxVar, ayqe ayqeVar, int i, int i2) {
        super(aynxVar);
        this.c = ayqeVar;
        this.d = i;
        this.e = i2;
    }

    public static ayoa a(bame bameVar, ayqe ayqeVar, int i, int i2) {
        return new aywa(bameVar, ayqeVar, i, i2);
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        if (azww.d(this.b, bameVar, this.c)) {
            return;
        }
        this.b.ac(a(bameVar, this.c, this.d, this.e));
    }
}
