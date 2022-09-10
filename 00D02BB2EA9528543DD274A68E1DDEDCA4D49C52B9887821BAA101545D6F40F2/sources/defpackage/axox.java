package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axox  reason: default package */
/* loaded from: classes3.dex */
public final class axox {
    public final dzsj<gga> a;
    public final dzsj<bsvn> b;
    public final dzsj<bvjj> c;
    public final dzsj<akfa> d;
    public final dzsj<cjqy> e;
    public final dzsj<cqhn> f;
    public final dzsj<Executor> g;
    public final dzsj<cqat> h;
    public final dzsj<axoi> i;

    public axox(dzsj<gga> dzsjVar, dzsj<bsvn> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<akfa> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<cqhn> dzsjVar6, dzsj<Executor> dzsjVar7, dzsj<cqat> dzsjVar8, dzsj<axoi> dzsjVar9) {
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
