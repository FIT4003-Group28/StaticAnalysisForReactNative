package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ygu  reason: default package */
/* loaded from: classes7.dex */
public class ygu {
    public final dzsj<Activity> a;
    public final dzsj<cqat> b;
    public final dzsj<xiy> c;
    public final dzsj<xhx> d;
    public final dzsj<cqhn> e;
    public final dzsj<xaz> f;

    public ygu(dzsj<Activity> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<xiy> dzsjVar3, dzsj<xhx> dzsjVar4, dzsj<cqhn> dzsjVar5, dzsj<xaz> dzsjVar6) {
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
