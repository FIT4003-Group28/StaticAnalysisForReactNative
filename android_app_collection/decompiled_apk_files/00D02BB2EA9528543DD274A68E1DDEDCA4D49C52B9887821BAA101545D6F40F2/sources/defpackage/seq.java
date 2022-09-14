package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: seq  reason: default package */
/* loaded from: classes7.dex */
public final class seq {
    public final dzsj<Application> a;
    public final dzsj<cqhn> b;
    public final dzsj<qjk> c;
    public final dzsj<sfd> d;
    public final dzsj<sev> e;
    public final dzsj<sei> f;
    public final dzsj<dehq> g;
    public final dzsj<cpv> h;

    public seq(dzsj<Application> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<qjk> dzsjVar3, dzsj<sfd> dzsjVar4, dzsj<sev> dzsjVar5, dzsj<sei> dzsjVar6, dzsj<dehq> dzsjVar7, dzsj<cpv> dzsjVar8) {
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
