package defpackage;
/* compiled from: PG */
/* renamed from: ahda  reason: default package */
/* loaded from: classes2.dex */
public final class ahda {
    public final dzsj<ahht> a;
    public final dzsj<ahas> b;
    public final dzsj<ahdg> c;
    public final dzsj<ahfo> d;

    public ahda(dzsj<ahht> dzsjVar, dzsj<ahas> dzsjVar2, dzsj<ahdg> dzsjVar3, dzsj<ahfo> dzsjVar4) {
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
