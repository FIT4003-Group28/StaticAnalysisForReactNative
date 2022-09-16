package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: mgx  reason: default package */
/* loaded from: classes7.dex */
public final class mgx {
    public final dzsj<cjqy> a;
    public final dzsj<cjqq> b;
    public final dzsj<axxb> c;
    public final dzsj<axwi> d;
    public final dzsj<cqhn> e;
    public final dzsj<Executor> f;
    public final dzsj<Executor> g;
    public final dzsj<ckcw> h;
    public final dzsj<btrm> i;

    public mgx(dzsj<cjqy> dzsjVar, dzsj<cjqq> dzsjVar2, dzsj<axxb> dzsjVar3, dzsj<axwi> dzsjVar4, dzsj<cqhn> dzsjVar5, dzsj<Executor> dzsjVar6, dzsj<Executor> dzsjVar7, dzsj<ckcw> dzsjVar8, dzsj<btrm> dzsjVar9) {
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
