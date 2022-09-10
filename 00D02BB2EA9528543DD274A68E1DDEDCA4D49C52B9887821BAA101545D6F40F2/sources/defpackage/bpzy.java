package defpackage;
/* compiled from: PG */
/* renamed from: bpzy  reason: default package */
/* loaded from: classes4.dex */
public final class bpzy {
    public final dzsj<boxa> a;
    public final dzsj<bpyh> b;
    public final dzsj<bnyd> c;
    public final dzsj<ff> d;
    public final dzsj<jmx> e;
    public final dzsj<cqhn> f;
    public final dzsj<eeu> g;
    public final dzsj<bpto> h;
    public final dzsj<acwo> i;
    public final dzsj<bvrb> j;
    public final dzsj<booa> k;

    public bpzy(dzsj<boxa> dzsjVar, dzsj<bpyh> dzsjVar2, dzsj<bnyd> dzsjVar3, dzsj<ff> dzsjVar4, dzsj<jmx> dzsjVar5, dzsj<cqhn> dzsjVar6, dzsj<eeu> dzsjVar7, dzsj<bpto> dzsjVar8, dzsj<acwo> dzsjVar9, dzsj<bvrb> dzsjVar10, dzsj<booa> dzsjVar11) {
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
