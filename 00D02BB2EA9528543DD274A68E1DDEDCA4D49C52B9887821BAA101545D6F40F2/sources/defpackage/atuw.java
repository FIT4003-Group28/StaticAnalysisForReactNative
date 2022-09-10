package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atuw  reason: default package */
/* loaded from: classes2.dex */
public class atuw {
    public final dzsj<dehq> a;
    public final dzsj<Executor> b;
    public final dzsj<crfl> c;
    public final dzsj<asbr> d;

    public atuw(dzsj<dehq> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<crfl> dzsjVar3, dzsj<asbr> dzsjVar4) {
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
