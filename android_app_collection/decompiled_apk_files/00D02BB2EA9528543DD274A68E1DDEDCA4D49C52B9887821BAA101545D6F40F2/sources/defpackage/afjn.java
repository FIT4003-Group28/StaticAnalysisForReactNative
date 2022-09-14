package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afjn  reason: default package */
/* loaded from: classes.dex */
public final class afjn implements afhy {
    private final dzsj<gga> a;
    private final dzsj<bvjj> b;
    private final dzsj<dxio<btao>> c;

    public afjn(dzsj<gga> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<dxio<btao>> dzsjVar3) {
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
        b(this.a.a(), 3);
        bvjj a = this.b.a();
        b(a, 4);
        dxio a2 = ((dxjh) this.c).a();
        b(a2, 5);
        return new afjm(intent, str, a, a2);
    }
}
