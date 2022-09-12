package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cftd  reason: default package */
/* loaded from: classes4.dex */
public class cftd {
    private final dzsj<dxio<chnm>> a;
    private final dzsj<Resources> b;

    public cftd(dzsj<dxio<chnm>> dzsjVar, dzsj<Resources> dzsjVar2) {
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

    public final cftc a(int i, ddho ddhoVar) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        Resources a2 = this.b.a();
        b(a2, 2);
        b(ddhoVar, 4);
        return new cftc(a, a2, i, ddhoVar);
    }
}
