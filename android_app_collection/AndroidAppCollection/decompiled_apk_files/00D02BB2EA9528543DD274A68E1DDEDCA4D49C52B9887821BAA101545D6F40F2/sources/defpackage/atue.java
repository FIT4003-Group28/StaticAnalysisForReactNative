package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atue  reason: default package */
/* loaded from: classes2.dex */
public final class atue {
    public final dzsj<btrm> a;
    public final dzsj<btvo> b;
    public final dzsj<cref> c;
    public final dzsj<cqat> d;
    public final dzsj<cjqy> e;
    public final dzsj<cjqq> f;
    public final dzsj<dehq> g;
    public final dzsj<Executor> h;
    public final dzsj<atsr> i;
    public final dzsj<Context> j;
    public final dzsj<Boolean> k;

    public atue(dzsj<btrm> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<cref> dzsjVar3, dzsj<cqat> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<cjqq> dzsjVar6, dzsj<dehq> dzsjVar7, dzsj<Executor> dzsjVar8, dzsj<atsr> dzsjVar9, dzsj<Context> dzsjVar10, dzsj<Boolean> dzsjVar11) {
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
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
        a(dzsjVar11, 11);
        this.k = dzsjVar11;
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
