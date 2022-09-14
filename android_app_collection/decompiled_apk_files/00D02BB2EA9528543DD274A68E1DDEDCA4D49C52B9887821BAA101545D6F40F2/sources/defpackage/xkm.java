package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xkm  reason: default package */
/* loaded from: classes7.dex */
public class xkm {
    private final dzsj<Application> a;
    private final dzsj<byyp> b;
    private final dzsj<vns> c;
    private final dzsj<Executor> d;
    private final dzsj<vwo> e;

    public xkm(dzsj<Application> dzsjVar, dzsj<byyp> dzsjVar2, dzsj<vns> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<vwo> dzsjVar5) {
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

    public final xkl a(vnk vnkVar) {
        Application a = this.a.a();
        b(a, 1);
        byyp a2 = this.b.a();
        b(a2, 2);
        vns a3 = this.c.a();
        b(a3, 3);
        Executor a4 = this.d.a();
        b(a4, 4);
        vwo a5 = this.e.a();
        b(a5, 5);
        b(vnkVar, 6);
        return new xkl(a, a2, a3, a4, a5, vnkVar);
    }
}
