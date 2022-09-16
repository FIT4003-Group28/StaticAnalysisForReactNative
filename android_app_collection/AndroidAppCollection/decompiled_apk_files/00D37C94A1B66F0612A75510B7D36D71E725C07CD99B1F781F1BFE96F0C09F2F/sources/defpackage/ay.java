package defpackage;
/* compiled from: PG */
/* renamed from: ay  reason: default package */
/* loaded from: classes2.dex */
final class ay extends az {
    private static final long serialVersionUID = 7766999779862263523L;

    public ay(ba baVar, ba baVar2) {
        super(baVar, baVar2);
    }

    @Override // defpackage.ba
    public final boolean a(bc bcVar) {
        return this.a.a(bcVar) && this.b.a(bcVar);
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 5 + String.valueOf(obj2).length());
        sb.append(obj);
        sb.append(" and ");
        sb.append(obj2);
        return sb.toString();
    }
}
