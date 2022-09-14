package defpackage;
/* compiled from: PG */
/* renamed from: bxxg  reason: default package */
/* loaded from: classes4.dex */
public final class bxxg {
    public final dzsj<ff> a;
    public final dzsj<eeu> b;
    public final dzsj<cqat> c;
    public final dzsj<awre> d;
    public final dzsj<awtj> e;

    public bxxg(dzsj<ff> dzsjVar, dzsj<eeu> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<awre> dzsjVar4, dzsj<awtj> dzsjVar5) {
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
