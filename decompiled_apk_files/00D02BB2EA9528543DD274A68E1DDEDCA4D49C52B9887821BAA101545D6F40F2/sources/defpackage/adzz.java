package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adzz  reason: default package */
/* loaded from: classes.dex */
public final class adzz {
    private final dzsj<dxio<awvy>> a;
    private final dzsj<dxio<akox>> b;
    private final dzsj<dxio<ahjq>> c;
    private final dzsj<Executor> d;

    public adzz(dzsj<dxio<awvy>> dzsjVar, dzsj<dxio<akox>> dzsjVar2, dzsj<dxio<ahjq>> dzsjVar3, dzsj<Executor> dzsjVar4) {
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

    public final adzy a(aeav aeavVar, String str, Set<awvv<?>> set) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        Executor a4 = this.d.a();
        b(a4, 4);
        b(aeavVar, 5);
        b(str, 7);
        b(set, 8);
        return new adzy(a, a2, a3, a4, aeavVar, str, set);
    }
}
