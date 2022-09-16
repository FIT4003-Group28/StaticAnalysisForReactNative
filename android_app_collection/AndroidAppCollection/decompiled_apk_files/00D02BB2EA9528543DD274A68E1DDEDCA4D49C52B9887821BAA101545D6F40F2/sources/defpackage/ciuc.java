package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ciuc  reason: default package */
/* loaded from: classes4.dex */
public final class ciuc {
    public final dzsj<Executor> a;
    public final dzsj<citl> b;
    public final dzsj<caxn> c;
    public final dzsj<cish> d;
    public final dzsj<chsf> e;
    public final dzsj<btvo> f;
    public final dzsj<bvpe> g;

    public ciuc(dzsj<Executor> dzsjVar, dzsj<citl> dzsjVar2, dzsj<caxn> dzsjVar3, dzsj<cish> dzsjVar4, dzsj<chsf> dzsjVar5, dzsj<btvo> dzsjVar6, dzsj<bvpe> dzsjVar7) {
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
