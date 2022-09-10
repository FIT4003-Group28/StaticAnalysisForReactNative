package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: nav  reason: default package */
/* loaded from: classes7.dex */
public final class nav {
    public final dzsj<btvo> a;
    public final dzsj<jzp> b;
    public final dzsj<btrm> c;
    public final dzsj<bvsl> d;
    public final dzsj<cjqy> e;
    public final dzsj<cjqq> f;
    public final dzsj<Executor> g;

    public nav(dzsj<btvo> dzsjVar, dzsj<jzp> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<bvsl> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<cjqq> dzsjVar6, dzsj<Executor> dzsjVar7) {
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
