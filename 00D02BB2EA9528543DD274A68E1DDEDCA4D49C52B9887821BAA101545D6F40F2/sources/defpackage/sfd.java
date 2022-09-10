package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: sfd  reason: default package */
/* loaded from: classes7.dex */
public class sfd {
    private final dzsj<gga> a;
    private final dzsj<eeu> b;
    private final dzsj<rzn> c;
    private final dzsj<sey> d;
    private final dzsj<axwq> e;
    private final dzsj<qjk> f;
    private final dzsj<ckcw> g;
    private final dzsj<Application> h;
    private final dzsj<sey> i;

    public sfd(dzsj<gga> dzsjVar, dzsj<eeu> dzsjVar2, dzsj<rzn> dzsjVar3, dzsj<sey> dzsjVar4, dzsj<axwq> dzsjVar5, dzsj<qjk> dzsjVar6, dzsj<ckcw> dzsjVar7, dzsj<Application> dzsjVar8, dzsj<sey> dzsjVar9) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
        c(dzsjVar2, 2);
        this.b = dzsjVar2;
        c(dzsjVar3, 3);
        this.c = dzsjVar3;
        c(dzsjVar4, 4);
        this.d = dzsjVar4;
        c(dzsjVar5, 5);
        this.e = dzsjVar5;
        c(dzsjVar6, 6);
        this.f = dzsjVar6;
        c(dzsjVar7, 7);
        this.g = dzsjVar7;
        c(dzsjVar8, 8);
        this.h = dzsjVar8;
        c(dzsjVar9, 9);
        this.i = dzsjVar9;
    }

    private static <T> void c(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final sfc a(int i, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, rzp rzpVar) {
        gga a = this.a.a();
        c(a, 1);
        eeu a2 = this.b.a();
        c(a2, 2);
        rzn a3 = this.c.a();
        c(a3, 3);
        sey a4 = this.d.a();
        c(a4, 4);
        axwq a5 = this.e.a();
        c(a5, 5);
        qjk a6 = this.f.a();
        c(a6, 6);
        ckcw a7 = this.g.a();
        c(a7, 7);
        c(rzpVar, 11);
        return new sfc(a.getApplication(), a2, a3, a4, a5, a6, a7, i != 0 ? a.getString(i) : "", ddhoVar, ddhoVar2, rzpVar);
    }

    public final sfc b(String str, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, rzp rzpVar) {
        Application a = this.h.a();
        c(a, 1);
        eeu a2 = this.b.a();
        c(a2, 2);
        rzn a3 = this.c.a();
        c(a3, 3);
        sey a4 = this.i.a();
        c(a4, 4);
        axwq a5 = this.e.a();
        c(a5, 5);
        qjk a6 = this.f.a();
        c(a6, 6);
        ckcw a7 = this.g.a();
        c(a7, 7);
        c(str, 8);
        c(rzpVar, 11);
        return new sfc(a, a2, a3, a4, a5, a6, a7, str, ddhoVar, ddhoVar2, rzpVar);
    }
}
