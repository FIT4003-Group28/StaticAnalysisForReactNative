package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: swt  reason: default package */
/* loaded from: classes7.dex */
public final class swt {
    public final dzsj<dxio<akfa>> a;
    public final dzsj<tma> b;
    public final dzsj<Executor> c;
    public final dzsj<tgi> d;

    public swt(dzsj<dxio<akfa>> dzsjVar, dzsj<tma> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<tgi> dzsjVar4) {
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
