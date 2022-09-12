package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: abvo  reason: default package */
/* loaded from: classes2.dex */
public final class abvo implements abpo {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<abfa> c;
    private final dzsj<dxio<abfb>> d;
    private final dzsj<akpm> e;
    private final dzsj<abvd> f;
    private final dzsj<abvi> g;
    private final dzsj<abwj> h;
    private final dzsj<cjqy> i;

    public abvo(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<abfa> dzsjVar3, dzsj<dxio<abfb>> dzsjVar4, dzsj<akpm> dzsjVar5, dzsj<abvd> dzsjVar6, dzsj<abvi> dzsjVar7, dzsj<abwj> dzsjVar8, dzsj<cjqy> dzsjVar9) {
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
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
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

    @Override // defpackage.abpo
    public final /* bridge */ /* synthetic */ abpn a(@dzsi acwt acwtVar, absg absgVar) {
        b((Activity) ((dxjd) this.a).a, 1);
        b(this.b.a(), 2);
        abfa a = this.c.a();
        b(a, 3);
        dxio a2 = ((dxjh) this.d).a();
        b(a2, 4);
        akpm a3 = this.e.a();
        b(a3, 5);
        abvd a4 = this.f.a();
        b(a4, 6);
        abvi a5 = this.g.a();
        b(a5, 7);
        abwj a6 = this.h.a();
        b(a6, 8);
        cjqy a7 = this.i.a();
        b(a7, 9);
        b(absgVar, 13);
        return new abvn(a, a2, a3, a4, a5, a6, a7, acwtVar, absgVar);
    }
}
