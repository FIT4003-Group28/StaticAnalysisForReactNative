package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ppu  reason: default package */
/* loaded from: classes7.dex */
public final class ppu {
    public final dzsj<gga> a;
    public final dzsj<Executor> b;
    public final dzsj<pnq> c;
    public final dzsj<bvjj> d;
    public final dzsj<araj> e;
    public final dzsj<pot> f;

    public ppu(dzsj<gga> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<pnq> dzsjVar3, dzsj<bvjj> dzsjVar4, dzsj<araj> dzsjVar5, dzsj<pot> dzsjVar6) {
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
