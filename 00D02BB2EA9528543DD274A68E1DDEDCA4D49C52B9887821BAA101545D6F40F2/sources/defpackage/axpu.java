package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axpu  reason: default package */
/* loaded from: classes3.dex */
public final class axpu {
    public final dzsj<gga> a;
    public final dzsj<axhs> b;
    public final dzsj<Executor> c;
    public final dzsj<cklf> d;

    public axpu(dzsj<gga> dzsjVar, dzsj<axhs> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<cklf> dzsjVar4) {
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
