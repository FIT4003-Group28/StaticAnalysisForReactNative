package defpackage;
/* renamed from: bnhp  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bnhp implements dbsl {
    static final dbsl a = new bnhp();

    private bnhp() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dwzu dwzuVar = (dwzu) obj;
        int i = dwzuVar.a;
        return ((i & 2) == 0 || (i & 4) == 0 || dwzuVar.d.isEmpty()) ? false : true;
    }
}
