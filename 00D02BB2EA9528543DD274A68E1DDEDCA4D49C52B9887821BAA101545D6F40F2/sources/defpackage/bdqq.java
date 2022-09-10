package defpackage;
/* compiled from: PG */
/* renamed from: bdqq  reason: default package */
/* loaded from: classes3.dex */
public final class bdqq {
    public final dzsj<btvo> a;
    public final dzsj<dxio<cclq>> b;
    public final dzsj<bbtk> c;
    public final dzsj<bhhf> d;
    public final dzsj<dxio<chht>> e;
    public final dzsj<chhr> f;

    public bdqq(dzsj<btvo> dzsjVar, dzsj<dxio<cclq>> dzsjVar2, dzsj<bbtk> dzsjVar3, dzsj<bhhf> dzsjVar4, dzsj<dxio<chht>> dzsjVar5, dzsj<chhr> dzsjVar6) {
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
