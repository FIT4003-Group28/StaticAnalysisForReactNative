package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ixf  reason: default package */
/* loaded from: classes6.dex */
public class ixf {
    public final dzsj<iyj> a;
    public final dzsj<ixv> b;
    public final dzsj<ixb> c;
    public final dzsj<Activity> d;
    public final dzsj<btvo> e;
    private final dzsj<bhja> f;
    private final dzsj<bhhf> g;

    public ixf(dzsj<iyj> dzsjVar, dzsj<ixv> dzsjVar2, dzsj<ixb> dzsjVar3, dzsj<bhja> dzsjVar4, dzsj<Activity> dzsjVar5, dzsj<btvo> dzsjVar6, dzsj<bhhf> dzsjVar7) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.f = dzsjVar4;
        a(dzsjVar5, 5);
        this.d = dzsjVar5;
        a(dzsjVar6, 6);
        this.e = dzsjVar6;
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final ixe b(bwrs<ilo> bwrsVar, cdjd cdjdVar, cdjk cdjkVar, boolean z) {
        a(bwrsVar, 1);
        a(cdjdVar, 2);
        a(cdjkVar, 3);
        iyj a = this.a.a();
        a(a, 6);
        ixv a2 = this.b.a();
        a(a2, 7);
        ixb a3 = this.c.a();
        a(a3, 8);
        bhja a4 = this.f.a();
        a(a4, 9);
        Activity activity = (Activity) ((dxjd) this.d).a;
        a(activity, 10);
        btvo a5 = this.e.a();
        a(a5, 11);
        bhhf a6 = this.g.a();
        a(a6, 12);
        return new ixe(bwrsVar, cdjdVar, cdjkVar, false, z, a, a2, a3, a4, activity, a5, a6);
    }
}
