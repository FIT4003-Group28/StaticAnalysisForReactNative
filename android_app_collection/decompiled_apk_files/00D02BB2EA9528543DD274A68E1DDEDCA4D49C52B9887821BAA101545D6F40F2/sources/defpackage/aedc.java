package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aedc  reason: default package */
/* loaded from: classes.dex */
public final class aedc {
    public final dzsj<dxio<akfa>> a;
    public final dzsj<afzu> b;
    public final dzsj<afzs> c;
    public final dzsj<Executor> d;

    public aedc(dzsj<dxio<akfa>> dzsjVar, dzsj<afzu> dzsjVar2, dzsj<afzs> dzsjVar3, dzsj<Executor> dzsjVar4) {
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
