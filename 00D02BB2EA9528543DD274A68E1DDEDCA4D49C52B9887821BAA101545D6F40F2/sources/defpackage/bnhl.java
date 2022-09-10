package defpackage;
/* compiled from: PG */
/* renamed from: bnhl  reason: default package */
/* loaded from: classes3.dex */
public final class bnhl {
    public final dzsj<bnhf> a;
    public final dzsj<bnhi> b;
    public final dzsj<bhhf> c;
    public final dzsj<bnhc> d;

    public bnhl(dzsj<bnhf> dzsjVar, dzsj<bnhi> dzsjVar2, dzsj<bhhf> dzsjVar3, dzsj<bnhc> dzsjVar4) {
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
