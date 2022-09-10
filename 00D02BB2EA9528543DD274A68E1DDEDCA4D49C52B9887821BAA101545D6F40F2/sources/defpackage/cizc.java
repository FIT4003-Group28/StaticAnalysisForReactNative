package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cizc  reason: default package */
/* loaded from: classes4.dex */
public class cizc {
    public final dzsj<Executor> a;
    public final dzsj<cqhn> b;
    public final dzsj<cqhu> c;
    public final dzsj<cchz> d;
    public final dzsj<amfi> e;
    public final dzsj<jlp> f;
    public final dzsj<gce> g;

    public cizc(dzsj<Executor> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cqhu> dzsjVar3, dzsj<cchz> dzsjVar4, dzsj<amfi> dzsjVar5, dzsj<jlp> dzsjVar6, dzsj<gce> dzsjVar7) {
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
