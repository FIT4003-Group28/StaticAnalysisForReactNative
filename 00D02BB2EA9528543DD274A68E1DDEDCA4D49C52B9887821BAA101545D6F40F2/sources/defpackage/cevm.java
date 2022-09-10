package defpackage;
/* compiled from: PG */
/* renamed from: cevm  reason: default package */
/* loaded from: classes4.dex */
public final class cevm {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<ceet> c;
    public final dzsj<axwo> d;
    public final dzsj<cevj> e;
    public final dzsj<cese> f;

    public cevm(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<ceet> dzsjVar3, dzsj<axwo> dzsjVar4, dzsj<cevj> dzsjVar5, dzsj<cese> dzsjVar6) {
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
