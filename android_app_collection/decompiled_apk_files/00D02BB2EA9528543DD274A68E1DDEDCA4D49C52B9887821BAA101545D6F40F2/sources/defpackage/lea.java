package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lea  reason: default package */
/* loaded from: classes7.dex */
public final class lea {
    public final dzsj<cqat> a;
    public final dzsj<crzm<Boolean>> b;
    public final dzsj<ckcw> c;
    public final dzsj<Executor> d;
    public final dzsj<dxio<bvrv>> e;
    public final dzsj<noh> f;

    public lea(dzsj<cqat> dzsjVar, dzsj<crzm<Boolean>> dzsjVar2, dzsj<ckcw> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<dxio<bvrv>> dzsjVar5, dzsj<noh> dzsjVar6) {
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
