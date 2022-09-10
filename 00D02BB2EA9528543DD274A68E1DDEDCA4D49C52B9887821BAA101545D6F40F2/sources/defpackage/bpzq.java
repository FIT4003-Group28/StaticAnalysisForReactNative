package defpackage;
/* compiled from: PG */
/* renamed from: bpzq  reason: default package */
/* loaded from: classes4.dex */
public class bpzq {
    public final dzsj<jkf> a;
    public final dzsj<bpys> b;
    public final dzsj<ff> c;
    public final dzsj<cqhn> d;
    public final dzsj<jmx> e;

    public bpzq(dzsj<jkf> dzsjVar, dzsj<bpys> dzsjVar2, dzsj<ff> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<jmx> dzsjVar5) {
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
