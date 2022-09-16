package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: apuf  reason: default package */
/* loaded from: classes2.dex */
public final class apuf {
    private final dzsj<gga> a;
    private final dzsj<apup> b;
    private final dzsj<dxio<buui>> c;
    private final dzsj<Executor> d;
    private final dzsj<bhhf> e;
    private final dzsj<bhat> f;
    private final dzsj<bvjj> g;

    public apuf(dzsj<gga> dzsjVar, dzsj<apup> dzsjVar2, dzsj<dxio<buui>> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<bhhf> dzsjVar5, dzsj<bhat> dzsjVar6, dzsj<bvjj> dzsjVar7) {
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

    public final apue a(bwrs<ilo> bwrsVar, int i) {
        gga a = this.a.a();
        b(a, 1);
        apup a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        Executor a4 = this.d.a();
        b(a4, 4);
        bhhf a5 = this.e.a();
        b(a5, 5);
        bhat a6 = this.f.a();
        b(a6, 6);
        bvjj a7 = this.g.a();
        b(a7, 7);
        b(bwrsVar, 8);
        return new apue(a, a2, a3, a4, a5, a6, a7, bwrsVar, i);
    }
}
