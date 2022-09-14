package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ccfu  reason: default package */
/* loaded from: classes.dex */
public final class ccfu implements afhy {
    private final dzsj<gfq> a;
    private final dzsj<dxio<cdfx>> b;
    private final dzsj<dxio<cfrt>> c;
    private final dzsj<dxio<chnm>> d;

    public ccfu(dzsj<gfq> dzsjVar, dzsj<dxio<cdfx>> dzsjVar2, dzsj<dxio<cfrt>> dzsjVar3, dzsj<dxio<chnm>> dzsjVar4) {
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
        gfq a = this.a.a();
        b(a, 3);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 4);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 5);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 6);
        return new ccft(intent, str, a, a2, a3, a4);
    }
}
