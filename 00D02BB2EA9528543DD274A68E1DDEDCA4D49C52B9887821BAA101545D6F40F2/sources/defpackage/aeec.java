package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aeec  reason: default package */
/* loaded from: classes.dex */
public final class aeec {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<acyr> c;
    public final dzsj<iwl> d;
    public final dzsj<cjqy> e;
    public final dzsj<cjqq> f;
    public final dzsj<acyp> g;
    public final dzsj<qbv> h;
    public final dzsj<bzmc> i;

    public aeec(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<acyr> dzsjVar3, dzsj<iwl> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<cjqq> dzsjVar6, dzsj<acyp> dzsjVar7, dzsj<qbv> dzsjVar8, dzsj<bzmc> dzsjVar9) {
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
