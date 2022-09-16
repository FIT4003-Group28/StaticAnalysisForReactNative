package defpackage;
/* compiled from: PG */
/* renamed from: bf  reason: default package */
/* loaded from: classes2.dex */
final class bf extends az {
    private static final long serialVersionUID = 1405488568664762222L;

    public bf(ba baVar, ba baVar2) {
        super(baVar, baVar2);
    }

    @Override // defpackage.ba
    public final boolean a(bc bcVar) {
        return this.a.a(bcVar) || this.b.a(bcVar);
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 4 + String.valueOf(obj2).length());
        sb.append(obj);
        sb.append(" or ");
        sb.append(obj2);
        return sb.toString();
    }
}
