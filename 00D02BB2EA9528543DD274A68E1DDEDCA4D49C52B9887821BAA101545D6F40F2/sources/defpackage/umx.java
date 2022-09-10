package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: umx  reason: default package */
/* loaded from: classes.dex */
public final class umx implements afhy {
    private final dzsj<dxio<qbt>> a;
    private final dzsj<yys> b;
    private final dzsj<cjqy> c;

    public umx(dzsj<dxio<qbt>> dzsjVar, dzsj<yys> dzsjVar2, dzsj<cjqy> dzsjVar3) {
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
        b(this.b.a(), 4);
        cjqy a2 = this.c.a();
        b(a2, 5);
        return new umw(intent, str, a, a2);
    }
}
