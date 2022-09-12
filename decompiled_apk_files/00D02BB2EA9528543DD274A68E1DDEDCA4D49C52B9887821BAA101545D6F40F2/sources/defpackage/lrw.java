package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lrw  reason: default package */
/* loaded from: classes7.dex */
public final class lrw {
    public final dzsj<bvjj> a;
    public final dzsj<btrm> b;
    public final dzsj<cjqy> c;
    public final dzsj<cjqq> d;
    public final dzsj<dehq> e;
    public final dzsj<Executor> f;
    public final dzsj<myg> g;

    public lrw(dzsj<bvjj> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<cjqq> dzsjVar4, dzsj<dehq> dzsjVar5, dzsj<Executor> dzsjVar6, dzsj<myg> dzsjVar7) {
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
