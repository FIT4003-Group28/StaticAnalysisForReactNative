package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: shi  reason: default package */
/* loaded from: classes7.dex */
public final class shi {
    public final dzsj<Application> a;
    public final dzsj<qjk> b;
    public final dzsj<sbz> c;
    public final dzsj<roq> d;
    public final dzsj<cqhn> e;
    public final dzsj<shk> f;
    public final dzsj<sfd> g;
    public final dzsj<rot> h;
    public final dzsj<btvo> i;

    public shi(dzsj<Application> dzsjVar, dzsj<qjk> dzsjVar2, dzsj<sbz> dzsjVar3, dzsj<roq> dzsjVar4, dzsj<cqhn> dzsjVar5, dzsj<shk> dzsjVar6, dzsj<sfd> dzsjVar7, dzsj<rot> dzsjVar8, dzsj<btvo> dzsjVar9) {
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
