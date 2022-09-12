package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ccgi  reason: default package */
/* loaded from: classes.dex */
public final class ccgi implements afhy {
    private final dzsj<gga> a;
    private final dzsj<gfq> b;
    private final dzsj<cjqy> c;
    private final dzsj<dxio<cgen>> d;
    private final dzsj<dxio<bsvm>> e;

    public ccgi(dzsj<gga> dzsjVar, dzsj<gfq> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<dxio<cgen>> dzsjVar4, dzsj<dxio<bsvm>> dzsjVar5) {
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
        gga a = this.a.a();
        b(a, 3);
        gfq a2 = this.b.a();
        b(a2, 4);
        cjqy a3 = this.c.a();
        b(a3, 5);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 6);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 7);
        return new ccgh(intent, str, a, a2, a3, a4, a5);
    }
}
