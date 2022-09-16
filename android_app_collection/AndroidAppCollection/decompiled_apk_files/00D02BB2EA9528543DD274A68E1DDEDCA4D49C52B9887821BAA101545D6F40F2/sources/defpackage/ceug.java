package defpackage;
/* compiled from: PG */
/* renamed from: ceug  reason: default package */
/* loaded from: classes4.dex */
public final class ceug {
    public final dzsj<gga> a;
    public final dzsj<dxio<akfa>> b;
    public final dzsj<awnm> c;
    public final dzsj<cqhn> d;
    public final dzsj<btvo> e;
    public final dzsj<cese> f;

    public ceug(dzsj<gga> dzsjVar, dzsj<dxio<akfa>> dzsjVar2, dzsj<awnm> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<btvo> dzsjVar5, dzsj<cese> dzsjVar6) {
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
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
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
