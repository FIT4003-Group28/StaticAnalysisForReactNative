package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atwq  reason: default package */
/* loaded from: classes2.dex */
public final class atwq implements atwp {
    private final dzsj<btrm> a;
    private final dzsj<cref> b;
    private final dzsj<Context> c;
    private final dzsj<atcu> d;
    private final dzsj<cqat> e;
    private final dzsj<cjqy> f;
    private final dzsj<cjqq> g;
    private final dzsj<dehq> h;
    private final dzsj<Executor> i;
    private final dzsj<atsr> j;
    private final dzsj<Boolean> k;
    private final dzsj<btvo> l;

    public atwq(dzsj<btrm> dzsjVar, dzsj<cref> dzsjVar2, dzsj<Context> dzsjVar3, dzsj<atcu> dzsjVar4, dzsj<cqat> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<cjqq> dzsjVar7, dzsj<dehq> dzsjVar8, dzsj<Executor> dzsjVar9, dzsj<atsr> dzsjVar10, dzsj<Boolean> dzsjVar11, dzsj<btvo> dzsjVar12) {
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
        b(dzsjVar11, 11);
        this.k = dzsjVar11;
        b(dzsjVar12, 12);
        this.l = dzsjVar12;
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

    @Override // defpackage.atwp
    public final atwo a(crrf crrfVar) {
        b(crrfVar, 1);
        btrm a = this.a.a();
        b(a, 2);
        cref a2 = this.b.a();
        b(a2, 3);
        Context context = (Context) ((dxjd) this.c).a;
        b(context, 4);
        atcu atcuVar = (atcu) ((dxjd) this.d).a;
        b(atcuVar, 5);
        cqat a3 = this.e.a();
        b(a3, 6);
        cjqy a4 = this.f.a();
        b(a4, 7);
        cjqq a5 = this.g.a();
        b(a5, 8);
        dehq a6 = this.h.a();
        b(a6, 9);
        Executor a7 = this.i.a();
        b(a7, 10);
        atsr a8 = this.j.a();
        b(a8, 11);
        Boolean a9 = this.k.a();
        b(a9, 12);
        boolean booleanValue = a9.booleanValue();
        btvo a10 = this.l.a();
        b(a10, 13);
        return new atwo(crrfVar, a, a2, context, atcuVar, a3, a4, a5, a6, a7, a8, booleanValue, a10);
    }
}
