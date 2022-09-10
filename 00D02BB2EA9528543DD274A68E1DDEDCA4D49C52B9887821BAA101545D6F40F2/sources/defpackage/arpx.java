package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: arpx  reason: default package */
/* loaded from: classes.dex */
public final class arpx implements afhy {
    private final dzsj<gga> a;
    private final dzsj<dxio<ascb>> b;
    private final dzsj<cjqy> c;
    private final dzsj<cjqq> d;

    public arpx(dzsj<gga> dzsjVar, dzsj<dxio<ascb>> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<cjqq> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 4);
        cjqy a3 = this.c.a();
        b(a3, 5);
        cjqq a4 = this.d.a();
        b(a4, 6);
        return new arpw(intent, str, a, a2, a3, a4);
    }
}
