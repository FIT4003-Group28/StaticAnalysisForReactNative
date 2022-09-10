package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: azbh  reason: default package */
/* loaded from: classes3.dex */
public final class azbh {
    public final dzsj<gga> a;
    public final dzsj<btvo> b;
    public final dzsj<Executor> c;
    public final dzsj<aymh> d;
    public final dzsj<axwi> e;

    public azbh(dzsj<gga> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<aymh> dzsjVar4, dzsj<axwi> dzsjVar5) {
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
