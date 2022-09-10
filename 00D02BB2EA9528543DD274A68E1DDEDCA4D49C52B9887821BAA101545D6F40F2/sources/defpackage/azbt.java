package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: azbt  reason: default package */
/* loaded from: classes3.dex */
public final class azbt {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<axwi> c;
    public final dzsj<aydu> d;
    public final dzsj<ayay> e;
    public final dzsj<Executor> f;
    public final dzsj<Executor> g;
    public final dzsj<cjqy> h;

    public azbt(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<axwi> dzsjVar3, dzsj<aydu> dzsjVar4, dzsj<ayay> dzsjVar5, dzsj<Executor> dzsjVar6, dzsj<Executor> dzsjVar7, dzsj<cjqy> dzsjVar8) {
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
