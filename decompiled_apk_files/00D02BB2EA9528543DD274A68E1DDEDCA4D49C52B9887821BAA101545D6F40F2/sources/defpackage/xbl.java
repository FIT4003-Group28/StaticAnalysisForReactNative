package defpackage;
/* compiled from: PG */
/* renamed from: xbl  reason: default package */
/* loaded from: classes7.dex */
public final class xbl {
    public final dzsj<eeu> a;
    public final dzsj<akox> b;
    public final dzsj<xbq> c;
    public final dzsj<vtn> d;

    public xbl(dzsj<eeu> dzsjVar, dzsj<akox> dzsjVar2, dzsj<xbq> dzsjVar3, dzsj<vtn> dzsjVar4) {
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
