package defpackage;
/* compiled from: PG */
/* renamed from: ncn  reason: default package */
/* loaded from: classes7.dex */
public final class ncn {
    public final dzsj<cqat> a;
    public final dzsj<buxk> b;
    public final dzsj<ahjq> c;
    public final dzsj<ckcw> d;

    public ncn(dzsj<cqat> dzsjVar, dzsj<buxk> dzsjVar2, dzsj<ahjq> dzsjVar3, dzsj<ckcw> dzsjVar4) {
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
