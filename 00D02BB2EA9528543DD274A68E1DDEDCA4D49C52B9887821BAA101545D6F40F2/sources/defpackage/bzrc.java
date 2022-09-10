package defpackage;
/* compiled from: PG */
/* renamed from: bzrc  reason: default package */
/* loaded from: classes4.dex */
public class bzrc {
    public final dzsj<dxio<afgy>> a;
    public final dzsj<dxio<afha>> b;
    public final dzsj<dxio<bvvw>> c;
    public final dzsj<dxio<blpp>> d;
    public final dzsj<dxio<cklf>> e;
    public final dzsj<btvo> f;

    public bzrc(dzsj<dxio<afgy>> dzsjVar, dzsj<dxio<afha>> dzsjVar2, dzsj<dxio<bvvw>> dzsjVar3, dzsj<dxio<blpp>> dzsjVar4, dzsj<dxio<cklf>> dzsjVar5, dzsj<btvo> dzsjVar6) {
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
