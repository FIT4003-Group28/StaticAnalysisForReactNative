package defpackage;
/* compiled from: PG */
/* renamed from: bpdr  reason: default package */
/* loaded from: classes3.dex */
public final class bpdr {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<bpdn> c;
    public final dzsj<booa> d;
    public final dzsj<bnyd> e;
    public final dzsj<bpto> f;
    public final dzsj<bptg> g;
    public final dzsj<bpsw> h;

    public bpdr(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bpdn> dzsjVar3, dzsj<booa> dzsjVar4, dzsj<bnyd> dzsjVar5, dzsj<bpto> dzsjVar6, dzsj<bptg> dzsjVar7, dzsj<bpsw> dzsjVar8) {
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
