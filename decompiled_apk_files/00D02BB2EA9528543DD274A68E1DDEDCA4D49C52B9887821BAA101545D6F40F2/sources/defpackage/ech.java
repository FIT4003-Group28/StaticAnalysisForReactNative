package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: ech  reason: default package */
/* loaded from: classes6.dex */
public class ech {
    private final dzsj<Resources> a;
    private final dzsj<eco> b;
    private final dzsj<cavs> c;

    public ech(dzsj<Resources> dzsjVar, dzsj<eco> dzsjVar2, dzsj<cavs> dzsjVar3) {
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

    public final ecg a(boolean z, boolean z2, cawy cawyVar) {
        Resources a = this.a.a();
        b(a, 1);
        eco a2 = this.b.a();
        b(a2, 2);
        cavs a3 = this.c.a();
        b(a3, 3);
        b(cawyVar, 6);
        return new ecg(a, a2, a3, z, z2, cawyVar);
    }
}
