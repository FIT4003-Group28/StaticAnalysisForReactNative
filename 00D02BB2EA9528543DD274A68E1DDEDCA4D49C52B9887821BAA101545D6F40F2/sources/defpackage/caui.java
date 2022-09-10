package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: caui  reason: default package */
/* loaded from: classes4.dex */
public class caui {
    public final dzsj<bvev> a;
    public final dzsj<Executor> b;
    public final dzsj<cauv> c;

    public caui(dzsj<bvev> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<cauv> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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
