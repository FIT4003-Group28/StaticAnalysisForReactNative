package defpackage;
/* compiled from: PG */
/* renamed from: abuq  reason: default package */
/* loaded from: classes2.dex */
public final class abuq {
    public final dzsj<gga> a;
    public final dzsj<ahjq> b;
    public final dzsj<bnjv> c;
    public final dzsj<gll> d;
    public final dzsj<akpm> e;
    public final dzsj<bvsl> f;
    public final dzsj<dxio<abfa>> g;
    public final dzsj<dxio<begg>> h;

    public abuq(dzsj<gga> dzsjVar, dzsj<ahjq> dzsjVar2, dzsj<bnjv> dzsjVar3, dzsj<gll> dzsjVar4, dzsj<akpm> dzsjVar5, dzsj<bvsl> dzsjVar6, dzsj<dxio<abfa>> dzsjVar7, dzsj<dxio<begg>> dzsjVar8) {
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