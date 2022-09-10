package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bnjf  reason: default package */
/* loaded from: classes3.dex */
public final class bnjf {
    private final dzsj<Activity> a;
    private final dzsj<cqat> b;
    private final dzsj<bmdv> c;
    private final dzsj<axwp> d;
    private final dzsj<beqf> e;
    private final dzsj<biko> f;
    private final dzsj<btvo> g;

    public bnjf(dzsj<Activity> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<bmdv> dzsjVar3, dzsj<axwp> dzsjVar4, dzsj<beqf> dzsjVar5, dzsj<biko> dzsjVar6, dzsj<btvo> dzsjVar7) {
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

    public final bnje a(ilo iloVar, bnjd bnjdVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqat a = this.b.a();
        b(a, 2);
        dzsj<bmdv> dzsjVar = this.c;
        dzsj<axwp> dzsjVar2 = this.d;
        dzsj<beqf> dzsjVar3 = this.e;
        dzsj<biko> dzsjVar4 = this.f;
        btvo a2 = this.g.a();
        b(a2, 7);
        b(iloVar, 8);
        b(bnjdVar, 9);
        return new bnje(activity, a, dzsjVar, dzsjVar2, dzsjVar3, dzsjVar4, a2, iloVar, bnjdVar);
    }
}
