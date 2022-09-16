package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atvj  reason: default package */
/* loaded from: classes2.dex */
public final class atvj {
    public final dzsj<Context> a;
    public final dzsj<btrm> b;
    public final dzsj<btvo> c;
    public final dzsj<cref> d;
    public final dzsj<cqat> e;
    public final dzsj<cjqy> f;
    public final dzsj<cjqq> g;
    public final dzsj<dehq> h;
    public final dzsj<Executor> i;
    public final dzsj<atsr> j;
    public final dzsj<Boolean> k;

    public atvj(dzsj<Context> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<cref> dzsjVar4, dzsj<cqat> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<cjqq> dzsjVar7, dzsj<dehq> dzsjVar8, dzsj<Executor> dzsjVar9, dzsj<atsr> dzsjVar10, dzsj<Boolean> dzsjVar11) {
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
