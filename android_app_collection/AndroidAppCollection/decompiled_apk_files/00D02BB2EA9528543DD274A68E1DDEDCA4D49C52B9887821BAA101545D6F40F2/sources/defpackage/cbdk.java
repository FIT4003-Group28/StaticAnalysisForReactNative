package defpackage;
/* compiled from: PG */
/* renamed from: cbdk  reason: default package */
/* loaded from: classes4.dex */
public final class cbdk {
    public final dzsj<bwqv> a;
    public final dzsj<gga> b;
    public final dzsj<akpm> c;
    public final dzsj<dxio<araj>> d;
    public final dzsj<btvo> e;

    public cbdk(dzsj<bwqv> dzsjVar, dzsj<gga> dzsjVar2, dzsj<akpm> dzsjVar3, dzsj<dxio<araj>> dzsjVar4, dzsj<btvo> dzsjVar5) {
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
