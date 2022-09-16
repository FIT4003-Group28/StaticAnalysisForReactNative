package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atug  reason: default package */
/* loaded from: classes2.dex */
public final class atug {
    public final dzsj<dbsg<atcw>> a;
    public final dzsj<btrm> b;
    public final dzsj<btvo> c;
    public final dzsj<cref> d;
    public final dzsj<Context> e;
    public final dzsj<cqat> f;
    public final dzsj<cjqy> g;
    public final dzsj<cjqq> h;
    public final dzsj<dehq> i;
    public final dzsj<Executor> j;
    public final dzsj<atsr> k;
    public final dzsj<vtn> l;
    public final dzsj<cqhn> m;
    public final dzsj<Boolean> n;

    public atug(dzsj<dbsg<atcw>> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<cref> dzsjVar4, dzsj<Context> dzsjVar5, dzsj<cqat> dzsjVar6, dzsj<cjqy> dzsjVar7, dzsj<cjqq> dzsjVar8, dzsj<dehq> dzsjVar9, dzsj<Executor> dzsjVar10, dzsj<atsr> dzsjVar11, dzsj<vtn> dzsjVar12, dzsj<cqhn> dzsjVar13, dzsj<Boolean> dzsjVar14) {
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
        a(dzsjVar12, 12);
        this.l = dzsjVar12;
        a(dzsjVar13, 13);
        this.m = dzsjVar13;
        a(dzsjVar14, 14);
        this.n = dzsjVar14;
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
