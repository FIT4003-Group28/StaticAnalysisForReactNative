package defpackage;
/* compiled from: PG */
/* renamed from: aqpc  reason: default package */
/* loaded from: classes2.dex */
public final class aqpc {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<bvrb> c;
    public final dzsj<aqeh> d;
    public final dzsj<aqov> e;
    public final dzsj<dxio<aqbo>> f;
    public final dzsj<dxio<apyz>> g;

    public aqpc(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bvrb> dzsjVar3, dzsj<aqeh> dzsjVar4, dzsj<aqov> dzsjVar5, dzsj<dxio<aqbo>> dzsjVar6, dzsj<dxio<apyz>> dzsjVar7) {
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
