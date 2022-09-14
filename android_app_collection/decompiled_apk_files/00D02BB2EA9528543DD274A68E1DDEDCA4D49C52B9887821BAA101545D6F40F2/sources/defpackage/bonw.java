package defpackage;
/* compiled from: PG */
/* renamed from: bonw  reason: default package */
/* loaded from: classes3.dex */
public final class bonw {
    public final dzsj<hwd> a;
    public final dzsj<cqkj> b;
    public final dzsj<cqhu> c;

    public bonw(dzsj<hwd> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<cqhu> dzsjVar3) {
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
