package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: arpr  reason: default package */
/* loaded from: classes.dex */
public final class arpr implements afhy {
    private final dzsj<cjqy> a;
    private final dzsj<dxio<ascb>> b;
    private final dzsj<asim> c;
    private final dzsj<asik> d;
    private final dzsj<dxio<ckcw>> e;
    private final dzsj<dxio<brlh>> f;

    public arpr(dzsj<cjqy> dzsjVar, dzsj<dxio<ascb>> dzsjVar2, dzsj<asim> dzsjVar3, dzsj<asik> dzsjVar4, dzsj<dxio<ckcw>> dzsjVar5, dzsj<dxio<brlh>> dzsjVar6) {
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

    @Override // defpackage.afhy
    public final /* bridge */ /* synthetic */ afhx a(Intent intent, @dzsi String str) {
        b(intent, 1);
        cjqy a = this.a.a();
        b(a, 3);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 4);
        asim a3 = this.c.a();
        b(a3, 5);
        asik a4 = this.d.a();
        b(a4, 6);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 7);
        b(((dxjh) this.f).a(), 8);
        return new arpq(intent, str, a, a2, a3, a4, a5);
    }
}
