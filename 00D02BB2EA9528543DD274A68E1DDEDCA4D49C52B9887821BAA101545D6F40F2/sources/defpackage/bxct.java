package defpackage;
/* compiled from: PG */
/* renamed from: bxct  reason: default package */
/* loaded from: classes4.dex */
public final class bxct {
    public final dzsj<ff> a;
    public final dzsj<cqhn> b;
    public final dzsj<bxcr> c;
    public final dzsj<begg> d;
    public final dzsj<huc> e;
    public final dzsj<bxcu> f;

    public bxct(dzsj<ff> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bxcr> dzsjVar3, dzsj<begg> dzsjVar4, dzsj<huc> dzsjVar5, dzsj<bxcu> dzsjVar6) {
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
