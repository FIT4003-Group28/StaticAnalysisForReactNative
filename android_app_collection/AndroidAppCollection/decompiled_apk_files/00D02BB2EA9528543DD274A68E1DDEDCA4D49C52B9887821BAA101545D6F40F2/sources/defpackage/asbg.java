package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: asbg  reason: default package */
/* loaded from: classes2.dex */
public final class asbg {
    public final dzsj<btrm> a;
    public final dzsj<pnq> b;
    public final dzsj<btvo> c;
    public final dzsj<crlb> d;
    public final dzsj<Executor> e;
    public final dzsj<pot> f;

    public asbg(dzsj<btrm> dzsjVar, dzsj<pnq> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<crlb> dzsjVar4, dzsj<Executor> dzsjVar5, dzsj<pot> dzsjVar6) {
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
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
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
