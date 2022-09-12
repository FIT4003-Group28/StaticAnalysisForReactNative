package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: duv  reason: default package */
/* loaded from: classes6.dex */
public final class duv {
    public final dzsj<dvc> a;
    public final dzsj<duz> b;
    public final dzsj<dvf> c;
    public final dzsj<Executor> d;
    public final dzsj<dvb> e;

    public duv(dzsj<dvc> dzsjVar, dzsj<duz> dzsjVar2, dzsj<dvf> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<dvb> dzsjVar5) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
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
