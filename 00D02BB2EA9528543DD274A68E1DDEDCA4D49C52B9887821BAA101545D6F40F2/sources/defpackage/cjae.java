package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cjae  reason: default package */
/* loaded from: classes4.dex */
public class cjae {
    private final dzsj<cqhn> a;
    private final dzsj<Resources> b;
    private final dzsj<cjab> c;

    public cjae(dzsj<cqhn> dzsjVar, dzsj<Resources> dzsjVar2, dzsj<cjab> dzsjVar3) {
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

    public final cjad a(chrx chrxVar, chum chumVar) {
        cqhn a = this.a.a();
        b(a, 1);
        Resources a2 = this.b.a();
        b(a2, 2);
        cjab a3 = this.c.a();
        b(a3, 3);
        b(chrxVar, 4);
        b(chumVar, 5);
        return new cjad(a, a2, a3, chrxVar, chumVar);
    }
}
