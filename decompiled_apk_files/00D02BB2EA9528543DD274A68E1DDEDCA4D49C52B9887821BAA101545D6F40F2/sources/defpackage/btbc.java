package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: btbc  reason: default package */
/* loaded from: classes.dex */
public final class btbc implements afhy {
    private final dzsj<dxio<bsvm>> a;
    private final dzsj<byps> b;
    private final dzsj<auhi> c;

    public btbc(dzsj<dxio<bsvm>> dzsjVar, dzsj<byps> dzsjVar2, dzsj<auhi> dzsjVar3) {
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
        byps a2 = this.b.a();
        b(a2, 4);
        auhi a3 = this.c.a();
        b(a3, 5);
        return new btbb(intent, str, a, a2, a3);
    }
}
