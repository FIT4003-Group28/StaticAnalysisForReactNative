package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: afxz  reason: default package */
/* loaded from: classes2.dex */
public final class afxz {
    private final dzsj<Context> a;
    private final dzsj<btvo> b;
    private final dzsj<afxv> c;
    private final dzsj<afxn> d;

    public afxz(dzsj<Context> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<afxv> dzsjVar3, dzsj<afxn> dzsjVar4) {
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

    public final afxy a(afyc afycVar) {
        Context a = this.a.a();
        b(a, 1);
        btvo a2 = this.b.a();
        b(a2, 2);
        afxv a3 = this.c.a();
        b(a3, 3);
        afxn a4 = this.d.a();
        b(a4, 4);
        b(afycVar, 5);
        return new afxy(a, a2, a3, a4, afycVar);
    }
}
