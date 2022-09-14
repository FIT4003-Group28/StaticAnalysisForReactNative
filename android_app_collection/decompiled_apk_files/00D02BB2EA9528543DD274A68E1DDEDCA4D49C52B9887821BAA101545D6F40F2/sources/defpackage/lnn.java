package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: lnn  reason: default package */
/* loaded from: classes7.dex */
public final class lnn {
    public final dzsj<Context> a;
    public final dzsj<btrm> b;
    public final dzsj<btpc> c;
    public final dzsj<ckcw> d;
    public final dzsj<amfi> e;
    public final dzsj<akfa> f;
    public final dzsj<ahvo> g;

    public lnn(dzsj<Context> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<btpc> dzsjVar3, dzsj<ckcw> dzsjVar4, dzsj<amfi> dzsjVar5, dzsj<akfa> dzsjVar6, dzsj<ahvo> dzsjVar7) {
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
