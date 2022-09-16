package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bzgt  reason: default package */
/* loaded from: classes.dex */
public final class bzgt implements afhy {
    private final dzsj<dxio<qbt>> a;

    public bzgt(dzsj<dxio<qbt>> dzsjVar, dzsj<String> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
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
        return new bzgs(intent, str, a);
    }
}
