package defpackage;
/* compiled from: PG */
/* renamed from: aoib  reason: default package */
/* loaded from: classes2.dex */
public final class aoib {
    public final dzsj<ache> a;
    public final dzsj<bzqa> b;
    public final dzsj<aohw> c;
    public final dzsj<bvjj> d;
    public final dzsj<anhg> e;

    public aoib(dzsj<ache> dzsjVar, dzsj<bzqa> dzsjVar2, dzsj<aohw> dzsjVar3, dzsj<bvjj> dzsjVar4, dzsj<anhg> dzsjVar5) {
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
