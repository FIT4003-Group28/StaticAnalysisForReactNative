package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: beoh  reason: default package */
/* loaded from: classes3.dex */
public final class beoh {
    public final dzsj<ff> a;
    public final dzsj<apnm> b;
    public final dzsj<cqhn> c;
    public final dzsj<bgyj> d;
    public final dzsj<beib> e;
    public final dzsj<beov> f;
    public final dzsj<cjqy> g;
    public final dzsj<Executor> h;

    public beoh(dzsj<ff> dzsjVar, dzsj<apnm> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<bgyj> dzsjVar4, dzsj<beib> dzsjVar5, dzsj<beov> dzsjVar6, dzsj<cjqy> dzsjVar7, dzsj<Executor> dzsjVar8) {
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
