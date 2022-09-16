package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cewk  reason: default package */
/* loaded from: classes4.dex */
public final class cewk {
    public final dzsj<Activity> a;
    public final dzsj<akzh> b;
    public final dzsj<ceet> c;
    public final dzsj<bbut> d;
    public final dzsj<cewg> e;
    public final dzsj<cese> f;

    public cewk(dzsj<Activity> dzsjVar, dzsj<akzh> dzsjVar2, dzsj<ceet> dzsjVar3, dzsj<bbut> dzsjVar4, dzsj<cewg> dzsjVar5, dzsj<cese> dzsjVar6) {
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
