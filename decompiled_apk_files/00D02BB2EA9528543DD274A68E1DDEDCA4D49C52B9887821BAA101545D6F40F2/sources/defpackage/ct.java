package defpackage;
/* compiled from: PG */
/* renamed from: ct  reason: default package */
/* loaded from: classes5.dex */
final class ct extends cu {
    private static final long serialVersionUID = 7766999779862263523L;

    public ct(cv cvVar, cv cvVar2) {
        super(cvVar, cvVar2);
    }

    @Override // defpackage.cv
    public final boolean a(cx cxVar) {
        return this.a.a(cxVar) && this.b.a(cxVar);
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
