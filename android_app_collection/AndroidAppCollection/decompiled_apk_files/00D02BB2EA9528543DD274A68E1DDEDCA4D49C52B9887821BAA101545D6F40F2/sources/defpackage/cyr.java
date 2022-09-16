package defpackage;
/* compiled from: PG */
/* renamed from: cyr  reason: default package */
/* loaded from: classes5.dex */
public final class cyr {
    public final dzsj<cyd> a;
    public final dzsj<btrm> b;
    public final dzsj<gga> c;
    public final dzsj<cztz> d;
    public final dzsj<cyi> e;
    public final dzsj<cjqy> f;
    public final dzsj<akfa> g;
    public final dzsj<dxio<afha>> h;

    public cyr(dzsj<cyd> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<cztz> dzsjVar4, dzsj<cyi> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<akfa> dzsjVar7, dzsj<dxio<afha>> dzsjVar8) {
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
