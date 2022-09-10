package defpackage;
/* compiled from: PG */
/* renamed from: bbpe  reason: default package */
/* loaded from: classes3.dex */
public final class bbpe {
    public final dzsj<btvo> a;
    public final dzsj<dxio<bsvm>> b;
    public final dzsj<dxio<ache>> c;
    public final dzsj<dxio<bbdv>> d;
    public final dzsj<dxio<bber>> e;
    public final dzsj<cklf> f;
    public final dzsj<cqhn> g;
    public final dzsj<bbol> h;

    public bbpe(dzsj<btvo> dzsjVar, dzsj<dxio<bsvm>> dzsjVar2, dzsj<dxio<ache>> dzsjVar3, dzsj<dxio<bbdv>> dzsjVar4, dzsj<dxio<bber>> dzsjVar5, dzsj<cklf> dzsjVar6, dzsj<cqhn> dzsjVar7, dzsj<bbol> dzsjVar8) {
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
