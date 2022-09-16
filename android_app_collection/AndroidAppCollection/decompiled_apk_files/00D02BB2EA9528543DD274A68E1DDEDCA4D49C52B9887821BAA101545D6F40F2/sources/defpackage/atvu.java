package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atvu  reason: default package */
/* loaded from: classes2.dex */
public final class atvu {
    public final dzsj<btrm> a;
    public final dzsj<btvo> b;
    public final dzsj<cref> c;
    public final dzsj<Context> d;
    public final dzsj<cqat> e;
    public final dzsj<cjqy> f;
    public final dzsj<cjqq> g;
    public final dzsj<vtn> h;
    public final dzsj<dehq> i;
    public final dzsj<Executor> j;
    public final dzsj<atsr> k;
    public final dzsj<crem> l;
    public final dzsj<Boolean> m;

    public atvu(dzsj<btrm> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<cref> dzsjVar3, dzsj<Context> dzsjVar4, dzsj<cqat> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<cjqq> dzsjVar7, dzsj<vtn> dzsjVar8, dzsj<dehq> dzsjVar9, dzsj<Executor> dzsjVar10, dzsj<atsr> dzsjVar11, dzsj<crem> dzsjVar12, dzsj<Boolean> dzsjVar13) {
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
