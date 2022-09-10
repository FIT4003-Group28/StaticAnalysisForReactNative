package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: deh  reason: default package */
/* loaded from: classes6.dex */
public final class deh {
    public final dzsj<dxio<dbsg<czo>>> a;
    public final dzsj<Executor> b;
    public final dzsj<Executor> c;

    public deh(dzsj<dxio<dbsg<czo>>> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<Executor> dzsjVar3) {
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
