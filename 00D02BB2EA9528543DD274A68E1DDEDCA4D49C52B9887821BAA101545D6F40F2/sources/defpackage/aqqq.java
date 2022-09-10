package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: aqqq  reason: default package */
/* loaded from: classes.dex */
public final class aqqq implements afhy {
    private final dzsj<aqqn> a;
    private final dzsj<apzy> b;

    public aqqq(dzsj<aqqn> dzsjVar, dzsj<apzy> dzsjVar2) {
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
        aqqn a = this.a.a();
        b(a, 3);
        apzy a2 = this.b.a();
        b(a2, 4);
        return new aqqp(intent, str, a, a2);
    }
}
