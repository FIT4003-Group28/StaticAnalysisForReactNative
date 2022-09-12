package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aedr  reason: default package */
/* loaded from: classes.dex */
public final class aedr {
    public final dzsj<dxio<akfa>> a;
    public final dzsj<afzu> b;
    public final dzsj<dxio<apyz>> c;
    public final dzsj<auql> d;
    public final dzsj<auom> e;
    public final dzsj<Executor> f;
    public final dzsj<Executor> g;

    public aedr(dzsj<dxio<akfa>> dzsjVar, dzsj<afzu> dzsjVar2, dzsj<dxio<apyz>> dzsjVar3, dzsj<auql> dzsjVar4, dzsj<auom> dzsjVar5, dzsj<Executor> dzsjVar6, dzsj<Executor> dzsjVar7) {
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
