package defpackage;
/* compiled from: PG */
/* renamed from: ahco  reason: default package */
/* loaded from: classes2.dex */
public final class ahco {
    public final dzsj<cqhn> a;
    public final dzsj<agwa> b;
    public final dzsj<gdc> c;
    public final dzsj<gga> d;
    public final dzsj<isd> e;
    public final dzsj<afzv> f;
    public final dzsj<bvrb> g;

    public ahco(dzsj<cqhn> dzsjVar, dzsj<agwa> dzsjVar2, dzsj<gdc> dzsjVar3, dzsj<gga> dzsjVar4, dzsj<isd> dzsjVar5, dzsj<afzv> dzsjVar6, dzsj<bvrb> dzsjVar7) {
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
