package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aqsj  reason: default package */
/* loaded from: classes2.dex */
public final class aqsj {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<auhi> c;
    public final dzsj<apyx> d;
    public final dzsj<auur> e;
    public final dzsj<aqrl> f;
    public final dzsj<aqrp> g;
    public final dzsj<aqcl> h;

    public aqsj(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<auhi> dzsjVar3, dzsj<apyx> dzsjVar4, dzsj<auur> dzsjVar5, dzsj<aqrl> dzsjVar6, dzsj<aqrp> dzsjVar7, dzsj<aqcl> dzsjVar8) {
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
