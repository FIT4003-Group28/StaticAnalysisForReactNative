package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: mhu  reason: default package */
/* loaded from: classes7.dex */
public final class mhu {
    public final dzsj<btpc> a;
    public final dzsj<Executor> b;
    public final dzsj<bvrb> c;
    public final dzsj<cjqy> d;
    public final dzsj<cjqq> e;
    public final dzsj<btvo> f;

    public mhu(dzsj<btpc> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<bvrb> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<cjqq> dzsjVar5, dzsj<btvo> dzsjVar6) {
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
