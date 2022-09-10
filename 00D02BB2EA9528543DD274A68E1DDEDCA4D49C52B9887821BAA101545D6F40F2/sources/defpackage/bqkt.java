package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bqkt  reason: default package */
/* loaded from: classes4.dex */
public class bqkt {
    private final dzsj<bvjj> a;
    private final dzsj<buma> b;
    private final dzsj<buzr> c;
    private final dzsj<bbul> d;
    private final dzsj<bbtk> e;
    private final dzsj<dxio<akfa>> f;
    private final dzsj<Executor> g;

    public bqkt(dzsj<bvjj> dzsjVar, dzsj<buma> dzsjVar2, dzsj<buzr> dzsjVar3, dzsj<bbul> dzsjVar4, dzsj<bbtk> dzsjVar5, dzsj<dxio<akfa>> dzsjVar6, dzsj<Executor> dzsjVar7) {
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

    public final bqks a(ilo iloVar) {
        b(iloVar, 1);
        b(this.a.a(), 2);
        buma a = this.b.a();
        b(a, 3);
        buzr a2 = this.c.a();
        b(a2, 4);
        bbul a3 = this.d.a();
        b(a3, 5);
        bbtk a4 = this.e.a();
        b(a4, 6);
        dxio a5 = ((dxjh) this.f).a();
        b(a5, 7);
        Executor a6 = this.g.a();
        b(a6, 8);
        return new bqks(iloVar, a, a2, a3, a4, a5, a6);
    }
}
