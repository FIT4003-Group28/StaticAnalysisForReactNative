package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ssp  reason: default package */
/* loaded from: classes7.dex */
public final class ssp {
    public final dzsj<tgi> a;
    public final dzsj<ssn> b;
    public final dzsj<Executor> c;
    public final dzsj<ufg> d;

    public ssp(dzsj<tgi> dzsjVar, dzsj<ssn> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<ufg> dzsjVar4) {
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
