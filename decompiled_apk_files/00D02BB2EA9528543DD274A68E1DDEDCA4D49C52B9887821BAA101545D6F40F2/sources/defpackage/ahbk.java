package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ahbk  reason: default package */
/* loaded from: classes2.dex */
public class ahbk {
    private final dzsj<cqhn> a;
    private final dzsj<ahbo> b;
    private final dzsj<gga> c;
    private final dzsj<dxio<afzv>> d;

    public ahbk(dzsj<cqhn> dzsjVar, dzsj<ahbo> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<dxio<afzv>> dzsjVar4) {
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

    public final ahbj a(btlu btluVar, dkzq dkzqVar, List<dlas> list) {
        cqhn a = this.a.a();
        b(a, 1);
        ahbo a2 = this.b.a();
        b(a2, 2);
        gga a3 = this.c.a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        b(btluVar, 5);
        b(dkzqVar, 6);
        b(list, 7);
        return new ahbj(a, a2, a3, a4, btluVar, dkzqVar, list);
    }
}
