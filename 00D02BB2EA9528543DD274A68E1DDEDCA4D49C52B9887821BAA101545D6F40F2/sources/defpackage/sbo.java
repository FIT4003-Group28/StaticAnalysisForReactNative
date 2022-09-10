package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: sbo  reason: default package */
/* loaded from: classes7.dex */
public final class sbo {
    public final dzsj<Application> a;
    public final dzsj<sfd> b;
    public final dzsj<qjk> c;
    public final dzsj<cqhn> d;
    public final dzsj<sbm> e;
    public final dzsj<sev> f;
    public final dzsj<sei> g;
    public final dzsj<dehq> h;
    public final dzsj<cpv> i;

    public sbo(dzsj<Application> dzsjVar, dzsj<sfd> dzsjVar2, dzsj<qjk> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<sbm> dzsjVar5, dzsj<sev> dzsjVar6, dzsj<sei> dzsjVar7, dzsj<dehq> dzsjVar8, dzsj<cpv> dzsjVar9) {
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
