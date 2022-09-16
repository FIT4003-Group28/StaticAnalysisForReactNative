package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: akmo  reason: default package */
/* loaded from: classes.dex */
public final class akmo implements afhy {
    private final dzsj<ckcw> a;
    private final dzsj<dxio<aagc>> b;

    public akmo(dzsj<ckcw> dzsjVar, dzsj<dxio<aagc>> dzsjVar2) {
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
        ckcw a = this.a.a();
        b(a, 3);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 4);
        return new akmn(intent, str, a, a2);
    }
}
