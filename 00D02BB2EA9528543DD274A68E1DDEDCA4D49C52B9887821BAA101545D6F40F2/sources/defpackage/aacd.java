package defpackage;
/* compiled from: PG */
/* renamed from: aacd  reason: default package */
/* loaded from: classes2.dex */
public final class aacd {
    public final dzsj<dxio<akox>> a;
    public final dzsj<alay> b;
    public final dzsj<akkz> c;
    public final dzsj<dxio<axsc>> d;
    public final dzsj<dxio<cjqy>> e;

    public aacd(dzsj<dxio<akox>> dzsjVar, dzsj<alay> dzsjVar2, dzsj<akkz> dzsjVar3, dzsj<dxio<axsc>> dzsjVar4, dzsj<dxio<cjqy>> dzsjVar5) {
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
