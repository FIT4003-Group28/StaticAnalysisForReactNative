package defpackage;

import android.app.Service;
/* compiled from: PG */
/* renamed from: bzgq  reason: default package */
/* loaded from: classes4.dex */
public final class bzgq {
    public final dzsj<Service> a;
    public final dzsj<cqat> b;
    public final dzsj<bzgl> c;
    public final dzsj<cref> d;
    public final dzsj<byzi> e;

    public bzgq(dzsj<Service> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<bzgl> dzsjVar3, dzsj<cref> dzsjVar4, dzsj<byzi> dzsjVar5) {
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
