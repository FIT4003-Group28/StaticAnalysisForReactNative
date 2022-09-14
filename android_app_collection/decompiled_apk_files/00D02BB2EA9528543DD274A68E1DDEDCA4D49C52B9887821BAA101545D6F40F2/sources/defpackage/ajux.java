package defpackage;
/* renamed from: ajux  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ajux implements cqlc {
    static final cqlc a = new ajux();

    private ajux() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        ajvb ajvbVar = (ajvb) cqkpVar;
        cqlc<ajvb, Integer> cqlcVar = ajva.a;
        if (ajvbVar.j().booleanValue()) {
            Integer k = ajvbVar.k();
            dbsk.s(k);
            int intValue = k.intValue();
            if (intValue > 0) {
                StringBuilder sb = new StringBuilder(12);
                sb.append(intValue);
                sb.append("%");
                return sb.toString();
            }
        }
        return "";
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
