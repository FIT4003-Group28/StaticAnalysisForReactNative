package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: cih  reason: default package */
/* loaded from: classes4.dex */
public abstract class cih<Z> extends chz<Z> {
    private final int a;
    private final int b;

    public cih(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.cij
    public final void g(cii ciiVar) {
        if (!cjp.b(this.a, this.b)) {
            int i = this.a;
            int i2 = this.b;
            StringBuilder sb = new StringBuilder(176);
            sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
            sb.append(i);
            sb.append(" and height: ");
            sb.append(i2);
            sb.append(", either provide dimensions in the constructor or call override()");
            throw new IllegalArgumentException(sb.toString());
        }
        ciiVar.j(this.a, this.b);
    }

    @Override // defpackage.cij
    public final void h(cii ciiVar) {
    }
}
