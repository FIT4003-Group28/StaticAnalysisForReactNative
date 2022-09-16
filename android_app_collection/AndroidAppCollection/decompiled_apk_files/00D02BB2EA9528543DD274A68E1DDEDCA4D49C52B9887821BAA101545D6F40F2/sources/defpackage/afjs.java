package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afjs  reason: default package */
/* loaded from: classes.dex */
public final class afjs implements afhy {
    private final dzsj<gga> a;
    private final dzsj<dxio<qbt>> b;
    private final dzsj<dxio<brba>> c;
    private final dzsj<asik> d;
    private final dzsj<dxio<ckcw>> e;

    public afjs(dzsj<gga> dzsjVar, dzsj<dxio<qbt>> dzsjVar2, dzsj<dxio<brba>> dzsjVar3, dzsj<asik> dzsjVar4, dzsj<dxio<ckcw>> dzsjVar5) {
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
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 4);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 5);
        asik a4 = this.d.a();
        b(a4, 6);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 7);
        return new afjr(intent, str, a, a2, a3, a4, a5);
    }
}
