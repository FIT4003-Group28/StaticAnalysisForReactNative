package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: zni  reason: default package */
/* loaded from: classes7.dex */
public class zni {
    private final dzsj<efa> a;
    private final dzsj<Resources> b;
    private final dzsj<cqkj> c;

    public zni(dzsj<efa> dzsjVar, dzsj<Resources> dzsjVar2, dzsj<cqkj> dzsjVar3) {
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

    public final znh a(ddho ddhoVar, ddho ddhoVar2) {
        efa a = this.a.a();
        b(a, 1);
        Resources a2 = this.b.a();
        b(a2, 2);
        cqkj a3 = this.c.a();
        b(a3, 3);
        b(ddhoVar, 4);
        b(ddhoVar2, 5);
        return new znh(a, a2, a3, ddhoVar, ddhoVar2);
    }
}
