package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cwwp  reason: default package */
/* loaded from: classes5.dex */
public final class cwwp {
    private final dzsj<cwwl> a;
    private final dzsj<cwwt> b;
    private final dzsj<cwuc> c;
    private final dzsj<cxfc> d;

    public cwwp(dzsj<cwwl> dzsjVar, dzsj<cwwt> dzsjVar2, dzsj<cwuc> dzsjVar3, dzsj<cxfc> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final cwwo a(Executor executor, dxio<? extends cwuw> dxioVar, dzsj<cxfg> dzsjVar) {
        cwwl a = this.a.a();
        b(a, 1);
        dzsj<cwwt> dzsjVar2 = this.b;
        cwuc a2 = this.c.a();
        b(a2, 3);
        cxfc a3 = this.d.a();
        b(a3, 4);
        b(executor, 5);
        b(dxioVar, 6);
        return new cwwo(a, dzsjVar2, a2, a3, executor, dxioVar, dzsjVar);
    }
}
