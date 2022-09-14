package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ceda  reason: default package */
/* loaded from: classes4.dex */
public class ceda {
    private final dzsj<Activity> a;
    private final dzsj<btvo> b;
    private final dzsj<dxio<cbzd>> c;
    private final dzsj<cbze> d;
    private final dzsj<cjqy> e;
    private final dzsj<blkr> f;
    private final dzsj<cecn> g;
    private final dzsj<cece> h;
    private final dzsj<cjcw> i;
    private final dzsj<cebr> j;
    private final dzsj<cebu> k;

    public ceda(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<dxio<cbzd>> dzsjVar3, dzsj<cbze> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<blkr> dzsjVar6, dzsj<cecn> dzsjVar7, dzsj<cece> dzsjVar8, dzsj<cjcw> dzsjVar9, dzsj<cebr> dzsjVar10, dzsj<cebu> dzsjVar11) {
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
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
        b(dzsjVar11, 11);
        this.k = dzsjVar11;
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

    public final cecz a(@dzsi cjtd cjtdVar, cjcs cjcsVar, boolean z) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        btvo a = this.b.a();
        b(a, 2);
        dxio a2 = ((dxjh) this.c).a();
        b(a2, 3);
        cbze a3 = this.d.a();
        b(a3, 4);
        cjqy a4 = this.e.a();
        b(a4, 5);
        blkr a5 = this.f.a();
        b(a5, 6);
        cecn a6 = this.g.a();
        b(a6, 7);
        cece a7 = this.h.a();
        b(a7, 8);
        cjcw a8 = this.i.a();
        b(a8, 9);
        cebr a9 = this.j.a();
        b(a9, 10);
        cebu a10 = this.k.a();
        b(a10, 11);
        b(cjcsVar, 13);
        return new cecz(activity, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, cjtdVar, cjcsVar, z);
    }
}
