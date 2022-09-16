package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acwx  reason: default package */
/* loaded from: classes.dex */
public final class acwx {
    public final dzsj<Application> a;
    public final dzsj<bvjj> b;
    public final dzsj<Executor> c;
    public final dzsj<ckcw> d;

    public acwx(dzsj<Application> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<ckcw> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
