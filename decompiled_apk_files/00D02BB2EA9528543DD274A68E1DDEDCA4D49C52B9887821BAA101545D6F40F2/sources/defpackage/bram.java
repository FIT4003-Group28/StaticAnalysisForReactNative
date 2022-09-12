package defpackage;
/* compiled from: PG */
/* renamed from: bram  reason: default package */
/* loaded from: classes4.dex */
public abstract class bram {
    public static bral f(bwrs<brln> bwrsVar) {
        braf brafVar = new braf();
        if (bwrsVar != null) {
            brafVar.a = bwrsVar;
            brafVar.b(false);
            brafVar.d(false);
            brafVar.c(cjqn.a);
            return brafVar;
        }
        throw new NullPointerException("Null searchRequestRef");
    }

    public static bral g(bwrs<brln> bwrsVar, gfw gfwVar) {
        bral f = f(bwrsVar);
        ((braf) f).b = gfwVar;
        f.d(false);
        return f;
    }

    public abstract bwrs<brln> a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract cjqk d();

    @dzsi
    public abstract gfw e();
}
