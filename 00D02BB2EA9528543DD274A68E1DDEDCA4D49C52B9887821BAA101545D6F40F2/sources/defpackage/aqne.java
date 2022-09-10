package defpackage;
/* compiled from: PG */
/* renamed from: aqne  reason: default package */
/* loaded from: classes2.dex */
public final class aqne {
    public final dzsj<cqhn> a;
    public final dzsj<cqhu> b;
    public final dzsj<ckcw> c;
    public final dzsj<apyv> d;
    public final dzsj<ckmm> e;
    public final dzsj<aqhw> f;
    public final dzsj<aqhv> g;
    public final dzsj<aqoi> h;
    public final dzsj<aqnj> i;
    public final dzsj<apyx> j;
    public final dzsj<dxio<aqme>> k;

    public aqne(dzsj<cqhn> dzsjVar, dzsj<cqhu> dzsjVar2, dzsj<ckcw> dzsjVar3, dzsj<apyv> dzsjVar4, dzsj<ckmm> dzsjVar5, dzsj<aqhw> dzsjVar6, dzsj<aqhv> dzsjVar7, dzsj<aqoi> dzsjVar8, dzsj<aqnj> dzsjVar9, dzsj<apyx> dzsjVar10, dzsj<dxio<aqme>> dzsjVar11) {
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
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
        a(dzsjVar11, 11);
        this.k = dzsjVar11;
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
