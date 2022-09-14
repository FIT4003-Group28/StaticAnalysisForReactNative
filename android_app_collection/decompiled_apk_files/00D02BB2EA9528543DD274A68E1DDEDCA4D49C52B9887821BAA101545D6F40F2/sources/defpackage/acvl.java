package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: acvl  reason: default package */
/* loaded from: classes2.dex */
public final class acvl {
    public final dzsj<Activity> a;
    public final dzsj<cqat> b;
    public final dzsj<boxa> c;
    public final dzsj<bhat> d;
    public final dzsj<bgvx> e;

    public acvl(dzsj<Activity> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<boxa> dzsjVar3, dzsj<bhat> dzsjVar4, dzsj<bgvx> dzsjVar5) {
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
