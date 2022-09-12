package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bjxq  reason: default package */
/* loaded from: classes3.dex */
public final class bjxq {
    private final dzsj<gga> a;
    private final dzsj<bjgu> b;
    private final dzsj<bjxt> c;
    private final dzsj<bvez> d;
    private final dzsj<btrm> e;
    private final dzsj<bjgi> f;
    private final dzsj<Executor> g;
    private final dzsj<jlp> h;

    public bjxq(dzsj<gga> dzsjVar, dzsj<bjgu> dzsjVar2, dzsj<bjxt> dzsjVar3, dzsj<bvez> dzsjVar4, dzsj<btrm> dzsjVar5, dzsj<bjgi> dzsjVar6, dzsj<Executor> dzsjVar7, dzsj<jlp> dzsjVar8) {
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

    public final bjxp a(bwrs<ilo> bwrsVar, djao djaoVar, boolean z) {
        gga a = this.a.a();
        b(a, 1);
        b(this.b.a(), 2);
        bjxt a2 = this.c.a();
        b(a2, 3);
        bvez a3 = this.d.a();
        b(a3, 4);
        btrm a4 = this.e.a();
        b(a4, 5);
        bjgi a5 = this.f.a();
        b(a5, 6);
        Executor a6 = this.g.a();
        b(a6, 7);
        jlp a7 = this.h.a();
        b(a7, 8);
        b(bwrsVar, 9);
        b(djaoVar, 10);
        return new bjxp(a, a2, a3, a4, a5, a6, a7, bwrsVar, djaoVar, z);
    }
}
