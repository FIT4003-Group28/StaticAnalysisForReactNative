package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: agbz  reason: default package */
/* loaded from: classes.dex */
public final class agbz implements afhy {
    private final dzsj<dxio<acyp>> a;
    private final dzsj<dxio<bvjj>> b;
    private final dzsj<dxio<afzv>> c;
    private final dzsj<dxio<akfa>> d;
    private final dzsj<dxio<akfc>> e;
    private final dzsj<dxio<cjot>> f;

    public agbz(dzsj<dxio<acyp>> dzsjVar, dzsj<dxio<bvjj>> dzsjVar2, dzsj<dxio<afzv>> dzsjVar3, dzsj<dxio<akfa>> dzsjVar4, dzsj<dxio<akfc>> dzsjVar5, dzsj<dxio<cjot>> dzsjVar6) {
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
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        b(((dxjh) this.b).a(), 2);
        dxio a2 = ((dxjh) this.c).a();
        b(a2, 3);
        dxio a3 = ((dxjh) this.d).a();
        b(a3, 4);
        dxio a4 = ((dxjh) this.e).a();
        b(a4, 5);
        dxio a5 = ((dxjh) this.f).a();
        b(a5, 6);
        b(intent, 7);
        return new agby(a, a2, a3, a4, a5, intent, str);
    }
}
