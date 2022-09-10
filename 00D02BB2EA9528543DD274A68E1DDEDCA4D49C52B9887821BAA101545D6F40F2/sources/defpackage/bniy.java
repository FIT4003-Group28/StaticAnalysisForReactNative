package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bniy  reason: default package */
/* loaded from: classes3.dex */
public class bniy {
    private final dzsj<Application> a;
    private final dzsj<jkf> b;
    private final dzsj<akfa> c;
    private final dzsj<bvjj> d;
    private final dzsj<ckcw> e;

    public bniy(dzsj<Application> dzsjVar, dzsj<jkf> dzsjVar2, dzsj<akfa> dzsjVar3, dzsj<bvjj> dzsjVar4, dzsj<ckcw> dzsjVar5) {
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

    public final bnix a(bniu bniuVar, @dzsi cjtd cjtdVar, boolean z) {
        Application a = this.a.a();
        b(a, 1);
        jkf a2 = this.b.a();
        b(a2, 2);
        akfa a3 = this.c.a();
        b(a3, 3);
        bvjj a4 = this.d.a();
        b(a4, 4);
        ckcw a5 = this.e.a();
        b(a5, 5);
        b(bniuVar, 6);
        return new bnix(a, a2, a3, a4, a5, bniuVar, cjtdVar, z);
    }
}
