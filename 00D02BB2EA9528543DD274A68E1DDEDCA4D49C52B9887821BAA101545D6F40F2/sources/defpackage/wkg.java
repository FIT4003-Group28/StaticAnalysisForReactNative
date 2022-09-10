package defpackage;

import android.content.res.Resources;
import java.util.List;
/* compiled from: PG */
/* renamed from: wkg  reason: default package */
/* loaded from: classes7.dex */
public final class wkg {
    private final dzsj<qds> a;
    private final dzsj<Resources> b;
    private final dzsj<btvo> c;

    public wkg(dzsj<qds> dzsjVar, dzsj<Resources> dzsjVar2, dzsj<btvo> dzsjVar3) {
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

    public final wkf a(akqi akqiVar, List<String> list) {
        qds a = this.a.a();
        b(a, 1);
        Resources a2 = this.b.a();
        b(a2, 2);
        btvo a3 = this.c.a();
        b(a3, 3);
        b(akqiVar, 4);
        b(list, 5);
        return new wkf(a, a2, a3, akqiVar, list);
    }
}
