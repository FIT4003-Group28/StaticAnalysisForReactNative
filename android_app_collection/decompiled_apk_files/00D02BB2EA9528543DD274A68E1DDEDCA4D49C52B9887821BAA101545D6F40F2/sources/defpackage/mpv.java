package defpackage;
/* compiled from: PG */
/* renamed from: mpv  reason: default package */
/* loaded from: classes7.dex */
public final class mpv {
    public final dzsj<cqat> a;
    public final dzsj<npo> b;
    public final dzsj<bvrb> c;
    public final dzsj<akfa> d;
    public final dzsj<btvo> e;

    public mpv(dzsj<cqat> dzsjVar, dzsj<npo> dzsjVar2, dzsj<bvrb> dzsjVar3, dzsj<akfa> dzsjVar4, dzsj<btvo> dzsjVar5) {
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
