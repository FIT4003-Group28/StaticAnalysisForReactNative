package defpackage;
/* compiled from: PG */
/* renamed from: abai  reason: default package */
/* loaded from: classes.dex */
public final class abai {
    public final dzsj<alay> a;
    public final dzsj<dxio<akox>> b;
    public final dzsj<cqat> c;
    public final dzsj<bvrb> d;
    public final dzsj<abba> e;

    public abai(dzsj<alay> dzsjVar, dzsj<dxio<akox>> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<bvrb> dzsjVar4, dzsj<abba> dzsjVar5) {
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
