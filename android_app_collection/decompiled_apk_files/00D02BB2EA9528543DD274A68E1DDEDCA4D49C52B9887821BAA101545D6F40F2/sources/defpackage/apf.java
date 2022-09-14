package defpackage;
/* compiled from: PG */
/* renamed from: apf  reason: default package */
/* loaded from: classes2.dex */
public final class apf<D> implements aa<D> {
    public final apl<D> a;
    public final apc<D> b;
    public boolean c = false;

    public apf(apl<D> aplVar, apc<D> apcVar) {
        this.a = aplVar;
        this.b = apcVar;
    }

    @Override // defpackage.aa
    public final void m(D d) {
        if (api.d(2)) {
            String str = "  onLoadFinished in " + this.a + ": " + apl.q(d);
        }
        this.c = true;
        this.b.b(d);
    }

    public final String toString() {
        return this.b.toString();
    }
}
