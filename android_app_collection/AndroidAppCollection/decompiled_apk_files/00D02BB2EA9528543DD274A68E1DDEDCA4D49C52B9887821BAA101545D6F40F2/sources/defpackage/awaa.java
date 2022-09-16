package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awaa  reason: default package */
/* loaded from: classes3.dex */
public final class awaa {
    public final dzsj<crzm<avkc>> a;
    public final dzsj<awar> b;
    public final dzsj<Executor> c;
    public final dzsj<Executor> d;
    public final dzsj<avjm> e;

    public awaa(dzsj<crzm<avkc>> dzsjVar, dzsj<awar> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<avjm> dzsjVar5) {
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
