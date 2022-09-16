package defpackage;
/* compiled from: PG */
/* renamed from: ayqh  reason: default package */
/* loaded from: classes3.dex */
public final class ayqh {
    public final dzsj<gga> a;
    public final dzsj<ckcw> b;
    public final dzsj<ayrm> c;
    public final dzsj<btvo> d;
    public final dzsj<cqhn> e;

    public ayqh(dzsj<gga> dzsjVar, dzsj<ckcw> dzsjVar2, dzsj<ayrm> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<cqhn> dzsjVar5) {
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
