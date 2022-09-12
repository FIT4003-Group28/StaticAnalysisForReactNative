package defpackage;
/* compiled from: PG */
/* renamed from: llc  reason: default package */
/* loaded from: classes7.dex */
public final class llc {
    public final dzsj<jzv> a;
    public final dzsj<dxio<aukk>> b;
    public final dzsj<cjqq> c;
    public final dzsj<bvrb> d;

    public llc(dzsj<jzv> dzsjVar, dzsj<dxio<aukk>> dzsjVar2, dzsj<cjqq> dzsjVar3, dzsj<bvrb> dzsjVar4) {
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
