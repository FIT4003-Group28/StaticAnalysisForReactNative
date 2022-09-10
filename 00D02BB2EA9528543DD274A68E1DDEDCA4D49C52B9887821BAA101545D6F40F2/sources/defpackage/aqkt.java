package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqkt  reason: default package */
/* loaded from: classes2.dex */
public final class aqkt {
    private final dzsj<cqhn> a;
    private final dzsj<bvjj> b;
    private final dzsj<dxio<aqkm>> c;
    private final dzsj<dxio<aqkn>> d;
    private final dzsj<dxio<aqkk>> e;
    private final dzsj<apyu> f;
    private final dzsj<aqko> g;
    private final dzsj<aqrp> h;
    private final dzsj<Executor> i;
    private final dzsj<apzy> j;

    public aqkt(dzsj<cqhn> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<dxio<aqkm>> dzsjVar3, dzsj<dxio<aqkn>> dzsjVar4, dzsj<dxio<aqkk>> dzsjVar5, dzsj<apyu> dzsjVar6, dzsj<aqko> dzsjVar7, dzsj<aqrp> dzsjVar8, dzsj<Executor> dzsjVar9, dzsj<apzy> dzsjVar10) {
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
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
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

    public final aqks a(btlu btluVar, String str) {
        cqhn a = this.a.a();
        b(a, 1);
        bvjj a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 5);
        apyu a6 = this.f.a();
        b(a6, 6);
        aqko a7 = this.g.a();
        b(a7, 7);
        aqrp a8 = this.h.a();
        b(a8, 8);
        Executor a9 = this.i.a();
        b(a9, 9);
        apzy a10 = this.j.a();
        b(a10, 10);
        b(btluVar, 11);
        b(str, 12);
        return new aqks(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, btluVar, str);
    }
}
