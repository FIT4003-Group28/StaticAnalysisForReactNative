package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cfns  reason: default package */
/* loaded from: classes4.dex */
public class cfns {
    private final dzsj<ckcw> a;
    private final dzsj<Resources> b;
    private final dzsj<buqz> c;
    private final dzsj<bvax> d;
    private final dzsj<btvo> e;
    private final dzsj<Executor> f;

    public cfns(dzsj<ckcw> dzsjVar, dzsj<Resources> dzsjVar2, dzsj<buqz> dzsjVar3, dzsj<bvax> dzsjVar4, dzsj<btvo> dzsjVar5, dzsj<Executor> dzsjVar6) {
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
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
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

    public final cfnr a(cfnq cfnqVar, Handler handler) {
        b(cfnqVar, 1);
        b(handler, 2);
        ckcw a = this.a.a();
        b(a, 3);
        Resources a2 = this.b.a();
        b(a2, 4);
        buqz a3 = this.c.a();
        b(a3, 5);
        bvax a4 = this.d.a();
        b(a4, 6);
        btvo a5 = this.e.a();
        b(a5, 7);
        Executor a6 = this.f.a();
        b(a6, 8);
        return new cfnr(cfnqVar, handler, a, a2, a3, a4, a5, a6);
    }
}
