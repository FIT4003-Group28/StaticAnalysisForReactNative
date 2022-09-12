package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bagp  reason: default package */
/* loaded from: classes3.dex */
public final class bagp {
    public final dzsj<cqhn> a;
    public final dzsj<btpc> b;
    public final dzsj<Executor> c;
    public final dzsj<gga> d;
    public final dzsj<bbai> e;
    public final dzsj<bvbi> f;

    public bagp(dzsj<cqhn> dzsjVar, dzsj<btpc> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<gga> dzsjVar4, dzsj<bbai> dzsjVar5, dzsj<bvbi> dzsjVar6) {
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
