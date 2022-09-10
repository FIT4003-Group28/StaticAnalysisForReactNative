package defpackage;

import android.app.Activity;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: bgqk  reason: default package */
/* loaded from: classes3.dex */
public class bgqk {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<apqe> c;
    private final dzsj<cjqy> d;
    private final dzsj<gga> e;
    private final dzsj<bgpx> f;

    public bgqk(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<apqe> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<gga> dzsjVar5, dzsj<bgpx> dzsjVar6) {
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

    public final bgqj a(dipk dipkVar, int i, diov diovVar, apnq apnqVar, HashSet<bgqj> hashSet, bgez bgezVar, bgnk bgnkVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqhn a = this.b.a();
        b(a, 2);
        apqe a2 = this.c.a();
        b(a2, 3);
        cjqy a3 = this.d.a();
        b(a3, 4);
        gga a4 = this.e.a();
        b(a4, 5);
        bgpx a5 = this.f.a();
        b(a5, 6);
        b(dipkVar, 7);
        b(diovVar, 9);
        b(apnqVar, 10);
        b(hashSet, 11);
        b(bgezVar, 12);
        b(bgnkVar, 13);
        return new bgqj(activity, a, a2, a3, a4, a5, dipkVar, i, diovVar, apnqVar, hashSet, bgezVar, bgnkVar);
    }
}
