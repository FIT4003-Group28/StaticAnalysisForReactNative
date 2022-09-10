package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqit  reason: default package */
/* loaded from: classes2.dex */
public class aqit {
    public final dzsj<cqhn> a;
    public final dzsj<aqhu> b;
    public final dzsj<aqki> c;
    public final dzsj<aqkc> d;
    public final dzsj<aqeh> e;
    public final dzsj<aqgn> f;
    public final dzsj<aqjh> g;
    public final dzsj<dxio<aqov>> h;
    public final dzsj<dxio<apyz>> i;
    public final dzsj<dxio<akfa>> j;
    public final dzsj<Executor> k;

    public aqit(dzsj<cqhn> dzsjVar, dzsj<aqhu> dzsjVar2, dzsj<aqki> dzsjVar3, dzsj<aqkc> dzsjVar4, dzsj<aqeh> dzsjVar5, dzsj<aqgn> dzsjVar6, dzsj<aqjh> dzsjVar7, dzsj<dxio<aqov>> dzsjVar8, dzsj<dxio<apyz>> dzsjVar9, dzsj<dxio<akfa>> dzsjVar10, dzsj<Executor> dzsjVar11) {
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
