package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abfl  reason: default package */
/* loaded from: classes.dex */
public final class abfl {
    private final dzsj<Executor> a;
    private final dzsj<dxio<ckcw>> b;
    private final dzsj<dxio<aaap>> c;
    private final dzsj<dxio<brba>> d;
    private final dzsj<btvo> e;

    public abfl(dzsj<Executor> dzsjVar, dzsj<dxio<ckcw>> dzsjVar2, dzsj<dxio<aaap>> dzsjVar3, dzsj<dxio<brba>> dzsjVar4, dzsj<btvo> dzsjVar5) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
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

    public final abfk a(dqfo dqfoVar, @dzsi dxio<aeaa> dxioVar, @dzsi abse abseVar) {
        Executor a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        btvo a5 = this.e.a();
        b(a5, 5);
        b(dqfoVar, 6);
        return new abfk(a, a2, a3, a4, a5, dqfoVar, dxioVar, abseVar);
    }
}
