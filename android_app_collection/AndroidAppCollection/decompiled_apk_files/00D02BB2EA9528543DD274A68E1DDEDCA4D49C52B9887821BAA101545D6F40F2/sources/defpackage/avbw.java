package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avbw  reason: default package */
/* loaded from: classes2.dex */
public final class avbw {
    public final dzsj<ckcw> a;
    public final dzsj<Executor> b;
    public final dzsj<avzm> c;
    public final dzsj<avzo> d;

    public avbw(dzsj<ckcw> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<avzm> dzsjVar3, dzsj<avzo> dzsjVar4) {
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
