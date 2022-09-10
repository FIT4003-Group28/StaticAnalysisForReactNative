package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: beoy  reason: default package */
/* loaded from: classes3.dex */
public final class beoy {
    public final dzsj<ff> a;
    public final dzsj<cqhn> b;
    public final dzsj<bgyb> c;
    public final dzsj<beot> d;
    public final dzsj<beoh> e;
    public final dzsj<bepv> f;
    public final dzsj<beid> g;
    public final dzsj<Executor> h;

    public beoy(dzsj<ff> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bgyb> dzsjVar3, dzsj<beot> dzsjVar4, dzsj<beoh> dzsjVar5, dzsj<bepv> dzsjVar6, dzsj<beid> dzsjVar7, dzsj<Executor> dzsjVar8) {
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
