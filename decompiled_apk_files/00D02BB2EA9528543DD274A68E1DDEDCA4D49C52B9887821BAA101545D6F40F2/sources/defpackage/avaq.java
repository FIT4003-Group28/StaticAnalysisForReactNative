package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avaq  reason: default package */
/* loaded from: classes2.dex */
public final class avaq {
    public final dzsj<avku> a;
    public final dzsj<avll> b;
    public final dzsj<avkp> c;
    public final dzsj<crzm<avkq>> d;
    public final dzsj<Executor> e;
    public final dzsj<avoj> f;

    public avaq(dzsj<avku> dzsjVar, dzsj<avll> dzsjVar2, dzsj<avkp> dzsjVar3, dzsj<crzm<avkq>> dzsjVar4, dzsj<Executor> dzsjVar5, dzsj<avoj> dzsjVar6) {
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
