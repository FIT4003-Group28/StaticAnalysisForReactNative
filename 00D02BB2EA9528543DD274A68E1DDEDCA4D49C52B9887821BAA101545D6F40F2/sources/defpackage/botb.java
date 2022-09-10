package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: botb  reason: default package */
/* loaded from: classes.dex */
public final class botb implements afhy {
    private final dzsj<dxio<begg>> a;
    private final dzsj<dxio<boxa>> b;

    public botb(dzsj<dxio<begg>> dzsjVar, dzsj<dxio<boxa>> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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
        return new bota(intent, str, a, a2);
    }
}
