package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atsy  reason: default package */
/* loaded from: classes2.dex */
public final class atsy {
    public final dzsj<dbsg<asmp>> a;
    public final dzsj<btrm> b;
    public final dzsj<cref> c;
    public final dzsj<pfk> d;
    public final dzsj<brlz> e;
    public final dzsj<cqat> f;
    public final dzsj<Context> g;
    public final dzsj<btvo> h;
    public final dzsj<cjqy> i;
    public final dzsj<cjqq> j;
    public final dzsj<jzv> k;
    public final dzsj<dehq> l;
    public final dzsj<Executor> m;
    public final dzsj<atsr> n;
    public final dzsj<vtn> o;
    public final dzsj<Boolean> p;

    public atsy(dzsj<dbsg<asmp>> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<cref> dzsjVar3, dzsj<pfk> dzsjVar4, dzsj<brlz> dzsjVar5, dzsj<cqat> dzsjVar6, dzsj<Context> dzsjVar7, dzsj<btvo> dzsjVar8, dzsj<cjqy> dzsjVar9, dzsj<cjqq> dzsjVar10, dzsj<jzv> dzsjVar11, dzsj<dehq> dzsjVar12, dzsj<Executor> dzsjVar13, dzsj<atsr> dzsjVar14, dzsj<vtn> dzsjVar15, dzsj<Boolean> dzsjVar16) {
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
        a(dzsjVar15, 15);
        this.o = dzsjVar15;
        a(dzsjVar16, 16);
        this.p = dzsjVar16;
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
