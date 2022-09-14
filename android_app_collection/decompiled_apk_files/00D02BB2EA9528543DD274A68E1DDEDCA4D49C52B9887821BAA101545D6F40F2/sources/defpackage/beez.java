package defpackage;

import android.app.Activity;
import android.app.Application;
/* compiled from: PG */
/* renamed from: beez  reason: default package */
/* loaded from: classes3.dex */
public class beez {
    private final dzsj<Application> a;
    private final dzsj<btrm> b;
    private final dzsj<jkf> c;
    private final dzsj<Activity> d;
    private final dzsj<btvo> e;
    private final dzsj<cyt> f;
    private final dzsj<cwy> g;
    private final dzsj<dxio<afha>> h;

    public beez(dzsj<Application> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<jkf> dzsjVar3, dzsj<Activity> dzsjVar4, dzsj<btvo> dzsjVar5, dzsj<cyt> dzsjVar6, dzsj<cwy> dzsjVar7, dzsj<dxio<afha>> dzsjVar8) {
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

    public final beey a(beex beexVar) {
        b(beexVar, 1);
        Application a = this.a.a();
        b(a, 2);
        btrm a2 = this.b.a();
        b(a2, 3);
        jkf a3 = this.c.a();
        b(a3, 4);
        Activity activity = (Activity) ((dxjd) this.d).a;
        b(activity, 5);
        btvo a4 = this.e.a();
        b(a4, 6);
        cyt a5 = this.f.a();
        b(a5, 7);
        cwy a6 = this.g.a();
        b(a6, 8);
        dxio a7 = ((dxjh) this.h).a();
        b(a7, 9);
        return new beey(beexVar, a, a2, a3, activity, a4, a5, a6, a7);
    }
}
