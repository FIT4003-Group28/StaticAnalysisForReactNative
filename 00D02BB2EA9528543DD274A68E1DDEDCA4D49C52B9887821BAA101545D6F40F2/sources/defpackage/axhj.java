package defpackage;
/* compiled from: PG */
/* renamed from: axhj  reason: default package */
/* loaded from: classes3.dex */
public final class axhj {
    private final dzsj<btvo> a;
    private final dzsj<axjj> b;
    private final dzsj<axjm> c;
    private final dzsj<akfa> d;
    private final dzsj<dyzz> e;
    private final dzsj<ckcw> f;

    public axhj(dzsj<btvo> dzsjVar, dzsj<axjj> dzsjVar2, dzsj<axjm> dzsjVar3, dzsj<akfa> dzsjVar4, dzsj<dyzz> dzsjVar5, dzsj<ckcw> dzsjVar6) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
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

    public final axhi a(String str, dyzu<axhd> dyzuVar) {
        btvo a = this.a.a();
        b(a, 1);
        axjj a2 = this.b.a();
        b(a2, 2);
        axjm a3 = this.c.a();
        b(a3, 3);
        akfa a4 = this.d.a();
        b(a4, 4);
        dyzz a5 = this.e.a();
        b(a5, 5);
        ckcw a6 = this.f.a();
        b(a6, 6);
        b(dyzuVar, 8);
        return new axhi(a, a2, a3, a4, a5, a6, str, dyzuVar);
    }
}
