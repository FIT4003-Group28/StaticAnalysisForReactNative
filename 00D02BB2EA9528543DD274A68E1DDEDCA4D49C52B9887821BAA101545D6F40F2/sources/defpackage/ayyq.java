package defpackage;
/* compiled from: PG */
/* renamed from: ayyq  reason: default package */
/* loaded from: classes3.dex */
public final class ayyq {
    private final dzsj<ayyh> a;
    private final dzsj<bnjv> b;
    private final dzsj<cqhn> c;
    private final dzsj<btrg> d;
    private final dzsj<befw> e;
    private final dzsj<bwqv> f;
    private final dzsj<bvrb> g;

    public ayyq(dzsj<ayyh> dzsjVar, dzsj<bnjv> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<btrg> dzsjVar4, dzsj<befw> dzsjVar5, dzsj<bwqv> dzsjVar6, dzsj<bvrb> dzsjVar7) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* bridge */ /* synthetic */ ayyi a(bvqg bvqgVar, cjtd cjtdVar) {
        ayyh a = this.a.a();
        b(a, 1);
        bnjv a2 = this.b.a();
        b(a2, 2);
        cqhn a3 = this.c.a();
        b(a3, 3);
        btrg a4 = this.d.a();
        b(a4, 4);
        befw a5 = this.e.a();
        b(a5, 5);
        bwqv a6 = this.f.a();
        b(a6, 6);
        bvrb a7 = this.g.a();
        b(a7, 7);
        b(bvqgVar, 8);
        b(cjtdVar, 9);
        return new ayyp(a, a2, a3, a4, a5, a6, a7, bvqgVar, cjtdVar);
    }
}
