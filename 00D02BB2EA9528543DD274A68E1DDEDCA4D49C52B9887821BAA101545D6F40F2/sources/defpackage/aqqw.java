package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: aqqw  reason: default package */
/* loaded from: classes.dex */
public final class aqqw implements afhy {
    private final dzsj<dxio<apyz>> a;
    private final dzsj<dxio<ckcw>> b;
    private final dzsj<dxio<cjqy>> c;

    public aqqw(dzsj<dxio<apyz>> dzsjVar, dzsj<dxio<ckcw>> dzsjVar2, dzsj<dxio<cjqy>> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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
        dxio a = ((dxjh) this.a).a();
        b(a, 3);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 4);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 5);
        return new aqqv(intent, str, a, a2, a3);
    }
}
