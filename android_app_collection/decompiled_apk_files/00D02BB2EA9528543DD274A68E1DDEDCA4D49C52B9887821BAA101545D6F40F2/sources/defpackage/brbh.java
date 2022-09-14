package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: brbh  reason: default package */
/* loaded from: classes4.dex */
public final class brbh {
    private final dzsj<bvrb> a;
    private final dzsj<btrm> b;
    private final dzsj<akpm> c;
    private final dzsj<btvo> d;
    private final dzsj<cqkj> e;
    private final dzsj<Activity> f;
    private final dzsj<cqhn> g;

    public brbh(dzsj<bvrb> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<akpm> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<cqkj> dzsjVar5, dzsj<Activity> dzsjVar6, dzsj<cqhn> dzsjVar7) {
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

    public final brbg a(brbe brbeVar) {
        bvrb a = this.a.a();
        b(a, 1);
        btrm a2 = this.b.a();
        b(a2, 2);
        akpm a3 = this.c.a();
        b(a3, 3);
        btvo a4 = this.d.a();
        b(a4, 4);
        cqkj a5 = this.e.a();
        b(a5, 5);
        Activity activity = (Activity) ((dxjd) this.f).a;
        b(activity, 6);
        b(this.g.a(), 7);
        b(brbeVar, 8);
        return new brbg(a, a2, a3, a4, a5, activity, brbeVar);
    }
}
