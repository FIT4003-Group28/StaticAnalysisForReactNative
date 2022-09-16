package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bwic  reason: default package */
/* loaded from: classes4.dex */
public final class bwic {
    private final dzsj<gga> a;
    private final dzsj<btvo> b;
    private final dzsj<cjmt> c;

    public bwic(dzsj<gga> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<cjmt> dzsjVar3) {
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

    public final bwib a(@dzsi btlu btluVar, Intent intent, bweo bweoVar, @dzsi String str, cjtd cjtdVar, cqrp cqrpVar, bvro<cjql, Intent> bvroVar) {
        gga a = this.a.a();
        b(a, 1);
        btvo a2 = this.b.a();
        b(a2, 2);
        cjmt a3 = this.c.a();
        b(a3, 3);
        b(intent, 5);
        b(bweoVar, 6);
        b(cjtdVar, 8);
        b(cqrpVar, 9);
        b(bvroVar, 10);
        return new bwib(a, a2, a3, btluVar, intent, bweoVar, str, cjtdVar, cqrpVar, bvroVar);
    }
}
