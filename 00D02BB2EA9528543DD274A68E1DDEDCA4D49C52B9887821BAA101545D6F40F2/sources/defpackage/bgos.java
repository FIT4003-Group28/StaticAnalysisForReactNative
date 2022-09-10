package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bgos  reason: default package */
/* loaded from: classes3.dex */
public class bgos {
    private final dzsj<Activity> a;
    private final dzsj<bmdq> b;
    private final dzsj<bgpa> c;
    private final dzsj<dxio<bvvw>> d;
    private final dzsj<dxio<apyz>> e;
    private final dzsj<dxio<afha>> f;
    private final dzsj<btvo> g;

    public bgos(dzsj<Activity> dzsjVar, dzsj<bmdq> dzsjVar2, dzsj<bgpa> dzsjVar3, dzsj<dxio<bvvw>> dzsjVar4, dzsj<dxio<apyz>> dzsjVar5, dzsj<dxio<afha>> dzsjVar6, dzsj<btvo> dzsjVar7) {
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

    public final bgor a(String str, dipk dipkVar, ilo iloVar, int i, bgnk bgnkVar, boolean z, @dzsi bgqj bgqjVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        bmdq a = this.b.a();
        b(a, 2);
        bgpa a2 = this.c.a();
        b(a2, 3);
        dxio a3 = ((dxjh) this.d).a();
        b(a3, 4);
        dxio a4 = ((dxjh) this.e).a();
        b(a4, 5);
        dxio a5 = ((dxjh) this.f).a();
        b(a5, 6);
        btvo a6 = this.g.a();
        b(a6, 7);
        b(str, 8);
        b(dipkVar, 9);
        b(iloVar, 10);
        b(bgnkVar, 12);
        return new bgor(activity, a, a2, a3, a4, a5, a6, str, dipkVar, iloVar, i, bgnkVar, z, bgqjVar);
    }
}
