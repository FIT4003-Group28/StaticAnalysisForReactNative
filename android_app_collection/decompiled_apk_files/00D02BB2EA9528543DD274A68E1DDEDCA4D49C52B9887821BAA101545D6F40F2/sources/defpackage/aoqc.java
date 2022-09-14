package defpackage;
/* compiled from: PG */
/* renamed from: aoqc  reason: default package */
/* loaded from: classes2.dex */
public final class aoqc {
    public final dzsj<ff> a;
    public final dzsj<angp> b;
    public final dzsj<aotw> c;
    public final dzsj<anqv> d;
    public final dzsj<anqx> e;
    public final dzsj<ansb> f;
    public final dzsj<anru> g;
    public final dzsj<anpw> h;

    public aoqc(dzsj<ff> dzsjVar, dzsj<angp> dzsjVar2, dzsj<aotw> dzsjVar3, dzsj<anqv> dzsjVar4, dzsj<anqx> dzsjVar5, dzsj<ansb> dzsjVar6, dzsj<anru> dzsjVar7, dzsj<anpw> dzsjVar8) {
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
