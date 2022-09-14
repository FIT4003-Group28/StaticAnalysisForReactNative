package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bsnk  reason: default package */
/* loaded from: classes4.dex */
public final class bsnk {
    public final dzsj<Activity> a;
    public final dzsj<cqhu> b;
    public final dzsj<cklq> c;
    public final dzsj<ckmp> d;
    public final dzsj<ckml> e;
    public final dzsj<brpm> f;
    public final dzsj<brlk> g;

    public bsnk(dzsj<Activity> dzsjVar, dzsj<cqhu> dzsjVar2, dzsj<cklq> dzsjVar3, dzsj<ckmp> dzsjVar4, dzsj<ckml> dzsjVar5, dzsj<brpm> dzsjVar6, dzsj<brlk> dzsjVar7) {
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
