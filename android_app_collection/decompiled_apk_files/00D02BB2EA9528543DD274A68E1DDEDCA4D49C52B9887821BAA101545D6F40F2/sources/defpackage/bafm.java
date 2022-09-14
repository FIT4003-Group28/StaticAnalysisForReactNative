package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bafm  reason: default package */
/* loaded from: classes3.dex */
public final class bafm {
    public final dzsj<cqhn> a;
    public final dzsj<Executor> b;
    public final dzsj<beya> c;
    public final dzsj<bbaa> d;
    public final dzsj<gga> e;
    public final dzsj<bafk> f;

    public bafm(dzsj<cqhn> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<beya> dzsjVar3, dzsj<bbaa> dzsjVar4, dzsj<gga> dzsjVar5, dzsj<bafk> dzsjVar6) {
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
