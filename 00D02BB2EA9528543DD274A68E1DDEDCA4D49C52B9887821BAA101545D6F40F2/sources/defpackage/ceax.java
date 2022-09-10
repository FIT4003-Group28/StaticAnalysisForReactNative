package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ceax  reason: default package */
/* loaded from: classes4.dex */
public final class ceax {
    public final dzsj<bbul> a;
    public final dzsj<akfc> b;
    public final dzsj<bbtk> c;
    public final dzsj<btrm> d;
    public final dzsj<bulj> e;
    public final dzsj<buzx> f;
    public final dzsj<Executor> g;

    public ceax(dzsj<bbul> dzsjVar, dzsj<akfc> dzsjVar2, dzsj<bbtk> dzsjVar3, dzsj<btrm> dzsjVar4, dzsj<bulj> dzsjVar5, dzsj<buzx> dzsjVar6, dzsj<Executor> dzsjVar7) {
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
