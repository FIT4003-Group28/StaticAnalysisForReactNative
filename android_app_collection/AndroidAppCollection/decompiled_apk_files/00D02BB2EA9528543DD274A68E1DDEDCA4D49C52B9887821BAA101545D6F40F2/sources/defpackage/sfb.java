package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sfb  reason: default package */
/* loaded from: classes7.dex */
public final class sfb {
    public final dzsj<Application> a;
    public final dzsj<sey> b;
    public final dzsj<qjk> c;
    public final dzsj<Executor> d;

    public sfb(dzsj<Application> dzsjVar, dzsj<sey> dzsjVar2, dzsj<qjk> dzsjVar3, dzsj<Executor> dzsjVar4) {
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
