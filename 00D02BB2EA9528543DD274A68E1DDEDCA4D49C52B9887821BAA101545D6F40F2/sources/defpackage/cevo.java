package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cevo  reason: default package */
/* loaded from: classes4.dex */
public final class cevo {
    public final dzsj<Activity> a;
    public final dzsj<btrm> b;
    public final dzsj<cqhn> c;
    public final dzsj<cefb> d;
    public final dzsj<ceuo> e;
    public final dzsj<nvh> f;

    public cevo(dzsj<Activity> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<cefb> dzsjVar4, dzsj<ceuo> dzsjVar5, dzsj<nvh> dzsjVar6) {
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
