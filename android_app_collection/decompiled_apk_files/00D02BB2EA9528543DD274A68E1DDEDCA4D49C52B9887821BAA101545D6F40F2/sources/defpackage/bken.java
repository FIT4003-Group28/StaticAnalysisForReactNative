package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bken  reason: default package */
/* loaded from: classes3.dex */
public class bken {
    public final dzsj<gga> a;
    public final dzsj<busu> b;
    public final dzsj<Executor> c;
    public final dzsj<bkdc> d;
    public final dzsj<jkf> e;
    public final dzsj<cqhu> f;
    public final dzsj<cqhn> g;
    public final dzsj<cjqy> h;

    public bken(dzsj<gga> dzsjVar, dzsj<busu> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<bkdc> dzsjVar4, dzsj<jkf> dzsjVar5, dzsj<cqhu> dzsjVar6, dzsj<cqhn> dzsjVar7, dzsj<cjqy> dzsjVar8) {
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
