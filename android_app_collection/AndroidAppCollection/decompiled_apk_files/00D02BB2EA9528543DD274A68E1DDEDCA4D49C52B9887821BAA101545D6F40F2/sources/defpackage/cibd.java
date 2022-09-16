package defpackage;
/* compiled from: PG */
/* renamed from: cibd  reason: default package */
/* loaded from: classes4.dex */
public final class cibd {
    public final dzsj<bmdv> a;
    public final dzsj<axru> b;
    public final dzsj<btvo> c;
    public final dzsj<ahjq> d;

    public cibd(dzsj<bmdv> dzsjVar, dzsj<axru> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<ahjq> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
