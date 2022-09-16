package defpackage;
/* compiled from: PG */
/* renamed from: cjdr  reason: default package */
/* loaded from: classes4.dex */
public class cjdr implements cjdq {
    private final cjdi a;
    private final String b;
    private final dgrh c;

    public cjdr(cjdi cjdiVar, String str, dgrh dgrhVar) {
        this.a = cjdiVar;
        this.b = str;
        this.c = dgrhVar;
    }

    @Override // defpackage.cjdq
    public String a() {
        return this.b;
    }

    @Override // defpackage.cjdq
    public cqkl b() {
        ily ilyVar = new ily();
        ilyVar.j(akqi.k(this.c));
        ilyVar.F(this.b);
        this.a.aS(cjcz.b(ilyVar.d()));
        return cqkl.a;
    }
}
