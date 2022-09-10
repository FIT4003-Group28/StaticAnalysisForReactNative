package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bflb  reason: default package */
/* loaded from: classes3.dex */
public class bflb {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<cqhu> c;
    private final dzsj<cjqq> d;
    private final dzsj<ckmm> e;
    private final dzsj<cjqy> f;
    private final dzsj<bfkf> g;

    public bflb(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cqhu> dzsjVar3, dzsj<cjqq> dzsjVar4, dzsj<ckmm> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<bfkf> dzsjVar7) {
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
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bfla a(dwfl dwflVar, int i, ilo iloVar, bmea bmeaVar, ddho ddhoVar, boolean z, @dzsi ckql ckqlVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqhn a = this.b.a();
        b(a, 2);
        cqhu a2 = this.c.a();
        b(a2, 3);
        cjqq a3 = this.d.a();
        b(a3, 4);
        ckmm a4 = this.e.a();
        b(a4, 5);
        cjqy a5 = this.f.a();
        b(a5, 6);
        bfkf a6 = this.g.a();
        b(a6, 7);
        b(dwflVar, 8);
        b(iloVar, 10);
        b(bmeaVar, 11);
        b(ddhoVar, 12);
        return new bfla(activity, a, a2, a3, a4, a5, a6, dwflVar, i, iloVar, bmeaVar, ddhoVar, z, ckqlVar);
    }
}
