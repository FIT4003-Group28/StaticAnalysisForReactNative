package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bsql  reason: default package */
/* loaded from: classes4.dex */
public class bsql {
    private final dzsj<Application> a;
    private final dzsj<brmb> b;
    private final dzsj<dxio<afha>> c;
    private final dzsj<cqg> d;
    private final dzsj<anhg> e;

    public bsql(dzsj<Application> dzsjVar, dzsj<brmb> dzsjVar2, dzsj<dxio<afha>> dzsjVar3, dzsj<cqg> dzsjVar4, dzsj<anhg> dzsjVar5) {
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

    public final bsqk a(@dzsi Runnable runnable, @dzsi Runnable runnable2) {
        Application a = this.a.a();
        b(a, 1);
        brmb a2 = this.b.a();
        b(a2, 4);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 5);
        return new bsqk(a, runnable, runnable2, a2, a3, this.d, this.e);
    }
}
