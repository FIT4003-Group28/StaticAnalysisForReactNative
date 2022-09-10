package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wbf  reason: default package */
/* loaded from: classes7.dex */
public final class wbf {
    public final dzsj<Executor> a;
    public final dzsj<btrm> b;
    public final dzsj<srv> c;

    public wbf(dzsj<Executor> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<srv> dzsjVar3) {
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
