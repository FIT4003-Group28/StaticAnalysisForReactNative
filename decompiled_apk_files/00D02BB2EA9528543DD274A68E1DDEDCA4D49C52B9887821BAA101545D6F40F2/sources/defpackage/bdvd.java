package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bdvd  reason: default package */
/* loaded from: classes3.dex */
public class bdvd {
    private final dzsj<Application> a;
    private final dzsj<bvrb> b;
    private final dzsj<btvo> c;
    private final dzsj<ckcw> d;
    private final dzsj<cjqy> e;

    public bdvd(dzsj<Application> dzsjVar, dzsj<bvrb> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<ckcw> dzsjVar4, dzsj<cjqy> dzsjVar5) {
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

    public final bdvc a(dwfl dwflVar) {
        b(dwflVar, 1);
        Application a = this.a.a();
        b(a, 2);
        bvrb a2 = this.b.a();
        b(a2, 3);
        btvo a3 = this.c.a();
        b(a3, 4);
        ckcw a4 = this.d.a();
        b(a4, 5);
        cjqy a5 = this.e.a();
        b(a5, 6);
        return new bdvc(dwflVar, a, a2, a3, a4, a5);
    }
}
