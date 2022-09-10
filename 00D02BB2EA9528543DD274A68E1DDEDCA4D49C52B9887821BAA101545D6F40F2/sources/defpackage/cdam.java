package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cdam  reason: default package */
/* loaded from: classes4.dex */
public final class cdam {
    private final dzsj<cqhn> a;
    private final dzsj<cqhu> b;
    private final dzsj<jlp> c;
    private final dzsj<btvo> d;

    public cdam(dzsj<cqhn> dzsjVar, dzsj<cqhu> dzsjVar2, dzsj<jlp> dzsjVar3, dzsj<btvo> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final cdal a(cdbb cdbbVar, Context context, int i) {
        b(cdbbVar, 1);
        b(context, 2);
        cqhn a = this.a.a();
        b(a, 4);
        cqhu a2 = this.b.a();
        b(a2, 5);
        jlp a3 = this.c.a();
        b(a3, 6);
        btvo a4 = this.d.a();
        b(a4, 7);
        return new cdal(cdbbVar, context, i, a, a2, a3, a4);
    }
}
