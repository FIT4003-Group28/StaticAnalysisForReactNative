package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: dsk  reason: default package */
/* loaded from: classes6.dex */
public final class dsk {
    public final dzsj<Activity> a;
    public final dzsj<cqat> b;
    public final dzsj<akox> c;
    public final dzsj<dgc> d;
    public final dzsj<btrm> e;
    public final dzsj<araj> f;

    public dsk(dzsj<Activity> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<akox> dzsjVar3, dzsj<dgc> dzsjVar4, dzsj<btrm> dzsjVar5, dzsj<araj> dzsjVar6) {
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
