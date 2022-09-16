package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lzj  reason: default package */
/* loaded from: classes7.dex */
public final class lzj implements atwp {
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

    public lzj(dzsj<btrm> dzsjVar, dzsj<cref> dzsjVar2, dzsj<Context> dzsjVar3, dzsj<atcu> dzsjVar4, dzsj<cqat> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<cjqq> dzsjVar7, dzsj<dehq> dzsjVar8, dzsj<Executor> dzsjVar9, dzsj<atsr> dzsjVar10, dzsj<Boolean> dzsjVar11, dzsj<btvo> dzsjVar12) {
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
    public final /* bridge */ /* synthetic */ atwo a(crrf crrfVar) {
        b(crrfVar, 1);
        btrm btrmVar = (btrm) ((dczw) this.a).a;
        b(btrmVar, 2);
        cref a = this.b.a();
        b(a, 3);
        Context context = (Context) ((dczw) this.c).a;
        b(context, 4);
        atcu atcuVar = (atcu) ((dczw) this.d).a;
        b(atcuVar, 5);
        cqat cqatVar = (cqat) ((dczw) this.e).a;
        b(cqatVar, 6);
        cjqy cjqyVar = (cjqy) ((dczw) this.f).a;
        b(cjqyVar, 7);
        cjqq cjqqVar = (cjqq) ((dczw) this.g).a;
        b(cjqqVar, 8);
        dehq dehqVar = (dehq) ((dczw) this.h).a;
        b(dehqVar, 9);
        Executor executor = (Executor) ((dczw) this.i).a;
        b(executor, 10);
        atsr atsrVar = (atsr) ((dczw) this.j).a;
        b(atsrVar, 11);
        Boolean bool = (Boolean) ((dczw) this.k).a;
        b(bool, 12);
        boolean booleanValue = bool.booleanValue();
        btvo btvoVar = (btvo) ((dczw) this.l).a;
        b(btvoVar, 13);
        return new lzi(crrfVar, btrmVar, a, context, atcuVar, cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, booleanValue, btvoVar);
    }
}
