package defpackage;
/* compiled from: PG */
/* renamed from: avrg  reason: default package */
/* loaded from: classes3.dex */
public final class avrg {
    public final dzsj<avpr> a;
    public final dzsj<bvjj> b;
    public final dzsj<awar> c;
    public final dzsj<avop> d;

    public avrg(dzsj<avpr> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<awar> dzsjVar3, dzsj<avop> dzsjVar4) {
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
