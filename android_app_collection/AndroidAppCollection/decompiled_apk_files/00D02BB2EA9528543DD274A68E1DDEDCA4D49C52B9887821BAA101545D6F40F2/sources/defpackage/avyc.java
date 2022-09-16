package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avyc  reason: default package */
/* loaded from: classes3.dex */
public final class avyc {
    public final dzsj<fd> a;
    public final dzsj<Executor> b;
    public final dzsj<cjqy> c;
    public final dzsj<cjqq> d;
    public final dzsj<avik> e;
    public final dzsj<away> f;
    public final dzsj<avzm> g;

    public avyc(dzsj<fd> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<cjqq> dzsjVar4, dzsj<avik> dzsjVar5, dzsj<away> dzsjVar6, dzsj<avzm> dzsjVar7) {
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
