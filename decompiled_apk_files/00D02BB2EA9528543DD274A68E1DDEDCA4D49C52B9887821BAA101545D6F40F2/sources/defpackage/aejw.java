package defpackage;
/* renamed from: aejw  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aejw implements cqlc {
    static final cqlc a = new aejw();

    private aejw() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aeki aekiVar = (aeki) cqkpVar;
        String b = aekiVar.b();
        String a2 = aekiVar.a();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + String.valueOf(a2).length());
        sb.append(b);
        sb.append("  ");
        sb.append(a2);
        return sb.toString();
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}