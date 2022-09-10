package defpackage;
/* compiled from: PG */
/* renamed from: baez  reason: default package */
/* loaded from: classes3.dex */
public final class baez {
    public final dzsj<gga> a;
    public final dzsj<bwqv> b;
    public final dzsj<aymh> c;
    public final dzsj<dxio<axwy>> d;
    public final dzsj<dxio<anhg>> e;
    public final dzsj<ania> f;
    public final dzsj<batz> g;

    public baez(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<aymh> dzsjVar3, dzsj<dxio<axwy>> dzsjVar4, dzsj<dxio<anhg>> dzsjVar5, dzsj<ania> dzsjVar6, dzsj<batz> dzsjVar7) {
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
