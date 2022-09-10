package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agbq  reason: default package */
/* loaded from: classes2.dex */
public class agbq {
    private final dzsj<dxio<cztz>> a;
    private final dzsj<Executor> b;
    private final dzsj<dxio<bbdv>> c;
    private final dzsj<afzs> d;

    public agbq(dzsj<dxio<cztz>> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<dxio<bbdv>> dzsjVar3, dzsj<afzs> dzsjVar4) {
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

    public final agbp a(@dzsi agxf agxfVar, @dzsi dlcv dlcvVar) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        Executor a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        afzs a4 = this.d.a();
        b(a4, 4);
        return new agbp(a, a2, a3, a4, agxfVar, dlcvVar);
    }
}
