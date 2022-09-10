package defpackage;
/* compiled from: PG */
/* renamed from: ahcd  reason: default package */
/* loaded from: classes2.dex */
public class ahcd {
    public final dzsj<cqhn> a;
    public final dzsj<ahbk> b;
    public final dzsj<agwa> c;
    public final dzsj<ahcs> d;
    public final dzsj<gga> e;
    public final dzsj<dxio<anhg>> f;
    public final dzsj<afzs> g;
    public final dzsj<bvrb> h;

    public ahcd(dzsj<cqhn> dzsjVar, dzsj<ahbk> dzsjVar2, dzsj<agwa> dzsjVar3, dzsj<ahcs> dzsjVar4, dzsj<gga> dzsjVar5, dzsj<dxio<anhg>> dzsjVar6, dzsj<afzs> dzsjVar7, dzsj<bvrb> dzsjVar8) {
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
