package defpackage;
/* compiled from: PG */
/* renamed from: absx  reason: default package */
/* loaded from: classes2.dex */
public final class absx {
    public final dzsj<cqhn> a;
    public final dzsj<dxio<axwy>> b;
    public final dzsj<abuo> c;
    public final dzsj<cjqy> d;
    public final dzsj<dxio<brba>> e;

    public absx(dzsj<cqhn> dzsjVar, dzsj<dxio<axwy>> dzsjVar2, dzsj<abuo> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<dxio<brba>> dzsjVar5) {
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
