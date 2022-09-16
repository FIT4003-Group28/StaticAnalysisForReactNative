package defpackage;
/* compiled from: PG */
/* renamed from: bpia  reason: default package */
/* loaded from: classes3.dex */
public final class bpia {
    public final dzsj<booa> a;
    public final dzsj<bnyd> b;
    public final dzsj<ff> c;

    public bpia(dzsj<booa> dzsjVar, dzsj<bnyd> dzsjVar2, dzsj<ff> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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
