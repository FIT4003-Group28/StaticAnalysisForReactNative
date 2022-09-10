package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwpa  reason: default package */
/* loaded from: classes4.dex */
public class bwpa {
    private final dzsj<Activity> a;
    private final dzsj<eeu> b;
    private final dzsj<akfa> c;
    private final dzsj<btpc> d;
    private final dzsj<avij> e;
    private final dzsj<avik> f;
    private final dzsj<avzo> g;
    private final dzsj<avzp> h;
    private final dzsj<Executor> i;

    public bwpa(dzsj<Activity> dzsjVar, dzsj<eeu> dzsjVar2, dzsj<akfa> dzsjVar3, dzsj<btpc> dzsjVar4, dzsj<avij> dzsjVar5, dzsj<avik> dzsjVar6, dzsj<avzo> dzsjVar7, dzsj<avzp> dzsjVar8, dzsj<Executor> dzsjVar9) {
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

    public final bwoz a(@dzsi bwnj bwnjVar, bwoy bwoyVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        eeu a = this.b.a();
        b(a, 2);
        akfa a2 = this.c.a();
        b(a2, 3);
        btpc a3 = this.d.a();
        b(a3, 4);
        avij a4 = this.e.a();
        b(a4, 5);
        dzsj<avik> dzsjVar = this.f;
        avzo a5 = this.g.a();
        b(a5, 7);
        avzp a6 = this.h.a();
        b(a6, 8);
        Executor a7 = this.i.a();
        b(a7, 9);
        b(bwoyVar, 11);
        return new bwoz(activity, a, a2, a3, a4, dzsjVar, a5, a6, a7, bwnjVar, bwoyVar);
    }
}
