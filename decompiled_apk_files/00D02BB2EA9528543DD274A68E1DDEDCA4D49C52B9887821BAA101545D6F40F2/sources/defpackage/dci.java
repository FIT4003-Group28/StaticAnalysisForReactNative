package defpackage;
/* compiled from: PG */
/* renamed from: dci  reason: default package */
/* loaded from: classes5.dex */
public final class dci {
    public final dzsj<dbu> a;
    public final dzsj<cjqy> b;
    public final dzsj<dkh> c;
    public final dzsj<dkn> d;
    public final dzsj<dol> e;
    public final dzsj<der> f;
    public final dzsj<djs> g;
    public final dzsj<dkf> h;
    public final dzsj<dbh> i;

    public dci(dzsj<dbu> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<dkh> dzsjVar3, dzsj<dkn> dzsjVar4, dzsj<dol> dzsjVar5, dzsj<der> dzsjVar6, dzsj<djs> dzsjVar7, dzsj<dkf> dzsjVar8, dzsj<dbh> dzsjVar9) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
