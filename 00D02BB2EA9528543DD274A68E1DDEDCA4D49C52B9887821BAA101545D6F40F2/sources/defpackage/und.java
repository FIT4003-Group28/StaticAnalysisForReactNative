package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: und  reason: default package */
/* loaded from: classes7.dex */
public final class und implements afhy {
    private final dzsj<dxio<ahwf>> a;
    private final dzsj<dxio<ahvo>> b;

    public und(dzsj<dxio<ahwf>> dzsjVar, dzsj<dxio<ahvo>> dzsjVar2) {
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
        return new unc(intent, str, a, a2);
    }
}
