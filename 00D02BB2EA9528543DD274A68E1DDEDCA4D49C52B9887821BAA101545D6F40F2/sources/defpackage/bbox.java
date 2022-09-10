package defpackage;
/* compiled from: PG */
/* renamed from: bbox  reason: default package */
/* loaded from: classes3.dex */
public final class bbox {
    public final dzsj<gga> a;
    public final dzsj<dxio<bbdv>> b;
    public final dzsj<cqhn> c;
    public final dzsj<bbpm> d;
    public final dzsj<cztz> e;
    public final dzsj<btvo> f;

    public bbox(dzsj<gga> dzsjVar, dzsj<dxio<bbdv>> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<bbpm> dzsjVar4, dzsj<cztz> dzsjVar5, dzsj<btvo> dzsjVar6) {
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
