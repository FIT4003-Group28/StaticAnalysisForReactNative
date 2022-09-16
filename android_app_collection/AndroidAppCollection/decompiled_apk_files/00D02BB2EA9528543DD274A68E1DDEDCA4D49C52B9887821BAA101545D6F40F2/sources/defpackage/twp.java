package defpackage;
/* renamed from: twp  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class twp implements dbsl {
    static final dbsl a = new twp();

    private twp() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dcep<dozy> dcepVar = twq.a;
        dozy b = dozy.b(((dozz) obj).f);
        if (b == null) {
            b = dozy.UNKNOWN;
        }
        return !twq.a.contains(b) && !b.equals(dozy.TOLL);
    }
}
