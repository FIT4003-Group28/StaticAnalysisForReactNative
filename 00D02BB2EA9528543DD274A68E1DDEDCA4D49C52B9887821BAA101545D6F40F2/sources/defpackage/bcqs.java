package defpackage;
/* compiled from: PG */
/* renamed from: bcqs  reason: default package */
/* loaded from: classes3.dex */
public final class bcqs {
    public final dzsj<gga> a;
    public final dzsj<bwqv> b;
    public final dzsj<dxio<anhg>> c;
    public final dzsj<bcaz> d;
    public final dzsj<cqkj> e;
    public final dzsj<ccst> f;
    public final dzsj<bvrb> g;

    public bcqs(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<dxio<anhg>> dzsjVar3, dzsj<bcaz> dzsjVar4, dzsj<cqkj> dzsjVar5, dzsj<ccst> dzsjVar6, dzsj<bvrb> dzsjVar7) {
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
