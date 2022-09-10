package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bnhc  reason: default package */
/* loaded from: classes3.dex */
public class bnhc {
    private final dzsj<Activity> a;
    private final dzsj<bnaj> b;
    private final dzsj<bngv> c;
    private final dzsj<bngs> d;
    private final dzsj<bnjj> e;
    private final dzsj<cqhn> f;

    public bnhc(dzsj<Activity> dzsjVar, dzsj<bnaj> dzsjVar2, dzsj<bngv> dzsjVar3, dzsj<bngs> dzsjVar4, dzsj<bnjj> dzsjVar5, dzsj<cqhn> dzsjVar6) {
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

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bnhb a(bwrs<ilo> bwrsVar, bneu bneuVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        bnaj a = this.b.a();
        b(a, 2);
        bngv a2 = this.c.a();
        b(a2, 3);
        bngs a3 = this.d.a();
        b(a3, 4);
        bnjj a4 = this.e.a();
        b(a4, 5);
        cqhn a5 = this.f.a();
        b(a5, 6);
        b(bwrsVar, 7);
        b(bneuVar, 8);
        return new bnhb(activity, a, a2, a3, a4, a5, bwrsVar, bneuVar);
    }
}
