package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: umr  reason: default package */
/* loaded from: classes.dex */
public final class umr implements afhy {
    private final dzsj<ros> a;
    private final dzsj<qbt> b;
    private final dzsj<acyp> c;

    public umr(dzsj<ros> dzsjVar, dzsj<qbt> dzsjVar2, dzsj<acyp> dzsjVar3) {
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
        ros a = this.a.a();
        b(a, 3);
        qbt a2 = this.b.a();
        b(a2, 4);
        acyp a3 = this.c.a();
        b(a3, 5);
        return new umq(intent, str, a, a2, a3);
    }
}
