package defpackage;
/* compiled from: PG */
/* renamed from: asko  reason: default package */
/* loaded from: classes.dex */
public final class asko {
    public final dzsj<askj> a;
    public final dzsj<btrm> b;
    public final dzsj<bvjj> c;
    public final dzsj<brlz> d;
    public final dzsj<asik> e;
    public final dzsj<akfa> f;

    public asko(dzsj<askj> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<brlz> dzsjVar4, dzsj<asik> dzsjVar5, dzsj<akfa> dzsjVar6) {
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
