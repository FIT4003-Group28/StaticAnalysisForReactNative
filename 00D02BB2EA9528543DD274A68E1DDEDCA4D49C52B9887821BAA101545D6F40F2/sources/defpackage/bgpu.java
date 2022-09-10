package defpackage;
/* compiled from: PG */
/* renamed from: bgpu  reason: default package */
/* loaded from: classes3.dex */
public class bgpu {
    private final dzsj<cqhn> a;
    private final dzsj<bhhf> b;
    private final dzsj<bnjj> c;
    private final dzsj<bgow> d;
    private final dzsj<bgpm> e;
    private final dzsj<bgne> f;
    private final dzsj<apup> g;

    public bgpu(dzsj<cqhn> dzsjVar, dzsj<bhhf> dzsjVar2, dzsj<bnjj> dzsjVar3, dzsj<bgow> dzsjVar4, dzsj<bgpm> dzsjVar5, dzsj<bgne> dzsjVar6, dzsj<apup> dzsjVar7) {
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

    public final bgpt a() {
        cqhn a = this.a.a();
        b(a, 1);
        bhhf a2 = this.b.a();
        b(a2, 2);
        bnjj a3 = this.c.a();
        b(a3, 3);
        bgow a4 = this.d.a();
        b(a4, 4);
        bgpm a5 = this.e.a();
        b(a5, 5);
        bgne a6 = this.f.a();
        b(a6, 6);
        apup a7 = this.g.a();
        b(a7, 7);
        return new bgpt(a, a2, a3, a4, a5, a6, a7);
    }
}
