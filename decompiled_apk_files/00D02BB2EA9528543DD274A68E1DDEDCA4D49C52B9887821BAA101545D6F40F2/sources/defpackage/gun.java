package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gun  reason: default package */
/* loaded from: classes6.dex */
public class gun {
    private final dzsj<Executor> a;
    private final dzsj<cjqy> b;
    private final dzsj<cjqq> c;
    private final dzsj<axrx> d;
    private final dzsj<arag> e;
    private final dzsj<axru> f;

    public gun(dzsj<Executor> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<cjqq> dzsjVar3, dzsj<axrx> dzsjVar4, dzsj<arag> dzsjVar5, dzsj<axru> dzsjVar6) {
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

    public final gum a(ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4, gul gulVar) {
        Executor a = this.a.a();
        b(a, 1);
        cjqy a2 = this.b.a();
        b(a2, 2);
        cjqq a3 = this.c.a();
        b(a3, 3);
        axrx a4 = this.d.a();
        b(a4, 4);
        arag a5 = this.e.a();
        b(a5, 5);
        axru a6 = this.f.a();
        b(a6, 6);
        b(ddhoVar, 7);
        b(ddhoVar2, 8);
        b(ddhoVar3, 9);
        b(ddhoVar4, 10);
        b(gulVar, 11);
        return new gum(a, a2, a3, a4, a5, a6, ddhoVar, ddhoVar2, ddhoVar3, ddhoVar4, gulVar);
    }
}
