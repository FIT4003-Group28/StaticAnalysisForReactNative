package defpackage;
/* compiled from: PG */
/* renamed from: bhyp  reason: default package */
/* loaded from: classes3.dex */
public final class bhyp {
    public final dzsj<ff> a;
    public final dzsj<bvrb> b;
    public final dzsj<axwq> c;
    public final dzsj<buom> d;
    public final dzsj<bvaz> e;

    public bhyp(dzsj<ff> dzsjVar, dzsj<bvrb> dzsjVar2, dzsj<axwq> dzsjVar3, dzsj<buom> dzsjVar4, dzsj<bvaz> dzsjVar5) {
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
