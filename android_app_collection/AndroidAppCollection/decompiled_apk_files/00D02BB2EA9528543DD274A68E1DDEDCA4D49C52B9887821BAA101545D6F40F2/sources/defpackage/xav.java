package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: xav  reason: default package */
/* loaded from: classes7.dex */
public class xav {
    public final dzsj<Application> a;
    public final dzsj<qbt> b;
    public final dzsj<wvj> c;
    public final dzsj<btvo> d;
    private final dzsj<cqhn> e;
    private final dzsj<xaz> f;

    public xav(dzsj<Application> dzsjVar, dzsj<qbt> dzsjVar2, dzsj<wvj> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<cqhn> dzsjVar5, dzsj<xaz> dzsjVar6) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
    }

    public static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final xau a(wvw wvwVar, djws djwsVar, drhn drhnVar, boolean z) {
        Application a = this.a.a();
        b(a, 1);
        qbt a2 = this.b.a();
        b(a2, 2);
        wvj a3 = this.c.a();
        b(a3, 3);
        btvo a4 = this.d.a();
        b(a4, 4);
        b(wvwVar, 5);
        cqhn a5 = this.e.a();
        b(a5, 6);
        xaz a6 = this.f.a();
        b(a6, 7);
        b(djwsVar, 8);
        b(drhnVar, 9);
        return new xau(a, a2, a3, a4, wvwVar, a5, a6, djwsVar, drhnVar, z);
    }
}
