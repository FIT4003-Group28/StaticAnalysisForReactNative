package defpackage;
/* compiled from: PG */
/* renamed from: axnt  reason: default package */
/* loaded from: classes3.dex */
public final class axnt {
    private final dzsj<gga> a;
    private final dzsj<axjh> b;
    private final dzsj<axoi> c;
    private final dzsj<cqhu> d;

    public axnt(dzsj<gga> dzsjVar, dzsj<axjh> dzsjVar2, dzsj<axoi> dzsjVar3, dzsj<cqhu> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final axns a(diyq diyqVar, dfqc dfqcVar, mw<axns> mwVar, cjta cjtaVar) {
        gga a = this.a.a();
        b(a, 1);
        axjh a2 = this.b.a();
        b(a2, 2);
        axoi a3 = this.c.a();
        b(a3, 3);
        cqhu a4 = this.d.a();
        b(a4, 4);
        b(diyqVar, 5);
        b(dfqcVar, 6);
        b(mwVar, 7);
        b(cjtaVar, 8);
        return new axns(a, a2, a3, a4, diyqVar, dfqcVar, mwVar, cjtaVar);
    }
}
