package defpackage;
/* compiled from: PG */
/* renamed from: bjau  reason: default package */
/* loaded from: classes3.dex */
public final class bjau {
    public final dzsj<gga> a;
    public final dzsj<bjhc> b;
    public final dzsj<bjzo> c;
    public final dzsj<bjxm> d;
    public final dzsj<bjxq> e;
    public final dzsj<bjbu> f;

    public bjau(dzsj<gga> dzsjVar, dzsj<bjhc> dzsjVar2, dzsj<bjzo> dzsjVar3, dzsj<bjxm> dzsjVar4, dzsj<bjxq> dzsjVar5, dzsj<bjbu> dzsjVar6) {
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
