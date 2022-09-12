package defpackage;
/* compiled from: PG */
/* renamed from: cuq  reason: default package */
/* loaded from: classes5.dex */
public final class cuq {
    public final dzsj<btrm> a;
    public final dzsj<dxio<amfi>> b;
    public final dzsj<cqat> c;
    public final dzsj<dxio<ckcw>> d;
    public final dzsj<cjqy> e;
    public final dzsj<dehq> f;
    public final dzsj<cvv> g;
    public final dzsj<dxio<akox>> h;

    public cuq(dzsj<btrm> dzsjVar, dzsj<dxio<amfi>> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<dxio<ckcw>> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<dehq> dzsjVar6, dzsj<cvv> dzsjVar7, dzsj<dxio<akox>> dzsjVar8) {
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
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
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
