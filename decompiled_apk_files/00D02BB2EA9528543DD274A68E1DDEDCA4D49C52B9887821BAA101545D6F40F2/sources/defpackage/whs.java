package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: whs  reason: default package */
/* loaded from: classes7.dex */
public class whs {
    private final dzsj<cqhn> a;
    private final dzsj<Executor> b;
    private final dzsj<gga> c;
    private final dzsj<dxio<whv>> d;
    private final dzsj<dxio<wdt>> e;

    public whs(dzsj<cqhn> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<dxio<whv>> dzsjVar4, dzsj<dxio<wdt>> dzsjVar5) {
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

    public final whr a(wgi wgiVar, boolean z, whq whqVar) {
        cqhn a = this.a.a();
        b(a, 1);
        Executor a2 = this.b.a();
        b(a2, 2);
        gga a3 = this.c.a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 5);
        b(wgiVar, 6);
        b(whqVar, 8);
        return new whr(a, a2, a3, a4, a5, wgiVar, z, whqVar);
    }
}
