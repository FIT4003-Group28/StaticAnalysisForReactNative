package defpackage;
/* compiled from: PG */
/* renamed from: betk  reason: default package */
/* loaded from: classes3.dex */
public class betk {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<bvrb> c;
    public final dzsj<dxio<akfa>> d;
    public final dzsj<akfc> e;
    public final dzsj<cztz> f;
    public final dzsj<btvo> g;

    public betk(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bvrb> dzsjVar3, dzsj<dxio<akfa>> dzsjVar4, dzsj<akfc> dzsjVar5, dzsj<cztz> dzsjVar6, dzsj<btvo> dzsjVar7) {
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
