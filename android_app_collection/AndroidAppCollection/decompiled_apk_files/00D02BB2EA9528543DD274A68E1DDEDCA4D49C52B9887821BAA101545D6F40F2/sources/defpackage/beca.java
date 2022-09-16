package defpackage;
/* compiled from: PG */
/* renamed from: beca  reason: default package */
/* loaded from: classes3.dex */
public class beca {
    public final dzsj<dxio<akfa>> a;
    public final dzsj<dxio<apyz>> b;
    public final dzsj<becb> c;
    public final dzsj<bebr> d;
    public final dzsj<btvo> e;
    public final dzsj<beam> f;
    public final dzsj<bebo> g;
    public final dzsj<bkgz> h;
    public final dzsj<bkgy> i;

    public beca(dzsj<dxio<akfa>> dzsjVar, dzsj<dxio<apyz>> dzsjVar2, dzsj<becb> dzsjVar3, dzsj<bebr> dzsjVar4, dzsj<btvo> dzsjVar5, dzsj<beam> dzsjVar6, dzsj<bebo> dzsjVar7, dzsj<bkgz> dzsjVar8, dzsj<bkgy> dzsjVar9) {
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
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
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
