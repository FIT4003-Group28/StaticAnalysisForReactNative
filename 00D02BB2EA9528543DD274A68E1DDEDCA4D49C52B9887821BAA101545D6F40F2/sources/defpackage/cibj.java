package defpackage;
/* compiled from: PG */
/* renamed from: cibj  reason: default package */
/* loaded from: classes4.dex */
public class cibj implements cibi {
    private final cjtd a;

    public cibj(chxl chxlVar) {
        cjtd a;
        if (chxlVar.c.isEmpty()) {
            a = cjtd.b;
        } else {
            cjta b = cjtd.b();
            b.g(chxlVar.c);
            a = b.a();
        }
        this.a = a;
    }

    @Override // defpackage.cibi
    public cjtd s(ddho ddhoVar) {
        cjta c = cjtd.c(this.a);
        c.d = ddhoVar;
        return c.a();
    }
}
