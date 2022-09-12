package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: benl  reason: default package */
/* loaded from: classes3.dex */
public final class benl {
    public final dzsj<ff> a;
    public final dzsj<apny> b;
    public final dzsj<cqhn> c;
    public final dzsj<bgyb> d;
    public final dzsj<bepv> e;
    public final dzsj<beid> f;
    public final dzsj<beis> g;
    public final dzsj<beni> h;
    public final dzsj<Executor> i;

    public benl(dzsj<ff> dzsjVar, dzsj<apny> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<bgyb> dzsjVar4, dzsj<bepv> dzsjVar5, dzsj<beid> dzsjVar6, dzsj<beis> dzsjVar7, dzsj<beni> dzsjVar8, dzsj<Executor> dzsjVar9) {
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
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
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
